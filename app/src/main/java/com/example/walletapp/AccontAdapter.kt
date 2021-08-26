package com.example.walletapp

import android.service.quickaccesswallet.WalletCard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AccontAdapter(var walleList: List<WalletCard>):RecyclerView.Adapter<AmountViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AmountViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AmountViewHolder, position: Int) {
        var currentCourse=walleList.get(position)
        holder.tvdesc.text=currentCourse.description
        holder.tvdate.text=currentCourse.CourseName
        holder.tvref.text=currentCourse.Instructor
        holder.tvamout.text=currentCourse.amou

    }

    override fun getItemCount(): Int {
       return walleList.size
    }

}
//var courseList:List<Courses>):RecyclerView.Adapter<CoursesViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
//        var itemView=
//            LayoutInflater.from(parent.context).inflate(R.layout.courses_list_item,parent,false)
//        return  CoursesViewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
//        var currentCourse=courseList.get(position)
//        holder.tvCode.text=currentCourse.CourseCode
//        holder.tvCourseName.text=currentCourse.CourseName
//        holder.tvName.text=currentCourse.Instructor
//        holder.tvdescription.text=currentCourse.CourseDescription
//    }
//
//    override fun getItemCount(): Int {
//        return courseList.size
//    }
//}
class AmountViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvdesc=itemView.findViewById<TextView>(R.id.tvdesc)
    var tvdate=itemView.findViewById<TextView>(R.id.tvdate)
    var tvref=itemView.findViewById<TextView>(R.id.tvref)
    var tvamout=itemView.findViewById<TextView>(R.id.tvamount)
}