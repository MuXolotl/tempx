package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: lؒ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1382l {
    VISIBILITY(0),
    MODALITY(1),
    OVERRIDE(2),
    ANNOTATIONS(3),
    INNER(4),
    MEMBER_KIND(5),
    DATA(6),
    INLINE(7),
    EXPECT(8),
    ACTUAL(9),
    CONST(10),
    LATEINIT(11),
    FUN(12),
    VALUE(13);


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Set f3516l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final Set f3520l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f3532l;

    static {
        EnumC1382l[] enumC1382lArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC1382l enumC1382l : enumC1382lArrValues) {
            if (enumC1382l.f3532l) {
                arrayList.add(enumC1382l);
            }
        }
        f3520l = AbstractC16901l.m4229l(arrayList);
        f3516l = AbstractC8669l.m2407import(values());
    }

    EnumC1382l(int i) {
        this.f3532l = z;
    }
}
