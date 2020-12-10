package project4110.Model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project4110.model.Role;

//Tests adding a new role
public class RoleTest {

    Role role = new Role("User");
    Role role1 = new Role("Admin");

    @Test
    //This test is to see if the role will store properly
    public void getRoleTest() {
        String expected = "User";
        String actual = role.getName();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("Admin", role1.getName());
    }
}
