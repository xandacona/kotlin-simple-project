package org.xan.kotlin_simple_project.example

import java.io.PrintStream
import javax.inject.Inject

class GreetingPrinter @Inject constructor(
    private val outStream: PrintStream
) {
    fun sayHello() {
        outStream.println(GREETING)
    }

    companion object {
        const val GREETING = "Hello World!"
    }
}
