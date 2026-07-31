package ealvatag.tag.datatype;

import defpackage.AbstractC16446l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class TCONString extends TextEncodedStringSizeTerminated {
    private boolean isNullSeparateMultipleValues;

    public TCONString(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        this.isNullSeparateMultipleValues = true;
    }

    private static List<String> splitV23(String str) {
        List<String> listAsList = Arrays.asList(str.replaceAll("(\\(\\d+\\)|\\(RX\\)|\\(CR\\)\\w*)", "$1\u0000").split("\u0000"));
        if (listAsList.size() != 0) {
            return listAsList;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("");
        return arrayList;
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public void addValue(String str) {
        if (isNullSeparateMultipleValues()) {
            setValue(this.value + "\u0000" + str);
            return;
        }
        boolean zStartsWith = str.startsWith("(");
        Object obj = this.value;
        if (zStartsWith) {
            setValue(obj + str);
            return;
        }
        setValue(obj + "\u0000" + str);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TCONString) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public int getNumberOfValues() {
        return getValues().size();
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public String getValueAtIndex(int i) {
        return getValues().get(i);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public String getValueWithoutTrailingNull() {
        List<String> values = getValues();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            if (i != 0) {
                sb.append("\u0000");
            }
            sb.append(values.get(i));
        }
        return sb.toString();
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public List<String> getValues() {
        if (this.value == null) {
            return Collections.EMPTY_LIST;
        }
        boolean zIsNullSeparateMultipleValues = isNullSeparateMultipleValues();
        Object obj = this.value;
        return zIsNullSeparateMultipleValues ? TextEncodedStringSizeTerminated.splitByNullSeperator((String) obj) : splitV23((String) obj);
    }

    public boolean isNullSeparateMultipleValues() {
        return this.isNullSeparateMultipleValues;
    }

    public void setNullSeparateMultipleValues(boolean z) {
        this.isNullSeparateMultipleValues = z;
    }

    public TCONString(TCONString tCONString) {
        super(tCONString);
        this.isNullSeparateMultipleValues = true;
    }
}
