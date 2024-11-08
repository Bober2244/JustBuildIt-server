package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object TeamsInOrder: Table() {
    val orderId: Column<Int> = integer("orderNumber").references(Order.orderId)
    val brigadeId: Column<Int> = integer("brigadeNumber").references(Brigade.brigadeId)

    override val primaryKey: PrimaryKey = PrimaryKey(orderId, brigadeId)
}