import java.util.Scanner;
class StudentGradeCalculator{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator ");
        System.out.println("Marks are out of 100");
        int totalMarks=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter the marks obtained in 5 subjects ");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
        System.out.println("Total marks obtained: " + totalMarks);
        double avgPercentage=totalMarks/5.0;
        if(avgPercentage>=90){
            System.out.println("Grade A");     
        }else if(avgPercentage>=80&&avgPercentage<=89){
            System.out.println("Grade B");
        }else if(avgPercentage>=70&&avgPercentage<=79){
            System.out.println("Grade C");
        }else if(avgPercentage>=60&&avgPercentage<=69){
            System.out.println("Grade D");
}else{
    System.out.println("Grade F");
}
System.out.println("Your AveragePercentage "+avgPercentage+"%");
sc.close();
    }
}

