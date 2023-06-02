Open-Closed Principle

Software Entities - (Classes, Modules, Methods etc.)
Should be open for extension, but closed for modification.

Open for Extention -> Extend existing behavior 

Closed for Modification -> Existing code remains unchanged

Base Class <- Closed for Modification 
    ^         (avoid modifying base class)
    |
Derived <- Open for extension
           (can derive from base & override methods)