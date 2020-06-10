package com.aashraf.qrcode.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.aashraf.qrcode.R
import com.aashraf.qrcode.models.PaymentsList
import com.aashraf.qrcode.models.WaletModel
import kotlinx.android.synthetic.main.activity_wallet.*

class Wallet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
        var waletModel = WaletModel()
        val animals: List<PaymentsList> = listOf(
            PaymentsList("Hyper Market", "30$")
        )
        tv_available_balance.text = waletModel.availableBalance
        rv_payments_wallet.layoutManager = LinearLayoutManager(this)
        var adapter = WaletAdapter(animals, this)
        rv_payments_wallet.adapter = adapter

        navigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_qrCode -> {
                    navigateToClass(ScaningActivity::class.java)
                }
                R.id.navigation_profile -> {
                    navigateToClass(Profile::class.java)

                }
            }
            true
        }
    }

    private fun navigateToClass(x: Class<out Any>) {
        val intent = Intent(this, x)
        startActivity(intent)
    }
}
