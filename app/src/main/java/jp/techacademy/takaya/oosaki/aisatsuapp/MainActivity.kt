package jp.techacademy.takaya.oosaki.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtview.text = ""
        button.setOnClickListener {
            txtview.text = ""
            showTimePickerDialog()
        }
    }
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if(hour >= 2 && hour <10){
                    txtview.text = "おはよう"
                }
                else if(hour >=10 && hour <18){
                    txtview.text = "こんにちは"
                }
                else if((hour >=18 && hour < 24) || (hour >=0 && hour <2) ){
                    txtview.text = "こんばんは"
                }
                else{
                    txtview.text = "unknown"
                }
            },
            13, 0, true)
        timePickerDialog.show()

    }
}
