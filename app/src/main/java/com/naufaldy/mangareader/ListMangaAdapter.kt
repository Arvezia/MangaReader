package com.naufaldy.mangareader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMangaAdapter(private val listManga: ArrayList<Manga>) :
    RecyclerView.Adapter<ListMangaAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_manga_title)
        var tvCover: ImageView = itemView.findViewById(R.id.MangaImg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.manga_list_menu, parent , false)
        return ListViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listManga.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val manga = listManga[position]
        Glide.with(holder.itemView.context)
            .load(manga.cover)
            .apply(RequestOptions().override(70,100))
            .into(holder.tvCover)

        holder.tvName.text = manga.name
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listManga[holder.adapterPosition])
        }
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Manga)
    }
}