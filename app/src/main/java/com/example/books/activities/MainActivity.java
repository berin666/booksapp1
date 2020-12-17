package com.example.books.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.books.R;
import com.example.books.adapter.RecyclerViewAdapter;
import com.example.books.model.book;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String JSON_URL ="http://www.pdfdomain.com/sedziezjkzd/search?q=biology";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private List<book>lstbook;
    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstbook=new ArrayList<>();

        recyclerView=findViewById(R.id.recyclerviewid);
        jsonrequest();


    }

    private void jsonrequest() {
        request =new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject=null;
                for (int i=0;i<response.length();i++){

                    try {

                        jsonObject=response.getJSONObject(i);
                        book book=new book();
                        book.setCategory(jsonObject.getString("category"));
                        book.setTitel(jsonObject.getString("titel"));
                        book.setAuthor(jsonObject.getString("author"));
                        book.setDesc(jsonObject.getString("desc"));
                        book.setFlNm(jsonObject.getString("FlNm"));
                        book.setIxDate(jsonObject.getInt("ixdate"));
                        book.setLanguagr(jsonObject.getString("language"));
                        book.setPgcnt(jsonObject.getInt("pgcnt"));
                        book.setSz(jsonObject.getInt("sz"));
                        book.setYr(jsonObject.getInt("yr"));
                        book.setRtng(jsonObject.getString("rtng"));
                        book.setPrevwOk(jsonObject.getString("prevwOK"));

                        lstbook.add(book);

                    }catch (JSONException e){
                        e.printStackTrace();
                    }


                }


                setuprecyclerview(lstbook);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue= Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(request);




    }

    private void setuprecyclerview(List<book> lstbook) {

        RecyclerViewAdapter myadapter=new RecyclerViewAdapter(this,lstbook);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);
    }
}
