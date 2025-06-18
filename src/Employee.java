
class Employee {
    private int emp_id;
    private String emp_name;

    public void setdata(int a, String b){
        emp_id = a;
        emp_name = b;
    }

    public void showdata(){
        System.out.println("Employee id is: "+emp_id);
        System.out.println("Employee name is: "+emp_name);
    }
}