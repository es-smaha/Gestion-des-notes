package com.example.gestiondesnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner sp ;
    EditText note ;
    TextView moy ;
    Button btn ;
    ListView list;
    Double n ;
    String module;
    ArrayList<note> NoteList ;
    note resultat ;
    Double moyenne ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        note = (EditText)findViewById(R.id.note) ;
        list = (ListView)findViewById(R.id.list);
        moy = (TextView)findViewById(R.id.moy);
        btn = (Button) findViewById(R.id.btn);
        sp = (Spinner) findViewById(R.id.spin);
        NoteList= new ArrayList<note>();
    }


    public void select(View view){
        Double s =0.0;
        module= sp.getSelectedItem().toString();
        n = Double.valueOf(note.getText().toString());

        resultat= new note(n , module);
//        condition sur le bouton
        if(NoteList.contains(resultat)){
            Toast.makeText(getApplicationContext(),"vous avez deja inserer la note de ce  module ",Toast.LENGTH_SHORT).show();

        }else {
            NoteList.add(resultat);
            for(int i = 0 ;i< NoteList.size() ;i++){
               s+= NoteList.get(i).getNote();
            }
            moyenne= s/NoteList.size();
            moy.setText(moyenne.toString());

            ArrayAdapter<note> adapter = new ArrayAdapter<note>(this,
                    android.R.layout.simple_list_item_1, NoteList);
            list.setAdapter(adapter);
        }






    }


}