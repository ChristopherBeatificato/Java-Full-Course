//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
}


/*
NonPrimitive Data Types

    String str = "test"; [creates a object that can be used multiple times]
    String str = new String ("test"); [creates a new object when called]

    int arr[]; [creates an int array]
    arr = new int [2]; [States the storage size of the array]

Data Type Conversions*

    Implicit casting example
    int a = 100;
    long b = a; [this is implicit data casting because it's going from a smaller datatype to a larger one]

    Explicit casting
    double a = 50.50;
    float b = (float)a; [this is explicit data casting because it's going from a larger datatype to a smaller one.]

Hello World Program

public [entry point method has to be public for java to find it]
static [whenever you want to access something within the class without making an object]
void [the return type, void will not return anything]
main [the name, needs to be main]

Switch Cases

    int month = 6;
    String monthString
    switch (month) {
    case 1: [the 1 represents the variable you want to look at]
        monthString = "January";
        break;
     default: [if none of the case conditions are true, then this will apply]
        monthString = "Invalid Month";
        break;
    }

Two Dimensional Arrays
    int arr[][] = { {2, 7, 9}, {3, 6, 1} };[each block of {} is a row, and inside that row are columns.
    ex: the 2 in the first row would be first row 2nd column]
    System.out.println(arr[0][1]) [This will print row 0, column 1 meaning 7 will be printed]

 */