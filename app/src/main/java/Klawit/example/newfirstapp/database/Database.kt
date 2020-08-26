package Klawit.example.newfirstapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [NameContact::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase(){
    abstract val databaseDao: DatabaseDAO
    companion object{
        @Volatile
        private var INSTANCE: Klawit.example.newfirstapp.database.Database? = null
        fun getInstance(context: Context): Klawit.example.newfirstapp.database.Database {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        Klawit.example.newfirstapp.database.Database::class.java,
                        "database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}