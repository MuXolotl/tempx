package ealvatag.tag.datatype;

import defpackage.AbstractC16446l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class StringDateTime extends StringSizeTerminated {
    public StringDateTime(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    @Override // ealvatag.tag.datatype.StringSizeTerminated, ealvatag.tag.datatype.TextEncodedStringSizeTerminated, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof StringDateTime) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public Object getValue() {
        Object obj = this.value;
        if (obj != null) {
            return obj.toString().replace(' ', 'T');
        }
        return null;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (obj != null) {
            this.value = obj.toString().replace(' ', 'T');
        }
    }

    public StringDateTime(StringDateTime stringDateTime) {
        super(stringDateTime);
    }
}
