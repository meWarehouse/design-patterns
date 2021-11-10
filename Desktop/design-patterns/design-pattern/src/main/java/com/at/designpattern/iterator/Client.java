package com.at.designpattern.iterator;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-19 23:57
 */
public class Client {
    public static void main(String[] args) {

        //创建学院
        List<College> colleges = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();


    }
}
