package com.example.roomsqlitetest.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//Это то, как выглядит наша таблица

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    var age: Int
)