package com.codeinpython.codeinpython;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;


public class codingFragment extends Fragment{


    public codingFragment() {
        // Required empty public constructor
        super();
    }
    //ImageButton back;
    public static codingFragment newInstance(String title, String url) {

        Bundle args = new Bundle();
        args.putString("title",title);
        args.putString("url",url);
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



        WebView webView = (WebView)v.findViewById(R.id.webview);
        //webView.setWebChromeClient(new MyWebViewClient());


        //progress.setMax(100);
        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webSettings.setDefaultFontSize(25);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setBuiltInZoomControls(true);
        //webSettings.getSettings().setLoadsImagesAutomatically(true);
        if(isNetworkAvailable()) {
            Toast.makeText(getActivity(),"Loading Data....",Toast.LENGTH_SHORT).show();
            String url = getArguments().getString("url");
            //codingFragment.this.progress.setProgress(0);
            webView.loadDataWithBaseURL("", url, "text/html", "UTF-8", null);
        }
        else
        {
            Toast.makeText(getActivity(),"No Internet. Please Connect to Network...",Toast.LENGTH_SHORT).show();
        }


        return v;
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }
    /*private class MyWebViewClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            codingFragment.this.setValue(newProgress);
            super.onProgressChanged(view, newProgress);
        }
    }

    public void setValue(int progress) {
        this.progress.setProgress(progress);
    }*/
}


