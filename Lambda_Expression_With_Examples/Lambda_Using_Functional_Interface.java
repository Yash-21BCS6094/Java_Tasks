package Lambda_Expression_With_Examples;

import java.util.ArrayList;

// Interface for simple demo of lambda expression
interface FunctionalInter{
    void abstractFun(int x);
}
// Interface with zero parameters
interface ZeroParamerter{
    void display();
}
// Interface with multiple parameters
interface MultipleParameter{
    int operation(int firstNum, int secondNum);
}

public class Lambda_Using_Functional_Interface {
    public static void main(String[] args) {
        // Lambda with one parameter
        FunctionalInter obj = (int x) -> {
            System.out.println(2 * x);
        };
        obj.abstractFun(5);
        // Lambda with zero parameter
        ZeroParamerter obj2 = () -> {
            System.out.println("Calling interface with no parameters");
        };
        obj2.display();

        // Lambda with ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(100);
        arrayList.add(1222);
        arrayList.add(4321);
        arrayList.add(123);

        System.out.println("Elements of arraylist");
        arrayList.forEach(x -> System.out.println(x));

        System.out.println("Even elements of the arrayList.");
        arrayList.forEach(x -> {
            if(x % 2 == 0){
                System.out.println(x);
            }
        });

        // Lamdba with multiple parameters [Arithmetic Expressions]
        MultipleParameter multi = (int firstNum, int secondNum) -> {
         return firstNum * secondNum;
        };

        MultipleParameter add = (int firstNum, int secondNum) -> {
            return firstNum + secondNum;
        };

        MultipleParameter subtract = (int firstNum, int secondNum) -> {
            return firstNum - secondNum;
        };

        MultipleParameter divide = (int firstNum, int secondNum) -> {
            return firstNum / secondNum;
        };

        System.out.println("Multiply with Lambda: " + multi.operation(10, 20));
        System.out.println("Add with Lambda: " + add.operation(20, 30));
        System.out.println("Subtract with Lambda: " + subtract.operation(20, 10));
        System.out.println("Divide with Lambda: " + divide.operation(30, 3));

    }
}
