package com.sias.first

fun main(args: Array<String>) {
    println("hello world")
    println(sum1(0,1))
    println(sum2(0,2))
    println(sum3(0,3))
    println(sum4(0,4))
    println(sum5(0,5))
    vars(1,2,3,4,5,6)
    val sumlambda:(Int,Int)->Int={x,y -> x+y}
    println(sumlambda(1,4))

    var a1 =1
    var a2:Int=1
    var a3:Int
    a3 = 1
    var x=5
    x+=1
    var a = 1
    val s1 = "a is $a"
    var b = 1
    val s2 = "${s1.replace("is","was")},but now is $a"
    println(b)
    println(a)
    println(s2)
    println(s1)
}

/*fun关键字创建函数，参数格式是 参数：类型  如 a:Int*/
fun sum1(a:Int,b:Int):Int {
    return a+b
}

fun sum2(a:Int,b:Int)=a+b

public fun sum3(a:Int,b:Int):Int=a+b

fun sum4(a:Int,b:Int): Unit {
    println(a+b)
}

public fun sum5(a:Int,b:Int) {
    println(a+b)
}

fun vars(vararg vargs:Int): Unit {
    for (v in vargs){
        print(v)
    }
}
