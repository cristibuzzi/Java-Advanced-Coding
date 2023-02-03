package ex4;

import java.util.LinkedList;

/**
 * Create a class imitating a weapon magazine.
 * The class should be able to define the size of the magazine using the constructor.
 * Implement the methods:
 * loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than the capacity of the magazine
 * isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 * shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and prepares the next one,
 * loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console
 */
public class WeaponMagazine {
    private int capacity;
    private final LinkedList<String> magazine = new LinkedList<>();

    public WeaponMagazine(int capacity) {
        this.capacity = capacity;
    }

    public void loadBullet(String bullet) {
        int size = magazine.size();
        if (size < capacity) {
            magazine.add(bullet);
        } else {
            System.out.println("Max capacity reached");
        }
    }

    public void isLoaded() {

        //if(magazine.size() == 0) { same as below
        if (magazine.isEmpty()) {
            System.out.println("The weapon is empty");
        } else {
            System.out.println("The weapon is loaded");
        }
    }

    public void shot() {
        if(!magazine.isEmpty()){
            System.out.println(magazine.removeFirst());
        } else {
            System.out.println("Empty magazine");
        }
    }
}
