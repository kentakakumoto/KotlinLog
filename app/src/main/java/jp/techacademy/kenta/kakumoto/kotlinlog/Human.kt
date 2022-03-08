package jp.techacademy.kenta.kakumoto.kotlinlog

import android.util.Log

class Human : Animal, Thinkable {
    constructor(name:String, age:Int):super(name,age){
    }

    companion object{
        val hobby = "釣り"
    }

    override fun say(){
        Log.d("kotlintest", "私の名前は"+this.name+"です。年は"+this.age+"歳です。")
    }

    override fun think() {
        Log.d("kotlintest","私は"+hobby+"について考える。")
    }

}