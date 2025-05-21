package Pertemuan_9;
public class charMethod {
    public static void main(String[] args) {
        String placeBirth[] = {"JAKARTA", "SURABAYA", "MALANG", "SUKABUMI", "MAGELANG"};
        
        int totalCity = 0;
        for (int i = 0; i < placeBirth.length; i++) {
            char prefix = placeBirth[0].charAt(0);
            if (prefix == 'M') {
                totalCity++;
            }
        }

        System.out.println(totalCity);
    }
}
