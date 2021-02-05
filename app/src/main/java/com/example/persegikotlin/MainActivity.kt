package com.example.persegikotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener{
    var sisi: TextView? = null
    var luas: TextView? = null
    var keliling: TextView? = null

    var dtor: RadioButton? = null
    var rtod: RadioButton? = null

    lateinit var count : Button

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.desain)
        sisi = findViewById<View>(R.id.sisi) as TextView
        keliling = findViewById<View>(R.id.keliling) as TextView
        luas = findViewById<View>(R.id.luas) as TextView
        dtor = findViewById<View>(R.id.dtor) as RadioButton
        dtor!!.isChecked = true
        rtod = findViewById<View>(R.id.rtod) as RadioButton
        count = findViewById<View>(R.id.count) as Button
        count.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (dtor!!.isChecked) {
            convertToLuas()
        }
        if (rtod!!.isChecked) {
            convertToKeliling()
        }
    }

    protected fun convertToLuas() {
        val `val` = sisi!!.text.toString().toDouble()
        luas!!.text = java.lang.Double.toString(`val` * `val`)
    }

    protected fun convertToKeliling() {
        val `val` = sisi!!.text.toString().toDouble()
        keliling!!.text = java.lang.Double.toString(`val` * 4)
    }
}