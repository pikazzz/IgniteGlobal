package pages;

public class PaginaAboutUs extends BasePage {

    private String contactTittle = "//h3[@class='text-[70px] lg:text-[45px] md:text-center text-primaryColor font-clashGrotesk font-semibold mb-10 lg:mb-0 aos-init aos-animate']";
    private String valuesTittle = "//h3[@class='flex justify-center items-center text-[70px] h-[55px] md:text-[45px] md:text-center text-primaryColor font-clashGrotesk font-semibold mb-14 aos-init aos-animate']";

    public PaginaAboutUs() {
        super(driver);
    }
        
    public String contactText() {
        return getText(contactTittle);
    }
        
        
}

