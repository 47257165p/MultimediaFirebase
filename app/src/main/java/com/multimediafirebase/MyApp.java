package com.multimediafirebase;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by 47257165p on 10/02/16.
 */
public class MyApp extends Application{

    private Firebase ref;

    public void setRef (Firebase ref)
    {
        this.ref = ref;
    }

    public void OnCreate()
    {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
    @Override
    public void onCreate() {
        super.onCreate();
        super.onCreate();
        Firebase.setAndroidContext(this);

        ref = new Firebase("https://multimediafirebase.firebaseio.com");
    }
    public Firebase getRef()
    {
        return ref;
    }
}
