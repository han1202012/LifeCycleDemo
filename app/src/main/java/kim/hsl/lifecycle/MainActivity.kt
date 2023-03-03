package kim.hsl.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startLifeCycleService(view: View) {
        startService(Intent(this, MyLifecycleService::class.java))
    }
    fun stopLifeCycleService(view: View) {
        stopService(Intent(this, MyLifecycleService::class.java))
    }
}