Open-Closed Principle

Software Entities - (Classes, Modules, Methods etc.)</br>
Should be open for extension, but closed for modification.</br>

Open for Extention -> Extend existing behavior </br>

Closed for Modification -> Existing code remains unchanged</br>

Base Class <- Closed for Modification </br>
    ^         (avoid modifying base class)</br>
    |</br>
Derived <- Open for extension</br>
           (can derive from base & override methods)</br>
