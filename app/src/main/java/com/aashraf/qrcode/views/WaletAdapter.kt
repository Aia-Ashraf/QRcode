package com.aashraf.qrcode.views

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aashraf.qrcode.R
import com.aashraf.qrcode.models.PaymentsList
import kotlinx.android.synthetic.main.item_wallet.view.*

class WaletAdapter(val items: List<PaymentsList>, val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_wallet, parent, false)
        )
    }

    override fun getItemCount(): Int {
   return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bName.text = items[position].bName
        holder.ammount.text = items[position].bpay
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val bName = view.tv_item_bussiness_name
    val ammount = view.tv_item_bussiness_amount

}