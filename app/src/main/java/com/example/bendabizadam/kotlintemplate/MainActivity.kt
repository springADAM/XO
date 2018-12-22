package com.example.bendabizadam.kotlintemplate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"select a letter ",Toast.LENGTH_LONG).show()
    }
    fun btnClick(v:View){
        val b:Button
        b = v as Button
        var btnId=0
        when(b.id){
            R.id.one -> btnId=1
            R.id.two -> btnId=2
            R.id.three -> btnId=3
            R.id.four -> btnId=4
            R.id.five -> btnId=5
            R.id.six -> btnId=6
            R.id.seven -> btnId=7
            R.id.eight -> btnId=8
            R.id.nine -> btnId=9
        }
        playgame(b,btnId)
    }

    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    var activePlayer=1
    fun playgame(button:Button,cellId:Int){
        if(activePlayer==1){
            player1.add(cellId)
            button.setBackgroundResource(R.color.colorPrimary)
            if(X.isChecked) {
                button.text = "X"
                X.isEnabled=false
                O.isEnabled=false
            }else{
                button.text = "O"
                X.isEnabled=false
                O.isEnabled=false
            }
            activePlayer=2
        }else{
            player2.add(cellId)
            button.setBackgroundResource(R.color.colorAccent)
            if(!X.isChecked) {
                button.text = "X"
            }else{
                button.text = "O"
            }
            activePlayer=1
        }
        button.isEnabled=false
        Winner()
    }
    fun Winner(){
        if (player1.contains(1)&&player1.contains(2)&&player1.contains(3)||player1.contains(4)&&player1.contains(5)&&player1.contains(6)||
                player1.contains(7)&&player1.contains(8)&&player1.contains(9)||player1.contains(1)&&player1.contains(4)&&player1.contains(7)||
                player1.contains(2)&&player1.contains(5)&&player1.contains(8)||player1.contains(3)&&player1.contains(6)&&player1.contains(9)||
                player1.contains(1)&&player1.contains(5)&&player1.contains(9)||player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            Toast.makeText(this,"Player one wins",Toast.LENGTH_LONG).show()
            reset()
        }else{
            if (player2.contains(1)&&player2.contains(2)&&player2.contains(3)||player2.contains(4)&&player2.contains(5)&&player2.contains(6)||
                player2.contains(7)&&player2.contains(8)&&player2.contains(9)||player2.contains(1)&&player2.contains(4)&&player2.contains(7)||
                player2.contains(2)&&player2.contains(5)&&player2.contains(8)||player2.contains(3)&&player2.contains(6)&&player2.contains(9)||
                player2.contains(1)&&player2.contains(5)&&player2.contains(9)||player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
                Toast.makeText(this,"Player two wins",Toast.LENGTH_LONG).show()
                reset()
            }
        }
    }
    fun reset(){
        one.setBackgroundResource(android.R.drawable.btn_default)
        one.text = ""
        one.isEnabled=true
        two.setBackgroundResource(android.R.drawable.btn_default)
        two.text = ""
        two.isEnabled=true
        three.setBackgroundResource(android.R.drawable.btn_default)
        three.text = ""
        three.isEnabled=true
        four.setBackgroundResource(android.R.drawable.btn_default)
        four.text = ""
        four.isEnabled=true
        five.setBackgroundResource(android.R.drawable.btn_default)
        five.text = ""
        five.isEnabled=true
        six.setBackgroundResource(android.R.drawable.btn_default)
        six.text = ""
        six.isEnabled=true
        seven.setBackgroundResource(android.R.drawable.btn_default)
        seven.text = ""
        seven.isEnabled=true
        eight.setBackgroundResource(android.R.drawable.btn_default)
        eight.text = ""
        eight.isEnabled=true
        nine.setBackgroundResource(android.R.drawable.btn_default)
        nine.text = ""
        nine.isEnabled=true
        player1=ArrayList<Int>()
        player2= ArrayList<Int>()
        activePlayer=1
        X.isEnabled=true
        O.isEnabled=true
    }
}
