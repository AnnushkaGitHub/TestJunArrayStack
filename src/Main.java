public class Main {
    public static <T> void main(String[] args) {


//        вот есть такая структура данных
//        надо реализовать ее на java с помощью массива
//        в нашем классе стек конструктор принимает свою размерность
//        операции со стеком:
//        push - добавить элемент
//        pop - достать элемент из стека
//        size - размер стека
//        стек должен поддерживать Generics, ограничим наш стек только типами для чисел в java (Integer, Float, Double)

//        Stack<Integer> stack = new  Stack<Integer>(5);
//        stack.push(4);
//        stack.push(2);
//        stack.push(1);
//        stack.push(8);
//        stack.push(9);
//        stack.push(11);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//
//        Stack<Double> stackDouble = new  Stack<Double>(5);
//        stackDouble.push(4.1);
//        stackDouble.push(2.2);
//        stackDouble.push(1.1);
//        stackDouble.push(8.8);
//        stackDouble.push(9.2);
//        stackDouble.push(11.2);
//        stackDouble.pop();
//        stackDouble.pop();
//        stackDouble.pop();
//        stackDouble.pop();
//        stackDouble.pop();
//        stackDouble.pop();
//        stackDouble.pop();


        StackArray<Integer> stack = new StackArray<Integer>(5);
        stack.push(4);
        System.out.println("Size = " + stack.size());
        stack.push(2);
        System.out.println("Size = " + stack.size());
        stack.push(1);
        System.out.println("Size = " + stack.size());
        stack.push(8);
        System.out.println("Size = " + stack.size());
        stack.push(9);
        System.out.println("Size = " + stack.size());
        stack.push(11);
        System.out.println("Size = " + stack.size());
        T i = (T) stack.pop();
        System.out.println(i + " removed");
        System.out.println("Size = " + stack.size());
        i = (T) stack.pop();
        System.out.println(i + " removed");
        System.out.println("Size = " + stack.size());
        i = (T) stack.pop();
        System.out.println(i + " removed");
        System.out.println("Size = " + stack.size());
        i = (T) stack.pop();
        System.out.println(i + " removed");
        System.out.println("Size = " + stack.size());
        i = (T) stack.pop();
        System.out.println(i + " removed");
        System.out.println("Size = " + stack.size());
        i = (T) stack.pop();
        System.out.println(i + " removed");
        System.out.println("Size = " + stack.size());
        i = (T) stack.pop();
        System.out.println(i + " removed");
        System.out.println("Size = " + stack.size());

        StackArray<Double> stackDouble = new StackArray<Double>(5);
        stackDouble.push(4.1);
        stackDouble.push(2.2);
        System.out.println("Size = " + stackDouble.size());
        stackDouble.push(1.1);
        stackDouble.push(8.8);
        stackDouble.push(9.2);
        stackDouble.push(11.2);
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();
        System.out.println(i + " removed");
        i = (T) stackDouble.pop();




  //            StackMassive<String> stackString = new  StackMassive<String>(5);
    }
}
