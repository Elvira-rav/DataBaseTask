package com.example.databasetask


import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [PostData::class], version = 1)
abstract class MyDatabase: RoomDatabase() {
   abstract fun getDao(): PostDao
}
