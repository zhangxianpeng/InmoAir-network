package com.inmo.network.model;

public class MultipartStringBody {

    public final String value;
    public final String contentType;

    public MultipartStringBody(String value, String contentType) {
        this.value = value;
        this.contentType = contentType;
    }

}
