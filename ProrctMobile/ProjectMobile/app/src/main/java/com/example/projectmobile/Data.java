package com.example.projectmobile;

import java.util.ArrayList;
public class Data {
    private String komikNama [] = new String [] {"Naruto","Dragon Ball","One Punch Man","Gintama","Bakugan"};
    private String harga []= new String[]{"Rp.35.500","Rp.23.500","Rp.25.500","Rp.26.500","Rp.26.500"};
    private int gambar []=new int[]{R.drawable.naruto,R.drawable.dragonball,R.drawable.opm,R.drawable.gintama,R.drawable.bakugan};

    public static ArrayList<Komik> getListData(){
        Data komikData = new Data();
        ArrayList<Komik> list = new ArrayList<>();
        for (int i=0; i<komikData.komikNama.length; i++){
            Komik komik = new Komik();
            komik.setNama(komikData.komikNama[i]);
            komik.setHarga(komikData.harga[i]);
            komik.setGambar(komikData.gambar[i]);
            list.add(komik);
        }
        return list;
}
}
