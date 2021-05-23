package d.com.roomassignment

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 2, exportSchema = false)
abstract class UserDatabase : RoomDatabase(){
    abstract fun userDao(): UserDAO
    companion object {
        private var INSTANT: UserDatabase? = null

        fun getInstance(context: Context): UserDatabase {
            return  if(INSTANT == null) {
                Room.databaseBuilder(context,UserDatabase::class.java,"user_database").build()
            }else {
                INSTANT!! }
        }

        fun destroyInstance(){
            INSTANT = null
        }
    }
}