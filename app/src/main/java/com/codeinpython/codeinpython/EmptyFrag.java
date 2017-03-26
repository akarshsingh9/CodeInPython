package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EmptyFrag extends Fragment {

    public EmptyFrag() {
        super();
    }

    public static EmptyFrag newInstance(String msg) {

        Bundle args = new Bundle();
        args.putString("message",msg);
        EmptyFrag fragment = new EmptyFrag();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.emptyfrag,container,false);
    }
}
