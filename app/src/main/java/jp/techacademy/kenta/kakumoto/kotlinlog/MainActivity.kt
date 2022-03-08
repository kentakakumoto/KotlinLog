package jp.techacademy.kenta.kakumoto.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest","ログへの出力テスト")

        val str1 = "Hello"
        val str2 = "World"
        val str3 = "Hello"

        if(str1.equals(str2)){
            Log.d("kotlintest","str1とstr2は一緒です。")
        }else{
            Log.d("kotlintest", "str1とstr2は異なります。")
        }

        if(str1.equals(str3)){
            Log.d("kotlintest","str1とstr3は一緒です。")
        }else{
            Log.d("kotlintest", "str1とstr3は異なります。")
        }

        val man = Human("Taro",12)
        val woman = Human("Hanako",13)
        man.say()
        man.think()
        woman.say()
        woman.think()



       }

}