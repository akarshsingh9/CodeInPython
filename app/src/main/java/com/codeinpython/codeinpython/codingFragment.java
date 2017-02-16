package com.codeinpython.codeinpython;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class codingFragment extends Fragment {


    public codingFragment() {
        // Required empty public constructor
        super();
    }
    //ImageButton back;
    public static codingFragment newInstance(String title, String code) {

        Bundle args = new Bundle();
        args.putString("title",title);
        args.putString("coding",code);
        codingFragment fragment = new codingFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_coding, container, false);

        TextView title = (TextView)v.findViewById(R.id.codeheading);
        title.setText(getArguments().getString("title"));


        //Toolbar toolbar = (Toolbar)getActivity().findViewById(R.id.toolbarcoding);



        /*WebView webView = (WebView)v.findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //webSettings.getSettings().setLoadsImagesAutomatically(true);
        webView.loadUrl("https://gist.github.com/rduplain/2638913");
*/


        TextView coding = (TextView)v.findViewById(R.id.coding);
        coding.setText(Html.fromHtml(getArguments().getString("coding")));


        return v;
    }
}
