package com.at.designpattern.proxy.staticproxy;

/**
 * @author zero
 * @create 2020-11-19 14:51
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {

        System.out.println("静态代理前准备....");

        iTeacherDao.teach();

        System.out.println("静态代理结束收尾 ....");

    }
}
