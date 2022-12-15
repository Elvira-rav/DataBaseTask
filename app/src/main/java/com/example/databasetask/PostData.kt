package com.example.databasetask


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PostData(
    @PrimaryKey(autoGenerate = true)
    val id : Int=0,
    val body: String ,
    val title: String
   )