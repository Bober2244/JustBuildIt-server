package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.date
import java.time.LocalDate

object Customer: Table() {
    val customerId: Column<Int> = integer("customerId").autoIncrement()
    val name: Column<String> = varchar("name", 50)
    val birthday: Column<LocalDate> = date("birthday")
    val phoneNumber: Column<String> = varchar("number", 12)
    val email: Column<String> = varchar("email", 30)

    override val primaryKey: PrimaryKey = PrimaryKey(customerId)
}