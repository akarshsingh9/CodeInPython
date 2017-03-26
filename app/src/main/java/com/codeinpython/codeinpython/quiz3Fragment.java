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
public class quiz3Fragment extends Fragment {

    RadioButton q3a3;
    Button btn3;
    public quiz3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_quiz3, container, false);

        String android_id = Settings.Secure.getString(getContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        String deviceId = md5(android_id).toUpperCase();
        Log.i("device id=",deviceId);
        AdView adView = (AdView)v.findViewById(R.id.adViewques3);
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
        q3a3 = (RadioButton)getView().findViewById(R.id.question3);
        btn3 = (Button)getView().findViewById(R.id.submitans3);
        final SharedPreferences preferences = getActivity().getSharedPreferences("shared",0);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = preferences.edit();
                if(q3a3.isChecked())
                {
                    editor.putInt("ans3",1);
                }
                else {
                    editor.putInt("ans3", 0);
                }
                editor.apply();
                ((QuizActivity)getActivity()).setCurrentItem(3,true);
                //Intent intent = new Intent(getActivity(),ScoreActivity.class);
                //startActivity(intent);
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
