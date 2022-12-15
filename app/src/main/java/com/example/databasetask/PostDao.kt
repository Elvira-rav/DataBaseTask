package com.example.databasetask
import androidx.room.Insert
import androidx.room.Query

@androidx.room.Dao
interface PostDao {
    @Query("SELECT * FROM PostData")
    fun getPostsAll(): List<PostData>
    @Insert
    fun insertPostOne(post: PostData)
}