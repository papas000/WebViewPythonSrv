package com.gmail.papas000.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);

        myWebView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebView.loadUrl("https://papas000.eu.pythonanywhere.com");

    }
}

//loadUrl() works with:
//
//https:// and https://URLs
//file:// URLs pointing to the local filesystem
//file:///android_asset/ URLs pointing to one of your applications assets
//content:// URLs pointing to a ContentProvider that is publishing content
//available for streaming