package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.date
import java.time.LocalDate

object Purchase: Table() {
    val purchaseId: Column<Int> = integer("purchaseId").autoIncrement()
    val materialId: Column<Int> = integer("materialId").references(Material.materialId)
    val purchaseDate: Column<LocalDate> = date("purchaseDate")
    val deliveryDate: Column<LocalDate> = date("deliveryDate")
    val purchaseCount: Column<Int> = integer("purchaseCount")

    override val primaryKey: PrimaryKey = PrimaryKey(purchaseId)
}