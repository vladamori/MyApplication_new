package com.poyata.p0071_onclickbuttons;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//найдём View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
// создаём обработчик нажатия
        View.OnClickListener oclBtnOk = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
// Меняем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка ОК");
            }
        };
// присвоим обработчик кнопке ОК (btnOk)
        btnOk.setOnClickListener(oclBtnOk);
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Меняем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}