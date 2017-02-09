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
public class quiz2Fragment extends Fragment {
    RadioButton q2a1;
    Button btn2;

    public quiz2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_quiz2, container, false);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        q2a1 = (RadioButton)getView().findViewById(R.id.question2);
        btn2 = (Button)getView().findViewById(R.id.submitans2);
        final SharedPreferences preferences = getActivity().getSharedPreferences("shared",0);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = preferences.edit();
                if(q2a1.isChecked())
                {
                    editor.putInt("ans2",1);
                }
                else {
                    editor.putInt("ans2", 0);
                }
                editor.apply();
                ((QuizActivity)getActivity()).setCurrentItem(2,true);
            }
        });
    }
}
