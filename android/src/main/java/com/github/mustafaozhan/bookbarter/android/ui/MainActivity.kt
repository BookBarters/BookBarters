/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.android.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import co.touchlab.kermit.Kermit
import com.github.mustafaozhan.bookbarter.android.R
import com.github.mustafaozhan.bookbarter.client.di.getForAndroid
import com.github.mustafaozhan.bookbarter.client.main.MainViewModel
import org.koin.android.ext.android.getKoin
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()
    private val kermit: Kermit by lazy { getKoin().getForAndroid(Kermit::class) }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kermit.d { "MainActivity onCreate" }
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "${mainViewModel.getPlatformName()}\n${mainViewModel.runCounter} times ran"
    }
}
