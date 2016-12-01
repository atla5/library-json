package shared;

/**
 * Given 'shared.Element' of metadata, not unlike the 'dublin core' standard.
 */
public abstract class Element {

    // -- Data Members -- //

    /* metadata about the data included */
    protected String encoding = ""; //the format of the data as it's entered (e.g 'iso639-2', 'LCSH', 'yyyy-mm-dd', etc)
    protected String origin = "";   //the `accessible` interpretation of a file the data came from.
    //protected String ...

    /* data itself */
    protected String data;


    // - Constructor - //

    /* IMPLEMENTATION NOTES
     * - each element should be constructed with information about its origin.
     * - should be able to trace back from element to the access file, to the actual metadata entry
     * - 
     */

    // - Methods - //
}
