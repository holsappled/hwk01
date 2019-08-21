public class EmployeeDatabase implements EmployeeCRUD{

    /**
     * Adds the employee to the system
     * @param employee
     */
    public void create(final Employee employee){
        System.out.println("hello");
    }

    /**
     * Returns the employee if found
     * @param id the id of the employee to be returned
     * @return the employee object (null if not found)
     */
    public Employee read(int id){
        return dingo; // this should be a employee object
    }


    public static void main(String args[]) {
        System.out.println("hello world");
    }


//########################################################
// These will be updated in next class
    /**
     * Updates the employee information
     * @param id the id of the employee to be updated
     * @param employee the employee object
     */
    public void update(int id, final Employee employee){

    }

    /**
     * Removes the employee specified by id
     * @param id the id of the employee to be deleted
     */
    public void delete(int id){

    }


}
