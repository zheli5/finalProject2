package com.example.daniel.stocktracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SP500 extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp500);
        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://money.cnn.com/data/markets/sandp/");
        WebSettings websettings = webview.getSettings();
        websettings.setJavaScriptEnabled(true);

    }

    public void onBackPressd() {
        if (webview.canGoBack()) {
            webview.goBack();

        } else {
            super.onBackPressed();
        }

    }
}
