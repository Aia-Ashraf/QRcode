package com.aashraf.qrcode.models

data class WaletModel(
    var availableBalance: String = "300$",
    var paymentsList: List<PaymentsList> = listOf(
        PaymentsList("hyper market", "30$")
    )
)

data class PaymentsList(var bName: String = "hyper market", var bpay: String = "30$")