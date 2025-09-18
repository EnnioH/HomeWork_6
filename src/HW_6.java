public class HW_6 {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Dark Blade");
        Boss boss = new Boss(500, 70, bossWeapon);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton(150, 25,
                new Weapon(WeaponType.BOW, "Bone Bow"), 20);
        Skeleton skeleton2 = new Skeleton(180, 30,
                new Weapon(WeaponType.BOW, "Shadow Bow"), 25);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}
