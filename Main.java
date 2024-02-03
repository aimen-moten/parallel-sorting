import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    private static int N;

    public static List<Integer> generateList(Integer N){
        Random random = new Random();
        List<Integer> thisList = new ArrayList<Integer>();
        for (int i=0; i < N; i++){
            thisList.add(i, random.nextInt(N*10));
        }
        return thisList;
    }

    public static int splitIndex(int N){
        return N/4;
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2){
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }
    
    public static void main(String[] args) throws InterruptedException {
        Scanner thisInput = new Scanner(System.in);
        System.out.println("Enter an integer N");
        N = thisInput.nextInt();

        List<Integer> myList = generateList(N);
        int index = splitIndex(N);
        List<Integer> list1 = myList.subList(0, index+1);
        List<Integer> list2 = myList.subList(index+1, index+1+index);
        List<Integer> list3 = myList.subList(index+1+index, index+1+index+index);
        List<Integer> list4 = myList.subList(index+1+index+index, N);

        System.out.println("Lists made");

        ThreadSort t1 = new ThreadSort(list1);
        ThreadSort t2 = new ThreadSort(list2);
        ThreadSort t3 = new ThreadSort(list3);
        ThreadSort t4 = new ThreadSort(list4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Threads made");
        
        List<Integer> sortedList1 = new ArrayList<>(t1.getList());
        List<Integer> sortedList2 = new ArrayList<>(t2.getList());
        List<Integer> sortedList3 = new ArrayList<>(t3.getList());
        List<Integer> sortedList4 = new ArrayList<>(t4.getList());
    
        myList.clear();
    
        myList.addAll(sortedList1);
        myList.addAll(sortedList2);
        myList.addAll(sortedList3);
        myList.addAll(sortedList4);
    
        Collections.sort(myList);
    
        System.out.println("Final List: ");
        System.out.println(myList);
    
        thisInput.close();
    }
    

}
