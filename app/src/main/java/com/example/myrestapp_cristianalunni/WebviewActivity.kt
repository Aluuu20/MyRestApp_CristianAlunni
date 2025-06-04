package com.example.myrestapp_cristianalunni

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WebviewActivity : AppCompatActivity() {

    private lateinit var myWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_webview)


        myWebView = findViewById(R.id.idwebview)
        myWebView.loadUrl("https://www.youtube.com/")
        myWebView.webViewClient = WebViewClient()
        myWebView.settings.javaScriptEnabled = true



    }
    }
