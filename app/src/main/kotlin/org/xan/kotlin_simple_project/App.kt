package org.xan.kotlin_simple_project

import com.google.inject.Guice
import org.xan.kotlin_simple_project.example.HelloApp


fun main() {
    Guice.createInjector(DependencyInjectionConfiguration())
        .getInstance(HelloApp::class.java)
        .run()
}