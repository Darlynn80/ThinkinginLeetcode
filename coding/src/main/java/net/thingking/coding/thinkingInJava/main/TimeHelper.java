package net.thingking.coding.thinkingInJava.main;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by darlynn on 6/22/17.
 *
 * 关于GregorianCalendar 和 Calendar
 */
public class TimeHelper {
    public boolean compare(XMLGregorianCalendar src, Calendar des) {
        if (src==null || des==null) {
            return false;
        }

        GregorianCalendar newTime = src.toGregorianCalendar();
        if (src.getTimezone()== DatatypeConstants.FIELD_UNDEFINED) {
            //转换到同一时区
            GregorianCalendar newSrc = src.toGregorianCalendar(des.getTimeZone(), Locale.getDefault(),src);
            if (des.compareTo(newSrc)==0)
                return true;
        } else if (!newTime.getTimeZone().getID().equals(des.getTimeZone())) {
            return newTime.equals(des)? true: false;

        }

        return false;
    }
}
