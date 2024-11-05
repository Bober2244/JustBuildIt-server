package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object TeamsInOrder: Table() {
    val orderId: Column<Int> = integer("orderNumber")
    val brigadeId: Column<Int> = integer("brigadeNumber")

    override val primaryKey: PrimaryKey = PrimaryKey(orderId, brigadeId)
}