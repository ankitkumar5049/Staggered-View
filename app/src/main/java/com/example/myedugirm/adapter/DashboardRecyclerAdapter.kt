package com.example.myedugirm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myedugirm.R
import com.example.myedugirm.model.Course
import com.squareup.picasso.Picasso

class DashboardRecyclerAdapter(val context: Context, private val itemList: List<Course>): RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_row,parent,false)

        return DashboardViewHolder(view)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val course = itemList[position]
        holder.txtCourseName.text = course.courseName
        holder.txtCourseNumber.text = course.courseNumber+" Courses"
        //holder.llContent.setBackgroundResource(course.courseImage)
        holder.imgCourseImage.setImageResource(course.courseImage)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class DashboardViewHolder(view: View): RecyclerView.ViewHolder(view){
        val txtCourseName : TextView = view.findViewById(R.id.txtCourseName)
        val txtCourseNumber : TextView = view.findViewById(R.id.txtCourseNumber)
        val imgCourseImage : ImageView = view.findViewById(R.id.imgCurseImage)
        val llContent : LinearLayout = view.findViewById(R.id.llDContent)
    }
}