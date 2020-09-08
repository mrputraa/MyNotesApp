package com.example.mynotesapp

import android.view.View

// Kelas ini bertugas membuat item seperti CardView bisa diklik di dalam adapter.
// Caranya lakukan penyesuaian pada kelas event OnClickListener
class CustomOnItemClickListener (private val position: Int, private val onItemClickCallback: OnItemClickCallback): View.OnClickListener {

    interface OnItemClickCallback {
        fun inItemClicked(view: View, position: Int)
    }


    override fun onClick(view: View) {
        onItemClickCallback.inItemClicked(view, position)
    }

}