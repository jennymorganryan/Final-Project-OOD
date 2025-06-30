import Problem2.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PayrollSystemTest {

        PayrollSystem payroll;
        Employee highEarner;
        Employee dev;
        Employee qa;

        @BeforeEach
        void setUp() {
            highEarner = new Employee(
                    new Name("Jenny", "Morgan", "Ryan"),
                    new ContactInfo("123 Main St", "Austin", "TX", "73301", "555-1234", "jenny@email.com"),
                    LocalDate.of(1998, 7, 12),
                    "E001",
                    2021,
                    "Manager",
                    2023,
                    180000.00);

            dev = new Employee(
                    new Name("Alex", "Lee", "Smith"),
                    new ContactInfo("456 Pine St", "Seattle", "WA", "98101", "555-5678", "alex@email.com"),
                    LocalDate.of(1995, 3, 2),
                    "E002",
                    2022,
                    "Developer",
                    2022,
                    110000.00);

            qa = new Employee(
                    new Name("Riley", "D", "Stone"),
                    new ContactInfo("789 Oak St", "Boston", "MA", "02110", "555-9012", "riley@email.com"),
                    LocalDate.of(1996, 8, 14),
                    "E003",
                    2021,
                    "QA",
                    2023,
                    95000.00);

            Employee[] baseEmployees = {highEarner, dev, qa};
            payroll = new PayrollSystem(baseEmployees);
        }

        @Test
        void testAddNewEmployee() {
            payroll.addNewEmployee(
                    new Name("Maya", "L.", "Green"),
                    new ContactInfo("500 Elm St", "Chicago", "IL", "60601", "555-1111", "maya@email.com"),
                    LocalDate.of(2000, 5, 20),
                    "E004",
                    2024,
                    "Intern",
                    2024,
                    60000.00);

            assertEquals("Maya", payroll.getNewEmployee().getEmployee().getFirstName());
            assertTrue(payroll.employeeExists(payroll.getNewEmployee()));
        }

        @Test
        void testRemoveEmployeeSuccess() throws EmployeeNotFoundException {
            payroll.removeEmployee(dev);
            assertFalse(payroll.employeeExists(dev));
        }

        @Test
        void testEmployeeExists() {
            assertTrue(payroll.employeeExists(qa));
            assertFalse(payroll.employeeExists(
                    new Employee(new Name("Ghost", "X", "Person"),
                            new ContactInfo("None", "Nowhere", "ZZ", "00000", "000", "ghost@void.com"),
                            LocalDate.of(2001, 1, 1),
                            "X999",
                            2024,
                            "N/A",
                            2024,
                            0.0)));
        }

        @Test
        void testFindEmployeesWithHighEarnings() {
            Employee[] results = payroll.findEmployeesWithHighEarnings();
            assertEquals(1, results.length);
            assertEquals(highEarner, results[0]);
        }

        @Test
        void testFindEmployeesByRole() {
            Employee[] results = payroll.findEmployeesByRole("Developer");
            assertEquals(1, results.length);
            assertEquals(dev, results[0]);
        }

        @Test
        void testFindEmployeesByYearJoined() {
            Employee[] results = payroll.findEmployeesByYearJoined(2021);
            assertEquals(2, results.length);
            assertTrue(results[0].equals(highEarner) || results[1].equals(highEarner));
            assertTrue(results[0].equals(qa) || results[1].equals(qa));
        }

        @Test
        void testIsEmptyAndHeadCount() {
            assertFalse(payroll.isEmpty());
            assertEquals(2, payroll.employeeHeadCount());
        }
    }
