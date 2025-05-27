# Creating Tables for different types of Employees present in an EdTech Company

## Requirements

Model Classes for different types of Employees.

Instructor and Ta are hired on contract basis normally while SoftwareDeveloper and ProgramManager have more defined need and charter (permanent employee)

Tables are created for all concrete classes and characteristics of Superclass will be present in all inherited classes throughout Hierarchy.

Note — Primary Key for ContractualEmployees is alias and for PermanentEmployees, it's email.

## Testing

You can also check which tables with what fields are created in H2 by running Application in IntellIJ and opening  `http://localhost:8080/h2-console` on browser and put values as below
- Saved Settings: `Generic H2(Embedded)`
- Setting Name: `Generic H2(Embedded)`
- Driver Class: `org.h2.Driver`
- JDBC URL: `jdbc:h2:mem:employee_tables_sc`
- User Name: `sa`
- Password: `password`
- click Connect

## Hints

- All set-up ready to use:
- pom.xml or application.properties
- No new file needs to be created.
- No new field needs to be added, No field needs to be removed or modified.
- All relations defined 
- All Testcases run.
