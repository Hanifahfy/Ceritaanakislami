package sttgarut.ceritaanakislami;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by user on 1/11/2018.
 */

public class tentang extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "Aplikasi ini dibuat oleh : "+
                "<br/>" +
                "Dessy Mutiara Komara (1406033) <br>Hanifah Fitriyanti (1406062) <br>Nur Istianah (1406093)"+
                "<br/>" +
                "<br/>" +
                "SEKOLAH TINGGI TEKNOLOGI GARUT <br> 2017"+
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
