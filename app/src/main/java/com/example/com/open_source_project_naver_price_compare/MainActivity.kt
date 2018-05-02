package com.example.com.open_source_project_naver_price_compare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private var database: FirebaseDatabase? = null
    private var databaseRef: DatabaseReference? = null
    private val thing: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        database = FirebaseDatabase.getInstance()
        databaseRef = database!!.getReference("massage")

        //   databaseRef.setValue("Hello world");

        //   thing =
        databaseRef!!.child("wishlist").child("for the url from NAVER API").setValue(thing)

    }
}
