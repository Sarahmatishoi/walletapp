package com.example.walletapp

import android.service.quickaccesswallet.WalletCard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter (var transctionList:List<WalletCard>):RecyclerView.Adapter<TransactionViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        var currentransaction=transctionList.get(position)
        holder.tvname.text.currentransaction.name
        holder.tvcurr.text=currentransaction.currency
        holder.tvbal.text=currentransaction.balance
        holder.tvtrans.text=currentransaction.transaction

    }

    override fun getItemCount(): Int {
        return transctionList.size
    }
}


class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvcurr=itemView.findViewById<TextView>(R.id.tvcurr)
    var tvbal=itemView.findViewById<TextView>(R.id.tvbal)
    var tvtrans=itemView.findViewById<TextView>(R.id.tvtrans)
}