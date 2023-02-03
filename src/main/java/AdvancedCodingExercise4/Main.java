package AdvancedCodingExercise4;

/**
 * Create a class imitating a weapon magazine.
 * The class should be able to define the size of the magazine using the constructor.
 * Implement the methods:
 * loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than the capacity of the magazine
 * isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 * shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and prepares the next one,
 * loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console
 */
public class Main {
    public static void main(String[] args) {

        WeaponMagazine weaponMagazine = new WeaponMagazine(10);

        weaponMagazine.loadBullet("1");
        weaponMagazine.loadBullet("2");
        weaponMagazine.loadBullet("3");
        weaponMagazine.loadBullet("4");
        weaponMagazine.loadBullet("5");
        weaponMagazine.loadBullet("6");
        weaponMagazine.loadBullet("7");
        weaponMagazine.loadBullet("8");
        weaponMagazine.loadBullet("9");
        weaponMagazine.loadBullet("10");
        weaponMagazine.loadBullet("11");

        weaponMagazine.isLoaded();

        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
    }
}
