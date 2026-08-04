package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15146l {
    static {
        AbstractC0509l.crashlytics(new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(1.25f)) << 32) | (((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(1.25f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)));
        AbstractC0509l.crashlytics(new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.5f)) << 32)), new C1187l((((long) Float.floatToRawIntBits(1.25f)) << 32) | (((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(1.25f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(1.25f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)));
    }

    public static final void yandex(Function0 function0, Function0 function1, InterfaceC17242l interfaceC17242l, int i, C6956l c6956l, int i2) {
        int i3;
        c6956l.m2133new(-1651839328);
        int i4 = i2 | (c6956l.admob(function0) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192);
        if (c6956l.m2127for(i4 & 1, (74899 & i4) != 74898)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC4311l.yandex();
                c6956l.m2147try(objM2132native);
            }
            C4480l c4480l = (C4480l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                i3 = i;
                objM2132native2 = new C16625l(new C14386l(i3));
                c6956l.m2147try(objM2132native2);
            } else {
                i3 = i;
            }
            C16625l c16625l = (C16625l) objM2132native2;
            boolean zAdmob = ((i4 & 14) == 4) | c6956l.admob(c16625l) | ((i4 & 112) == 32) | c6956l.admob(c4480l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == c13863l) {
                C17796l c17796l = new C17796l(c16625l, function0, function1, c4480l, 11);
                c6956l.m2147try(c17796l);
                objM2132native3 = c17796l;
            }
            AbstractC12155l.yandex(interfaceC17242l, (Function1) objM2132native3, c6956l, (i4 >> 12) & 14);
        } else {
            i3 = i;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(function0, function1, interfaceC17242l, i3, i2);
        }
    }
}
