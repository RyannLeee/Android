package me.yuanlee.weather

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import java.io.File
import javax.xml.transform.Templates

/**
 * Created by Y-Lee on 2017.06.08.
 */

class ForecastListAdapter(val items:List<String>) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ?, position: Int) {
        holder.textView.text = items.[position]
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}