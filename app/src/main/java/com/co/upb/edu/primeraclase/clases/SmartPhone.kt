package com.co.upb.edu.primeraclase.clases


class SmartPhone( number:Int, val isPrivate: Boolean): Phone(number) {

    override fun showNumber() {

        if(isPrivate)
            println("Desconocido")
        else super.showNumber()


    }




}