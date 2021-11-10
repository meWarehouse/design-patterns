package com.at.designpattern.prototype.deepclone;


import java.io.*;

/**
 * 深度拷贝的实现拷贝的两种方式
 */
public class DeepPrototype implements Serializable, Cloneable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {

    }

    // 方式1 ：通过重写clone方法来实现深拷贝 （引用对象多，这种方法比较繁琐）
    @Override
    protected DeepPrototype clone() throws CloneNotSupportedException {

        DeepPrototype clone = (DeepPrototype) super.clone();
        clone.deepCloneableTarget = (DeepCloneableTarget) clone.deepCloneableTarget.clone();

        return clone;
    }

    // 方式2： 通过对象序列化实现深拷贝 （推荐）
    public Object deepClone() {

        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);


            DeepPrototype o = (DeepPrototype) ois.readObject();

            return o;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {

                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
