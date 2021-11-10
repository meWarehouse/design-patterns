package com.at.designpattern.proxy.staticproxy;

/**
 * @author zero
 * @create 2020-11-19 14:50
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("TeacherDao 开始 teach ...");
    }
}
