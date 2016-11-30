import java.util.Date;
import java.util.List;

/**
 * Creation - Core element (4) in Getty Crosswalk
 */
public abstract class Creation extends Element{

    // - CREATION (core) - //

    public abstract List<String> getCreatorDescription();

    public abstract List<String> getCreatorExtent();

    public abstract List<String> getCreatorQualifier();

    public abstract List<String> getCreatorIdentity();

    public abstract List<String> getCreatorRole();

    public abstract List<Date>   getCreationDates();

    public Date getEarliestCreationDate(){
        return Accessible.getEarliestDate(getCreationDates());
    }

    public Date getLatestCreationDate(){
        return Accessible.getLatestDate(getCreationDates());
    }

    public abstract List<String> getCreationDateQualifier();

    public abstract List<String> getCreationPlace();

    public abstract List<String> getObjectWorkCulture();

    public abstract List<String> getCommissioner();

    public abstract List<String> getCommissionerRole();

    public abstract List<Date> getCommissionDates();

    public Date getEarliestCommissionDate(){
        return Accessible.getEarliestDate(getCommissionDates());
    }

    public Date getLatestCommissionDate(){
        return Accessible.getLatestDate(getCommissionDates());
    }

    public abstract List<String> getCreationRemarks();

}
