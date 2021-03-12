package com.naufaldy.mangareader

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.manga_list_menu.view.*
import kotlinx.android.synthetic.main.manga_page.*
import kotlinx.android.synthetic.main.manga_page.view.*

class MangaDetail:AppCompatActivity() {
    companion object{
    const val EXTRA_NAME ="extra name"
    const val EXTRA_SYNOPSIS = "extra synopsis"
    const val EXTRA_COVER = "extra cover"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manga_page)

        val nameReceived: TextView = findViewById(R.id.ln_manga_title)
        val coverReceived: ImageView = findViewById(R.id.MangaImg)
        val synopsisReceived: TextView = findViewById(R.id.ln_manga_synopsis)

        val tvMangaReceived: TextView =findViewById(R.id.tv_manga_title)

        val name =intent.getStringExtra(EXTRA_NAME)
        val synopsis = intent.getStringExtra(EXTRA_SYNOPSIS)
        val cover = intent.getIntExtra(EXTRA_COVER, 0)



        nameReceived.text = name
        //coverReceived.
        synopsisReceived.text = synopsis





    }
}