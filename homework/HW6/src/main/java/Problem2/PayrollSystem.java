package Problem2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * The type Payroll system which serves as a way to track a companies employees
 */
public class PayrollSystem {
    protected Employee[] employees;
    protected Employee newEmployee;

    /**
     * Instantiates a new Payroll system.
     *
     * @param employees the employees as an array of a companies employees
     */

    public PayrollSystem(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Add new employee.
     *
     * @param name                 the name as a Name card object
     * @param employeesContactInfo the employees contact info object
     * @param employeesDOB         the employees dob as a local date
     * @param employeeID           the employee id as a String
     * @param yearJoinedCompany    the year joined company as an integer year
     * @param currentRole          the current role as a string
     * @param yearLastPromoted     the year last promoted as an integer
     * @param annualEarnings       the annual earnings as a double
     */


    public void addNewEmployee(Name name, ContactInfo employeesContactInfo, LocalDate employeesDOB,
                                  String employeeID, Integer yearJoinedCompany, String currentRole,
                                  Integer yearLastPromoted, Double annualEarnings) {
        newEmployee = new Employee(name, employeesContactInfo, employeesDOB, employeeID,
                yearJoinedCompany, currentRole, yearLastPromoted, annualEarnings);

        Employee[] newEmployees = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
        newEmployees[employees.length - 1] = newEmployee;

        employees = newEmployees;
    }

    /**
     * Gets new employee.
     *
     * @return the new employee
     */
    public Employee getNewEmployee() {
        return newEmployee;
    }

    /**
     * Remove employee.
     *
     * @param employee the employee
     * @throws EmployeeNotFoundException the employee not found exception
     */
    public void removeEmployee(Employee employee) throws EmployeeNotFoundException {
        Employee[] newEmployees = new Employee[employees.length - 1];
        int j = 0;
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            if (!employees[i].equals(employee)) {
                newEmployees[j] = employees[i];
                j++;
            }
            found = true;
        }
        if (!found) {
            throw new EmployeeNotFoundException("Employee not found in the system");
        }
        employees = newEmployees;
    }

    /**
     * Employee exists boolean.
     *
     * @param employee the employee
     * @return the boolean
     */
    public boolean employeeExists(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(employee)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty() {
        return employees.length == 0;
    }

    /**
     * Employee head count int.
     *
     * @return the int
     */
    public int employeeHeadCount() {
        return (int) (employees.length - 1);
    }

    /**
     * Find employees with high earnings employee [ ].
     *
     * @return the employee [ ]
     */
    public Employee[] findEmployeesWithHighEarnings() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAnnualEarnings() > 150000) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAnnualEarnings() > 150000) {
                result[j] = employees[i];
                j++;
            }
        }
        return result;
    }

    /**
     * Find employees by role employee [ ].
     *
     * @param currentRole the current role
     * @return the employee [ ]
     */
    public Employee[] findEmployeesByRole(String currentRole) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCurrentRole().equals(currentRole)) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCurrentRole().equals(currentRole)) {
                result[j] = employees[i];
                j++;
            }
        }
        return result;
    }

    /**
     * Find employees by year joined employee [ ].
     *
     * @param year the year
     * @return the employee [ ]
     */
    public Employee[] findEmployeesByYearJoined(Integer year) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getYearJoinedCompany().equals(year)) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getYearJoinedCompany().equals(year)) {
                result[j] = employees[i];
                j++;
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PayrollSystem that)) return false;
        return Objects.deepEquals(employees, that.employees) && Objects.equals(newEmployee, that.newEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(employees), newEmployee);
    }

    @Override
    public String toString() {
        return "PayrollSystem{" +
                "employees=" + Arrays.toString(employees) +
                ", newEmployee=" + newEmployee +
                '}';
    }


}
