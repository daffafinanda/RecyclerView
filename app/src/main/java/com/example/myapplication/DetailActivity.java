package com.example.myapplication;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get data from intent
        String name = getIntent().getStringExtra("name");
        String nim = getIntent().getStringExtra("nim");
        int imageResource = getIntent().getIntExtra("imageResource", 0);

        // Initialize views
        TextView nameTextView = findViewById(R.id.tv_detail_nama);
        TextView nimTextView = findViewById(R.id.tv_detail_nim);
        ImageView imageView = findViewById(R.id.iv_detail_foto);

        // Set data to views
        nameTextView.setText(name);
        nimTextView.setText(nim);
        imageView.setImageResource(imageResource);
    }
}

