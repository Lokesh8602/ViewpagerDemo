package com.example.task12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.synnapps.carouselview.CarouselView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sampleImages = intArrayOf(


        R.drawable.team1,
        R.drawable.team2,
        R.drawable.team3,
        R.drawable.team4,
        R.drawable.team5,
        R.drawable.team6,
        R.drawable.team7,
        R.drawable.team8


    )
    var teams = arrayOf(

        "team1",
        "team2",
        "team3",
        "team4",
        "team5",
        "team6",
        "team7",
        "team8"


    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        carouselView.pageCount = teams.size
        carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages[position])
        }
        carouselView.setImageClickListener { position ->
            Toast.makeText(applicationContext, teams[position], Toast.LENGTH_SHORT).show()





        }
    }
}