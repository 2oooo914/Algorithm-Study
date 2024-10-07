import java.io.*;
import java.util.*;

public class BOJ_10845 {
    static Queue<Integer> queue = new LinkedList<>(); // 제네릭, 앞의 타입 따라감

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int n = Integer.parseInt(line);

        for (int i = 0; i < n; i++){
            line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " "); // 기본 값이 공백임
            
            String cmd = st.nextToken();
            
            switch (cmd) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                break;

                case "pop":
                    if (!queue.isEmpty()){
                        System.out.println(queue.remove()); // 헤드 삭제
                    }
                    else
                        System.out.println(-1);
                break;   

                case "size":
                    System.out.println(queue.size());
                break;    

                case "empty":
                    if (queue.isEmpty())
                        System.out.println(1);
                    else
                    System.out.println(0);
                break;      
            
                case "front":
                    if (queue.peek() != null)
                        System.out.println(queue.peek());
                    else
                        System.out.println(-1);
                break;  
            
                case "back":
                    if (queue.peek() != null)
                        System.out.println(((LinkedList<Integer>) queue).getLast());
                    else
                        System.out.println(-1);
                break;  
            
                default:
                    break;
            }
        }
    }
}