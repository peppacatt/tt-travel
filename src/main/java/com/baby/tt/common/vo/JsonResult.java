package com.baby.tt.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult implements Serializable {

    private static final long serialVersionUID = 5634334572842773731L;
    private Integer state = 1;//1表示成功,0表示失败
    private String message = "success";
    private Object data;

    public JsonResult(String message) {
        this.message = message;
    }

    public JsonResult(Object data) {
        this.data = data;
    }

    public JsonResult(Throwable e) {
        this.state = 0;
        this.message = e.getMessage();
    }
}
