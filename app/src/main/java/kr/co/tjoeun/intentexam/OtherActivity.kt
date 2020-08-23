package kr.co.tjoeun.intentexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val receivedMessage = intent.getStringExtra("message")
       receivedMessage1.text = receivedMessage

      btnBack.setOnClickListener {

          finish()

      }

    }
}