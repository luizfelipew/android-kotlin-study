package br.com.study.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        view.setText("cesta de frutas")
        setContentView(view)
    }
}