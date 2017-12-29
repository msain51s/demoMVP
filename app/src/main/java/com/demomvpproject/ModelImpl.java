package com.demomvpproject;

import android.text.TextUtils;
import android.view.View;

/**
 * Created by Administrator on 12/28/2017.
 */

public class ModelImpl implements Model{

    @Override
    public void logicAction(String userName, String password,OnLoginFinish listener) {
        if(!TextUtils.isEmpty(userName)&& !TextUtils.isEmpty(password)){
            listener.onSuccessLogin("Login Successfully");
        }else{
            listener.onError();
        }
    }


}
