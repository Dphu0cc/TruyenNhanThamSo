package com.example.truyennhanthamso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button)  findViewById(R.id.buttonMain);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                HocSinh hs = new HocSinh("Cu", 123);
                String[] name = {"Minh", "Tiền", "Hoàng", "Tiến"};
                bundle.putString("chuoi", "Nguyen Duc Phuoc");
                bundle.putInt("conso", 12345);
                bundle.putStringArray("mang", name);
                bundle.putSerializable("doituong", hs);
                intent.putExtra("dulieu", bundle);

                startActivity(intent);
            }
        });
    }
}