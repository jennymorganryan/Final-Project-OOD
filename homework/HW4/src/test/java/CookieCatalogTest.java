import static org.junit.jupiter.api.Assertions.*;
import Problem1.Cookie;
import Problem1.CookieCatalog;
import Problem1.CookieNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CookieCatalogTest {
    protected CookieCatalog catalog;
    protected CookieCatalog emptyCatalog;
    protected Cookie oatmeal;
    protected Cookie macadamia;
    protected Cookie emptyCookie;

    @BeforeEach
    void setUp() {
         macadamia = new Cookie("Macadamia", new String[] {"nuts", "flour", "dairy"}, 1.0, 300.0, 50.6, 30.5, 50.8, 5.1, true, true, false);
         oatmeal = new Cookie("Oatmeal", new String[] {"oats", "flour", "oatmilk"}, 1.0, 400.5, 20.0, 20.8, 100.5, 30.0, false, false, true);
         emptyCookie = new Cookie(null,null,null, null, null, null, null,null, null, null, null);

        Cookie[] cookies = {macadamia, oatmeal};
        Cookie[] emptyCookies = {emptyCookie, emptyCookie};
        catalog = new CookieCatalog(cookies);
        emptyCatalog = new CookieCatalog(emptyCookies);
    }

    @Test
    void isEmpty() {
        assertFalse(catalog.isEmpty());
        assertTrue(emptyCatalog.isEmpty());
    }

    @Test
    void countCookies() {
        assertEquals(2, catalog.countCookies());
    }

    @Test
    void checkCookie() {
        assertTrue(catalog.checkCookie("Macadamia"));
        assertFalse(catalog.checkCookie("Chocolate"));
    }

    @Test
    void addCookie() {
            Cookie snickerdoodle = new Cookie("Cookies & Cream", new String[]{"sugar", "flour"}, 1.0, 250.0, 40.0, 20.0, 10.0, 3.0, false, false, false);
            catalog.addCookie(snickerdoodle);
            assertTrue(catalog.checkCookie("Cookies & Cream"));
            assertEquals(3, catalog.countCookies());
    }

    @Test
    void removeCookie() {
        try {
            catalog.removeCookie(macadamia);
            assertFalse(catalog.checkCookie("Macadamia"));
            assertEquals(1, catalog.countCookies());
        } catch (CookieNotFoundException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void findGlutenFreeSugarLiteCookies() {
        Cookie[] result = catalog.findGlutenFreeSugarLiteCookies();
        assertEquals(1, result.length);
    }

    @Test
    void findNutsAndDairyCookies() {
        Cookie[] result = catalog.findNutsAndDairyCookies();
        assertEquals(1, result.length);
        assertEquals("Macadamia", result[0].getName());
    }
}