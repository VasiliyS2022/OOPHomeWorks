package dip1.model;

import java.util.ArrayList;
import java.util.List;

import dip1.model.util.Printer;

public class Report{
    private List<ReportItem> items;
    private Printer<ReportItem> printer;

    public Report(Printer<ReportItem> printer) {
        this.printer = printer;
    }

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        printer.output(items);
    }
}