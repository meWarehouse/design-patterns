package com.at.designprinciples.uml.dep;

/**
 * @author zero
 * @create 2020-11-17 13:10
 */
public class IDCard {
    private Person person;

    public class Person {
        private IDCard card;
    }
}
