package com.co.upb.edu.primeraclase.clases

open class Phone ( protected val number: Int) {

    fun call(){

        println("llamando...")
    }

    open fun showNumber(){

        println("My number is:  $number ")
    }



}