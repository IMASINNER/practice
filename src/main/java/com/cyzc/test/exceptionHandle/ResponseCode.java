package com.cyzc.test.exceptionHandle;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-02-10
 */
public enum ResponseCode {

    SUCCESS(200,"成功","SUCCESS"),
    NO_AUTHORITY(230,"无权限","NO AUTHORITY")
    ;


    private Integer code;

    private String msgCh;

    private String msgEn;

    ResponseCode(Integer code, String msgCh, String msgEn) {
        this.code = code;
        this.msgCh = msgCh;
        this.msgEn = msgEn;
    }

    ResponseCode() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsgCh() {
        return msgCh;
    }

    public void setMsgCh(String msgCh) {
        this.msgCh = msgCh;
    }

    public String getMsgEn() {
        return msgEn;
    }

    public void setMsgEn(String msgEn) {
        this.msgEn = msgEn;
    }
}
