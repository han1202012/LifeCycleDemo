package kim.hsl.lifecycle

import android.util.Log
import androidx.lifecycle.LifecycleService

/**
 * Android 系统组件
 */
class MyLifecycleService: LifecycleService {
    constructor(){
        Log.i("LifeCycleDemo", "MyService Init")

        // 为 Service 添加 生命周期回调
        // 解耦 Service 系统组件 与 普通逻辑组件
        var myLifeCycleObserver = MyLifeCycleObserver()
        lifecycle.addObserver(myLifeCycleObserver)
    }
}