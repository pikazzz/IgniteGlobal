package pages;

public class PaginaPrincipal extends BasePage {
    private String sectionLink = "//img[contains(@alt,'menu icon')]";
    private String elegirUnaSeccion = "//ul[contains(@class,'flex flex-col justify-between items-start h-[60%] pl-16 mb-10')]";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToIgniteGlobal() {
        navigateTo("https://www.igniteglobal.io");
    }

    public void clickOnSectionNavigationBar(String section) {
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnElegirUnaSeccion() {
        clickElement(elegirUnaSeccion);
    }
}
