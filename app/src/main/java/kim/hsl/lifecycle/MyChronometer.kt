package kim.hsl.lifecycle

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.widget.Chronometer
import androidx.annotation.RequiresApi
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyChronometer: Chronometer, LifecycleObserver {

    constructor(context: Context?): super(context)
    constructor(context: Context?, attrs: AttributeSet?): super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int):
            super(context, attrs, defStyleAttr)
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int):
            super(context, attrs, defStyleAttr, defStyleRes)

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun startMeter() {
        // 开始计时
        this.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun stopMeter() {
        // 停止计时
        this.stop()
    }
}