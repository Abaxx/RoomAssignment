package d.com.roomassignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Contact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        var bundle: Bundle? = intent.extras
        val name: String? = bundle?.getString("title")
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.title = name
        setSupportActionBar(toolbar)

    }
}