package org.xan.kotlin_simple_project

import com.google.inject.AbstractModule
import com.google.inject.Provides
import org.xan.kotlin_simple_project.example.GreetingPrinter
import java.io.PrintStream

class DependencyInjectionConfiguration : AbstractModule() {
    override fun configure() {
        bind(GreetingPrinter::class.java)
    }

    @Provides
    fun printStream(): PrintStream = System.out
}