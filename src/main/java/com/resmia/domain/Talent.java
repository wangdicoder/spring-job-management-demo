/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.domain;

import javax.persistence.Entity;

@Entity
public class Talent extends User {

    public Talent() {
        setUserType("talent");
    }
}
