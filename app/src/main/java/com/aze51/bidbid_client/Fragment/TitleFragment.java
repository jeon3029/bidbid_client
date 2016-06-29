package com.aze51.bidbid_client.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aze51.bidbid_client.R;

/**
 * Created by jeon3029 on 16. 6. 27..
 */
public class TitleFragment extends Fragment {
    View rootViewBasic;
    ImageView image1;
    TextView text;
    ImageView image2;
    public TitleFragment(){
        //생성자
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootViewBasic = inflater.inflate(R.layout.title_fragment,container,false);
        image1 = (ImageView)rootViewBasic.findViewById(R.id.logo_image);
        text = (TextView)rootViewBasic.findViewById(R.id.bidbid_text);
        image2 = (ImageView)rootViewBasic.findViewById(R.id.setting_image);
        return rootViewBasic;
    }
}