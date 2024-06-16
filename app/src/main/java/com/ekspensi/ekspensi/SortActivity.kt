package com.ekspensi.ekspensi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class SortActivity : AppCompatActivity() {
    lateinit var buttonApply: Button
    lateinit var buttonSave: Button
    lateinit var selectorMonth: LinearLayout
    lateinit var selectorToday: LinearLayout
    lateinit var selectorWeek: LinearLayout
    lateinit var selectorDate: LinearLayout
    lateinit var selectorAll: LinearLayout
    lateinit var selectorIn: LinearLayout
    lateinit var selectorOut: LinearLayout
    lateinit var iconToday: ImageView
    lateinit var iconWeek: ImageView
    lateinit var iconMonth: ImageView
    lateinit var iconDate: ImageView
    lateinit var iconAll: ImageView
    lateinit var iconIn: ImageView
    lateinit var iconOut: ImageView
    lateinit var selectorMonth1: LinearLayout
    lateinit var selectorMonth2: LinearLayout
    lateinit var selectorMonth3: LinearLayout
    lateinit var selectorMonth4: LinearLayout
    lateinit var selectorMonth5: LinearLayout
    lateinit var selectorMonth6: LinearLayout
    lateinit var selectorMonth7: LinearLayout
    lateinit var selectorMonth8: LinearLayout
    lateinit var selectorMonth9: LinearLayout
    lateinit var selectorMonth10: LinearLayout
    lateinit var selectorMonth11: LinearLayout
    lateinit var selectorMonth12: LinearLayout
    lateinit var iconMonth1: ImageView
    lateinit var iconMonth2: ImageView
    lateinit var iconMonth3: ImageView
    lateinit var iconMonth4: ImageView
    lateinit var iconMonth5: ImageView
    lateinit var iconMonth6: ImageView
    lateinit var iconMonth7: ImageView
    lateinit var iconMonth8: ImageView
    lateinit var iconMonth9: ImageView
    lateinit var iconMonth10: ImageView
    lateinit var iconMonth11: ImageView
    lateinit var iconMonth12: ImageView
    lateinit var blurBcg: View
    lateinit var modalPopup: LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)

        buttonApply = findViewById(R.id.btnApply)
        buttonSave = findViewById(R.id.btnSave)
        selectorToday = findViewById(R.id.itemSortToday)
        selectorWeek = findViewById(R.id.itemSortLastWeek)
        selectorDate = findViewById(R.id.itemSortDate)
        selectorMonth = findViewById(R.id.itemSortMonth)
        selectorAll = findViewById(R.id.itemSortAll)
        selectorIn = findViewById(R.id.itemSortIn)
        selectorOut = findViewById(R.id.itemSortOut)
        iconToday = findViewById(R.id.btn_sort_1)
        iconWeek = findViewById(R.id.btn_sort_2)
        iconMonth = findViewById(R.id.btn_sort_3)
        iconDate = findViewById(R.id.btn_sort_4)
        iconAll = findViewById(R.id.btn_sort_5)
        iconIn = findViewById(R.id.btn_sort_6)
        iconOut = findViewById(R.id.btn_sort_7)
        blurBcg = findViewById(R.id.blur)
        modalPopup = findViewById(R.id.popUp)

        //icon radio month
        iconMonth1 = findViewById(R.id.iconMonth1)
        iconMonth2 = findViewById(R.id.iconMonth2)
        iconMonth3 = findViewById(R.id.iconMonth3)
        iconMonth4 = findViewById(R.id.iconMonth4)
        iconMonth5 = findViewById(R.id.iconMonth5)
        iconMonth6 = findViewById(R.id.iconMonth6)
        iconMonth7 = findViewById(R.id.iconMonth7)
        iconMonth8 = findViewById(R.id.iconMonth8)
        iconMonth9 = findViewById(R.id.iconMonth9)
        iconMonth10 = findViewById(R.id.iconMonth10)
        iconMonth11 = findViewById(R.id.iconMonth11)
        iconMonth12 = findViewById(R.id.iconMonth12)

        //selector month
        selectorMonth1 = findViewById(R.id.selectorMonth1)
        selectorMonth2 = findViewById(R.id.selectorMonth2)
        selectorMonth3 = findViewById(R.id.selectorMonth3)
        selectorMonth4 = findViewById(R.id.selectorMonth4)
        selectorMonth5 = findViewById(R.id.selectorMonth5)
        selectorMonth6 = findViewById(R.id.selectorMonth6)
        selectorMonth7 = findViewById(R.id.selectorMonth7)
        selectorMonth8 = findViewById(R.id.selectorMonth8)
        selectorMonth9 = findViewById(R.id.selectorMonth9)
        selectorMonth10 = findViewById(R.id.selectorMonth10)
        selectorMonth11 = findViewById(R.id.selectorMonth11)
        selectorMonth12 = findViewById(R.id.selectorMonth12)

        buttonApply.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("apply", "apply")
            startActivity(intent)
        })

        selectorMonth1.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_active)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth2.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_active)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth3.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_active)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth4.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_active)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth5.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_active)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth6.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_active)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth7.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_active)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth8.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_active)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth9.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_active)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth10.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_active)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth11.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_active)
            iconMonth12.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorMonth12.setOnClickListener(View.OnClickListener {
            iconMonth1.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth2.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth3.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth4.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth5.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth6.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth7.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth8.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth9.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth10.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth11.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth12.setImageResource(R.drawable.ic_radio_active)
        })

        selectorToday.setOnClickListener(View.OnClickListener {
            iconToday.setImageResource(R.drawable.ic_radio_active)
            iconWeek.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth.setImageResource(R.drawable.ic_radio_unactive)
            iconDate.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorWeek.setOnClickListener(View.OnClickListener {
            iconToday.setImageResource(R.drawable.ic_radio_active)
            iconWeek.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth.setImageResource(R.drawable.ic_radio_unactive)
            iconDate.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorDate.setOnClickListener(View.OnClickListener {
            iconToday.setImageResource(R.drawable.ic_radio_unactive)
            iconWeek.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth.setImageResource(R.drawable.ic_radio_unactive)
            iconDate.setImageResource(R.drawable.ic_radio_active)
        })

        selectorAll.setOnClickListener(View.OnClickListener {
            iconAll.setImageResource(R.drawable.ic_radio_active)
            iconIn.setImageResource(R.drawable.ic_radio_unactive)
            iconOut.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorIn.setOnClickListener(View.OnClickListener {
            iconAll.setImageResource(R.drawable.ic_radio_unactive)
            iconIn.setImageResource(R.drawable.ic_radio_active)
            iconOut.setImageResource(R.drawable.ic_radio_unactive)
        })

        selectorOut.setOnClickListener(View.OnClickListener {
            iconAll.setImageResource(R.drawable.ic_radio_unactive)
            iconIn.setImageResource(R.drawable.ic_radio_unactive)
            iconOut.setImageResource(R.drawable.ic_radio_active)
        })

        selectorMonth.setOnClickListener(View.OnClickListener {
            blurBcg.setVisibility(View.VISIBLE)
            modalPopup.setVisibility(View.VISIBLE)

            iconToday.setImageResource(R.drawable.ic_radio_unactive)
            iconWeek.setImageResource(R.drawable.ic_radio_unactive)
            iconMonth.setImageResource(R.drawable.ic_radio_active)
            iconDate.setImageResource(R.drawable.ic_radio_unactive)
        })

        buttonSave.setOnClickListener(View.OnClickListener {
            blurBcg.setVisibility(View.GONE)
            modalPopup.setVisibility(View.GONE)
        })

        blurBcg.setOnClickListener(View.OnClickListener {
            blurBcg.setVisibility(View.GONE)
            modalPopup.setVisibility(View.GONE)
        })
    }
}