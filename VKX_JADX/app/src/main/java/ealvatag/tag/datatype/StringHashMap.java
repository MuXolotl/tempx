package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC7000l;
import defpackage.C13161l;
import defpackage.C8339l;
import defpackage.InterfaceC1771l;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class StringHashMap extends StringFixedLength {
    private boolean hasEmptyValue;
    private final InterfaceC1771l simpleStringStringMap;

    public StringHashMap(String str, AbstractC16446l abstractC16446l, int i) {
        super(str, abstractC16446l, i);
        this.hasEmptyValue = false;
        if (str.equals(DataTypes.OBJ_LANGUAGE)) {
            this.simpleStringStringMap = C13161l.subs();
        } else {
            C8339l.metrica("Hashmap identifier not defined in this class: ".concat(str));
            throw null;
        }
    }

    @Override // ealvatag.tag.datatype.StringFixedLength, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof StringHashMap)) {
            return false;
        }
        StringHashMap stringHashMap = (StringHashMap) obj;
        return this.hasEmptyValue == stringHashMap.hasEmptyValue && AbstractC7000l.loadAd(this.simpleStringStringMap, stringHashMap.simpleStringStringMap) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public Charset getTextEncodingCharSet() {
        return AbstractC12379l.loadAd;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (!(obj instanceof String)) {
            this.value = obj;
        } else if (obj.equals("XXX")) {
            this.value = obj.toString();
        } else {
            this.value = ((String) obj).toLowerCase();
        }
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public String toString() {
        String value;
        Object obj = this.value;
        return (obj == null || (value = this.simpleStringStringMap.getValue(obj.toString())) == null) ? "" : value;
    }

    public StringHashMap(StringHashMap stringHashMap) {
        super(stringHashMap);
        this.hasEmptyValue = false;
        this.hasEmptyValue = stringHashMap.hasEmptyValue;
        this.simpleStringStringMap = stringHashMap.simpleStringStringMap;
    }
}
