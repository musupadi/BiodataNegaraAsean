package com.destiny.biodatanegaraasean.Model;

import com.destiny.biodatanegaraasean.R;

import java.util.ArrayList;

public class Model {
    public static String[][] data = new String[][]{
            {"Indonesia",
                    String.valueOf(R.drawable.bendera_ina),
                    String.valueOf(R.drawable.lambang_ina),
                    String.valueOf(R.drawable.maps_indo),
                    "Jakarta",
                    "Negara kesatuan bersistem republic presdensial",
                    "Bhinneka Tunggal Ika",
                    "Indonesia Raya",
                    "Rupiah",
                    "Indonesia",
                    "1.990.250 km²",
                    "270.054.853 jiwa",
                    "+62",
                    ".id",
                    "Republik Indonesia (RI) atau Negara Kesatuan Republik Indonesia (NKRI), atau lebih umum disebut Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau. Dengan populasi Hampir 270.054.853 jiwa pada tahun 2018, Indonesia adalah negara berpenduduk terbesar keempat di dunia dan negara yang berpenduduk Muslim terbesar di dunia, dengan lebih dari 230 juta jiwa."
            },
            {"Malaysia",
                    String.valueOf(R.drawable.bndera_malaysia),
                    String.valueOf(R.drawable.lambang_negara_malaysia),
                    String.valueOf(R.drawable.maps_malaysia),
                    "Kuala Lumpur",
                    "Federal parlementer monarki konstitusional",
                    "Bersekutu Bertambah Mutu",
                    "Negaraku",
                    "Ringgit",
                    "Melayu",
                    "329.847 km²",
                    "30.697.000 jiwa",
                    "+60",
                    ".my",
                    "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km perseg Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal. Negara ini dipisahkan ke dalam dua kawasan  Malaysia Barat dan Malaysia Timur."
            },
            {"Myanmar",
                    String.valueOf(R.drawable.bndera_myanmar),
                    String.valueOf(R.drawable.lambang_myanmar),
                    String.valueOf(R.drawable.maps_myanmar),
                    "Naypyitaw",
                    "Kesatuan parlemen republik konstitusional",
                    "-",
                    "Kaba Ma Kyei",
                    "Kyat",
                    "Burma",
                    "676.578 km²",
                    "53.582.855  jiwa",
                    "+95",
                    ".mm",
                    "Republik Persatuan Myanmar (juga dikenal sebagai Birma, disebut \"Burma\" di dunia Barat adalah sebuah negara berdaulat di Asia Tenggara. Ibu kota negara ini sebelumnya terletak di Yangon sebelum dipindahkan oleh pemerintahan junta militer ke Naypyidaw pada tanggal 7 November 2005. Myanmar telah bergabung sebagai anggota Perhimpunan Bangsa-Bangsa Asia Tenggara (ASEAN) sejak tahun 1997."
            },
            {"Thailand",
                    String.valueOf(R.drawable.bndera_thailand),
                    String.valueOf(R.drawable.lambang_thailand),
                    String.valueOf(R.drawable.maps_thailand),
                    "Bangkok",
                    "Kesatuan parlementer monarki konstitusional di bawah kuasa junta militer",
                    "Chat, Satsana, Phra Maha Kasat",
                    "Phleng Chat Thai",
                    "Baht",
                    "Thai",
                    "513.120 km²",
                    "64.785.909  jiwa",
                    "+66",
                    ".th",
                    "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km perseg Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal. Negara ini dipisahkan ke dalam dua kawasan  Malaysia Barat dan Malaysia Timur."
            },
            {"Laos",
                    String.valueOf(R.drawable.bndera_malaysia),
                    String.valueOf(R.drawable.lambang_negara_malaysia),
                    String.valueOf(R.drawable.maps_malaysia),
                    "Vientiane",
                    "Kesatuan Marxis-Leninis satu partai sosialis republik",
                    "Santiphab ekalad pasathipatai ekaphab vadtha na thauaon",
                    "Pheng Xat Lao",
                    "Kip",
                    "Lao Perancis",
                    "237,955 km2",
                    "6.758.353 jiwa",
                    "+856",
                    ".la",
                    "Laos adalah sebuah Negara Republik yang dikelilingi oleh daratan dan terletak di bagian utara Semenanjung Indochina. Laos berasal dari kata Lan Xang yang artinya kerajaan gajah. Negara ini adalah satu-satunya Negara di kawasan Asia Tenggara yang tidak memiliki pantai. Laos pernah dijajah oleh Prancis dan memperoleh kemerdekaan pada 22 Oktober 1953 dalam bentuk kerajaan. Sejak 2 Desember 1975 kerajan Laos berubah menjadi Republik Laos. Laos adalah salah satu negara komunis dengan kepala pemerintahan berupa presiden yang bernama Choummaly Sayasone dan dibantu oleh perdana menteri yang bernama Bouasone Bouphavanh."
            },
            {"Kamboja",
                    String.valueOf(R.drawable.bendera_kamboja),
                    String.valueOf(R.drawable.lmbang_kamboja),
                    String.valueOf(R.drawable.maps_kamboja),
                    "Phnom Penh",
                    "Monarki konstitusional demokratik",
                    "Chat, Satsana, Phra Maha Kasat",
                    "Nokoreach",
                    "Riel",
                    "Khmer dan Perancis",
                    "181,035  km²",
                    "16.204.486 jiwa",
                    "855",
                    ".kh",
                    "Kerajaan Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14. Menjelang kemerdekaannya, Negara Kesatuan Republik Indonesia banyak membantu negara Kamboja ini. Buku - buku taktik perang karangan perwira militer Indonesia banyak digunakan oleh militer Kamboja. Oleh karenanya, para calon perwira di militer Kamboja, wajib belajar dan dapat berbahasa Indonesia. "
            },
            {"Vietnam",
                    String.valueOf(R.drawable.bendera_vietnam),
                    String.valueOf(R.drawable.lmbang_vietnam),
                    String.valueOf(R.drawable.maps_vietnam),
                    "Hanoi",
                    "Kesatuan Marxis-Leninis satu partai sosialis republik",
                    "Độc lập – Tự do – Hạnh phúc \"Kemerdekaan, Kebebasan, Kebahagiaan",
                    "Tiến Quân Ca",
                    "Dong",
                    "Vietnam",
                    "331,212 km²",
                    "94.569.072 jiwa",
                    "+84",
                    ".vn",
                    "Vietnam adalah negara paling timur di Semenanjung Indochina di Asia Tenggara. Dengan populasi sekitar 84 juta jiwa, Vietnam adalah negara terpadat nomor 13 di dunia. Vietnam termasuk di dalam grup ekonomi \"Next Eleven\"; menurut pemerintah, GDP Vietnam tumbuh sebesar 8.17% pada tahun 2006, negara dengan pertumbuhan tercepat kedua di Asia Timur dan pertama di Asia Tenggara. Pada akhir tahun 2007."
            },
            {"Brunei Darussalam",
                    String.valueOf(R.drawable.bndera_brunei),
                    String.valueOf(R.drawable.lambang_brunei),
                    String.valueOf(R.drawable.maps_brunei),
                    "Bandar Seri Begawan",
                    "Kesatuan Islam Monarki absolut",
                    "Sentiasa membuat kebajikan dengan petunjuk Allah",
                    "Allah Peliharakan Sultan",
                    "Dolar Brunei",
                    "Melayu",
                    "5.765  km²",
                    "417.200 jiwa",
                    "+673",
                    ".bn",
                    "Brunei Darussalam adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. Saat ini, Brunei Darussalam memiliki Indeks Pembangunan Manusia tertinggi kedua di Asia Tenggara setelah Singapura, sehingga diklasifikasikan sebagai negara maju. Selain itu, Brunei juga terkenal dengan kemakmurannya dan ketegasan dalam melaksanakan syariat Islam, baik dalam bidang pemerintahan maupun kehidupan bermasyarakat."
            },
            {"Singapura",
                    String.valueOf(R.drawable.bendera_singapura),
                    String.valueOf(R.drawable.lmbang_singapura),
                    String.valueOf(R.drawable.maps_singapur),
                    "Singapura",
                    "Kesatuan partai mayoritas Republik parlementer",
                    "Majulah Singapura",
                    "Majulah Singapura",
                    "Dolar Singapura",
                    "Inggris dan melayu",
                    "722.5 km²",
                    "5.638.700 jiwa",
                    "+65",
                    ".sg",
                    "Singapura adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya. Singapura adalah pusat keuangan terdepan ketiga di dunia dan sebuah kota dunia kosmopolitan yang memainkan peran penting dalam perdagangan dan keuangan internasional. Pelabuhan Singapura adalah satu dari lima pelabuhan tersibuk di dunia"
            },
            {"Philipina",
                    String.valueOf(R.drawable.bndera_filipin),
                    String.valueOf(R.drawable.lmbang_filipina),
                    String.valueOf(R.drawable.maps_filipina),
                    "Manila",
                    "Kesatuan Republik konstitusional presidensial",
                    "Maka-Diyos, Maka-Tao, Makakalikasan at Makabansa",
                    "Lupang Hinirang",
                    "Peso",
                    "Filipino",
                    "300,000  km²",
                    "100.981.437 jiwa",
                    "+63",
                    ".ph",
                    "Singapura adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya. Singapura adalah pusat keuangan terdepan ketiga di dunia dan sebuah kota dunia kosmopolitan yang memainkan peran penting dalam perdagangan dan keuangan internasional. Pelabuhan Singapura adalah satu dari lima pelabuhan tersibuk di dunia"
            }
    };
    public static ArrayList<DataModel> getListData(){
        DataModel models = null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new DataModel();
            models.setNama(aData[0]);
            models.setBendera(aData[1]);
            models.setLambang(aData[2]);
            models.setPeta(aData[3]);
            models.setIbuKota(aData[4]);
            models.setPemerintahan(aData[5]);
            models.setSemboyan(aData[6]);
            models.setLaguKebangsaan(aData[7]);
            models.setMataUang(aData[8]);
            models.setBahasa(aData[9]);
            models.setLuasArea(aData[10]);
            models.setPenduduk(aData[11]);
            models.setTelepon(aData[12]);
            models.setDomain(aData[13]);
            models.setDeskripsi(aData[14]);
            list.add(models);
        }
        return list;
    }
}
