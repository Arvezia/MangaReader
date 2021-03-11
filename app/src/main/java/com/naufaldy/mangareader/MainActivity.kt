package com.naufaldy.mangareader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),  View.OnClickListener {

    private lateinit var rvManga: RecyclerView
    private var list: ArrayList<Manga> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvManga = findViewById(R.id.rv_manga)
        rvManga.setHasFixedSize(true)

        list.addAll(MangaList.listdata)
        showRecyclerList()

        val readManga : Button = findViewById(R.id.btn_read_manga)
        readManga.setOnClickListener(this)
    }
    private fun showRecyclerList(){
        rvManga.layoutManager  = LinearLayoutManager(this)
        val listMangaAdapter = ListMangaAdapter(list)
        rvManga.adapter = listMangaAdapter

        /*listMangaAdapter.setOnItemClickCallback(object : ListMangaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Manga) {
                showSelectedManga(data)
            }
        })*/
    }

    override fun onClick(v: View){
        when (v.id){
            R.id.btn_read_manga ->{
                val moveIntent = Intent(this@MainActivity, MangaActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_read_manga ->{

                val moveManga = Intent (this@MainActivity, MangaDetail::class.java)
                moveManga.putExtra(MangaDetail.EXTRA_NAME,)
                moveManga.putExtra(MangaDetail.EXTRA_COVER)
                moveManga.putExtra(MangaDetail.EXTRA_SYNOPSIS)
                startActivity(moveManga)

            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_page -> {
            this.startActivity(Intent(this, MainActivity::class.java))
                return true
        }
            R.id.about_page -> {
            this.startActivity(Intent(this@MainActivity, AboutActivity::class.java))
                return true
        }
        }
        return super.onOptionsItemSelected(item)
    }




  /*  private fun showSelectedManga (manga: Manga){
            title = manga.name
           val moveManga  = Intent(this, MangaActivity::class.java))
            moveManga.putExtra(moveManga.EXTRA_NAME, )

        }*/
    }
