package com.salsabilazahrasarwo.klinikapp_mi2c.screen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.salsabilazahrasarwo.klinikapp_mi2c.R
import com.salsabilazahrasarwo.klinikapp_mi2c.adapter.ListDoctorAdapter
import com.salsabilazahrasarwo.klinikapp_mi2c.model.ModelListDoctors

class HomeDoctors : AppCompatActivity() {

    private var rv_list_dostors: RecyclerView? = null
    private var homeDoctorsAdapter: ListDoctorAdapter? = null

    private var doctorList = mutableListOf<ModelListDoctors>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctors)

        rv_list_dostors = findViewById(R.id.rv_list_dostors)
        doctorList = ArrayList()
        homeDoctorsAdapter = ListDoctorAdapter(doctorList);
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        rv_list_dostors!!.layoutManager = layoutManager
        rv_list_dostors!!.adapter = homeDoctorsAdapter

        prepareDataDoctors()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun prepareDataDoctors() {
        var itemDoctors = ModelListDoctors(
            R.drawable.dokter6,
            "Salsa",
            "Dentist",
            "120",
            "5.0"
        )
        doctorList.add(itemDoctors)
        itemDoctors = ModelListDoctors(
            R.drawable.dokter6,
            "Salsa",
            "Obgyn",
            "100",
            "5.0"
        )
        doctorList.add(itemDoctors)
        itemDoctors = ModelListDoctors(
            R.drawable.dokter4,
            "Salsa",
            "Dokter Umum",
            "100",
            "5.0"
        )
        doctorList.add(itemDoctors)
    }
}