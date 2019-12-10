package com.example.bdt

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao

interface BDDao {
    @Insert
    suspend fun insertBD(bd: BD)

    @Query("SELECT * FROM birthday")
    suspend fun getAllBD(): LiveData<List<BD>>

    @Query("SELECT * FROM birthday WHERE id = ID")

    @Delete
    suspend fun deleteBD(bd: BD)

    @Update
    suspend fun updateBD(bd: BD)

    
}