package com.gd.common.pojo;


import com.gd.common.consts.ConstantUtil;

/**
 * 分页信息(Response)
 *
 * @author yuansf
 * @date 2018-01-02
 */
public class Pager {

    private Integer pageIndex;

    private Integer pageSize = ConstantUtil.PAGE_SIZE;

    private Integer recordSize;

    private Boolean isEnd;

    public Pager() {
    }

    public Pager(Integer pageIndex, Integer recordSize) {
        this.pageIndex = pageIndex;
        this.recordSize = recordSize;
    }

    public Pager(Integer recordSize, Boolean isEnd) {
        this.recordSize = recordSize;
        this.isEnd = isEnd;
    }

    public Pager(Integer pageIndex, Integer pageSize, Integer recordSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.recordSize = recordSize;
    }

    public Pager(Integer pageIndex, Integer pageSize, Integer recordSize, Boolean isEnd) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.recordSize = recordSize;
        this.isEnd = isEnd;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(Integer recordSize) {
        this.recordSize = recordSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Boolean getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }
}
