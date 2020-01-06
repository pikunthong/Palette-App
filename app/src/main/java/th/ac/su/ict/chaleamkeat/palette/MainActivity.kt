package th.ac.su.ict.chaleamkeat.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var Showcolor =findViewById<TextView>(R.id.Showcolor)

        btn1.setOnClickListener{
            Showcolor.setText("235-255-221")
            Showcolor.setBackgroundColor(Color.parseColor("#EBE1DD"))


        }
        btn2.setOnClickListener{
            Showcolor.setText("236-203-202")
            Showcolor.setBackgroundColor(Color.parseColor("#ECCBCA"))

        }
        btn3.setOnClickListener{
            Showcolor.setText("117-131-156")
            Showcolor.setBackgroundColor(Color.parseColor("#75839C"))

        }
        btn4.setOnClickListener{
            Showcolor.setText("153-169-191")
            Showcolor.setBackgroundColor(Color.parseColor("#99A9BF"))

        }
        btn5.setOnClickListener{
            Showcolor.setText("195-204-206")
            Showcolor.setBackgroundColor(Color.parseColor("#C3CCD5"))

        }
        btn6.setOnClickListener{
            Showcolor.setText("221-226-269")
            Showcolor.setBackgroundColor(Color.parseColor("#DDE2E5"))

        }




    }
}
