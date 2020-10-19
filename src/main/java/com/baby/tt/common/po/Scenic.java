package com.baby.tt.common.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Scenic implements Serializable {

    private Long id;
    private String imgurl;
    private String location;
    private String detail;

}
