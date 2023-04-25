package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcommerceMainPageElementMap extends CommonPage {

    @FindBy(xpath = "/html/body/section[@id='advertisement']/div[@class='container']/input[@id='search_product']")
    protected WebElement txtPesquisarProduto;

    @FindBy(xpath = "/html/body/section[@id='advertisement']/div[@class='container']/button[@id='submit_search']")
    protected WebElement btnPesquisarProduto;

    @FindBy(xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[@class='col-sm-4'][1]/div[@class='product-image-wrapper']/div[@class='single-products']/div[@class='product-overlay']")
    protected WebElement lblQtdResultadosEncontrados;

}
