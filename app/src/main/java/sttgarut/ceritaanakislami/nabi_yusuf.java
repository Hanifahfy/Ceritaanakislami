package sttgarut.ceritaanakislami;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
/**
 * Created by user on 1/11/2018.
 */

public class nabi_yusuf extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nabi_yusuf);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "Rasa sayang dan cinta yang ditunjukkan oleh Nabi Yaqub kepada Yusuf ternyata telah menimbulkan kebencian saudara-saudaranya. Mereka iri dan dengki. Mereka merasa Yusuf lebih dicintai daripada mereka. Adik Nabi Yusuf yang bernama Bunyamin pun ikut dibenci karena dianggap telah mendapatkan kasih sayang yang sama seperti Yusuf.\n" +
                "\n" +
                "<br/>"+
                "Dalam sebuah pertemuan rahasia, saudara-saudara Yusuf yang iri hati berkumpul untuk membuat sebuah rencana keji. Salah satu dari mereka berkata, \"Sesungguhnya Yusuf dan Bunyamin lebih dicintai oleh ayah kita daripada kita sendiri, padahal kita ini adalah anak dari ayah kita juga. Ayah kita rupanya telah keliru dalam hal ini.\n" +
                "\n" +
                "<br/>"+
                "\"Bunuhlah Yusuf atau buanglah dia ke suatu daerah yang tidak dikenal supaya perhatian ayah kita tertumpah kepada kita semua,\" ujar salah satu saudara Yusuf.\n" +
                "Yahuda, anak keempat Nabi Yaqub, tampaknya tidak sependapat. la berkata. Janganlah kalian membunuh Yusuf, tapi masukkanlah dia ke dalam sumur yang sering dilewati dan dijadikan tempat peristirahan para musafir. Dengan demikian, jika nanti para musafir itu menemukannya, mereka membawanya jauh dari kita. Mungkin nanti Yusuf akan dijual sebagai budak. Setelah itu, kita bertobat kepada Allah atas dosa-dosa kita dan menjadi orang yang senantiasa berbuat baik. \n" +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}

