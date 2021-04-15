package net.kathir.basicfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()


        btnFragment1.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, firstFragment).
                    addToBackStack(null).
                commit()
            }
        }

        btnFragment2.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, secondFragment).
                    addToBackStack(null).
                commit()
            }

        }
    }
}