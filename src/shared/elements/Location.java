package shared.elements;

import shared.Element;

import java.util.List;

/**
 * Current shared.elements.Location - Core element (21) in Getty crosswalk.
 */
public abstract class Location extends Element {

    public abstract String getCurrentRepository();

    public abstract List<String> getRepositoryNumbers();

    public abstract String getNumberType();

    public abstract String getShelfLocation();

    public abstract String getCurrentCreditLine();

    public abstract String getIdentification();

    public abstract List<String> getRemarks();

}
