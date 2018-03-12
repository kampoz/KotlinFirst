package com.example.kamilpoznakowski.kotlinfirst

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class TutorialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wv.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }

        val url: String = intent.getStringExtra(Constants.URL_TAG)
        wv.loadUrl(url)
    }

    override fun onBackPressed() {
        if (wv.canGoBack()){
            wv.goBack()
        } else {
            super.onBackPressed()
        }

    }
}


class Alien {
    var name: String = ""
}

//Nadpisywanie widoków w Kotlinie:

class CustomWebView : WebView {
    val url2 : String = ""

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
    }
//    constructor(context: Context) : this(context, null)
}

class CustomWebView2(context: Context?) : WebView(context) {
}
