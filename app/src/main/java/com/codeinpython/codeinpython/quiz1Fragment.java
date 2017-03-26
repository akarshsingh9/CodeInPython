package com.codeinpython.codeinpython;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * A simple {@link Fragment} subclass.
 */
public class quiz1Fragment extends Fragment {
    RadioButton q1a2;
    Button btn1;

    public quiz1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_quiz1, container, false);
        String android_id = Settings.Secure.getString(getContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        String deviceId = md5(android_id).toUpperCase();
        Log.i("device id=",deviceId);
        AdView adView = (AdView)v.findViewById(R.id.adViewques1);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(deviceId)
                .build();
        adView.loadAd(adRequest);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //noinspection ConstantConditions
        q1a2 = (RadioButton)getView().findViewById(R.id.question1);
        btn1 = (Button)getView().findViewById(R.id.submitans1);
        final SharedPreferences preferences = getActivity().getSharedPreferences("shared",0);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = preferences.edit();
                if(q1a2.isChecked())
                {
                    editor.putInt("ans1",1);
                }
                else {
                    editor.putInt("ans1", 0);
                }
                editor.apply();
                ((QuizActivity)getActivity()).setCurrentItem(1,true);
            }
        });
    }
    public String md5(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}