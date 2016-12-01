package shared.elements;

import shared.Accessible;

import java.util.List;

/**
 * shared.elements.State - shared.Element (9) of Getty crosswalk
 */
public abstract class State extends Accessible {

    public abstract String getStateDescription();

    public abstract String getStateIdentification();

    public abstract List<String> getKnownStates();

    public abstract List<String> getCitations();

}
