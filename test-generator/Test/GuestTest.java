import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {
    Guest guest = new Guest("Ahmet", "Duzduran","blabla@gmail.com","12345");


    @Test
    void getName() {

        assertEquals(guest.getName(),"Ahmet");
    }

    @Test
    void setName() {
        guest.setName("ASD");
        assertEquals(guest.getName(),"ASD");

    }

    @Test
    void getSurname() {
        assertEquals(guest.getSurname(),"Duzduran");

    }

    @Test
    void setSurname() {
        guest.setSurname("ASD");
        assertEquals(guest.getSurname(),"ASD");
    }

    @Test
    void getEmail() {assertEquals(guest.getEmail(),"blabla@gmail.com");
    }

}