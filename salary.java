class salary{
    public static void main(String[] args) {
        int salary=50000;
        float ta,da,pf,gsalary;
        ta=(salary*5/100);
        da=(salary*7/100);
        pf=(salary*2/100);
        gsalary=salary+ta+da-pf;
        System.out.println("Gross Salary: "+gsalary);
    }
}