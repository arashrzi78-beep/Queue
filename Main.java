import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Queue q1 = new Queue(100);
        Queue q2 = new Queue(100);
        Scanner sc = new Scanner(System.in);

        q1.enqueue("elma");
        q1.enqueue("armut");
        q1.enqueue("kiraz");
        q1.enqueue("muz");
        q1.enqueue("kavun");
        q1.enqueue("kaysi");

        q2.enqueue("apple");
        q2.enqueue("pear");
        q2.enqueue("cherry");
        q2.enqueue("banana");
        q2.enqueue("melon");
        q2.enqueue("apricot");

        System.out.println("enter a fruit in Turkish : ");
        String word = sc.nextLine().toLowerCase();
        boolean isFound = false;

        for (int i = 0; i < q1.size(); i++) {
            if (q1.peek().toString().equalsIgnoreCase(word)) {
                System.out.println(q2.peek());
                isFound = true;
                break;
            }else {
                q1.enqueue(q1.dequeue());
                q2.enqueue(q2.dequeue());
            }
        }
        if (!isFound) {
            System.out.println("fruit not found");
        }

        Queue q3 = new Queue(1000);

        for (int i = 0 ; i<10 ; i++){
            int number  = (int)(Math.random()*20 + 1);
            q3.enqueue(number);
            System.out.print(number+" ");
        }
        System.out.println();
        for (int i = 1 ; i<=20 ; i++){
            boolean isExist = false;
            for (int j = 0 ; j<q3.size() ; j++){
                if((int)q3.peek()==i){
                    isExist = true;
                    break;
                }else {
                    q3.enqueue(q3.dequeue());
                }
            }
            if (!isExist) {
                System.out.print(i+" ");
            }
        }





    }
}