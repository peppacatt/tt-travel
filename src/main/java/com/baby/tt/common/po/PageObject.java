package com.baby.tt.common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageObject<T> implements Serializable {

    private static final long serialVersionUID = 4207522149063738383L;
    private Integer pageSize;
    private List<T> records;
    private Long pageCurrent;
    private Long pageCount;
    private Long rowCount;

    public PageObject(Integer pageSize, List<T> records, Long pageCurrent, Long rowCount) {
        this.pageSize = pageSize;
        this.records = records;
        this.pageCurrent = pageCurrent;
        this.rowCount = rowCount;
        this.pageCount = (this.rowCount-1)/pageSize+1;
    }
}
