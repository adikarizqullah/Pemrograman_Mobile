package com.example.modul_satu

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daduGambar1 : ImageView = findViewById(R.id.imageView)
        daduGambar1.setImageResource(R.drawable.dadu_0)
        val daduGambar2 : ImageView = findViewById(R.id.imageView2)
        daduGambar2.setImageResource(R.drawable.dadu_0)

        val rollButton: Button = findViewById(R.id.tombol)
        rollButton.setOnClickListener { rollDadu() }
    }
    private fun rollDadu() {
        val dadu1 = Dadu(6)
        val daduRoll1 = dadu1.roll()

        val daduImage1 : ImageView = findViewById(R.id.imageView)
        when (daduRoll1) {
            1 -> daduImage1.setImageResource(R.drawable.dadu_1)
            2 -> daduImage1.setImageResource(R.drawable.dadu_2)
            3 -> daduImage1.setImageResource(R.drawable.dadu_3)
            4 -> daduImage1.setImageResource(R.drawable.dadu_4)
            5 -> daduImage1.setImageResource(R.drawable.dadu_5)
            6 -> daduImage1.setImageResource(R.drawable.dadu_6)
        }
        val dadu2 = Dadu(6)
        val daduRoll2 = dadu2.roll()

        val daduImage2 : ImageView = findViewById(R.id.imageView2)
        when (daduRoll2) {
            1 -> daduImage2.setImageResource(R.drawable.dadu_1)
            2 -> daduImage2.setImageResource(R.drawable.dadu_2)
            3 -> daduImage2.setImageResource(R.drawable.dadu_3)
            4 -> daduImage2.setImageResource(R.drawable.dadu_4)
            5 -> daduImage2.setImageResource(R.drawable.dadu_5)
            6 -> daduImage2.setImageResource(R.drawable.dadu_6)
        }
        if (daduRoll1 == daduRoll2){
            val toast = Toast.makeText(this, "Selamat anda dapat dadu double!", Toast.LENGTH_SHORT)
            toast.show()
        } else {
            val toast = Toast.makeText(this, "Anda belum beruntung!", Toast.LENGTH_SHORT)
            toast.show() }
    }
    }

class Dadu(private  val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}