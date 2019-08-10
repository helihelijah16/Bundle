package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    EditText edtNama,edtAlamat,edtPekerjaan,edtNoHp,edtLamaKerja,edtKeahlian,edtAsalSekolah;
    String namanya,alamatnya,pekerjaannya,nohpnya,lamakerjanya,keahliannya,asalSekolahnya;
    Button btnInput;
    Pegawai pegawainya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNama=(EditText)findViewById(R.id.edt_nama);
        edtAlamat=(EditText)findViewById(R.id.edt_alamat);
        edtPekerjaan=(EditText)findViewById(R.id.edt_pekerjaan);
        edtNoHp=(EditText)findViewById(R.id.edt_noHp);
        edtLamaKerja=(EditText)findViewById(R.id.edt_lamaKerja);
        edtKeahlian=(EditText)findViewById(R.id.edt_keahlian);
        edtAsalSekolah=(EditText)findViewById(R.id.edt_asalSekolah);

        btnInput=(Button)findViewById(R.id.btn_input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namanya = edtNama.getText().toString();
                alamatnya = edtAlamat.getText().toString();
                pekerjaannya = edtPekerjaan.getText().toString();
                nohpnya = edtNoHp.getText().toString();
                lamakerjanya= edtLamaKerja.getText().toString();
                keahliannya= edtKeahlian.getText().toString();
                asalSekolahnya= edtAsalSekolah.getText().toString();
                pegawainya=new Pegawai(namanya,alamatnya,pekerjaannya,nohpnya,lamakerjanya,keahliannya,asalSekolahnya);
                Intent pindah = new Intent(MainActivity.this,DetailActivity.class);
                pindah.putExtra("pegawainya",(Serializable)pegawainya);
                startActivity(pindah);
            }
        });





    }
}
