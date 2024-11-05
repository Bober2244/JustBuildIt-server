package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Material: Table() {
    val materialId: Column<Int> = integer("materialId").autoIncrement()
    val name: Column<String> = varchar("name", 40)
    val count: Column<Int> = integer("count")
    val measurementUnit: Column<Int> = integer("measurementUnit")

    override val primaryKey: PrimaryKey = PrimaryKey(materialId)
}