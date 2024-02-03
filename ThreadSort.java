import java.util.Collections;
import java.util.List;

public class ThreadSort extends Thread{
    private List<Integer> list;

    public ThreadSort(List<Integer> l){
        list = l;
    };

    @Override
    public void run(){
        Collections.sort(list);

    }

    public List<Integer> getList(){
        return list;
    }

}