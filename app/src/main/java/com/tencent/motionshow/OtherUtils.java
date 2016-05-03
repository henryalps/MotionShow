package com.tencent.motionshow;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by henryalps on 5/2/16.
 */
public class OtherUtils {

    private static final AtomicInteger counter = new AtomicInteger();

    public static int getUuid() {
        return counter.getAndIncrement();
    }
}
