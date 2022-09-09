package org.xan.kotlin_simple_project.app

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import org.xan.kotlin_simple_project.example.HelloApp
import org.xan.kotlin_simple_project.example.GreetingPrinter

class HelloAppTest {
    private val greetingPrinter = mockk<GreetingPrinter>(relaxed = true)

    // Subject
    var helloApp = HelloApp(greetingPrinter)

    @Test
    fun appHasAGreeting() {
        // When:
        helloApp.run()

        // Then:
        verify { greetingPrinter.sayHello() }
    }
}