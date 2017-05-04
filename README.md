# library-json

### short description ###
Collect, translate, standardize, and serve collected 
  [getty crosswalk](http://www.getty.edu/research/publications/electronic_publications/intrometadata/crosswalks.html)
  information for common metadata schemas and controlled vocabularies in LIS.

### long description ###
A collection of json objects which attempt to interpret common information/standards
  systems (e.g. dublin core) and controlled vocabularies (e.g. LoC subject headings, 
  ISO language options) in a way that is as helpful, simple, reusable, readable, 
  and extensible as possible.
  
### rationale ###

#### library
much of the work in LIS...
- involves robust static systems of hierarchically organized knowledge
- requires constant reference to standards and references which are difficult to memorize (size, specificity, complexity, etc) 
- can benefit extremely from automation and open source collaboration.

#### json
the .json file format...
- is very lightweight and readable, allowing for expanding/collapsing sections in most editors/IDEs
- is increasingly becoming the standard for the web and microservices
- is language agnostic (easy to translate back into other kinds of objects in different OO-languages)

#### etc
interpreting these hierarchical systems of information into concrete files is useful for...
- (reuse) make a reusable reference usable by multiple projects
- (reference) increasing the reability and understandability 
- (unit economy) expand/collapse easily to specify/omit relevant sections and hold context
- (learning them) creating the references themselves is a useful tool for first grasping them.
