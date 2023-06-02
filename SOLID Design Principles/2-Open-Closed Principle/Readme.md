Open-Closed Principle

Software Entities - (Classes, Modules, Methods etc.)</br>
Should be open for extension, but closed for modification.</br>

Open for Extention -> Extend existing behavior </br>

Closed for Modification -> Existing code remains unchanged</br>

```
Base Class <- Closed for Modification
    ^         (avoid modifying base class)
    |
Derived <- Open for extension
           (can derive from base & override methods)
```
