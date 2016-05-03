package com.tencent.motionshow;

import android.content.Context;

import com.elbbbird.android.socialsdk.SocialSDK;
import com.elbbbird.android.socialsdk.model.SocialShareScene;

/**
 * Created by henryalps on 5/2/16.
 */
public class ShareModel {
    private Context mContext;

    public ShareModel(Context mContext) {
        this.mContext = mContext;
    }

    public void shareImage(String imageUri) {
        SocialShareScene tSocialShareScene =
                new SocialShareScene(OtherUtils.getUuid(),
                        mContext.getString(R.string.app_name),
                        mContext.getString(R.string.share_default_title),
                        mContext.getString(R.string.share_default_content),
                        imageUri,
                        "");
        SocialSDK.shareTo(mContext, tSocialShareScene);
    }

}
