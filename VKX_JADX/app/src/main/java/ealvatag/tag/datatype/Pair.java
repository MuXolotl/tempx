package ealvatag.tag.datatype;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class Pair {
    private String key;
    private String value;

    public Pair(String str, String str2) {
        setKey(str);
        setValue(str2);
    }

    public String getKey() {
        return this.key;
    }

    public String getPairValue() {
        return getKey() + (char) 0 + getValue();
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
