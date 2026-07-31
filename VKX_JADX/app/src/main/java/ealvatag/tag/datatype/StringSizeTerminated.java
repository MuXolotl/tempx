package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class StringSizeTerminated extends TextEncodedStringSizeTerminated {
    public StringSizeTerminated(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof StringSizeTerminated) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public Charset getTextEncodingCharSet() {
        return AbstractC12379l.loadAd;
    }

    public StringSizeTerminated(StringSizeTerminated stringSizeTerminated) {
        super(stringSizeTerminated);
    }
}
