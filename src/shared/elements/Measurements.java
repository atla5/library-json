package shared.elements;

import shared.Accessible;
import shared.Element;

import java.util.Date;
import java.util.List;

/**
 * shared.elements.Measurements - Core element (6) in Getty Crosswalk
 */
public abstract class Measurements extends Element {

    // - shared.elements.Measurements (core) - //

    public abstract List<String> getDimensionsDescription();

    public abstract List<String> getDimensionsType();

    public abstract List<String> getDimensionsValue();

    public abstract List<String> getDimensionsUnit();

    public abstract List<String> getDimensionsExtent();

    public abstract List<String> getScaleType();

    public abstract List<String> getDimensionsQualifier();

    public abstract List<Date> getDimensionsDate();

    public Date getEarliestDimensionsDate(){
        return Accessible.getEarliestDate(getDimensionsDate());
    }

    public Date getLatestDimensionsDate(){
        return Accessible.getLatestDate(getDimensionsDate());
    }

    public abstract List<String> getShape();

    public abstract List<String> getFormatSize();
}
