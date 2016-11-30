import java.util.Date;
import java.util.List;

/**
 * Inscriptions / Marks - Element 8 of Getty Crosswalk
 */
public abstract class Inscriptions extends Element{

    // - Inscriptions / Marks - //

    public abstract List<String> getInscriptionDescription();

    public abstract List<String> getInscriptionType();

    public abstract List<String> getInscriptionAuthor();

    public abstract List<String> getInscriptionLanguage();

    public abstract List<String> getInscriptionTypeface();

    public abstract List<Date> getInscriptionDates();

    public Date getEarliestInscriptionDate(){
        return Accessible.getEarliestDate(getInscriptionDates());
    }

    public Date getLatestInscriptionDate(){
        return Accessible.getLatestDate(getInscriptionDates());
    }
}
