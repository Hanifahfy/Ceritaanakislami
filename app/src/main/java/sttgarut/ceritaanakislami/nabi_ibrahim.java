package sttgarut.ceritaanakislami;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
/**
 * Created by user on 1/11/2018.
 */

/**
 * Created by user on 1/12/2018.
 */

public class nabi_ibrahim  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nabi_musa_dan_nabi_harun);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "Nabi Ismail adalah putra nabi Ibrahim dengan istri mudahnya yakni Siti Hajar. Siti Hajar adalah budak yang diberikan oleh Raja Mesir kepada Nabi Ibrahim a.s. Atas  persetujuan Siti Sarah akhirnya nabi Ibrahim mau menikahi Siti Hajar. Setelah menikah dengan Nabi Ibrahim, Siti Hajar akhirnya mengandung. Namun, ia menyembunyikan kandungannya dari Siti Sarah yang sudah lama menikah. Tapi belum juga di karuniai seorang anak. Sekeras apapun Siti Hajar menyembunyikan kandungannya, akhirnya terungkap juga rahasia tersebut.  Dari rahim Siti Hajar lahirlah seorang anak  laki-laki yang kemudian diberi nama Ismail.\n" +
                "Setelah kelahiran Ismail, Allah Subhaanahu wa Ta’ala memerintahkan Nabi Ibrahim membawa  pergi Siti Hajar dan Ismail ke Mekah, maka Nabi Ibrahim memenuhi perintah itu dan ia pun pergi membawa keduanya ke Mekah di dekat tempat yang nantinya akan dibangunkan ka’bah.  Pada saat itu masih padang pasir kosong yang belum di diami oleh manusia.\n. \n"+
                "Siti hajar begitu cemas dan sedih ketika Nabi ibrahim akan meninggalkannya seorang diri bersama anaknya yang masih kecil, di tempat yang begitu sunyi senyap, tidak ada orang sama sekali, kecuali hanya pasir dan batu. Seraya merintih dan menangis, ia memegang kuat-kuat baju Nabi ibrahim as sambil memohon belas kasihannya, meminta agar ia tidak ditinggalkan seorang diri di tempat yang begitu hampa, tdak ada seorang manusia sama sekali, tidak ada binatang, tidak ada pohon dan air mengalir pun juga tidak terlihat di tempat itu. Semenara itu ia masih bertanggung jawab untuk mengasuh anak kecil yang masih menyusu kepadanya. \n"+
                "Lalu atas perintah Allah Swt Nabi Ibrahim a.s. pun kembali ke negri Syam pada istri pertamanya yaitu Siti Sarah.\n" +
                "\n" +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}

