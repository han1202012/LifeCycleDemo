package kim.hsl.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyLifeCycleObserver: LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun serviceStart(){
        // 服务启动
        Log.i("LifeCycleDemo", "MyService ON_CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun serviceStop(){
        // 服务停止
        Log.i("LifeCycleDemo", "MyService ON_DESTROY")
    }
}