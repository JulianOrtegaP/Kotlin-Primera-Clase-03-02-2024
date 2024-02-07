package com.co.upb.edu.primeraclase

import com.co.upb.edu.primeraclase.clases.Group
import com.co.upb.edu.primeraclase.clases.User

// Colleciones: son arreglos
// Arrays = arreglos

// Metodo Random

fun main(){

    newTopic("colecciones")
    newTopic("Solo lectura")

    var fruitList = listOf<String>("Banano","uva","manzana","lima")

    println(fruitList.get((0..fruitList.size-1).random()))

    println("El index de uva es: ${fruitList.indexOf("uva")}")

    // MUTABLE LIST

    newTopic("Mutable List")

    val myUser = User(0,"leon","giraldo", Group.FAMILY.ordinal)
    var bro = myUser.copy(1,"ivan")
    var friend = bro.copy(2, group = Group.FRIEND.ordinal)


    val userList = mutableListOf<User>(myUser,bro)

    println(userList)

    userList.add(friend)

    println(userList)

    val userSelectList = mutableListOf<User>()
    userSelectList.addAll(userList)
    userSelectList.set(0,bro)

    userSelectList.add(myUser)


}