package sttgarut.ceritaanakislami;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by user on 1/12/2018.
 */

public class nabi_yunus extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nabi_daud);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                " Yunus membawa ajaran tauhid dan iman. Ia mengajak kaum Ninawa agar menyembah kepada Allah. Ajaran Nabi Yunus merupakan hal yang baru bagi para penduduk Ninawa. Mereka tidak dapat menerimanya. Apalagi pembawa ajaran agama itu adalah seorang asing yang bukan dari golongan mereka. \n"+
                " Selama 33 tahun berdakwah, Nabi Yunus hanya mendapatkan dua orang pengikut saja, yakni Rubil dan Tanukh. Hal ini membuatnya sangat sedih. Ia merasa telah berusaha dengan maksimal untuk mengajak kaum Ninawa kepada Allah. Akan tetapi, ajaran yang disampaikannya tidak sedikit pun menggugah hati mereka. Keadaan ini membuat Yunus putus asa. la berpikir bahwa tidak ada lagi harapan bagi kaum Ninawa untuk bisa beriman kepada Allah. \n"+
                "Pada suatu hari, Yunus telah bersiap-siap membawa perbekalan untuk meninggalkan kaum Niwana. Sebelum meninggalkan mereka, Nabi Yunus memperingatkan akan datang azab jika mereka tidak segera bertobat.\n" +
                "\n" +
                "<br/>" +
                "<br/>" +
                "<br/>" +
                "Tobatnya kaum Ninawa.\n" +
                "<br/>" +
                "Pada awalnya, kepergian Yunus disambut dengan suka cita oleh penduduk Ninawa. Mereka merasa tidak lagi mendapat gangguan dari Nabi Yunus. Akan tetapi, tidak berapa lama, penduduk Ninawa mulai melihat tanda-tanda yang mencemaskan. Mereka melihat awan hitam yang sangat pekat mulai menutupi daerah mereka sedikit demi sedikit. Semakin lama, awan itu akhirnya menutupi langit mereka. Keadaan menjadi sangat gelap. Mereka tidak bisa melihat lagi, kecuali dengan bantuan api yang mereka buat. Keadaan tersebut terus berlanjut. Tidak tampak tanda-tanda akan hilangnya awan gelap tersebut.\n" +
                "Di tengah kekhawatiran yang sangat besar, penduduk Ninawa teringat dengan ucapan Yunus. Mereka mulai berpikir bahwa seruan Yunus adalah kebenaran. Mereka pun semakin khawatir ketika menyadari kejadian ini adalah azab dari Allah.\"\n" +
                "Setelah Nabi Yunus sembuh, Allah memerintahkan agar kembali berdakwah ke Ninawa. Alangkah terkejutnya Nabi Yunus ketika masuk Ninawa. la menemui orang-orang yang dulu menentang ajarannya, kini sudah menjadi orang-orang saleh dan beribadah kepada Allah. Nabi Yunus sangat bersyukur kepada Allah. la bersama Kaum Ninawa bersatu membangun dan membenahi negeri tersebut ke arah yang lebih baik.\n." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}



