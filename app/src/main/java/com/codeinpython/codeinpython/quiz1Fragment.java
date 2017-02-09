package com.codeinpython.codeinpython;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;


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

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
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
}