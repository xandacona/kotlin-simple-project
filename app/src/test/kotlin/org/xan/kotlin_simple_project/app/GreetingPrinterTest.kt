package org.xan.kotlin_simple_project.app

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.xan.kotlin_simple_project.example.GreetingPrinter
import java.io.PrintStream


class GreetingPrinterTest {
    private val printStream = mockk<PrintStream>(relaxed = true)

    // Subject
    private val greetingPrinter = GreetingPrinter(printStream)

    @Test
    @DisplayName("Should put the greeting in the output stream")
    fun shouldPutTheGreetingInTheOutputStream() {
        // When:
        greetingPrinter.sayHello()

        // Then:
        verify { printStream.println("Hello World!") }
    }
}
