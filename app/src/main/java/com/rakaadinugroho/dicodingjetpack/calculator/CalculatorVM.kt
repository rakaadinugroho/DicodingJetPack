package com.rakaadinugroho.dicodingjetpack.calculator

import androidx.lifecycle.ViewModel

class CalculatorVM: ViewModel() {
    var result = 0
    fun calculateDiscount(discount: Int, amount: Int) = amount-((discount/100)*amount)
}