package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:12
 *
 * 指挥官角色
 *
 */
public class RemoteController {

    //开关 按钮的命令数组
    Commond[] onCommonds;
    Commond[] offCommonds;

    //撤销命令
    Commond undoCommonds;

    //使用构造器对按钮进行初始化
    public RemoteController() {

        onCommonds = new Commond[5];
        offCommonds = new Commond[5];

        for (int i = 0; i < 5; i++) {
            onCommonds[i] = new NoCommond();
            offCommonds[i] = new NoCommond();
        }
    }

    //给按钮设置需要的命令
    public void setCommand(int no,Commond onCommond,Commond offCommond){
        onCommonds[no] = onCommond;
        offCommonds[no] = offCommond;
    }

    /* ----------------------指挥官执行请求--------------------------- */
    //点击按钮
    public void onButtonWasPushed(int no){
        //找到对应的按钮并执行操作
        onCommonds[no].execute();
        //记录本次操作
        undoCommonds = onCommonds[no];
    }
    public void offButtonWasPushed(int no){
        offCommonds[no].execute();
        undoCommonds = offCommonds[no];
    }

    //撤销按钮 只能撤销一次
    public void undoButtonCommit(){
        undoCommonds.undo();
    }




}
