package com.example.dell.gllweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2020/6/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
