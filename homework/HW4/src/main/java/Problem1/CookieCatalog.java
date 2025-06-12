package Problem1;

import java.util.Arrays;
import java.util.Objects;

public class CookieCatalog implements CookieCatalogInterface{

    protected Cookie[] cookies;

    public CookieCatalog(Cookie[] cookies) {
        this.cookies = cookies;
    }

    public Cookie[] getCookies() {
        return cookies;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < 2; i++) {
            if (cookies[i].getName() != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int countCookies() {
        int count = 0;
       for (int i = 0; i < this.cookies.length; i++) {
           if (this.cookies[i] != null) {
               count++;
           }
       }
       return count;
    }


    @Override
    public boolean checkCookie(String cookie) {
        for (int i = 0; i < this.cookies.length; i++) {
            if (Objects.equals(this.cookies[i].getName(), cookie)) {
                return true;
            }
            }
        return false;
        }

    @Override
    public void addCookie(Cookie cookie) {
        for (int i = 0; i < this.cookies.length; i++) {
            if (this.cookies[i] != null && Objects.equals(this.cookies[i].getName(), cookie.getName())) {
                throw new RuntimeException("Duplicate cookies not allowed");
            }
        }

        Cookie[] newCookies = new Cookie[this.cookies.length + 1];
        for (int i = 0; i < this.cookies.length; i++) {
            newCookies[i] = this.cookies[i];
        }
        newCookies[this.cookies.length] = cookie;
        this.cookies = newCookies;
    }


    @Override
    public void removeCookie(Cookie cookie) throws CookieNotFoundException {
        boolean found = false;
        Cookie[] newCookies = new Cookie[this.cookies.length - 1];
        int j = 0;
        for (int i = 0; i < this.cookies.length; i++) {
            if (this.cookies[i] != null && this.cookies[i].equals(cookie)) {
                found = true;
                continue;
            }
            if (j < newCookies.length) {
                newCookies[j++] = this.cookies[i];
            }
        }
        if (!found) {
            throw new CookieNotFoundException("Cookie not found");
        }
        this.cookies = newCookies;
    }



    @Override
    public Cookie[] findGlutenFreeSugarLiteCookies() {
        int count = 0;
        for (int i = 0; i < this.cookies.length; i++) {
            if (this.cookies[i].getGlutenFree() == true && this.cookies[i].getSugarPerServing() < 30) {
                count++;
            }
        }
        Cookie[] newCookies = new Cookie[count];
        int j = 0;
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i] != null && cookies[i].getGlutenFree() && cookies[i].getSugarPerServing() < 30) {
                newCookies[j++] = cookies[i];
            }
        }

        return newCookies;
    }

    @Override
    public Cookie[] findNutsAndDairyCookies() {
        int count = 0;
        for (int i = 0; i < this.cookies.length; i++) {
            if (this.cookies[i].getContainsNuts() == true && this.cookies[i].getContainsDairy() == true) {
                count++;
            }
        }
        Cookie[] newCookies = new Cookie[count];
        int j = 0;
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i] != null && cookies[i].getContainsNuts() && cookies[i].getContainsDairy()) {
                newCookies[j++] = cookies[i];
            }
        }
        return newCookies;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CookieCatalog that = (CookieCatalog) o;
        return Objects.deepEquals(cookies, that.cookies);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cookies);
    }

    @Override
    public String toString() {
        return "CookieCatalog{" +
                "cookies=" + Arrays.toString(cookies) +
                '}';
    }
}
