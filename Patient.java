public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private String bloodGroup;
    private String phoneNumber;
    private double height;
    private double weight;
    public Patient(int id,String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber){
        if(birthYear <= 0){
            birthYear *= -1;
            this.birthYear = birthYear;
            if(birthYear == 0){
                System.out.print("Birthyear is invalid. Please resign the birthyear again.");
                this.birthYear = 1996;
            }
        }else{
            this.birthYear = birthYear;
        }
        if(height <= 0){
            height *= -1;
            this.height = height;
            if(height == 0){
                System.out.print("Height is invalid. Please resign the height again.");
                this.height = 175.0;
            }
        }else{
            this.height = height;
        }
        if(weight <= 0){
            weight *= -1;
            this.weight = weight;
            if(weight == 0){
                System.out.print("Weight is invalid. Please resign the weight again.");
                this.weight = 70.0;
            }
        }else{
            this.weight = weight;
        }
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }
    public int getId(){
        return this.id;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public String getBloodGroup(){
        return this.bloodGroup;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public double getBMI(double height, double weight){
        if (height <= 0 && weight <= 0){
            return 0.0;
        }else{
            return weight/(height*height/10000);
        }
    }
    public int getAge(int currentYear){
        if (currentYear < 0) {
            currentYear *= -1;
        }if (currentYear == 0){
            System.out.print("Currentyear is invalid");
        }
        return currentYear - this.birthYear;
    }
    public void displayDetails(int currentYear){
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BloodGroup : " + bloodGroup);
        System.out.println("Patient PhoneNumber : " + phoneNumber);
        System.out.println("Patient BMI : " + getBMI(height,weight));
    }
}
