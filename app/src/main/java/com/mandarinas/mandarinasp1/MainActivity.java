package com.mandarinas.mandarinasp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView plazatoros;
    WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plazatoros = (WebView)findViewById(R.id.plazatoros);
        webSettings = plazatoros.getSettings();
        webSettings.setJavaScriptEnabled(true);

        plazatoros.loadUrl("https://www.youtube.com/embed/7ynQKQzTK2g");
        plazatoros.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if(plazatoros.canGoBack()){
            plazatoros.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
