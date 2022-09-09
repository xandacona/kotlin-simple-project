import com.google.inject.AbstractModule
import com.google.inject.Guice
import com.google.inject.Module
import com.google.inject.util.Modules
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import org.xan.kotlin_simple_project.DependencyInjectionConfiguration
import org.xan.kotlin_simple_project.example.HelloApp
import java.io.PrintStream

class ServiceIntegrationTest {
    private val printStream: PrintStream = mockk(relaxed = true)

    var overrides: AbstractModule = object : AbstractModule() {
        override fun configure() {
            bind(PrintStream::class.java).toInstance(printStream)
        }
    }

    private val module: Module = Modules
        .override(DependencyInjectionConfiguration())
        .with(overrides)

    private val helloApp: HelloApp = Guice.createInjector(module).getInstance(HelloApp::class.java)

    @Test
    fun itPrints() {
        // When:
        helloApp.run()

        // Then:
        verify { printStream.println("Hello World!") }
    }
}