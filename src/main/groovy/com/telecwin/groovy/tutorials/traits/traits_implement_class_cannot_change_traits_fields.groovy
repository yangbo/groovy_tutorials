package com.telecwin.groovy.tutorials.traits

/**
 * traits 的 属性不能被重载定义，但是可以赋值改变。
 */


trait IntCouple {
    int x = 1
    int y = 2

    int sum() { x + y }
}

class ElemWrong implements IntCouple {
    int x = 3
    int y = 4

    int f() {
        sum()
    }
}

def elemWrong = new ElemWrong()
assert elemWrong.f() != 7

class Elem implements IntCouple {
//    int x = 3
//    int y = 4

    int f() {
        x = 3
        y = 4
        sum()
    }
}

def elem = new Elem()
assert elem.f() == 7
