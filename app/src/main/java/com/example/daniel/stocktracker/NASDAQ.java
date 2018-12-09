package com.example.daniel.stocktracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NASDAQ extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasdaq);

        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://money.cnn.com/data/markets/nasdaq/");
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
