package com.demomvpproject;

/**
 * Created by Administrator on 1/28/2016.
 */
public interface ResponseListener {
    public static final int REQUEST_TEXTPAD = 111;
    public static final int REQUEST_SAVETABLE = 3;
    public static final int REQUEST_GET_IMEI_AVAILABILITY=1;
    public static final int REQUEST_GET_DEALER_AVAILABILITY=2;
    public static final int REQUEST_VALIDATE_USER=4;
    public static final int REQUEST_FORGOT_PASSWORD=5;
    public static final int REQUEST_RIGHT_MODULE=6;
    public static final int REQUEST_VERIFY_USER=7;
    public static final int REQUEST_DEVICE_INFORMATION=8;
    public static final int REQUEST_DISCLAIMER=9;
    public static final int REQUEST_SAVE_DISCLAIMER=10;
    public static final int REQUEST_CATEGORY_LIST=11;
    public static final int REQUEST_SERIES_LIST=12;
    public static final int REQUEST_MODEL_LIST=13;
    public static final int REQUEST_LITERATURE_TYPE=14;
    public static final int REQUEST_GET_ATTACHMENT_LIST=15;
    public static final int REQUEST_GET_STATISTICS_LIST=16;
    public static final int REQUEST_CALL_ACTION=17;
    public static final int REQUEST_GET_APPLICABILITY=18;
    public static final int REQUEST_DEVICE_LOGOUT=19;
    public static final int REQUEST_CHANGE_PASSWORD=20;
    public static final int REQUEST_SUB_USER_DETAILS_LIST=21;
    public static final int REQUEST_CHECK_USER_AVAILABILITY=22;
    public static final int REQUEST_CREATE_SUB_USER=23;
    public static final int REQUEST_ROLE_LIST=24;
    public static final int REQUEST_DELETE_USER_DETAIL=25;
    public static final int REQUEST_ROLE_DETAILS=26;
    public static final int REQUEST_LANGUAGE_LIST=27;
    public static final int REQUEST_SAVE_FEEDBACK_IMAGE=28;
    public static final int REQUEST_SAVE_FEEDBACK=29;
    public static final int REQUEST_VALIDATE_SERIAL_NUMBER=30;
    public static final int REQUEST_IMAGES_SYNCING=31;

    public void onResponse(Response response, int rid);
}
