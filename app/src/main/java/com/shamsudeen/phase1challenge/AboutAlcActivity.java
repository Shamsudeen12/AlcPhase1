package com.shamsudeen.phase1challenge;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlcActivity extends AppCompatActivity {

  WebView mWebView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about_alc);

    setTitle("About Alc");
    mWebView = findViewById(R.id.webview);
    mWebView.getSettings().setJavaScriptEnabled(true);
    mWebView.getSettings().setLoadWithOverviewMode(true);
    mWebView.getSettings().setUseWideViewPort(true );
    mWebView.setWebViewClient(new WebViewClient() {
      @Override
      public void onReceivedSslError(WebView v, SslErrorHandler handler, SslError er) {
        handler.proceed();
      }
    });


    mWebView.loadUrl("https://www.andela.com/alc");


  }

}




