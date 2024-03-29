package com.efom.randomlearn.adapters.web

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.efom.randomlearn.R

class RecyVH_Web(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imgBtn_edit: ImageButton
    val imgBtn_play: ImageButton
    val tVNombre_CM: TextView
    private val tVTAprendidos_CM: TextView
    private val tVTTotal_CM: TextView
    private val tVItem_CM: TextView
    fun gettVTAprendidos_CM(): TextView {
        return tVTAprendidos_CM
    }

    fun gettVTTotal_CM(): TextView {
        return tVTTotal_CM
    }

    fun gettVItem_CM(): TextView {
        return tVItem_CM
    }

    init {
        imgBtn_edit = itemView.findViewById(R.id.imgBtn_edit)
        imgBtn_play = itemView.findViewById(R.id.framBtn_play)
        tVNombre_CM = itemView.findViewById(R.id.tVNombre_CM)
        tVTAprendidos_CM = itemView.findViewById(R.id.tVTAprendidos_CM)
        tVTTotal_CM = itemView.findViewById(R.id.tVTTotal_CM)
        tVItem_CM = itemView.findViewById(R.id.tVItem_CM)
    }
}