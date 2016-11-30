import java.util.List;

/**
 * Materials and Techniques - Core element (7) in Getty Crosswalk
 */
public abstract class Materials extends Element {

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
}
