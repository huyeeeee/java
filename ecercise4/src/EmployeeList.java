public class EmployeeList {
    OrderedList<Employee> data;
    public EmployeeList(){
        data = new OrderedList<>();
    }

    /**
     * add an employee to the list
     * @param e
     */
    public void addEmployee(Employee e){
        data.add(e);
    }

    /**
     * delete an employee by its id
     * @param ID
     */
    public void deleteEmployee(int ID){
        for (int i = 0;i < data.size();i++){
            if (data.get(i).getEmployeeID() == ID){
                data.remove(i);
            }
        }

    }

    /**
     * search an employee by its id
     * @param ID
     * @return
     */
    public Employee searchID(int ID){
        for (int i = 0;i < data.size();i++){
            if (data.get(i).getEmployeeID() == ID){
                return data.get(i);
            }
        }
        return null;
    }

    /**
     * get all data from the list
     */
    public void getData() {
        Employee e = data.first();
        while (e != null){
            System.out.println(e.toString());
            e = data.next();
        }
    }
}
