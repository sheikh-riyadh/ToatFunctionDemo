package toast

import android.content.Context
import android.widget.Toast


fun Context.toast(value : String , duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, value,duration).show()

}