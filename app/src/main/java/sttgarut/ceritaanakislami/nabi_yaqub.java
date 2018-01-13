package sttgarut.ceritaanakislami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
/**
 * Created by user on 1/12/2018.
 */

public class nabi_yaqub extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nabi_yaqub);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                " Daud lahir di Palestina. la keturunan Nabi Ibrahim dari anaknya, Nabi Ishag. Walau masih  remaja. \n" +
                " Daud berhasil mengalahkan Raja Jalut yang bertubuh besar dalam peperangan hanya dengan senjata katapel. \n" +
                "Setelah menikah dengan anak Raja Thalut, akhirnya Daud diangkat menjadi Raja. Daerah kekuasaannya meliputi daerah Palestina dan sekitarnya. Daud Wafat di Baitul Maqdis, Palestina.\n" +
                "\n" +
                "<br/>" +
                "<br/>" +
                "<br/>" +
                "Nabi Daud AS Pertempuran Thalut dan Jalut.\n" +
                "<br/>" +
                "Pada suatu hari, Jalut bersama pasukannya datang menyerang bani Israil. Jalut dikenal sebagai pemimpin yang ditakuti karena badannya yang besar dan memiliki kesaktian yang tinggi. Hal ini sangat mengkhawatirkan Thalut dan pasukannya.\n" +
                "Oleh karena itu, Thalut menyusun strategi dan taktik dalam perang. Kemudian, Thalut dan pasukannya bersiap menuju medan pertempuran. Dalam perjalanan, para tentaranya merasa kehausan, mereka ingin sekali istirahat untuk minum. Thalut berkata, \"Sesungguhnya, Allah akan menguji kamu dengan adanya suatu sungai. Siapa diantara kamu meminum airnya, bukanlah ia pengikutku. Siapa yang tidak meminumnya, kecuali menceduk seceduk tangan, dia adalah pengikutku.\"\n" +
                "Saat melewati sungai yang dikatakan Thalut, pasukan Thalut kemudian meminum airnya sebanyak yang diperintahkan Thalut. Namun, beberapa orang di antara mereka tidak mematuhi apa yang diperintahkan oleh pemimpin mereka.\n." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}