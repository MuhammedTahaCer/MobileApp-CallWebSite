package com.muhammed.portfolio

import android.content.DialogInterface
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Portfolio=findViewById<WebView>(R.id.Portfolio)
        setTitle("M.Taha Portfolio Sayfası")
        Portfolio.loadUrl("https://muhammedcer.com")
        Portfolio.webViewClient= WebViewClient()
        Portfolio.settings.javaScriptEnabled=true //js desteği default kapalı gelir
        Portfolio.settings.setSupportZoom(true) // user can zoom on page

    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
                .setTitle("Çıkış")
                .setMessage("Uygulamadan çıkış yapmak mı istiyorsun..")
                .setPositiveButton("Çıkış Yap", DialogInterface.OnClickListener {
                    dialogInterface, i ->  super.onBackPressed() })
                .create()
                .show()
    }

}
