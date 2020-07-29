package org.techtown.listviewtest1.adapter;

public class SampleData {

    private String count;
    private String strName;
    private String strText;

    public SampleData(String count, String strName, String strText) {
        this.count = count;
        this.strName = strName;
        this.strText = strText;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrText() {
        return strText;
    }

    public void setStrText(String strText) {
        this.strText = strText;
    }
}
