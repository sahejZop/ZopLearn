package com.example.zoplearn

import kotlin.lazy as lazy1

interface base{
    fun print()
}

class baseImplemented(val x: Int): base{
    override fun print(){
        println("1 $x")
    }
}

class baseImplemented2(val x: Int): base{
    override fun print(){
        print("2 $x")
    }
}

class Derived(b: base) : base by b

fun main()
{
    val b = baseImplemented2(15)
    Derived(b).print()

    val num: Int by lazy1 {
        5
    }
    println(num)

    val lazyValue: String by lazy1()
    {
        // Printing to standard output
        println("GeeksforGeeks")
        "hello"
    }
}
