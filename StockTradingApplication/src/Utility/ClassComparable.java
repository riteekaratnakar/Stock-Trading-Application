/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.Date;

/**
 *
 * @author Waqar
 */
public class ClassComparable implements Comparable<ClassComparable> {

    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date datetime) {
        this.dateTime = datetime;
    }

    @Override
    public int compareTo(ClassComparable o) {
        return getDateTime().compareTo(o.getDateTime());
    }
}
