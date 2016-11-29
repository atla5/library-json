import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.List;

/**
 * Interface of getters and setters, to be implemented by each standard
 *   in order to afford flexibility in process of interoperability.
 */
public abstract class Accessible{

    /* - GETTERS - */

    // - OBJECT/WORK (core) - //

    public abstract List<String> getCatalogLevel();

    public abstract List<String> getObjectWorkType();

    public abstract List<String> getComponenntsParts();

    public abstract List<String> getObjectRemarks();


    // - CLASSIFICATION (core) - //

    public abstract List<String> getClassificationTerm();


    // - TITLES OR NAMES (core) - //

    public abstract List<String> getTitleText();

    public abstract List<String> getTitleType();

    public abstract List<String> getPreference();

    public abstract List<String> getTitleLanguage();

    public abstract List<Date> getTitleDates();

    public Date getEarliestTitleDate(){
        return getEarliestDate(getTitleDates());
    }

    public Date getLatestTitleDate(){
        return getLatestDate(getTitleDates());
    }

    public abstract List<String> getCitations();


    // - CREATION (core) - //

    public abstract List<String> getCreatorDescription();

    public abstract List<String> getCreatorExtent();

    public abstract List<String> getCreatorQualifier();

    public abstract List<String> getCreatorIdentity();

    public abstract List<String> getCreatorRole();

    public abstract List<Date>   getCreationDates();

    public Date getEarliestCreatiorDate(){
        return getEarliestDate(getCreationDates());
    }

    public Date getLatestCreatorDate(){
        return getLatestDate(getCreationDates());
    }

    public abstract List<String> getCreationDateQualifier();

    public abstract List<String> getCreationPlace();

    public abstract List<String> getObjectWorkCulture();

    public abstract List<String> getCommissioner();

    public abstract List<String> getCommissionerRole();

    public abstract List<Date> getCommissionDates();

    public Date getEarliestCommissionDate(){
        return getEarliestDate(getCommissionDates());
    }

    public Date getLatestCommissionDate(){
        return getLatestDate(getCommissionDates());
    }

    public abstract List<String> getCreationRemarks();

    
    // - Styles/Periods/Groups/Movements - //

    public abstract List<String> getStylesIndexingTerms();

    public abstract List<String> getStyleIndexingType();
    
    
    // - Measurements (core) - //

    public abstract List<String> getDimensionsDescription();

    public abstract List<String> getDimensionsType();

    public abstract List<String> getDimensionsValue();

    public abstract List<String> getDimensionsUnit();

    public abstract List<String> getDimensionsExtent();

    public abstract List<String> getScaleType();

    public abstract List<String> getDimensionsQualifier();

    public abstract List<Date> getDimensionsDate();
    
    public Date getEarliestDimensionsDate(){
        return getEarliestDate(getDimensionsDate());
    }

    public Date getLatestDimensionsDate(){
        return getLatestDate(getDimensionsDate());
    }

    public abstract List<String> getShape();

    public abstract List<String> getFormatSize();


    // - Materials and Techniques (core) - //

    public abstract List<String> getMaterialsTechniquesDescription();

    public abstract List<String> getMaterialsFlag();

    public abstract List<String> getMaterialsExtent();

    public abstract List<String> getMaterialsRole();

    public abstract List<String> getMaterialsName();

    public abstract List<String> getMaterialsColor();

    public abstract List<String> getMaterialsSourcePlace();

    public abstract List<String> getWatermarks();

    public abstract List<String> getPerformanceActions();

    public abstract List<String> getMaterialsRemarks();

    public abstract List<String> getMaterialsCitations();


    // - Inscriptions / Marks - //

    public abstract List<String> getInscriptionDescription();

    public abstract List<String> getInscriptionType();

    public abstract List<String> getInscriptionAuthor();

    public abstract List<String> getInscriptionLanguage();

    public abstract List<String> getInscriptionTypeface();

    public abstract List<String> getInscriptionDate();

    //...



    /* - HELPERS - */

    /** utilize helper to return _earliest_ date from iterable collection of Dates*/
    static Date getEarliestDate(Iterable<Date> lsDates){
        return getDateExtreme(lsDates, true);
    }

    /** utilize helper to return _earliest_ date from iterable collection of Dates*/
    static Date getLatestDate(Iterable<Date> lsDates){
        return getDateExtreme(lsDates, false);
    }

    /**
     * Abstractly handle date comparisons from earliest or
     * @param lsDates
     * @param isEarliest
     * @return
     */
    static Date getDateExtreme(Iterable<Date> lsDates, boolean isEarliest){

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
