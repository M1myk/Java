package student;

public record StudentRecord(String name, int id, double gpa) {
   public StudentRecord {
       if(gpa < 0 || gpa > 4)
       {
           throw new IllegalArgumentException("gpa must be between 0 and 4");
       }
   }

    public boolean isHonorStudent()
    {
        if(gpa >= 3.5)
        {
            return true;
        }
        return false;
    }

   public void printDetails()
   {
       System.out.println("Name: " + name + ", ID: " + id + ", GPA: " + gpa);
   }

}
