package com.co.upb.edu.primeraclase

import kotlin.math.abs

fun main(){

print(suma(55,50))
    val a = 50
    val b = 40

    println("$a + $b = ${suma(a,b)}")

    newTopic("Funciones Infix")
    val c = - 3

    println(c.enableAbs(false))

    println("$a + $c = ${suma(a,c.enableAbs(false))}")


}

// El Int despues del ":" indica el tipo de dato que retorna la funcion
fun suma(a:Int, b: Int):Int{

    return a + b
}

// Se puede realizar en una sola linea si el proceso es simple

fun resta(a:Int, b: Int) = a - b

// funcion de tipo infix = modifican las clases de tipádo de Kotlin ( Int, String, Double) en Kotlin

infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this