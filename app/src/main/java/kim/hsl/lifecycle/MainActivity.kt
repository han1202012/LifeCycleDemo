package kim.hsl.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    /**
     * UI 组件的业务逻辑 与 Activity 系统组件 绑定程度很高
     * 并且 UI 组件的逻辑 与 Activity 生命周期关联程度很高
     */
    lateinit var chronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chronometer = findViewById(R.id.chronometer)
    }

    override fun onResume() {
        super.onResume()
        chronometer.start()
    }

    override fun onPause() {
        super.onPause()
        chronometer.stop()
    }
}