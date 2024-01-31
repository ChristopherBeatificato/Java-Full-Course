//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[][] = { {2, 7, 9}, {3, 6, 1}, {7, 4, 2} };
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
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
    ex: the 2 in the 0 row would be row 0 column 0]
    System.out.println(arr[0][1]) [This will print row 0, column 1 meaning 7 will be printed]

Do While Loops
    [The do while loop is very similar to a while loop. The only difference is in a do while Loop the
    statement will be printed ONCE, then only be repeated if the expression stated after the while is true.]
    int count = 11;
    do {
        System.out.println("Hello there!");
        } while (count < 10)

While Loops
    [While loops are very simple. They are basically loops that will only execute this statement if the
    expression after while is true.]
    int count = 1;
    while (count < 10) {
        System.out.println("Count is: " + count);
        count++;
    }

For Loops
    [For Loops are basically complex while loops. They are used for a more compact loop. The variable created
    inside the for loop cannot be used outside the for loop]
    for (num1 = 1; num1<10; num1++){ [initialization; termination; increment]
        System.out.println("Count is: " + num1);
    }

Enhanced For Loop
    [Enhanced for Loops utilize something called a collection. An array is a type of collection. This loop
    can be used to slowly cycle through all the elements of your array. To easily see this see the example]
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    for (int count : numbers) {
        System.out.println("Count is: " + count);
        if (numbers = 4){
            System.out.println("This is 4");
        }
    }

Nested For Loop
    [Nested For Loops can be used whenever you have a situation in which you need to iterate a collection
    based off of another collection. Hard to explain in words just copy and paste this example and it should
    make sense. It basically finishes the entire sub for loop before ending/checking the main for loop again.]
    int arr[][] = { {2, 7, 9}, {3, 6, 1}, {7, 4, 2} }
    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            System.out.println(arr[i][j] + " ");
        }
        System.out.println();
    }
 */