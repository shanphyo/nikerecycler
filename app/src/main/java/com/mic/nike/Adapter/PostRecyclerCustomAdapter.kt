package com.mic.findcrush.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mic.nike.R
import com.mic.nike.Shoe
import kotlinx.android.synthetic.main.itemnike.view.*


class PostRecyclerCustomAdapter(var postlist:ArrayList<Shoe>) :RecyclerView.Adapter<PostRecyclerCustomAdapter.postViewHolder>(){
    inner  class  postViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun postData(post: Shoe){
            itemView.iv_image.setImageResource(post.shoeimg)
            itemView.tv_no.text=post.no
            itemView.tv_shoename.text=post.shoename
            itemView.tv_shoetype.text=post.shoetype
            itemView.tv_shoeprice.text=post.shoeprice

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.itemnike,parent,false)
        return postViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  postlist.size
    }

    override fun onBindViewHolder(holder: postViewHolder, position: Int) {
        holder.postData(postlist[position])
    }

}