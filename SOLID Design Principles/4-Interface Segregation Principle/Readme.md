Interface Segregation Principle

Clients should not have to depend upon interfaces that they do not use. (Interface Pollution)

- Large Interfaces
- Unrelated Methods

Classes have empty method implentations
Method implementations throw UnsupportedOperationException (or similar)
Method implementations return null or default/dummy values 