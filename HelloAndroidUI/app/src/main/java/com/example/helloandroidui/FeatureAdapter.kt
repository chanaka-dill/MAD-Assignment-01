package com.example.helloandroidui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Feature(val title: String, val desc: String)

class FeatureAdapter(private val features: List<Feature>) :
    RecyclerView.Adapter<FeatureAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tvFeatureTitle)
        val tvDesc: TextView = view.findViewById(R.id.tvFeatureDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_feature, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val feature = features[position]
        holder.tvTitle.text = feature.title
        holder.tvDesc.text = feature.desc
    }

    override fun getItemCount() = features.size
}