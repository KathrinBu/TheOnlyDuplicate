import java.util.*;

public class Main {
    public static void main(String[] args) {
        findDublicate(create());
    }
    public static List<Integer> create(){
        List<Integer> numbers=generate(10,0,10);
        System.out.println(numbers);
        return numbers;
    }
    public static List<Integer> generate(int count, int min, int max ){
        List<Integer> numbers=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i <count ; i++) {
            int randNum= random.nextInt(max-min+1)+min;
            numbers.add(randNum);
        }
        return numbers;
    }
    public static int findDublicate(List<Integer> numbers){
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:numbers) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        for (int k:map.keySet()) {
            if (map.get(k)>1){ //см строку 25
                System.out.println(k); //если продублированный найден
            }
        }
        return 0; //если продублированный не найден
    }
}
