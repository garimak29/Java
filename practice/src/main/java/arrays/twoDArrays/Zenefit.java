package arrays.twoDArrays;


import java.util.*;

class Student {
    String name;
    Integer marks;
    Integer count;


    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
        this.count = 1;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", marks=" + marks + ", count=" + count + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(marks, student.marks) && Objects.equals(count, student.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks, count);
    }


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}

public class Zenefit {


  /*  public static void main(String[] args) {
        System.out.println("hello world");
        String[][] scores = {{"a", "20"}, {"a", "1"}, {"b", "1"}, {"b", "329"}, {"c", "1"}, {"d", "1"}, {"a", "1"}, {"a", "89"}};
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + " --> " + scores[i][1]);
            Student studentFix = findStudentByName(scores[i][0], students);
            if (studentFix != null) {
                studentFix.marks += Integer.parseInt(scores[i][1]);
                studentFix.count++;


            } else students.add(new Student(scores[i][0], Integer.parseInt(scores[i][1])));
        }
        int maxAvg = 0;
        for (int i = 0; i < students.size(); i++) {
            int avg = students.get(i).marks / students.get(i).count;
            if (avg > maxAvg) {
                maxAvg = avg;
            }
        }
        System.out.println(students);
        System.out.println(maxAvg);
    }
    private static Student findStudentByName(String name, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (name.equalsIgnoreCase(students.get(i).name)) {
                return students.get(i);
            }
        }
        return null;
    }

*/

    public static void main(String[] args) {
        System.out.println("hello world");
        String[][] scores = {{"a", "20"}, {"a", "1"}, {"b", "1"}, {"b", "329"}, {"c", "1"}, {"d", "1"}, {"a", "1"}, {"a", "89"}};
        HashMap<String , ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + " --> " + scores[i][1]);
             if (map.containsKey(scores[i][0]) ) {
                 int newMarks = map.get(scores[i][0]).get(0)+Integer.parseInt(scores[i][1]);
                 int newCount = map.get(scores[i][0]).get(1)+1;
                 map.put(scores[i][0],new ArrayList<>(Arrays.asList(newMarks,newCount)));
              //   map.put(scores[i][0],map.get(scores[i][0]).add(Arrays.asList(newMarks,2)) ));

            } else
                map.put(scores[i][0],new ArrayList<>(Arrays.asList(Integer.parseInt(scores[i][1]),1)));
        }
        int maxAvg = 0;
        for(Map.Entry<String , ArrayList<Integer>> entry : map.entrySet()){
            int avg = entry.getValue().get(0)/entry.getValue().get(1);
            if(avg > maxAvg){
                maxAvg = avg;
            }
        }
       System.out.println(maxAvg);
    }


}
