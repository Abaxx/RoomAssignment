package d.com.roomassignment

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    private var email: EditText? = null;
    private var password: EditText? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_log_in)
        setSupportActionBar(findViewById(R.id.toolbar))

        email = findViewById(R.id.Login_Email)
        password = findViewById(R.id.Login_Password)

    }

    fun LogIn(view: View): Unit
    {
        var myEmail = email?.text.toString()
        var myPassword = password?.text.toString()


        if(TextUtils.isEmpty(myEmail) || TextUtils.isEmpty(myPassword)) {
            Toast.makeText(this, "Enter your Email and Password", Toast.LENGTH_SHORT).show()
        }else {

        }
    }

}