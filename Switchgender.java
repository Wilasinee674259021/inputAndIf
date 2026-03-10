public class Switchgender {
    public static void main(String[] args) {
        char gender = 'x';
        String genderString;
        switch (gender) {
            case 'M':
                genderString = "Male";
                break;
            case 'F':
                genderString = "Female";
                break;
            default:
                genderString = "LGBTQ+";
                break;
        }
        System.out.print(genderString);
    }
}