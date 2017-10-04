package com.enva.model;

/**
 * Help link object
 */
public class HelpLinkModel {
    private String title;
    private String link;
    private String description;

    public String getTitle() {
        return title;
    }

    public HelpLinkModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLink() {
        return link;
    }

    public HelpLinkModel setLink(String link) {
        this.link = link;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public HelpLinkModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
