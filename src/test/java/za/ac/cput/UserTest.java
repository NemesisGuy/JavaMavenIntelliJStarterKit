//Author Asiphe Funda 215092317

package za.ac.cput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void test() {
        User u = new User("User102", "User_password");
        System.out.println(u);
    }
    @Test
    public void test_fail(){
        User u = User.createUser( "", "User_password");
        System.out.println(u.toString());
        assertNotNull(u);
    }
    @Test
    public void timeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);

    }
}