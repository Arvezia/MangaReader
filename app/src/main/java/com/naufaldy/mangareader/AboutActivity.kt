package com.naufaldy.mangareader

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_page)
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
                this.startActivity(Intent(this, AboutActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}