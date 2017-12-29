package com.demomvpproject;

/**
 * Created by Administrator on 12/28/2017.
 */

public interface Model {
    void logicAction(String userName,String password,OnLoginFinish listener);

    interface OnLoginFinish{
       void onError();
       void onSuccessLogin(String message);
    }
}
