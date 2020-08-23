package kr.co.tjoeun.intentexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener {

            val myIntent = Intent(this,OtherActivity::class.java)

            val sendMessage = sendMassage.text.toString()

            myIntent.putExtra("message",sendMessage)

            startActivity(myIntent)


        }



    }
}