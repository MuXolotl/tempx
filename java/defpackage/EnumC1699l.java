package defpackage;

import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: lًؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1699l {
    /* JADX INFO: Fake field, exist only in values array */
    ENGINEER("engineer"),
    /* JADX INFO: Fake field, exist only in values array */
    MIXER("mix"),
    /* JADX INFO: Fake field, exist only in values array */
    DJMIXER("DJ-mix"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCER("producer"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRANGER("arranger");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final HashMap f4087l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f4088l;

    static {
        for (EnumC1699l enumC1699l : EnumSet.allOf(EnumC1699l.class)) {
            f4087l.put(enumC1699l.f4088l, enumC1699l);
        }
    }

    EnumC1699l(String str) {
        this.f4088l = str;
    }
}
