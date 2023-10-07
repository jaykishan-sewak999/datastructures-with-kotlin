package com.jecky.datastructures.util

object Sorting {

    fun selectionSort(arr: IntArray? = null) {

    }

    fun bubbleSort(arr: IntArray? = null) {

        println("Before Sort")
        arr?.map { element -> println(element) }

        for (i in arr?.indices!!) {
            for (j in i + 1 until arr.size) {
                if (arr[i] > arr[j]){
                    var tmp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = tmp
                }
            }
        }
        println("After Sort")
        for (element in arr){
            println(element)
        }
    }

}