package OOP.spec_classes;

import java.util.UUID;

public class UUIDClass {
    public static void main(String[] args) {
        UUID.randomUUID();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(UUID.randomUUID());
        }
    }
}
