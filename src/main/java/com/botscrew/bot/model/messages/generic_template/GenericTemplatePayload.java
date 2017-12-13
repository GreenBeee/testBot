package com.botscrew.bot.model.messages.generic_template;

public class GenericTemplatePayload {

    private String template_type;
    private Boolean sharable;
    private String image_aspect_ratio;
    private GenericTemplateElement[] elements;

    public String getTemplate_type() {
        return template_type;
    }

    public void setTemplate_type(String template_type) {
        this.template_type = template_type;
    }

    public Boolean getSharable() {
        return sharable;
    }

    public void setSharable(Boolean sharable) {
        this.sharable = sharable;
    }

    public String getImage_aspect_ratio() {
        return image_aspect_ratio;
    }

    public void setImage_aspect_ratio(String image_aspect_ratio) {
        this.image_aspect_ratio = image_aspect_ratio;
    }

    public GenericTemplateElement[] getElements() {
        return elements;
    }

    public void setElements(GenericTemplateElement[] elements) {
        this.elements = elements;
    }

    public GenericTemplatePayload() {

    }

    public GenericTemplatePayload(String template_type, Boolean sharable, String image_aspect_ratio, GenericTemplateElement[] elements) {

        this.template_type = template_type;
        this.sharable = sharable;
        this.image_aspect_ratio = image_aspect_ratio;
        this.elements = elements;
    }
}
