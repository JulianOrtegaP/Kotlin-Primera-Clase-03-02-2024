package com.co.upb.edu.primeraclase

// Colleciones: son arreglos
// Arrays = arreglos

// Metodo Random

fun main(){

    newTopic("colecciones")
    newTopic("Solo lectura")

    var fruitList = listOf<String>("Banano","uva","manzana","lima")

    println(fruitList.get((0..fruitList.size-1).random()))

    println("El index de uva es: ${fruitList.indexOf("uva")}")

    newTopic("Mutable List")



}