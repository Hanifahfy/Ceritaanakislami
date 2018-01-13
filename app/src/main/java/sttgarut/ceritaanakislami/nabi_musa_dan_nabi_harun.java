package sttgarut.ceritaanakislami;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
/**
 * Created by user on 1/12/2018.
 */

public class nabi_musa_dan_nabi_harun extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nabi_musa_dan_nabi_harun);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                " Nabi Musa lahir dan diutus untuk berdakwah di Mesir ditemani oleh saudaranya yang bernama Nabi Harun. Setelah melalui berbagai rintangan dan cobaan, akhirnya Nabi Musa dan Nabi Harun berhasil membebaskan dan membawa kaum lsrail keluar dari Mesir.\n" +
                "Musa sempat melarikan diri ke Madyan dan menikah di sana, namun kembali lagi untuk berdakwah di Mesir. Musa diangkat menjadi nabi dan menerima wahyu di Bukit Thursinai dan wafat di Gunung Nibu, wilayah Syam.\n. \n"+
                "Kala itu, Mesir diperintah seorang raja yang sangat zalim dan kejam. Raja Mesir tersebut bernama Firaun. la sendiri mengaku sebagai tuhan yang harus disembah oleh seluruh rakyatnya. Jika ada yang membangkang, ia tidak segan-segan memberikan hukuman kepadanya. Rakyat benar-benar merasa hidup menderita di bawah kepemimpinannya. \n"+
                "Suatu malam, Firaun bermimpi seolah-olah melihat negeri Mesir yang dipimpinnya terbakar habis. Seluruh rakyatnya mati, kecuali seorang dari bani Israil. Firaun menjadi gelisah sejak datangnya mimpi tersebut. la mengumpulkan seluruh ahli ramal untuk mengartikan mimpinya.\n" +
                "\n" +
                "<br/>" +
                "<br/>" +
                "<br/>" +
                "Setelah terkumpul, salah seorang dari mereka berusaha mengartikan mimpi tersebut. la berkata bahwa suatu saat akan datang seorang laki-laki dari keturunan bani Israil yang akan meruntuhkan kekuasaannya. Mendengar hal itu, Firaun menjadi gelisah dan ketakutan.\n" +
                "<br/>" +
                "Sejak saat itu, ia memerintahkan kepada bawahannya agar membunuh setiap bayi laki-laki yang lahir dari keturunan bani Israil. Setiap ibu yang hamil dari keturunan bani Israil dilanda kegelisahan. Mereka khawatir jika bayi mereka nanti adalah laki-laki karena akan dibunuh.\n" +
                "Di tengah kondisi yang mencekam tersebut, lahirlah seorang bayi laki-laki keturunan Israil. Bayi ini dilindungi oleh Allah. Allah berkata kepadaYukabad, ibu bayi tersebut, \"Susuilah dia dan apabila kamu khawatir terhadapnya maka jatuhkanlah dia ke sungai. Janganlah kamu khawatir dan janganlah bersedih hati karena sesungguhnya Kami akan mengembalikannya kepadamu, dan menjadikannya rasul.\n" +
                "Sejak saat itu, Musa tinggal bersama Firaun dan istrinya. Asiah mencarikan ibu yang dapat menyusui bayi temuannya. Sementara itu, di tempat tinggalnya, ibu Musa yang bernama Yukabad gelisah. la khawatir kalau bayinya ditemukan Firaun dan dibunuh. la menyuruh saudara perempuan Musa yang bernama Maryam untuk mencari informasi tentang Musa. Akhirnya, Maryam mendapatkan informasi bahwa Musa dalam asuhan istri Firaun. Sekarang, istri Firaun sedang mencari ibu yang dapat menyusuinya. Dengan cepat, Yukabad mengajukan diri menjadi ibu susu bagi Musa.\n." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}

