 package com.ekspensi.ekspensi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

 class MainActivity : AppCompatActivity() {
     lateinit var btnFilter: ImageView
     lateinit var btnAdd: ImageView
     lateinit var blurBcg: View
     lateinit var modalSuccess: LinearLayout
     lateinit var buttonContinue: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFilter = findViewById(R.id.btn_filter)
        btnAdd = findViewById(R.id.btn_add)
        blurBcg = findViewById(R.id.blur)
        modalSuccess = findViewById(R.id.modalCard)
        buttonContinue = findViewById(R.id.btnContinue)

        val bundle = intent.extras
        if (bundle != null) {
            val applyValue = bundle.getString("apply")

            if(applyValue != null && applyValue != ""){
                blurBcg.setVisibility(View.VISIBLE)
                modalSuccess.setVisibility(View.VISIBLE)
            }
        } else {
            blurBcg.setVisibility(View.GONE)
            modalSuccess.setVisibility(View.GONE)
        }

        btnFilter.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SortActivity::class.java)
            startActivity(intent)
        })

        btnAdd.setOnClickListener(View.OnClickListener {
            blurBcg.setVisibility(View.VISIBLE)
            modalSuccess.setVisibility(View.VISIBLE)
        })

        buttonContinue.setOnClickListener(View.OnClickListener {
            blurBcg.setVisibility(View.GONE)
            modalSuccess.setVisibility(View.GONE)
        })

        blurBcg.setOnClickListener(View.OnClickListener {
            blurBcg.setVisibility(View.GONE)
            modalSuccess.setVisibility(View.GONE)
        })
    }


}