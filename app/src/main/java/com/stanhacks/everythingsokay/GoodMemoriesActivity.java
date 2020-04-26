package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GoodMemoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_memories);

//        Intent extraIntentInfo = getIntent();
//        String name = extraIntentInfo.getStringExtra("Input");

        ListView list = (ListView) findViewById(R.id.listViewMemories);
        final ArrayList<String> memories = new ArrayList<>();
        memories.add("Went for a walk today");
        memories.add("Pet my cat without getting scratched");
        memories.add("Aced my midterm!");
//        memories.add(name);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, memories);
        list.setAdapter(adapter);
    }

    public void goToMainActivity(View view){
        Intent goToActivity = new Intent(GoodMemoriesActivity.this, MainActivity.class);
        startActivity(goToActivity);
    }
}
