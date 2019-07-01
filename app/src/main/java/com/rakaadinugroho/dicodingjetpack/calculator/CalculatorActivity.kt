package com.rakaadinugroho.dicodingjetpack.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.rakaadinugroho.dicodingjetpack.R
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    private lateinit var viewModel: CalculatorVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        viewModel = ViewModelProviders
            .of(this)
            .get(CalculatorVM::class.java)



        calculate.setOnClickListener {
            val amount = ammount.text.toString()
            val disc = discount.text.toString()
            when {
                amount.isEmpty() -> ammount.error = "please fill"
                disc.isEmpty() -> discount.error = "please fill"
                else -> {
                    viewModel.calculateDiscount(disc.toInt(), amount.toInt())
                    loadCalculate()
                }
            }
        }

    }

    private fun loadCalculate() {
        price.text = viewModel.result.toString()
    }
}
