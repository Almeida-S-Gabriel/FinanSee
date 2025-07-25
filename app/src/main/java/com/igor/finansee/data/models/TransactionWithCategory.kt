package com.igor.finansee.data.models

import androidx.room.Embedded
import androidx.room.Relation

data class TransactionWithCategory(
    @Embedded
    val transaction: Transaction,
    @Relation(
        parentColumn = "categoryId",
        entityColumn = "id"
    )
    val category: Category?
)