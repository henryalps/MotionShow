package com.tencent.motionshow;

import android.app.Application;

import com.elbbbird.android.socialsdk.SocialSDK;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by henryalps on 5/2/16.
 * 应用初始化
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initConfig();
    }

    /**
     * 此处进行应用初始化配置 by henryrhe
     */
    private void initConfig() {
        // 分享sdk初始化 开始
        SocialSDK.setDebugMode(true); //开启分享功能的调试
        // 分享sdk初始化 结束
        // Iconify初始化 开始
        Iconify
                .with(new FontAwesomeModule());
        // Iconify初始化 结束
    }
}
