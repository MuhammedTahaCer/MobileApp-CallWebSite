package com.muhammed.portfolio

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

val delaytime:Long=3000
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            //start act olayında bulunduğumuz sayfada Intnet nesnesini çağırıyorum
            finish()// uyg page bg açık kalmasın diye
        },delaytime)//runable ve delay
    }

}