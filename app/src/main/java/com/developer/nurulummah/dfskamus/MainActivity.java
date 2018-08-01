package com.developer.nurulummah.dfskamus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    ImageView btnCari;
    EditText etInput;
    TextView txHasil, txFaidah;

    Character faidah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = (EditText)findViewById(R.id.iKata);
        txHasil = (TextView) findViewById(R.id.hasil);
        txFaidah = (TextView) findViewById(R.id.faidah);
        btnCari = (ImageButton) findViewById(R.id.cari);
        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Jalur();
                Faidah();
            }
        });
    }

    public void Jalur(){
        com.developer.nurulummah.dfskamus.Node a = new com.developer.nurulummah.dfskamus.Node("Wazan");

        com.developer.nurulummah.dfskamus.Node u = new com.developer.nurulummah.dfskamus.Node("Wazan Tsulasi");
        com.developer.nurulummah.dfskamus.Node v = new com.developer.nurulummah.dfskamus.Node("Wazan Rubai");

        com.developer.nurulummah.dfskamus.Node b = new com.developer.nurulummah.dfskamus.Node("Wazan Tsulasi Mujarrod");
        com.developer.nurulummah.dfskamus.Node s = new com.developer.nurulummah.dfskamus.Node("Wazan Tsulasi Mazid");
        com.developer.nurulummah.dfskamus.Node c = new com.developer.nurulummah.dfskamus.Node("Wazan Rubai Mujarrod");
        com.developer.nurulummah.dfskamus.Node t = new com.developer.nurulummah.dfskamus.Node("Wazan Rubai Mazid");

        com.developer.nurulummah.dfskamus.Node x = new com.developer.nurulummah.dfskamus.Node("Wazan Tsulasi Mazid biharfin");
        com.developer.nurulummah.dfskamus.Node y = new com.developer.nurulummah.dfskamus.Node("Wazan Tsulasi Mazid biharfain");
        com.developer.nurulummah.dfskamus.Node z = new com.developer.nurulummah.dfskamus.Node("Wazan Tsulasi Mazid bitsalasati ahruf");

        com.developer.nurulummah.dfskamus.Node aa = new com.developer.nurulummah.dfskamus.Node("Wazan Rubai Mazid biharfin");
        com.developer.nurulummah.dfskamus.Node ab = new com.developer.nurulummah.dfskamus.Node("Wazan Rubai Mazid biharfain");

        com.developer.nurulummah.dfskamus.Node d = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfin wazan فعّل");
        com.developer.nurulummah.dfskamus.Node e = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfin wazan افعل");
        com.developer.nurulummah.dfskamus.Node f = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfin wazan فاعل");

        com.developer.nurulummah.dfskamus.Node g = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfain wazan انفعل");
        com.developer.nurulummah.dfskamus.Node h = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfain wazan افتعل");
        com.developer.nurulummah.dfskamus.Node i = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfain wazan تفعّل");
        com.developer.nurulummah.dfskamus.Node j = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfain wazan تفاعل");
        com.developer.nurulummah.dfskamus.Node k = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid biharfain wazan افعلّ");

        com.developer.nurulummah.dfskamus.Node l = new com.developer.nurulummah.dfskamus.Node("Ruba'i Mazid bi harfin wazan تفعلل");

        com.developer.nurulummah.dfskamus.Node m = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid bi tsalatsati ahruf wazan استفعل");
        com.developer.nurulummah.dfskamus.Node n = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid bi tsalatsati ahruf wazan افعوعل");
        com.developer.nurulummah.dfskamus.Node o = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid bi tsalatsati ahruf wazan افعوّل");
        com.developer.nurulummah.dfskamus.Node p = new com.developer.nurulummah.dfskamus.Node("Tsulatsi Mazid bi tsalatsati ahruf wazan افعالّ");

        com.developer.nurulummah.dfskamus.Node q = new com.developer.nurulummah.dfskamus.Node("Ruba'i Mazid bi harfain wazan إفعنلل");
        com.developer.nurulummah.dfskamus.Node r = new com.developer.nurulummah.dfskamus.Node("Ruba'i Mazid bi harfain wazan إفعللّ");

        a.right1Child = u;
        a.leftChild = v;

        u.right1Child = b;
        u.leftChild = s;

        v.right1Child = c;
        v.leftChild = t;

        s.right1Child = x;
        s.right2Child = y;
        s.leftChild = z;

        t.right1Child = aa;
        t.leftChild = ab;

        x.right1Child = d;
        x.right2Child = e;
        x.leftChild = f;

        y.right1Child = g;
        y.right2Child = h;
        y.right3Children = i;
        y.right4Child = j;
        y.leftChild = k;

        z.right1Child = m;
        z.right2Child = n;
        z.right3Children = o;
        z.leftChild = p;

        aa.right1Child = l;


        ab.right1Child = q;
        ab.leftChild = r;

        String ambil= etInput.getText().toString();
        try {

            if (ambil.length() == 3){

                Toast.makeText(MainActivity.this, "Tsulatsi Mujarrod", Toast.LENGTH_SHORT).show();
                faidah = 'A';
                AbstractSearch searchAlgo = new DepthFirstSearch(a, b);
                if(searchAlgo.execute())
                    txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);

            }else if (ambil.length() == 4){

                    Toast.makeText(MainActivity.this, "ٌRuba'i Mujarrod", Toast.LENGTH_SHORT).show();
                    faidah = 'F';
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, c);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);


                if(ambil.charAt(2) == 'ّ'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfin wazan فعّل", Toast.LENGTH_SHORT).show();
                     searchAlgo = new DepthFirstSearch(a, d);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(0) == 'ا' || ambil.charAt(0) == 'أ' ) {
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfin wazan افعل", Toast.LENGTH_SHORT).show();
                     searchAlgo = new DepthFirstSearch(a, e);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(1) ==  'ا'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfin wazan فاعل", Toast.LENGTH_SHORT).show();
                     searchAlgo = new DepthFirstSearch(a, f);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }


            }else if (ambil.length() == 5){

                if(ambil.charAt(1) == 'ن' & ambil.charAt(0) == 'ا' ||  ambil.charAt(0) == 'إ' ){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfain wazan انفعل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, g);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if( ambil.charAt(2) == 'ت' & ambil.charAt(0) == 'ا' || ambil.charAt(0) == 'إ' ) {
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfain wazan افتعل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, h);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(0) ==  'ت' & ambil.charAt(3) == 'ّ'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfain wazan تفعّل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, i);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(0) ==  'ت' & ambil.charAt(2) == 'ا'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfain wazan تفاعل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, j);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(0) == 'ا' ||  ambil.charAt(0) == 'إ'  & ambil.charAt(4) == 'ّ'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid biharfain wazan افعلّ", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, k);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(0) == 'ت'){
                    Toast.makeText(MainActivity.this, "Ruba'i Mazid bi harfin wazan تفعلل ", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, l);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else
                    Toast.makeText(MainActivity.this, "ٌTidak mengikuti wazan apapun", Toast.LENGTH_SHORT).show();

            }else if (ambil.length() == 6){
                if(ambil.charAt(1) == 'س'  & ambil.charAt(2) == 'ت' & ambil.charAt(0) == 'ا' ||  ambil.charAt(0) == 'إ'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid bi tsalatsati ahruf wazan استفعل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, m);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(3) == 'و' & ambil.charAt(2) == ambil.charAt(4) & ambil.charAt(0) == 'ا' || ambil.charAt(0) == 'إ') {
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid bi tsalatsati ahruf wazan افعوعل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, n);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(3) ==  'و' & ambil.charAt(4) == 'ّ' & ambil.charAt(0) == 'ا' ||  ambil.charAt(0) == 'إ'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid bi tsalatsati ahruf wazan افعوّل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, o);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if(ambil.charAt(0) == 'ا' ||  ambil.charAt(0) == 'إ' & ambil.charAt(3) ==  'ا' & ambil.charAt(5) == 'ّ'){
                    Toast.makeText(MainActivity.this, "Tsulatsi Mazid bi tsalatsati ahruf wazan افعالّ", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, p);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if (ambil.charAt(0) == 'ا' ||  ambil.charAt(0) == 'إ' & ambil.charAt(3) ==  'ن' ) {
                    Toast.makeText(MainActivity.this, "ٌRuba'i Mazid bi harfain wazan إفعنلل", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, q);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }
                else if (ambil.charAt(0) == 'ا' ||  ambil.charAt(0) == 'إ' & ambil.charAt(5) ==  'ّ' ) {
                    Toast.makeText(MainActivity.this, "ٌRuba'i Mazid bi harfain wazan إفعللّ", Toast.LENGTH_SHORT).show();
                    AbstractSearch searchAlgo = new DepthFirstSearch(a, r);
                    if(searchAlgo.execute())
                        txHasil.setText("Path Found ! & " + searchAlgo.goalNode.stationName);
                }else
                    Toast.makeText(MainActivity.this, "ٌTidak mengikuti wazan apapun", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Bukan kata yang benar/harus berbahasa arab", Toast.LENGTH_SHORT).show();
            }

        }catch (Exception ee){
            Toast.makeText(MainActivity.this, "Kata harus fi'il madhi", Toast.LENGTH_SHORT).show();
        }

    }

    public void Faidah(){
        switch(faidah) {
            case 'A' :
                txFaidah.setText("Faidah : 1. ");
                break;
            case 'F' :
                txFaidah.setText("dshfasjkfd");
                break;
            default :
                System.out.println("Invalid grade");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu); //your file name
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.materi:
                Intent intent = new Intent(MainActivity.this, MateriActivity.class);
                startActivity(intent);
                //your code
                // EX : call intent if you want to swich to other activity
                return true;
            case R.id.history:
                //your code
                Intent intent2 = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
