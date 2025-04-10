class Employee{
    String empName;
    int empID;
    
    public String setempName(String empName,Lambda l){
        this.empName = empName;
        String res = l.setDetails(empName);
        return res;
    }
}