package shared;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;



/**
 * Interface of getters and setters, to be implemented by each standard
 *   in order to afford flexibility in process of interoperability.
 *
 * - quasi-Strategy pattern where each standard must
 */
public abstract class Accessible{

    /* - GETTERS - */


    // - CLASSIFICATION (core) - //

    public abstract List<String> getClassificationTerm();

    
    // - Styles/Periods/Groups/Movements - //

    public abstract List<String> getStylesIndexingTerms();

    public abstract List<String> getStyleIndexingType();


    /* - HELPERS - */

    /** utilize helper to return _earliest_ date from iterable collection of Dates*/
    public static Date getEarliestDate(Iterable<Date> lsDates){
        return getDateExtreme(lsDates, true);
    }

    /** utilize helper to return _earliest_ date from iterable collection of Dates*/
    public static Date getLatestDate(Iterable<Date> lsDates){
        return getDateExtreme(lsDates, false);
    }

    /**
     * Abstractly handle date comparisons from earliest or
     * @param lsDates
     * @param isEarliest
     * @return
     */
    public static Date getDateExtreme(Iterable<Date> lsDates, boolean isEarliest){

        // set toReturn to null to avoid skewing comparison and to handle case where lsDates is empty
        Date toReturn = null;

        // for each date is list of dates
        for(Date d : lsDates){

            // if toReturn is not initialized, set toReturn to the first value
            if(toReturn == null){ toReturn = d; }
            else {
                // determine whether or not the 'toReturn' needs to be updated
                boolean toChange = isEarliest ? d.compareTo(toReturn) < 0 : d.compareTo(toReturn) > 0;
                if(toChange){ toReturn = d; }
            }
        }

        return toReturn;
    }

    /**
     * TESTING - test the date comparator
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<Date> lsDates = new ArrayList<Date>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d2009 = sdf.parse("2009-01-01"); lsDates.add(d2009);
        Date d2010 = sdf.parse("2010-01-01"); lsDates.add(d2010);
        Date d2011 = sdf.parse("2011-01-01"); lsDates.add(d2011);

        System.out.println("earliest: " + getEarliestDate(lsDates));
        System.out.println("latest: " + getLatestDate(lsDates));
    }
}
