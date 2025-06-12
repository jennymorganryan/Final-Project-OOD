package Problem1;

public interface CookieCatalogInterface {
    boolean isEmpty();
    int countCookies();
    boolean checkCookie(String cookie);
    void addCookie(Cookie cookie);
    void removeCookie(Cookie cookie) throws CookieNotFoundException;
    Cookie[] findGlutenFreeSugarLiteCookies();
    Cookie[] findNutsAndDairyCookies();
}
