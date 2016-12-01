package shared.elements;

import shared.Accessible;
import shared.Element;

import java.util.Date;
import java.util.List;

/**
 * Titles or Names - Core element (3) in Getty Crosswalk
 */
public abstract class Title extends Element {

    // - TITLES OR NAMES (core) - //

    public abstract List<String> getTitleText();

    public abstract List<String> getTitleType();

    public abstract List<String> getPreference();

    public abstract List<String> getTitleLanguage();

    public abstract List<Date> getTitleDates();

    public Date getEarliestTitleDate(){
        return Accessible.getEarliestDate(getTitleDates());
    }

    public Date getLatestTitleDate(){
        return Accessible.getLatestDate(getTitleDates());
    }

    public abstract List<String> getCitations();

}
