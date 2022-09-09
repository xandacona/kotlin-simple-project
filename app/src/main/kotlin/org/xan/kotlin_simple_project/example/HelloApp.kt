package org.xan.kotlin_simple_project.example

import org.xan.kotlin_simple_project.example.GreetingPrinter
import javax.inject.Inject

class HelloApp @Inject constructor(
    private val greetingPrinter: GreetingPrinter
) {
    fun run() =
        greetingPrinter.sayHello()
}
