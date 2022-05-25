package web;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.Map;
//import java.util.TreeMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] args) {
        
//        ArrayList<String> a = new ArrayList<>();
//        a.add("Jan");
//        a.add("Cherprang");
//        a.add("Pupe");
//        System.out.println(a);
//        
//        Set<String> s = new TreeSet<>();
//        s.add("Elon");
//        s.add("Thaksin");
//        s.add("Prayuth");
//        s.add("Elon");
//        System.out.println(s);
//        
//        for (String i : s) {
//            System.out.println(i);
//        }
//        
//        Map<String, Integer> m = new TreeMap<>();
//        m.put("Phatumwan", 10000);
//        m.put("Japan", 20000);
//        m.put("Swizzerland", 30000);
//        
//        Integer i = m.get("Japan");
//        System.out.println(i);
        
//        int[] a = {1, 3, 6, 1, 6, 6, 9, 9};
//        Map<Integer, Integer> first = new TreeMap<>();
//        Map<Integer, Integer> last = new TreeMap<>();
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//            Integer f = first.get(i);
//            if (f == null) {
//                first.put(i, sum);
//            } else {
//                last.put(i, sum);
//            }
//        }
//        Integer result = null;
//        for (Integer j : last.keySet()) {
//            Integer start = first.get(j);
//            Integer end = last.get(j);
//            int total = end - start + j;
//            if (result == null) {
//                result = total;
//            }
//            if (total > result) {
//                result = total;
//            }
//        }
//        System.out.println("Maximum is " + result);

          ApplicationContext context;
          context = SpringApplication.run(Prepare.class);
    }
}

@SpringBootApplication
class Prepare {
    @Bean(name="datasource")
    DriverManagerDataSource m1() {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setUrl("jdbc:mysql://localhost/sample");
        source.setUsername("admin");
        source.setPassword("1234");
        return source;
    }
}

@RestController
class Check{
    @RequestMapping("/")
    String check() {
        return "Hello";
    }
}