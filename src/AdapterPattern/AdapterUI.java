package AdapterPattern;

public class AdapterUI implements  IAppUI{

    private final FancyUI fancyUI;

    public AdapterUI(FancyUI fancyUI) {
        this.fancyUI = fancyUI;
    }


    @Override
    public void displayMenus() {
        convertData();
        this.fancyUI.displayMenus();
    }

    @Override
    public void displayRecomandations() {
        convertData();
        this.fancyUI.displayMenus();
    }

    private void convertData() {}
}
