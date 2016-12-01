package standards.dublincore;

import shared.Accessible;

import java.util.List;

/**
 * DublinCore implementation of an 'accessible' data object:
 *   - fed by 'ParseDC'
 *   - exported via 'ExportDC'
 *   - and potentially used by 'Aggregate'
 */
public class DublinCore extends Accessible{

    @Override
    public List<String> getClassificationTerm() {
        return null;
    }

    @Override
    public List<String> getStylesIndexingTerms() {
        return null;
    }

    @Override
    public List<String> getStyleIndexingType() {
        return null;
    }
}
