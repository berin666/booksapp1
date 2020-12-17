package com.example.books.model;

public class book {

    private String category;
    private String titel;
    private String author;
    private String desc;
    private String FlNm;
    private String imgFlPth;
    private int ixDate;
    private String language;
    private int pgcnt;
    private int sz;
    private int yr;
    private String rtng;
    private String prevwOk;

    public book() {
        this.category = category;
        this.titel = titel;
        this.author = author;
        this.desc = desc;
        FlNm =FlNm;
        this.imgFlPth = imgFlPth;
        this.ixDate = ixDate;
        this.language = language;
        this.pgcnt = pgcnt;
        this.sz = sz;
        this.yr = yr;
        this.rtng = rtng;
        this.prevwOk = prevwOk;
    }

    public String getCategory() {
        return category;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }

    public String getDesc() {
        return desc;
    }

    public String getFlNm() {
        return FlNm;
    }

    public String getImgFlPth() {
        return imgFlPth;
    }

    public int getIxDate() {
        return ixDate;
    }

    public String getLanguagr() {
        return language;
    }

    public int getPgcnt() {
        return pgcnt;
    }

    public int getSz() {
        return sz;
    }

    public int getYr() {
        return yr;
    }

    public String getRtng() {
        return rtng;
    }

    public String getPrevwOk() {
        return prevwOk;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setFlNm(String flNm) {
        FlNm = flNm;
    }

    public void setImgFlPth(String imgFlPth) {
        this.imgFlPth = imgFlPth;
    }

    public void setIxDate(int ixDate) {
        this.ixDate = ixDate;
    }

    public void setLanguagr(String languagr) {
        this.language = languagr;
    }

    public void setPgcnt(int pgcnt) {
        this.pgcnt = pgcnt;
    }

    public void setSz(int sz) {
        this.sz = sz;
    }

    public void setYr(int yr) {
        this.yr = yr;
    }

    public void setRtng(String rtng) {
        this.rtng = rtng;
    }

    public void setPrevwOk(String prevwOk) {
        this.prevwOk = prevwOk;
    }
}