package com.ckc.calculatorsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ckc.calculatorsample.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var numberFirst :Float? = null
    var numberSecond :Float? = null
    var result : Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)






    }
    fun sum(view:View){

        numberFirst = binding.number1.text.toString().toFloatOrNull()
        numberSecond = binding.number2.text.toString().toFloatOrNull()
        if (numberFirst==null || numberSecond==null){
            Toast.makeText(this,"Error !!!",Toast.LENGTH_LONG).show()
        }else{
            result = numberFirst!! + numberSecond!!
            binding.result.text = "Result : ${result}"
        }


    }
    fun sub(view:View){
        numberFirst = binding.number1.text.toString().toFloatOrNull()
        numberSecond = binding.number2.text.toString().toFloatOrNull()
        if (numberFirst==null || numberSecond==null){
            Toast.makeText(this,"Error !!!",Toast.LENGTH_LONG).show()
        }else{
            result = numberFirst!! - numberSecond!!
            binding.result.text = "Result : ${result}"
        }

    }
    fun multi(view:View){
        numberFirst = binding.number1.text.toString().toFloatOrNull()
        numberSecond = binding.number2.text.toString().toFloatOrNull()
        if (numberFirst==null || numberSecond==null){
            Toast.makeText(this,"Error !!!",Toast.LENGTH_LONG).show()
        }else{
            result = numberFirst!! * numberSecond!!
            binding.result.text = "Result : ${result}"
        }

    }
    fun div(view:View){
        numberFirst = binding.number1.text.toString().toFloatOrNull()
        numberSecond = binding.number2.text.toString().toFloatOrNull()
        if (numberFirst==null || numberSecond==null){
            Toast.makeText(this,"Error !!!",Toast.LENGTH_LONG).show()
        }else{
            result = numberFirst!! / numberSecond!!
            binding.result.text = "Result : ${result}"
        }

    }


}