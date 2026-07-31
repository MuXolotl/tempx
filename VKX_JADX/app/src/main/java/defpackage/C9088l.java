package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌ۟۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9088l extends C14747l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f18670l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f18671l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9088l(String str, ArrayList arrayList) {
        String strAdvert;
        if (arrayList.size() == 1) {
            strAdvert = AbstractC9361l.advert(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strAdvert = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(strAdvert, null, arrayList, str);
    }

    public C9088l(String str, C9088l c9088l, List list, String str2) {
        super(str, c9088l);
        this.f18671l = list;
        this.f18670l = str2;
    }

    public C9088l(String str, String str2) {
        this(AbstractC14814l.ads("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, Collections.singletonList(str), str2);
    }
}
