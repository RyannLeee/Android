package me.yuanlee.weather

import android.util.Log
import java.net.URL

/**
 * Created by Y-Lee on 2017.06.08.
 */

public class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}