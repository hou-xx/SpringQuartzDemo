package com.hxx.job;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <ul>
 * <li>功能说明：</li>
 * <li>作者：tal on 2018/6/4 0004 10:38 </li>
 * <li>邮箱：houxiangxiang@cibfintech.com</li>
 * </ul>
 */

public class JobDemo {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void execute() {
        System.err.println("现在的时间是 --> " + dateFormat.format(new Date()));
    }
}
