package com.example.qrcode1

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //button sends to page called GenerateQrCode
        //call the function when the button is clicked
        var btn = findViewById<Button>(R.id.QRCode)
        var userBtn = findViewById<Button>(R.id.userLogin)

        val userIntent = Intent (this, MainPage::class.java)

        userBtn.setOnClickListener {
            startActivity(userIntent)
        }

        val qrCode = Intent (this, GenerateQrCode::class.java)

        btn.setOnClickListener {
            startActivity(qrCode)
        }
    }
}
