package com.middle.advanced.controller;

import com.middle.advanced.dto.ResponseDto;

import static com.middle.advanced.constant.Response.*;

public class BaseController {

    public ResponseDto buildSuccessResponse() {
        return new ResponseDto(CODE_RESULT_SUCCESS, MSG_RESULT_SUCCESS);
    }

    public ResponseDto buildErrorResponse() {
        return new ResponseDto(CODE_ERROR, MSG_ERROR);
    }

    public ResponseDto buildResponse(String code, String msg, Object data) {
        return new ResponseDto(code, msg, data);
    }

}
