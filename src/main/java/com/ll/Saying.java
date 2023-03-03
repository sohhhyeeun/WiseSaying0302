package com.ll;

public class Saying {
    private long num;
    private String famSaying;
    private String writer;

    public Saying(long num, String famSaying, String writer) {
        this.num = num;
        this.famSaying = famSaying;
        this.writer = writer;
    }

    public long getNum() {
        return num;
    }

    public String getFamSaying() {
        return famSaying;
    }

    public String getWriter() {
        return writer;
    }
}
