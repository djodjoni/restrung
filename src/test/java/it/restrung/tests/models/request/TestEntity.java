package it.restrung.tests.models.request;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.request.AbstractJSONRequest;

public class TestEntity extends AbstractJSONRequest {

    @JsonProperty("_id")
    private String objectId;

    private String string;

    private int anInt;

    private double aDouble;

    private boolean aBoolean;

    private TestNestedEntity nestedEntity;

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public TestNestedEntity getNestedEntity() {
        return nestedEntity;
    }

    public void setNestedEntity(TestNestedEntity nestedEntity) {
        this.nestedEntity = nestedEntity;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
}
