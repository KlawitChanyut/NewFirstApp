package klawit.example.newfirstapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDAO {
    @Insert
    fun insert(contact: NameContact)
    @Query("SELECT * from my_contact_table")
    fun get(): LiveData<List<NameContact>>
}