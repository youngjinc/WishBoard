package com.hyeeyoung.wishboard.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SaveSharedPreferences {
    static final String PREF_USER_ID = "user_id";
    static final String PREF_USER_EMAIL = "email";
//    static final String PREF_USER_PW = "pw";

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    // @param : 사용자 정보 저장
    public static void setUserEmail(Context ctx, String email) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER_EMAIL, email);
        editor.commit();
    }

//    public static void setUserPw(Context ctx, String pwd) {
//        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
//        editor.putString(PREF_USER_PW, pwd);
//        editor.commit();
//    }

    public static void setUserId(Context ctx, String user_id) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER_ID, user_id);
        editor.commit();
    }

    // @param : 저장된 이메일 정보 가져오기
    public static String getUserEmail(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_USER_EMAIL, "");
    }

//    // @param : 저장된 패스워드 정보 가져오기
//    public static String getUserPw(Context ctx) {
//        return getSharedPreferences(ctx).getString(PREF_USER_PW, "");
//    }

    // @param : 저장된 이메일 정보 가져오기
    public static String getUserId(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_USER_ID, "");
    }

    // @param : 로그아웃, 앱 내에서 로그아웃 누를 경우에 사용 예정
    public static void clearUser(Context ctx) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.clear();
        editor.commit();
    }
}