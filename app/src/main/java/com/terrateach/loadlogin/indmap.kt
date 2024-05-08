package com.terrateach.loadlogin

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.terrateach.loadlogin.PaintView.Companion.colorList
import com.terrateach.loadlogin.PaintView.Companion.currentBrush
import com.terrateach.loadlogin.PaintView.Companion.pathList

class indmap : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indmap)

        val redbtn = findViewById<ImageButton>(R.id.redcolor)
        val bluebtn = findViewById<ImageButton>(R.id.bluecolor)
        val blackbtn = findViewById<ImageButton>(R.id.blackcolor)
        val eraser = findViewById<ImageButton>(R.id.eraser)

        redbtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        bluebtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackbtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }

    private fun currentColor(color: Int) {
        currentBrush = color
        path = Path()
    }
}