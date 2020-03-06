package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private EditText txtimput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView) findViewById(R.id.listv);
        String[] items={"apple","orange"};
        arrayList=new ArrayList<>(Arrays.asList(items));
        adapter=new ArrayAdapter<String >(this,R.layout.list_item,R.id.txtitem,arrayList);
        listView.setAdapter(adapter);
        txtimput=(EditText)findViewById(R.id.txtimput);
        Button btAdd=(Button)findViewById(R.id.btadd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=txtimput.getText().toString();
                arrayList.add(newItem);
                adapter.notifyDataSetChanged();
            }
        });




    }
}
