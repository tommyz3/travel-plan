package com.example.utils.response;

public enum RespCode {
    SUCCESS(0, "请求成功"),
    WARN(1, "请求失败"),
    WRONGPARAM(2, "错误的参数");

    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
