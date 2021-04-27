package test.d18;

public class StarCraftTestDrive {
    public static void main(String[] args) {
        Unit attackup_marine = new Marine();
        attackup_marine = new Stimpack(attackup_marine);
        System.out.println(attackup_marine.getDescription());

        Unit fullup_marine = new Marine();
        fullup_marine = new Armored(fullup_marine);
        fullup_marine = new Stimpack(fullup_marine);
        System.out.println(fullup_marine.getDescription());
    }
}
