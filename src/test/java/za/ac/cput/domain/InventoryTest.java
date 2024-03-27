/* InventoryRepository.java
InventoryRepository model class
Author: Thapelo Xaba (222400471)
Date: 22 March 2024
*/

package za.ac.cput.;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Inventory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTest {

    @Test
    void testInventoryBuilder() {
        Inventory inventory = new Inventory.Builder()
                .setInventoryId("123")
                .setName("Test Inventory")
                .setLocation("Test Location")
                .setStockItemId("456")
                .build();

        assertEquals("123", inventory.getInventoryId());
        assertEquals("Test Inventory", inventory.getName());
        assertEquals("Test Location", inventory.getLocation());
        assertEquals("456", inventory.getStockItemId());
    }

    @Test
    void testInventoryCopy() {
        Inventory originalInventory = new Inventory.Builder()
                .setInventoryId("123")
                .setName("Original Inventory")
                .setLocation("Original Location")
                .setStockItemId("456")
                .build();

        Inventory copiedInventory = new Inventory.Builder().copy(originalInventory).build();

        assertEquals(originalInventory.getInventoryId(), copiedInventory.getInventoryId());
        assertEquals(originalInventory.getName(), copiedInventory.getName());
        assertEquals(originalInventory.getLocation(), copiedInventory.getLocation());
        assertEquals(originalInventory.getStockItemId(), copiedInventory.getStockItemId());
    }
}
