package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    //deklarasi variabel
    private lateinit var input_panjang: EditText
    private  lateinit var inputan_lebar: EditText
    private lateinit var  inputan_tinggi: EditText
    private lateinit var btn : Button
    private lateinit var teks_hasil: TextView
    companion object{
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inisialisasi variabel
        input_panjang=findViewById(R.id.edt_lenght)
        inputan_lebar=findViewById(R.id.edt_width)
        inputan_tinggi=findViewById(R.id.edt_height)
        btn=findViewById(R.id.btn_result)
        teks_hasil=findViewById(R.id.btn_result)

        if (savedInstanceState != null){
            teks_hasil.text = savedInstanceState.getString(STATE_RESULT)
        }

        btn.setOnClickListener(this)

}

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, teks_hasil.text.toString())
    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.btn_result){
            val nilai_tinggi =inputan_tinggi.text.toString().trim()
            val nilai_lebar=inputan_lebar.text.toString().trim()
            val nilai_panjang=input_panjang.text.toString().trim()
            val volume=nilai_tinggi.toDouble()*nilai_lebar.toDouble()*nilai_tinggi.toDouble()
            teks_hasil.text= volume.toString()
        }

    }

    }