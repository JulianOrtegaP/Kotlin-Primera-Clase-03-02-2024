package com.co.upb.edu.primeraclase.clases

import com.co.upb.edu.primeraclase.newTopic

// copy metodo para modificar los item en un objeto
fun main(){

    newTopic("Clases")

    val phone = Phone(12345)

    phone.call()
    phone.showNumber()

    // Herencia

    newTopic("Herencias")

    val smart = SmartPhone(12345,true)
    smart.call()
    smart.showNumber()

    println("¿ El numero es privado? ${if (smart.isPrivate)"si" else "no"}")

    // Data Classes

    newTopic("Data classes")

    val myUser = User(0,"leon","giraldo", Group.FAMILY.ordinal)

    var bro = myUser.copy(1,"ivan")

    var friend = bro.copy(2, group = Group.FRIEND.ordinal)

    println(myUser)
    println(bro)
    println(friend)
    println(myUser.component3())


    // METODOS PROPIOS -- PARA LLAMAR A VARIOS METODOS DE UNA INSTANCIA

     newTopic("Funciones de alcance")

    with(smart){

        call()
        showNumber()
        println("Privado? $isPrivate" )


    }

    friend.group = Group.FRIEND.ordinal
    friend.name = "juan"
    friend.apply {

        name = "fede"
        lastName = "gomez"
        group = Group.FRIEND.ordinal
    }

    println(friend)



    }

