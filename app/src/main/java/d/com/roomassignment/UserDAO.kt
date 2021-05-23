package d.com.roomassignment

import androidx.room.*

@Dao
interface UserDAO {

    @Insert
    suspend fun insert(user: User)
    @Query("SELECT * FROM user")
    suspend fun queryAll(): List<User>
    @Query("SELECT * FROM user WHERE email_address LIKE :email AND + password LIKE :pass LIMIT 1")
    suspend fun findByEmailandPassword(email: String, pass: String): User
    @Update
    suspend fun update(user: User)
    @Delete
    suspend fun delete(user: User)
}