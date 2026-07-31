package defpackage;

import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lِؚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12151l {
    public final C13904l amazon;
    public C17266l crashlytics;
    public final Set loadAd;
    public final C12747l yandex;

    public C12151l(C12747l c12747l, Set set, InterfaceC2262l interfaceC2262l, C8250l c8250l) {
        this.yandex = c12747l;
        this.loadAd = set;
        this.amazon = new C13904l(interfaceC2262l, new Ctry(c8250l, this, 3));
        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C11039l(this, null, 1), 3);
    }

    public final Unit amazon(C17266l c17266l, C17726l c17726l) {
        Unit unit;
        C17266l c17266l2 = this.crashlytics;
        this.crashlytics = c17266l;
        InterfaceC14029l interfaceC14029l = null;
        if (c17266l2 != null) {
            c17266l2.yandex(null);
        }
        C1008l c1008l = this.yandex.Signature;
        synchronized (c17266l.purchase) {
            if (c17266l.billing) {
                c17726l.loadAd();
                unit = Unit.INSTANCE;
            } else {
                c17266l.firebase = AbstractC10999l.mopub(c17266l.crashlytics, null, 0, new C15352l(c1008l, c17266l, interfaceC14029l, 29), 3);
                c17266l.smaato = c17726l;
                unit = Unit.INSTANCE;
            }
        }
        return unit == EnumC9342l.f19165l ? unit : Unit.INSTANCE;
    }

    public final void crashlytics() {
        this.amazon.admob();
        this.yandex.yandex();
    }

    public final Object loadAd(AbstractC0283l abstractC0283l) {
        Object objSmaato = AbstractC0622l.smaato(this.yandex.Signature, new C2051l(2, null, 1), abstractC0283l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objSmaato != enumC9342l) {
            objSmaato = Unit.INSTANCE;
        }
        return objSmaato == enumC9342l ? objSmaato : Unit.INSTANCE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) C10160l.loadAd(this.yandex.yandex));
        sb.append(")@");
        int iHashCode = hashCode();
        AbstractC8576l.loadAd(16);
        sb.append(Integer.toString(iHashCode, 16));
        return sb.toString();
    }

    public final C17726l yandex() {
        C13904l c13904l = this.amazon;
        synchronized (c13904l.f27204l) {
            try {
                if (c13904l.f27199l) {
                    return null;
                }
                int i = c13904l.f27201l + 1;
                c13904l.f27201l = i;
                if (i == 1) {
                    C7504l c7504l = (C7504l) c13904l.f27200l;
                    if (c7504l != null) {
                        c7504l.ads(null);
                    }
                    c13904l.f27200l = null;
                }
                Unit unit = Unit.INSTANCE;
                return new C17726l(c13904l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
