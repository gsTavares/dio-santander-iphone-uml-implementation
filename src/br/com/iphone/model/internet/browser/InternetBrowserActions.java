package br.com.iphone.model.internet.browser;

import br.com.iphone.model.internet.Tab;

public interface InternetBrowserActions {
    
    void addNewTab(Tab tab);
    void showPage(int tabIndex);
    void refreshPage(int tabIndex);

}
