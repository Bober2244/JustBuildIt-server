package dev.bober

import dev.bober.plugins.configureDatabases
import dev.bober.plugins.configureHTTP
import dev.bober.plugins.configureRouting
import dev.bober.plugins.configureSecurity
import dev.bober.plugins.configureSerialization
import io.ktor.server.application.Application
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureSecurity()
    configureHTTP()
    configureRouting()
}
