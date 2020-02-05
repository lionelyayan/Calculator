package com.supriyandi.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.supriyandi.calculator.BaseActivity.BaseActivity;

public class MainActivity extends BaseActivity {

    EditText Input1, Input2, Input3;
    CheckBox Cek1, Cek2, Cek3;
    TextView Tambah, Kurang, Kali, Bagi, Hasil;
    int iInput1, iInput2, iInput3;
    float fInput1, fInput2, fInput3;
    String sInput1, sInput2, sInput3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        initListener();
    }

    @Override
    public void findView() {
        Input1 = findViewById(R.id.input1);
        Input2 = findViewById(R.id.input2);
        Input3 = findViewById(R.id.input3);
        Cek1 = findViewById(R.id.cek1);
        Cek2 = findViewById(R.id.cek2);
        Cek3 = findViewById(R.id.cek3);
        Tambah = findViewById(R.id.tambah);
        Kurang = findViewById(R.id.kurang);
        Kali = findViewById(R.id.kali);
        Bagi = findViewById(R.id.bagi);
        Hasil = findViewById(R.id.hasil);
    }

    @Override
    public void initListener() {
        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Input1.getText().toString().equals("") && Input2.getText().toString().equals("") && Input3.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG).show();
                }

                else {
                    if (!Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        Hasil.setText("");
                        Toast.makeText(MainActivity.this, "Pilih ceklis untuk operasi", Toast.LENGTH_LONG).show();

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        int iTambah = iInput1 + iInput1 + iInput1;

                        sInput1 = String.valueOf(iInput1);
                        Hasil.setText(sInput1+ " + " +sInput1+ " + " +sInput1+ " = " + iTambah);

                    }else if (Cek2.isChecked() && !Cek1.isChecked() && !Cek3.isChecked()){
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        int iTambah = iInput2 + iInput2 + iInput2;

                        sInput2 = String.valueOf(iInput2);
                        Hasil.setText(sInput2+ " + " +sInput2+ " + " +sInput2+ " = " + iTambah);

                    }else if (Cek3.isChecked() && !Cek1.isChecked() && !Cek2.isChecked()){
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iTambah = iInput3 + iInput3 + iInput3;

                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput3+ " + " +sInput3+ " + " +sInput3+ " = " + iTambah);

                    }else if (Cek1.isChecked() && Cek2.isChecked() && !Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        int iTambah = iInput1 + iInput2;

                        sInput1 = String.valueOf(iInput1);
                        sInput2 = String.valueOf(iInput2);
                        Hasil.setText(sInput1+ " + " +sInput2+ " = " + iTambah);

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iTambah = iInput1 + iInput3;

                        sInput1 = String.valueOf(iInput1);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput1+ " + " +sInput3+ " = " + iTambah);

                    }else if (!Cek1.isChecked() && Cek2.isChecked() && Cek3.isChecked()){
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iTambah = iInput2 + iInput3;

                        sInput2 = String.valueOf(iInput2);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput2+ " + " +sInput3+ " = " + iTambah);
                    }

                    else {
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iTambah = iInput1 + iInput2 + iInput3;

                        sInput1 = String.valueOf(iInput1);
                        sInput2 = String.valueOf(iInput2);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput1+ " + " +sInput2+ " + " +sInput3+ " = " + iTambah);
                    }
                }
            }
        });

        Kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Input1.getText().toString().equals("") && Input2.getText().toString().equals("") && Input3.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG).show();
                }

                else {
                    if (!Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        Hasil.setText("");
                        Toast.makeText(MainActivity.this, "Pilih ceklis untuk operasi", Toast.LENGTH_LONG).show();

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        int iKurang = iInput1 - iInput1 - iInput1;

                        sInput1 = String.valueOf(iInput1);
                        Hasil.setText(sInput1+ " - " +sInput1+ " - " +sInput1+ " = " + iKurang);

                    }else if (Cek2.isChecked() && !Cek1.isChecked() && !Cek3.isChecked()){
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        int iKurang = iInput2 - iInput2 - iInput2;

                        sInput2 = String.valueOf(iInput2);
                        Hasil.setText(sInput2+ " - " +sInput2+ " - " +sInput2+ " = " + iKurang);

                    }else if (Cek3.isChecked() && !Cek1.isChecked() && !Cek2.isChecked()){
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKurang = iInput3 - iInput3 - iInput3;

                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput3+ " - " +sInput3+ " - " +sInput3+ " = " + iKurang);

                    }else if (Cek1.isChecked() && Cek2.isChecked() && !Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        int iKurang = iInput1 - iInput2;

                        sInput1 = String.valueOf(iInput1);
                        sInput2 = String.valueOf(iInput2);
                        Hasil.setText(sInput1+ " - " +sInput2+ " = " + iKurang);

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKurang = iInput1 - iInput3;

                        sInput1 = String.valueOf(iInput1);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput1+ " - " +sInput3+ " = " + iKurang);

                    }else if (!Cek1.isChecked() && Cek2.isChecked() && Cek3.isChecked()){
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKurang = iInput2 - iInput3;

                        sInput2 = String.valueOf(iInput2);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput2+ " - " +sInput3+ " = " + iKurang);
                    }

                    else {
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKurang = iInput1 - iInput2 - iInput3;

                        sInput1 = String.valueOf(iInput1);
                        sInput2 = String.valueOf(iInput2);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput1+ " - " +sInput2+ " - " +sInput3+ " = " + iKurang);
                    }
                }
            }
        });

        Kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Input1.getText().toString().equals("") && Input2.getText().toString().equals("") && Input3.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG).show();
                }

                else {
                    if (!Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        Hasil.setText("");
                        Toast.makeText(MainActivity.this, "Pilih ceklis untuk operasi", Toast.LENGTH_LONG).show();

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        int iKali = iInput1 * iInput1 * iInput1;

                        sInput1 = String.valueOf(iInput1);
                        Hasil.setText(sInput1+ " * " +sInput1+ " * " +sInput1+ " = " + iKali);

                    }else if (Cek2.isChecked() && !Cek1.isChecked() && !Cek3.isChecked()){
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        int iKali = iInput2 * iInput2 * iInput2;

                        sInput2 = String.valueOf(iInput2);
                        Hasil.setText(sInput2+ " * " +sInput2+ " * " +sInput2+ " = " + iKali);

                    }else if (Cek3.isChecked() && !Cek1.isChecked() && !Cek2.isChecked()){
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKali = iInput3 * iInput3 * iInput3;

                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput3+ " * " +sInput3+ " * " +sInput3+ " = " + iKali);

                    }else if (Cek1.isChecked() && Cek2.isChecked() && !Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        int iKali = iInput1 * iInput2;

                        sInput1 = String.valueOf(iInput1);
                        sInput2 = String.valueOf(iInput2);
                        Hasil.setText(sInput1+ " * " +sInput2+ " = " + iKali);

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && Cek3.isChecked()){
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKali = iInput1 * iInput3;

                        sInput1 = String.valueOf(iInput1);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput1+ " * " +sInput3+ " = " + iKali);

                    }else if (!Cek1.isChecked() && Cek2.isChecked() && Cek3.isChecked()){
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKali = iInput2 * iInput3;

                        sInput2 = String.valueOf(iInput2);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput2+ " * " +sInput3+ " = " + iKali);
                    }

                    else {
                        iInput1 = Integer.parseInt(Input1.getText().toString());
                        iInput2 = Integer.parseInt(Input2.getText().toString());
                        iInput3 = Integer.parseInt(Input3.getText().toString());
                        int iKali = iInput1 * iInput2 * iInput3;

                        sInput1 = String.valueOf(iInput1);
                        sInput2 = String.valueOf(iInput2);
                        sInput3 = String.valueOf(iInput3);
                        Hasil.setText(sInput1+ " * " +sInput2+ " * " +sInput3+ " = " + iKali);
                    }
                }
            }
        });

        Bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Input1.getText().toString().equals("") && Input2.getText().toString().equals("") && Input3.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG).show();
                }

                else {
                    if (!Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        Hasil.setText("");
                        Toast.makeText(MainActivity.this, "Pilih ceklis untuk operasi", Toast.LENGTH_LONG).show();

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && !Cek3.isChecked()){
                        fInput1 = Float.parseFloat(Input1.getText().toString());
                        float iBagi = fInput1 / fInput1 / fInput1;

                        sInput1 = String.valueOf(fInput1);
                        Hasil.setText(sInput1+ " / " +sInput1+ " / " +sInput1+ " = " + iBagi);

                    }else if (Cek2.isChecked() && !Cek1.isChecked() && !Cek3.isChecked()){
                        fInput2 = Float.parseFloat(Input2.getText().toString());
                        float iBagi = fInput2 / fInput2 / fInput2;

                        sInput2 = String.valueOf(fInput2);
                        Hasil.setText(sInput2+ " / " +sInput2+ " / " +sInput2+ " = " + iBagi);

                    }else if (Cek3.isChecked() && !Cek1.isChecked() && !Cek2.isChecked()){
                        fInput3 = Float.parseFloat(Input3.getText().toString());
                        float iBagi = fInput3 / fInput3 / fInput3;

                        sInput3 = String.valueOf(fInput3);
                        Hasil.setText(sInput3+ " / " +sInput3+ " / " +sInput3+ " = " + iBagi);

                    }else if (Cek1.isChecked() && Cek2.isChecked() && !Cek3.isChecked()){
                        fInput1 = Float.parseFloat(Input1.getText().toString());
                        fInput2 = Float.parseFloat(Input2.getText().toString());
                        float iBagi = fInput1 / fInput2;

                        sInput1 = String.valueOf(fInput1);
                        sInput2 = String.valueOf(fInput2);
                        Hasil.setText(sInput1+ " / " +sInput2+ " = " + iBagi);

                    }else if (Cek1.isChecked() && !Cek2.isChecked() && Cek3.isChecked()){
                        fInput1 = Float.parseFloat(Input1.getText().toString());
                        fInput3 = Float.parseFloat(Input3.getText().toString());
                        float iBagi = fInput1 / fInput3;

                        sInput1 = String.valueOf(fInput1);
                        sInput3 = String.valueOf(fInput3);
                        Hasil.setText(sInput1+ " / " +sInput3+ " = " + iBagi);

                    }else if (!Cek1.isChecked() && Cek2.isChecked() && Cek3.isChecked()){
                        fInput2 = Float.parseFloat(Input2.getText().toString());
                        fInput3 = Float.parseFloat(Input3.getText().toString());
                        float iBagi = fInput2 / fInput3;

                        sInput2 = String.valueOf(fInput2);
                        sInput3 = String.valueOf(fInput3);
                        Hasil.setText(sInput2+ " / " +sInput3+ " = " + iBagi);
                    }

                    else {
                        fInput1 = Float.parseFloat(Input1.getText().toString());
                        fInput2 = Float.parseFloat(Input2.getText().toString());
                        fInput3 = Float.parseFloat(Input3.getText().toString());
                        float iBagi = fInput1 / fInput2 / fInput3;

                        sInput1 = String.valueOf(fInput1);
                        sInput2 = String.valueOf(fInput2);
                        sInput3 = String.valueOf(fInput3);
                        Hasil.setText(sInput1+ " / " +sInput2+ " / " +sInput3+ " = " + iBagi);
                    }
                }
            }
        });
    }
}
