package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object MaterialInOrder: Table() {
    val orderId: Column<Int> = integer("orderId").references(Order.orderId)
    val materialId: Column<Int> = integer("materialId").references(Material.materialId)
    val count: Column<Int> = integer("count")

    override val primaryKey: PrimaryKey = PrimaryKey(orderId, materialId)
}