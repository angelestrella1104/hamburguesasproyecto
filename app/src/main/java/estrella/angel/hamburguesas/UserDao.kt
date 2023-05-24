package estrella.angel.hamburguesas

import androidx.room.*
import estrella.angel.hamburguesas.User

@Dao
interface UserDao {

    @Insert
    suspend fun insert(Personal: User)

    @Query("SELECT * FROM user ORDER  BY id DESC")
    suspend fun getAllUser():List<User>

    @Update
    suspend fun update(Personal: User)

    @Delete
    suspend fun delete(Personal: User)

}