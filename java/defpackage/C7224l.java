package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7224l {
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final float loadAd;
    public final float purchase;
    public final float yandex;

    public C7224l(float f, float f2, float f3, float f4, float f5, float f6) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        this.purchase = f5;
        this.billing = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7224l)) {
            return false;
        }
        C7224l c7224l = (C7224l) obj;
        return C14467l.loadAd(this.yandex, c7224l.yandex) && C14467l.loadAd(this.loadAd, c7224l.loadAd) && C14467l.loadAd(this.crashlytics, c7224l.crashlytics) && C14467l.loadAd(this.amazon, c7224l.amazon) && C14467l.loadAd(this.billing, c7224l.billing);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.billing) + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31);
    }

    public final InterfaceC12244l yandex(boolean z, C2403l c2403l, C6956l c6956l, int i) {
        Object obj;
        C5616l c5616l;
        InterfaceC12244l interfaceC12244l;
        Object obj2;
        c6956l.m2123default(-1763481333);
        float f = this.yandex;
        Object obj3 = C1867l.yandex;
        if (c2403l == null) {
            c6956l.m2123default(167726411);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == obj3) {
                obj2 = objM2132native;
                Object objSmaato = AbstractC8020l.smaato(new C14467l(f));
                c6956l.m2147try(objSmaato);
                obj2 = objSmaato;
            }
            obj2 = objM2132native;
            interfaceC12244l = (InterfaceC8714l) obj2;
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(167799447);
            c6956l.startapp(false);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj3) {
                obj = objM2132native2;
                Object c11362l = new C11362l();
                c6956l.m2147try(c11362l);
                obj = c11362l;
            }
            obj = objM2132native2;
            C11362l c11362l2 = (C11362l) obj;
            int i2 = 1;
            boolean z2 = (((i & 112) ^ 48) > 32 && c6956l.billing(c2403l)) || (i & 48) == 32;
            Object objM2132native3 = c6956l.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            Object obj4 = objM2132native3;
            if (z2 || objM2132native3 == obj3) {
                Object c5405l = new C5405l(c2403l, c11362l2, interfaceC14029l, i2);
                c6956l.m2147try(c5405l);
                obj4 = c5405l;
            }
            AbstractC12311l.amazon(c6956l, c2403l, (Function2) obj4);
            InterfaceC12553l interfaceC12553l = (InterfaceC12553l) AbstractC16901l.m4212class(c11362l2);
            if (!z) {
                f = this.billing;
            } else if (interfaceC12553l instanceof C12951l) {
                f = this.loadAd;
            } else if (interfaceC12553l instanceof C0261l) {
                f = this.amazon;
            } else if (interfaceC12553l instanceof C7008l) {
                f = this.crashlytics;
            } else if (interfaceC12553l instanceof C1311l) {
                f = this.purchase;
            }
            Object objM2132native4 = c6956l.m2132native();
            Object obj5 = objM2132native4;
            if (objM2132native4 == obj3) {
                Object c5616l2 = new C5616l(new C14467l(f), AbstractC3483l.mopub, null, 12);
                c6956l.m2147try(c5616l2);
                obj5 = c5616l2;
            }
            C5616l c5616l3 = (C5616l) obj5;
            C14467l c14467l = new C14467l(f);
            int i3 = (c6956l.admob(c5616l3) ? 1 : 0) | (c6956l.crashlytics(f) ? 1 : 0) | (((((i & 14) ^ 6) <= 4 || !c6956l.mopub(z)) && (i & 6) != 4) ? 0 : 1);
            if ((((i & 896) ^ 384) <= 256 || !c6956l.billing(this)) && (i & 384) != 256) {
                i2 = 0;
            }
            int i4 = i3 | i2 | (c6956l.admob(interfaceC12553l) ? 1 : 0);
            Object objM2132native5 = c6956l.m2132native();
            if (i4 != 0 || objM2132native5 == obj3) {
                c5616l = c5616l3;
                Object c12969l = new C12969l(c5616l, f, z, this, interfaceC12553l, null, 1);
                c6956l.m2147try(c12969l);
                objM2132native5 = c12969l;
            } else {
                c5616l = c5616l3;
            }
            AbstractC12311l.amazon(c6956l, c14467l, (Function2) objM2132native5);
            interfaceC12244l = c5616l.crashlytics;
        }
        c6956l.startapp(false);
        return interfaceC12244l;
    }
}
