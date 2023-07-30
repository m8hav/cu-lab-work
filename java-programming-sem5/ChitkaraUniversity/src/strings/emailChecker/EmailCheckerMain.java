package strings.emailChecker;

public class EmailCheckerMain {
    public static void main(String[] args) {
        EmailChecker emailCheckerObj = new EmailChecker();
        System.out.println(emailCheckerObj.checkEmail("madhavgoyal2k2@gmail.com"));
        System.out.println(emailCheckerObj.checkEmail("madhav1262.be20@chitkarauniversity.edu.in"));
        System.out.println(emailCheckerObj.checkEmail("madhavgoyal2k2gmail.com"));
        System.out.println(emailCheckerObj.checkEmail("madhavgoyal2k2@gmailcom"));
        System.out.println(emailCheckerObj.checkEmail("madhavgoyal.2k2@gmailcom"));
        System.out.println(emailCheckerObj.checkEmail("madhav-goyal.2k2@gmailcom.com"));
    }
}
