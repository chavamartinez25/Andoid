package salvadormtz.com.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        print("Entra al metodo OnStart")
    }

    override fun onResume() {
        super.onResume()
        print("Entra al metodo OnResume")
    }

    override fun onPause() {
        super.onPause()
        print("Entra al metodo OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("Entra al metodo OnDestroy")
    }
}
