package d.com.roomassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var email: EditText? = null;
    private var password: EditText? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         email = findViewById(R.id.Login_Email)
         password = findViewById(R.id.Login_Password)


        //var db = UserDatabase.getInstance(this)


    }

    fun SignUp(view: View): Unit {

        /*var myEmail = email?.text.toString()
        var myPassword = password?.text.toString()

        if(TextUtils.isEmpty(myEmail) || TextUtils.isEmpty(myPassword)) {
            Toast.makeText(this, "Enter your Email and Password", Toast.LENGTH_SHORT).show()
        }else {

            GlobalScope.launch {


            }

            Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show()
            //val intent = Intent(this,Login::class.java)
            //startActivity(intent)

        }*/
        val intent = Intent(this,Categories::class.java)
        startActivity(intent)
    }

}