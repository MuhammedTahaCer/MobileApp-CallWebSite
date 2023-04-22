package com.muhammed.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

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

}
