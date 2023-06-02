Dependency Inversion Principle

a) High level modules should not depend upon low level modules.
Both should depend on abstractions

b) Abstractions should not depend upon details.
Details should depend upon abstractions

Dependency Examples
```
public void printMe(){
    System.out.println("Hello!"); //We are depending on out
}
```
```
public void writeReport(){ //these should not be tightly coupled (we can use interface for formatter and writer)
    Report report = new Report();
    //Build the report
    JSONFormatter formatter = new JSONFormatter(); //We are depending on formatter
    String report = formatter.format(report);
    FileWriter writer = new FileWriter("report.json"); //We are depending on writer
    //write out report
    ...
}
```
                |
                |
                V
```
public void writeReport(Formatter formatter, Writer writer){ //pass difference formatter or writer such as XML, HTML etc
    Report report = new Report();
    //Build the report
    String report = formatter.format(report);
    //write out report
    writer.write("myreport");

}
```
