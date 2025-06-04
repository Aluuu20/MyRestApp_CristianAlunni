package com.example.myrestapp_cristianalunni

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
            val btnwebview = findViewById<ImageButton>(R.id.idbtnWebView)
            val btndashboard = findViewById<ImageButton>(R.id.idbtnDashboard)
            val btnsearch = findViewById<Button>(R.id.idbtnSearch)


            btnwebview.setOnClickListener {
                val intent = Intent(this, WebviewActivity::class.java)
                startActivity(intent)
            }

            btndashboard.setOnClickListener{
                val intent2 = Intent(this, DashboardActivity::class.java)
                startActivity(intent2)
            }

            btnsearch.setOnClickListener {
                val intent3 = Intent(this, SearchActivity::class.java)
                startActivity(intent3)
            }
        }
    }
