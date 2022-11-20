public class Exercise2 {
    public static void isNumberEqual(int firstNumber, int secondNumber){
        if(firstNumber == secondNumber){
            System.out.println("მითითებული რიცხვები ერთმანეთის ტოლია");
        }else if(firstNumber > secondNumber){
            System.out.println(firstNumber + " მეტია " + secondNumber + "-ზე");
        }else{
            System.out.println(firstNumber + " ნაკლებია " + secondNumber + "-ზე");
        }
    }
}
