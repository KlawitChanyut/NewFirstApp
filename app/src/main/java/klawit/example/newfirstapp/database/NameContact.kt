package klawit.example.newfirstapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_contact_table")
data class NameContact (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "your_name")
    var name: String = "unnamed",
    @ColumnInfo(name = "your_phone")
    var phone: String = ""
)