package pages;

import java.util.List;

public class PaginaServicios extends BasePage {

    private String serviciosLink = "//span[normalize-space()='Services']";
    private String serviciosList = "//section[@id='exceptional']";

    public PaginaServicios() {
        super(driver);
    }

    public void clickServiciosLink() {
        clickElement(serviciosLink);
    }

    public List<String> returnServiciosList() {
        return getListValues(serviciosList);
    }
}
