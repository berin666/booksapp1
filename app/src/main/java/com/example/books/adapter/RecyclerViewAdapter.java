package com.example.books.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.books.model.book;
import com.example.books.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    private Context mContext;
    private List<book> mDAta;
    RequestOptions options;

    public RecyclerViewAdapter(Context mContext, List<book> mDAta) {
        this.mContext = mContext;
        this.mDAta = mDAta;
        options=new RequestOptions().centerCrop().placeholder(R.drawable.loadinf_shape).error(R.drawable.loadinf_shape);
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(mContext);
        view=inflater.inflate(R.layout.book_row_item,parent,false);
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.category.setText(mDAta.get(position).getCategory());
        holder.titel.setText(mDAta.get(position).getTitel());
       holder.author.setText(mDAta.get(position).getAuthor());
       holder.desc.setText(mDAta.get(position).getDesc());
       holder.FlNm.setText(mDAta.get(position).getFlNm());
       //holder.ixdate.setText(mDAta.get(position).getIxDate());
       holder.language.setText(mDAta.get(position).getLanguagr());
       //holder.pgcnt.setText(mDAta.get(position).getPgcnt());
        //holder.sz.setText(mDAta.get(position).getSz());
       // holder.yr.setText(mDAta.get(position).getYr());
        holder.rtng.setText(mDAta.get(position).getRtng());
        holder.pervwOK.setText(mDAta.get(position).getPrevwOk());

       // Glide.with(mContext).load(mDAta.get(position).getImage_url()).apply(position).into(holder.thumbnail);




    }


    @Override
    public int getItemCount() {
        return mDAta.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView category;
        TextView titel;
        TextView author;
        TextView desc;
        TextView FlNm;
        TextView ixdate;
        TextView language;
        TextView pgcnt;
        TextView sz;
        TextView yr;
        TextView rtng;
        TextView pervwOK;

        ImageView thumbnail;




        public MyViewHolder(View itemView) {
            super(itemView);

            category=itemView.findViewById(R.id.book1);
            titel=itemView.findViewById(R.id.book2);
            author=itemView.findViewById(R.id.book3);
            desc=itemView.findViewById(R.id.book4);
            FlNm=itemView.findViewById(R.id.book5);
            ixdate=itemView.findViewById(R.id.book6);
            language=itemView.findViewById(R.id.book7);
            pgcnt=itemView.findViewById(R.id.book8);
            sz=itemView.findViewById(R.id.book9);
            yr=itemView.findViewById(R.id.book10);
            rtng=itemView.findViewById(R.id.book11);
            pervwOK=itemView.findViewById(R.id.book12);




        }
    }
}
