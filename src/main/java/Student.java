import java.util.ArrayList;

public class Student
{
//    id should be a long number used to represent a "unique user" in our application.
//name is a String that holds the name of the student.
//grades is an ArrayList that contains a list of Integer numbers.
    private long id;
    private  String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList<Integer> grades)
    {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public Student(long id, String name)
    {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();

    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Integer> getGrades()
    {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades)
    {
        this.grades = grades;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade)
    {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage()
    {
        int total = 0;
        for(int i = 0; i < this.grades.size(); i++)
        {
            total += this.grades.get(i);
        }
        return (double) total / this.grades.size();
    }




}

