package com.baby.tt.common.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Strategy implements Serializable {

    private static final long serialVersionUID = -5645671853456995891L;
    private Long id;
    private String imgurl;
    private String title;
    private String author;
    private String detail;
    private Date createdTime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

}
