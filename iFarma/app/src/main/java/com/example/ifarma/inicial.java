package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        final Button btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                WebView wv = (WebView)findViewById(R.id.webview1);
                WebSettings ws= wv.getSettings();
                ws.setJavaScriptEnabled(true);
                ws.setSupportZoom(false);
                String html = "<html>";
                html+="<body>";
                html+="<style>";
                html+="</style>";
                html+="<center>";
                html+="<iframe src='https://www.google.com/maps/embed/v1/place?q=Dograria%20Brasil&key=347324300422-9u4unodp88p595kso3qfrk09usn66ug3.apps.googleusercontent.com'></iframe>";
                html+="</center>";
                html+="</body>";
                html+="</html>";
                wv.loadData(html, "text/html", "UTF-8");
            }
        });
    }
}