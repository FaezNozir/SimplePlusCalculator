package com.kridentia.mysimplewordlibrary;

import android.util.Log;

public class HelloWorld {
    public static String result;

    public static void main(String[] args){

    }

    public static void printLog(String name, String message){
        Log.d("com.kridentia.mysimplewordlibrary.HelloWorld", name + ": " + message);
        // Store the result string
        result = name + ": " + message;
    }
}
