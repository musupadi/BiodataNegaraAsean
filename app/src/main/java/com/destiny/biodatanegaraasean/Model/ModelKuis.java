package com.destiny.biodatanegaraasean.Model;

import java.util.ArrayList;

public class ModelKuis {
    public static String[][] data = new String[][]{
            {"1",
                    "ibukota Indonesia adalah...",
                    "B",
                    "A. Singapura",
                    "B. Jakarta",
                    "C. Hanoi",
                    "D. Phnom Penh",
            },
            {"2",
                    "Dari jawaban berikut mana yang tidak termasuk Negara ASEAN...",
                    "C",
                    "A. Indonesia",
                    "B. Myanmar",
                    "C. Japan",
                    "D. Philipina",
            },
            {"3",
                    "Ibukota negara manakah kota Hanoi\"",
                    "A",
                    "A. Vietnam",
                    "B. Kamboja",
                    "C. Thailand",
                    "D. Brunei",
            },
            {"4",
                    "Berapakah kode telepon negara Indonesia...",
                    "C",
                    "A. +84",
                    "B. +856",
                    "C. +62",
                    "D. +66",
            },
            {"5",
                    "\"Mata uang negara Thailand adalah\n",
                    "A",
                    "A. Baht",
                    "B. Rupiah",
                    "C. Kip",
                    "D. Riel",
            },
            {"6",
                    "\"Bahasa resmi apa yang digunakan negara malaysia\"\n",
                    "B",
                    "A. Indonesia",
                    "B. Melayu",
                    "C. Ingris",
                    "D. Khmer",
            },
            {"7",
                    "Mata uang negara Indonesia adalah...",
                    "A",
                    "A. Rupiah",
                    "B. Baht",
                    "C. Ringgit",
                    "D. Dong",
            },
            {"8",
                    "Ibukota negara manakah Bandar Sri Bengawan...",
                    "D",
                    "A. Indonesia",
                    "B. Malaysia",
                    "C. Singapura",
                    "D. Bruneii",
            },
            {"9",
                    "Lagu kebangsaan ASEAN adalah...",
                    "A",
                    "A. The ASEAN Way",
                    "B. Indonesia Raya ",
                    "C. Nokoreach",
                    "D. Allah Peliharakan Sultan",
            },
            {"10",
                    "Berapakah jumlah anggota Negara ASEAN...",
                    "D",
                    "A. 8",
                    "B. 9",
                    "C. 11",
                    "D. 10",
            },
    };
    public static ArrayList<DataModel> getListData(){
        DataModel models = null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new DataModel();
            models.setNo(aData[0]);
            models.setSoal(aData[1]);
            models.setJawaban(aData[2]);
            models.setJawabana(aData[3]);
            models.setJawabanb(aData[4]);
            models.setJawabanc(aData[5]);
            models.setJawaband(aData[6]);
            list.add(models);
        }
        return list;
    }
}
