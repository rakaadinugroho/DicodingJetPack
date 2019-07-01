package com.rakaadinugroho.dicodingjetpack.calculator

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CalculatorVMTest {
    private lateinit var calculatorVM: CalculatorVM

    @Before
    fun init() {
        calculatorVM = CalculatorVM()
    }

    @Test
    fun calculateDiscount() {
        val amount = 10000
        val discount = 20
        calculatorVM.calculateDiscount(discount = discount, amount = amount)
        assertEquals(8000, calculatorVM.result)
    }
}