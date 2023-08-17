package com.example.truyennhanthamso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtKetQua = (TextView) findViewById(R.id.textViewKetQua);

        // nhận dữ liệu
        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("dulieu");


        if (bundle!=null) {
            String name = bundle.getString("chuoi");
            int so = bundle.getInt("conso", 1243);
            String[] array = bundle.getStringArray("mang");
            HocSinh hs = (HocSinh) bundle.getSerializable("doituong");
            txtKetQua.setText(name + "\n" + so + "\n" + array[0] + "\n" +  hs.getHoTen());
        }

    }
}