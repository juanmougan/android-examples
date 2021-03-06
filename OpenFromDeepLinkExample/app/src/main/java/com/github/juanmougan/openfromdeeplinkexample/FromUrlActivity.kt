package com.github.juanmougan.openfromdeeplinkexample

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FromUrlActivity : AppCompatActivity() {

    companion object {
        const val TAG = "FromUrlActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_from_url_actvity)
        val action: String? = intent?.action
        Log.d(TAG, "action: $action")
        val data: Uri? = intent?.data
        Log.d(TAG, "data: $data")
        val paramAndValue = data?.path?.removePrefix("/")?.split("/")
        Toast.makeText(
            this,
            "Param[${paramAndValue?.get(0)}]: ${paramAndValue?.get(1)}",
            Toast.LENGTH_LONG
        )
            .show()
    }
}
