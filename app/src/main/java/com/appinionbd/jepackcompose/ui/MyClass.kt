package com.appinionbd.jepackcompose.ui

import com.appinionbd.jepackcompose.Interface

class MyClass(val myIn:Interface) : Interface {

    override fun add(): String {
        return "value"
    }

}