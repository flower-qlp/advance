package com.middle.advanced.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResponseDto implements Serializable {

    private String code;

    private String msg;

    private Object data;

    public ResponseDto() {
    }

    public ResponseDto(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseDto(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
