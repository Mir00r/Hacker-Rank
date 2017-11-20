/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_code;

import java.util.*;

/**
 *
 * @author Created by Mir00r
 */
class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student student) {
        if (getCgpa() > student.getCgpa()) {
            return -1;
        }
        if (getCgpa() < student.getCgpa()) {
            return 1;
        }

        int n = getName().compareTo(student.getName());
        if (n != 0) {
            return n;
        }

        if (getId() > student.getId()) {
            return 1;
        }
        if (getId() < student.getId()) {
            return -1;
        }
        return 0;
    }
}

class Priorities {

    public Priorities() {
    }
   
    public List< Student> getStudents(List< String> events) {
        PriorityQueue< Student> studentQueue = new PriorityQueue<Student>();
        List< Student> students = new ArrayList< Student>();
        for (String e : events) {
            Scanner in = new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();

                Student student = new Student(token, name, cgpa);
                studentQueue.add(student);
            } else if (event.equals("SERVED")) {
                Student first = studentQueue.poll();
            }
            in.close();
        }
        Student first = studentQueue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = studentQueue.poll();

            }
            return students;
        }
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}


/*
public class JavaPriorityQueue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, id;
        String name;
        double cgpa;
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String query = in.next();

            if (query.equals("ENTER")) {
                name = in.next();
                cgpa = in.nextDouble();
                id = in.nextInt();

                queue.offer(new Student(id, name, cgpa));
            }
            if (query.equals("SERVED")) {
                queue.poll();
            }
        }

        if (queue.size() == 0) {
            System.out.println("EMPTY");
        } else {
            for (;;) {
                Student stu = queue.poll();
                if (stu == null) {
                    break;
                }
                System.out.println(stu.getName());
            }
        }
    }
}
*/