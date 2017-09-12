/**
 * Copyright (C) 2014-2017 墨泊云舟 All Rights Reserved.
 */
package cn.no7player.bean.model;

/**
 *People ：
 *
 *@author xlb
 *@version 1.00
 *@since 2017/7/31 10:02
 */
public class BookList {
    private  String bookName;
    private  Integer bookType;

    public BookList(String bookName, Integer bookType) {
        this.bookName = bookName;
        this.bookType = bookType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }
}
