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
import com.example.books.model.book;
import com.example.books.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    private Context mContext;
    private List<book> mDAta;

    public RecyclerViewAdapter(Context mContext, List<book> mDAta) {
        this.mContext = mContext;
        this.mDAta = mDAta;
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
        holder.intex.setText(mDAta.get(position).getIndex());
        holder.type.setText(mDAta.get(position).getType());
       holder.id.setText(mDAta.get(position).getId());
       holder.score.setText(mDAta.get(position).getScore());
       holder.source.setText(mDAta.get(position).getSource());
       holder.category.setText(mDAta.get(position).getCategory());
       holder.titel.setText(mDAta.get(position).getTitle());
       holder.author.setText(mDAta.get(position).getAuthor());
        holder.desc.setText(mDAta.get(position).getDesc());
        holder.flNm.setText(mDAta.get(position).getFlNm());
        holder.foundUrl.setText(mDAta.get(position).getFoundUrl());
        holder.imgFlPth.setText(mDAta.get(position).getImgFlPth());
        holder.ixDate.setText(mDAta.get(position).getIxDate());
        holder.language.setText(mDAta.get(position).getLanguage());
        holder.pgCnt.setText(mDAta.get(position).getPgCnt());
        holder.sz.setText(mDAta.get(position).getSz());
        holder.url.setText(mDAta.get(position).getUrl());
        holder.year.setText(mDAta.get(position).getYr());




    }


    @Override
    public int getItemCount() {
        return mDAta.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView intex;
        TextView type;
        TextView id;
        TextView score;
        TextView source;
        TextView category;
        TextView titel;
        TextView author;
        TextView desc;
        TextView flNm;
        TextView foundUrl;
        TextView imgFlPth;
        TextView ixDate;
        TextView language;
        TextView pgCnt;
        TextView sz;
        TextView url;
        TextView year;
        ImageView thumbnail;




        public MyViewHolder(View itemView) {
            super(itemView);

            intex=itemView.findViewById(R.id.book1);
            type=itemView.findViewById(R.id.book2);
            id=itemView.findViewById(R.id.book3);
            score=itemView.findViewById(R.id.book4);
            source=itemView.findViewById(R.id.book5);
            category=itemView.findViewById(R.id.book6);
            titel=itemView.findViewById(R.id.book7);
            author=itemView.findViewById(R.id.book8);
            desc=itemView.findViewById(R.id.book9);
            flNm=itemView.findViewById(R.id.book10);
            foundUrl=itemView.findViewById(R.id.book11);
            imgFlPth=itemView.findViewById(R.id.book12);
            ixDate=itemView.findViewById(R.id.book13);
            language=itemView.findViewById(R.id.book14);
            pgCnt=itemView.findViewById(R.id.book15);
            sz=itemView.findViewById(R.id.book16);
            url=itemView.findViewById(R.id.book17);
            year=itemView.findViewById(R.id.book18);




        }
    }
}
