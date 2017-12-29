package com.demomvpproject;

/**
 * Created by Administrator on 12/28/2017.
 */

public interface Presenter {

    void performLoginBusinessLogic(String userName,String password);

    void onDestroy();
}
