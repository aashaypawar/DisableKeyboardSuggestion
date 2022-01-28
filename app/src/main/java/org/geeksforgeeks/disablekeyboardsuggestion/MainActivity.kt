package org.geeksforgeeks.disablekeyboardsuggestion

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mEditText = findViewById<EditText>(R.id.edit_text_1)
        mEditText.inputType = EditorInfo.TYPE_TEXT_FLAG_NO_SUGGESTIONS
    }
}