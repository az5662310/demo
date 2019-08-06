package com.company.dao.pojo;

public class PageVO {
    private  int begin;
    private int size;

    @Override
    public String toString() {
        return "PageVO{" +
                "begin=" + begin +
                ", size=" + size +
                '}';
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PageVO(int begin, int size) {
        this.begin = begin;
        this.size = size;
    }

    public PageVO() {
    }
}
