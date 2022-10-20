package com.example.a100tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import com.example.a100tasks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf("byte", "short", "int", "long", "float", "double", "boolean", "char", "string")
        val adapter = ArrayAdapter(this, R.layout.list_item, list)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> startAlertDialog(R.string.byte_)
                1 -> startAlertDialog(R.string.short_)
                2 -> startAlertDialog(R.string.int_)
                3 -> startAlertDialog(R.string.long_)
                4 -> startAlertDialog(R.string.float_)
                5 -> startAlertDialog(R.string.double_)
                6 -> startAlertDialog(R.string.boolean_)
                7 -> startAlertDialog(R.string.char_)
                8 -> startAlertDialog(R.string.string_)
            }
        }
    }
private fun startAlertDialog (s: Int){
    val builder = AlertDialog.Builder(this, R.style.AlertDialog)
    builder.setMessage(s)
    builder.show()

}


}