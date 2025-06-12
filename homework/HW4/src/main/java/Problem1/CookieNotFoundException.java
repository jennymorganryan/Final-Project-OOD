package Problem1;

public class CookieNotFoundException extends Exception {
    public CookieNotFoundException(String cookieNotFound) {
        super(cookieNotFound);
    }
}
