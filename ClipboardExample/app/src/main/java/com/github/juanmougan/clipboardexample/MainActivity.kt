package com.github.juanmougan.clipboardexample

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    private val clipboardHandler: ClipboardHandler = ClipboardHandler(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        copyText.setOnClickListener {
            val text = textInput.text.toString()
            clipboardHandler.copy(text)
            Toast.makeText(this, "$text copied to clipboard!", Toast.LENGTH_SHORT).show()
        }
    }

}
