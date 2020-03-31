package com.example.week07.Entities;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.w3c.dom.CDATASection;

public class CoinLoreResponse {

    @SerializedName("data")
    @Expose
    private List<Coin> data = null;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
