class Employee implements Comparable<Employee>{
    public String empName;
    public int empID;
    
    public Employee(String empName,int empID){
        this.empName = empName;
        this.empID = empID;
    }
    
    
    public int compareTo(Employee e){
        return Integer.compare(e.empID,empID);
    }
    
    
    
}