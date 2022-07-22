package Exercise1;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("Matei",8);
        studentMap.put("Ana", 9);
        studentMap.put("George", 5);
        studentMap.put("Sorin", 7);
        studentMap.put("Marius",6);
        studentMap.put("Mirela",10);
        studentMap.put("Alexandra",10);
        System.out.println(studentMap);
        System.out.print("Students with the highest grades are: ");
        System.out.println(findTheStudentWithTheHighestGrade(studentMap));

    }


    public static List<String> findTheStudentWithTheHighestGrade(Map<String, Integer> map){
        Integer maxGrade= Collections.max(map.values());
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<String> student  = new LinkedList<>();
        for(Map.Entry entry : entries){
            if(entry.getValue() == maxGrade){
                student.add((String) entry.getKey());

            }
        }
        return student;
    }
}
