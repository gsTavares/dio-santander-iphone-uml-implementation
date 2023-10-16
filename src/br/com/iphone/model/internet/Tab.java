package br.com.iphone.model.internet;

public class Tab {

    private int index;
    private Page page;

    public Tab() {
    }

    public Tab(int index, Page page) {
        this.index = index;
        this.page = page;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void showPage() {
        System.out.println("Showing page " + this.page.getUrl());
    }

    public void refreshPage() {
        System.out.println("Refrehsing page " + this.page.getUrl());
    }

}
