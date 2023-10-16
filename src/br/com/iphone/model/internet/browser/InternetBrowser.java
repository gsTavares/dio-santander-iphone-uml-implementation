package br.com.iphone.model.internet.browser;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import br.com.iphone.model.internet.Tab;

public class InternetBrowser implements InternetBrowserActions {

    private String searchInput;
    private List<Tab> tabs;

    public InternetBrowser() {
    }

    public String getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(String searchInput) {
        this.searchInput = searchInput;
    }

    public List<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    private Predicate<Tab> findTabByIndex(int index) {
        return t -> t.getIndex() == index;
    }

    @Override
    public void addNewTab(Tab tab) {
        Optional.ofNullable(this.tabs).ifPresentOrElse(
                tabs -> tabs.add(tab),
                () -> {
                    this.tabs = Arrays.asList(tab);
                });
    }

    @Override
    public void refreshPage(int tabIndex) {
        Optional.ofNullable(this.tabs).ifPresent(tabs -> {
            tabs.stream().filter(
                    this.findTabByIndex(tabIndex)).findFirst().ifPresent(t -> t.refreshPage());
        });
    }

    @Override
    public void showPage(int tabIndex) {
        Optional.ofNullable(this.tabs).ifPresent(tabs -> {
            tabs.stream().filter(
                    this.findTabByIndex(tabIndex)).findFirst().ifPresent(t -> t.showPage());
        });
    }

}
