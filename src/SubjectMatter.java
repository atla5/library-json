import java.util.List;

/**
 * SubjectMatter Matter - Core element (16) of Getty Crosswalk
 */
public abstract class SubjectMatter extends Accessible {

    public abstract String getSubjectDisplay();

    public abstract List<String> getSubjectIndexingTerms();

    public abstract List<String> getSubjectIndexingType();

    public abstract List<String> getSubjectExtent();

}
