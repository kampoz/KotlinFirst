package com.example.kamilpoznakowski.kotlinfirst
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_tutorial.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        btn_vogella.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                println("Start Vogella")
                val i= Intent(this@MainActivity, TutorialActivity::class.java)
                i.putExtra(Constants.URL_TAG, Urls.VOGELLA_URL)
                startActivity(i)
            }
        })

        btn_tutorials_point.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                println("Start Tutorials point")
                val i = Intent(this@MainActivity, TutorialActivity::class.java)
                i.putExtra(Constants.URL_TAG, Urls.TUTORIALS_POINT_URL)
                startActivity(i)
            }
        })

        btn_mind_dorks.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                println("Start Mind Dorks")
                val i = Intent(this@MainActivity, TutorialActivity::class.java)
                i.putExtra(Constants.URL_TAG, Urls.MIND_DORKS_URL)
                startActivity(i)
            }
        })

    }
}
