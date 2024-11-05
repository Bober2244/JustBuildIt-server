package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Worker: Table() {
    val workerId: Column<Int> = integer("workerId").autoIncrement()
    val brigadeId: Column<Int> = integer("brigadeId").references(Brigade.brigadeId)
    val jobTitle: Column<String> = varchar("jobTitle", 30)
    val name: Column<String> = varchar("name", 50)
    val phoneNumber: Column<String> = varchar("phoneNumber", 12)
    val email: Column<String>? = varchar("email", 20)

    override val primaryKey: PrimaryKey = PrimaryKey(workerId)
}