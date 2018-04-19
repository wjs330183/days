package regular;

public class telephone {
    public static final String REGEX_TELEPHONE = "\\d{3,4}\\-\\d{8}$";//"((0[1-9]\\d)|(0[1-9]{2}\\d}))\\-\\d{8}$";

    public static void main(String[] args) {
        String phone = "0571-86458931";
        boolean regex = phone.matches(REGEX_TELEPHONE);
        System.out.println(regex);
    }
}
