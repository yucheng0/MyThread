package com.example.mythread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread {
            run{
                while(true){
                    println ("1000ms")          // 每隔1s去執行一次
                try {
                    sleep(1000)
                }catch (e:Exception){           // 擔心錯誤去捕捉
                    println (e.printStackTrace())
                }
                }
            }
        }.start()           //記得要.start才會啟動線程
    }
}