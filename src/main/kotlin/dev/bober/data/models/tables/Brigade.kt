package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Brigade: Table() {
    val brigadeId: Column<Int> = integer("brigadeId").autoIncrement()
    val brigadeName: Column<String> = varchar("brigadeName", 50)
    val foreman: Column<String> = varchar("foreman", 50)
    val workersCount: Column<Int> = integer("workersCount")

    override val primaryKey: PrimaryKey = PrimaryKey(brigadeId)
}