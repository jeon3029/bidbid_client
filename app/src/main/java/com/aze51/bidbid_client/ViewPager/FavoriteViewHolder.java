package com.aze51.bidbid_client.ViewPager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aze51.bidbid_client.R;

import org.w3c.dom.Text;

/**
 * Created by Leekh on 2016-07-06.
 */
public class FavoriteViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView text1;
    TextView text2;
    TextView text3, text4, text5, text6;
    TextView startTime;
    TextView endTime;
    TextView bidUser;
    public FavoriteViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView)itemView.findViewById(R.id.favorite_ImageView);
        text1 = (TextView)itemView.findViewById(R.id.favorite_title);
        text2 = (TextView)itemView.findViewById(R.id.favorite_price);
        text3 = (TextView)itemView.findViewById(R.id.favorite_hour);
        text4 = (TextView)itemView.findViewById(R.id.favorite_min);
        text5 = (TextView)itemView.findViewById(R.id.favorite_start);
        text6 = (TextView)itemView.findViewById(R.id.favorite_final);
        startTime = (TextView)itemView.findViewById(R.id.favorite_start);
        endTime = (TextView)itemView.findViewById(R.id.favorite_final);
        bidUser = (TextView)itemView.findViewById(R.id.favorite_bidUser);

        //text3 = (TextView)itemView.findViewById(R.id.mypage_remain_time);
    }
}
