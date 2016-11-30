import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.List;

/**
 * State - Element (9) of Getty crosswalk
 */
public abstract class State extends Accessible{

    public abstract String getStateDescription();

    public abstract String getStateIdentification();

    public abstract List<String> getKnownStates();

    public abstract List<String> getCitations();

}
