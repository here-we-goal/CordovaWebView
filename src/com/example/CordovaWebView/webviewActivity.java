package com.example.CordovaWebView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.apache.cordova.Config;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;

import java.util.concurrent.ExecutorService;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 13-5-20
 * Time: 下午11:39
 * To change this template use File | Settings | File Templates.
 */
public class webviewActivity extends Activity implements CordovaInterface {
    CordovaWebView webview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        webview = (CordovaWebView) findViewById(R.id.webview);
        Config.init(this);
        webview.loadUrl("http://baidu.com");
    }

    @Override
    public void startActivityForResult(CordovaPlugin cordovaPlugin, Intent intent, int i) {
        //To change body of implemented methods use File | Settings | File Templates.

    }

    @Override
    public void setActivityResultCallback(CordovaPlugin cordovaPlugin) {
        //To change body of implemented methods use File | Settings | File Templates.

    }

    @Override
    public Activity getActivity() {
        //Thanks to
        //http://stackoverflow.com/questions/12739729/embedding-org-apache-cordova-cordovawebview-on-android-throwing-error
        return this;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object onMessage(String s, Object o) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ExecutorService getThreadPool() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}