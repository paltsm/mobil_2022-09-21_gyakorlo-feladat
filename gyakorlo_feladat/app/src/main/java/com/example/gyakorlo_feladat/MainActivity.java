package com.example.gyakorlo_feladat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//1.: deklarálás
	private Button buttonNagy;
	private Button buttonKis;
	private Button buttonSzin;
	private EditText editTextBemenet;
	private TextView textViewKimenet;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		init();
		buttonNagy.setOnClickListener(view -> {
			String bevitel=editTextBemenet.getText().toString().toUpperCase();
			textViewKimenet.setText(bevitel);
		});
		buttonKis.setOnClickListener(view -> {
			String bevitel=editTextBemenet.getText().toString().toLowerCase();
			textViewKimenet.setText(bevitel);
		});
		buttonSzin.setOnClickListener(view -> {
			Random random = new Random();
			int red = random.nextInt(255);
			int green = random.nextInt(255);
			int blue = random.nextInt(255);
			textViewKimenet.setBackgroundColor(Color.rgb(red,green,blue));
		});
	}
	//2.: inicializálás
	private void init(){
		buttonNagy=findViewById(R.id.buttonNagy);
		buttonKis=findViewById(R.id.buttonKis);
		buttonSzin=findViewById(R.id.buttonSzin);
		editTextBemenet=findViewById(R.id.editTextBemenet);
		textViewKimenet=findViewById(R.id.textViewKimenet);

	}
}