package com.aashraf.qrcode.views

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.zxing.Result
import me.dm7.barcodescanner.zxing.ZXingScannerView

class ScaningActivity : Activity(), ZXingScannerView.ResultHandler {
    private var mScannerView: ZXingScannerView? = null
    public override fun onCreate(state: Bundle?) {
        super.onCreate(state)
        mScannerView = ZXingScannerView(this) // Programmatically initialize the scanner view
        setContentView(mScannerView) // Set the scanner view as the content view
    }

    public override fun onResume() {
        super.onResume()
        mScannerView!!.setResultHandler(this) // Register ourselves as a handler for scan results.
        mScannerView!!.startCamera() // Start camera on resume
    }

    public override fun onPause() {
        super.onPause()
        mScannerView!!.stopCamera() // Stop camera on pause
    }

    override fun handleResult(rawResult: Result?) {
        // Do something with the result here
        Log.v("ScaningActivityyy", rawResult?.getText()) //
        Toast.makeText(this,rawResult?.text,Toast.LENGTH_LONG)// Prints scan results
        Log.v(
            "ScaningActivityyy",
            rawResult?.getBarcodeFormat().toString()
        ) // Prints the scan format (qrcode, pdf417 etc.)
        // If you would like to resume scanning, call this method below:
        mScannerView!!.resumeCameraPreview(this)
    }
}