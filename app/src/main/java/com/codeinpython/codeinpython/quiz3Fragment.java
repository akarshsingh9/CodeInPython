package com.codeinpython.codeinpython;


import android.content.Intent;
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
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

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
                Intent intent = new Intent(getActivity(),ScoreActivity.class);
                startActivity(intent);
            }
        });

    }
}
