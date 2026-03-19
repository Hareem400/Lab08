package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City toronto = new City("Toronto", "ON");

        list.addCity(calgary);
        list.addCity(toronto);

        // Deleting a city that exists should return true and remove it
        assertTrue(list.deleteCity(calgary));
        assertFalse(list.hasCity(calgary));

        // Deleting a city that doesn't exist should return false
        City vancouver = new City("Vancouver", "BC");
        assertFalse(list.deleteCity(vancouver));
    }

}
