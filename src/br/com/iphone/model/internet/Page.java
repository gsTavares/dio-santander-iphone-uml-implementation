package br.com.iphone.model.internet;

public class Page {

    private String page;
    private String url;

    public Page() {
    }

    public Page(String page, String url) {
        this.page = page;
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
