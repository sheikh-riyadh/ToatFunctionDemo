package activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toatfunctiondemo.R
import toast.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // we can pass one parameter or two parameter
        toast("Hi i'm from one parameter ")

        // and we can pass two parameter
        toast("Hi i'm from two parameter",Toast.LENGTH_LONG)
    }
}
