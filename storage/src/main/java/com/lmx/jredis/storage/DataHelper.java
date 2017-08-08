package com.lmx.jredis.storage;

import lombok.Data;

/**
 * Created by lmx on 2017/4/17.
 */
@Data
public class DataHelper {
    String type = "kv";
    String key;
    String hash;
    int pos;
    int selfPos;
    int length;
    long expire;
}