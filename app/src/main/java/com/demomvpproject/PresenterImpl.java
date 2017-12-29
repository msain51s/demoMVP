package com.demomvpproject;

/**
 * Created by Administrator on 12/28/2017.
 */

public class PresenterImpl implements Presenter,Model.OnLoginFinish {
    private MainView mainView;
    private Model model;

    PresenterImpl(MainView mainView,Model model){
        this.mainView=mainView;
        this.model=model;
    }
    @Override
    public void performLoginBusinessLogic(String userName, String password) {
        if(mainView!=null)
            mainView.showProgress();
         if(model!=null){
             model.logicAction(userName,password,this);
         }
    }


    @Override
    public void onDestroy() {
      mainView=null;
    }

    @Override
    public void onError() {
        if(mainView!=null){
            mainView.hideProgress();
        }
    }

    @Override
    public void onSuccessLogin(String message) {

       if (mainView!=null){
           mainView.hideProgress();
           mainView.showToastMessage(message);
       }
    }
}
