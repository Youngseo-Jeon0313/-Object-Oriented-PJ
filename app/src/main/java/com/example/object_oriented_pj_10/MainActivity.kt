package com.example.object_oriented_pj_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()

        initNumberPicker()
        numberPickerListener()
    }
    private fun initNumberPicker() {
        val data1 : Array<String> Array(100) {
            i -> i.toString()
        }
        numberPicker.minValue = 0
        numberPicker.maxValue = data1.size -1
        numberPicker.wrapSelectorWheel = false
        numberPicker.displayValues = data1
    }

    private fun numberPickerListener() {
        numberPicker.setOnValueChangedListener {picker, oldVal, newVal ->
            Log.d("test", "oldVal : ${oldVal}, newVal : ${newVal}")
            Log.d("test", "picker.displayedValues ${picker.displayedValues[picker.value]}")

        }
    }

}