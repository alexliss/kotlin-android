package com.redspot.kotlinandroid

object CounterSingleton {
    var counter = 0;
    val cat = Cat("Cinnamon", 7.8F, 6)
    val cat2 = cat.copy(weight = 6.8F, age = 10)
}