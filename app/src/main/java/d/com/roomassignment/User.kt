package d.com.roomassignment

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User (@PrimaryKey(autoGenerate = true) val id: Int,
                 @ColumnInfo(name = "email_address") val email: String,
                 @ColumnInfo(name = "password") val pass: String)