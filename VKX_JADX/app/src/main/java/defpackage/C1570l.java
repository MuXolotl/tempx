package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1570l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C1570l) && C14467l.loadAd(0.0f, 0.0f) && C14467l.loadAd(0.0f, 0.0f) && C14467l.loadAd(0.0f, 0.0f) && C14467l.loadAd(1.0f, 1.0f) && C14467l.loadAd(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(0.0f) * 31, 0.0f, 31), 0.0f, 31), 1.0f, 31);
    }

    public final C6570l yandex(boolean z, C2403l c2403l, C6956l c6956l, int i) {
        C5616l c5616l;
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (objM2132native == obj) {
            objM2132native = new C11362l();
            c6956l.m2147try(objM2132native);
        }
        C11362l c11362l = (C11362l) objM2132native;
        boolean z2 = true;
        int i2 = 0;
        boolean z3 = (((i & 112) ^ 48) > 32 && c6956l.billing(c2403l)) || (i & 48) == 32;
        Object objM2132native2 = c6956l.m2132native();
        InterfaceC14029l interfaceC14029l = null;
        if (z3 || objM2132native2 == obj) {
            objM2132native2 = new C5405l(c2403l, c11362l, interfaceC14029l, i2);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.amazon(c6956l, c2403l, (Function2) objM2132native2);
        InterfaceC12553l interfaceC12553l = (InterfaceC12553l) AbstractC16901l.m4212class(c11362l);
        float f = 0.0f;
        if (z && !(interfaceC12553l instanceof C12951l) && (interfaceC12553l instanceof C0261l)) {
            f = 1.0f;
        }
        float f2 = f;
        Object objM2132native3 = c6956l.m2132native();
        if (objM2132native3 == obj) {
            objM2132native3 = new C5616l(new C14467l(f2), AbstractC3483l.mopub, null, 12);
            c6956l.m2147try(objM2132native3);
        }
        C5616l c5616l2 = (C5616l) objM2132native3;
        C14467l c14467l = new C14467l(f2);
        boolean zAdmob = c6956l.admob(c5616l2) | c6956l.crashlytics(f2) | ((((i & 14) ^ 6) > 4 && c6956l.mopub(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !c6956l.billing(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zAdmob2 = zAdmob | z2 | c6956l.admob(interfaceC12553l);
        Object objM2132native4 = c6956l.m2132native();
        if (zAdmob2 || objM2132native4 == obj) {
            c5616l = c5616l2;
            Object c12969l = new C12969l(c5616l, f2, z, this, interfaceC12553l, null, 0);
            c6956l.m2147try(c12969l);
            objM2132native4 = c12969l;
        } else {
            c5616l = c5616l2;
        }
        AbstractC12311l.amazon(c6956l, c14467l, (Function2) objM2132native4);
        return c5616l.crashlytics;
    }
}
