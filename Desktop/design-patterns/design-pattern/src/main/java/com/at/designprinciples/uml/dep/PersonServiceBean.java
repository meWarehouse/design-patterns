package com.at.designprinciples.uml.dep;

import com.at.designprinciples.uml.gen.DaoSupport;
import com.at.designprinciples.uml.impl.PersonService;

/**
 * @author zero
 * @create 2020-11-17 13:10
 */
public class PersonServiceBean extends DaoSupport implements PersonService {

    private PersonDao personDao;//类

    public void save(Person person) {
    }

    public IDCard getIDCard(Integer personid) {
        return null;
    }

    public void modify() {
        Department department = new Department();
    }


}
