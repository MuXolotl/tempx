package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙۙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6725l {
    public static final C15578l yandex = new C15578l(263107239, false, new C13982l(14));
    public static final C15578l loadAd = new C15578l(1930504614, false, new C13982l(15));
    public static final C15578l crashlytics = new C15578l(2120573168, false, new C13982l(16));
    public static final C15578l amazon = new C15578l(1030923805, false, new C13982l(17));

    public static void admob(C5257l c5257l) {
        c5257l.metrica(3);
        c5257l.metrica(8);
        boolean zBilling = c5257l.billing();
        boolean zBilling2 = c5257l.billing();
        if (zBilling) {
            c5257l.metrica(5);
        }
        if (zBilling2) {
            c5257l.metrica(6);
        }
    }

    public static C6558l loadAd(int i) {
        Object next;
        Iterator it = C6558l.loadAd.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C6558l) next).yandex == i) {
                return (C6558l) next;
            }
        }
        next = null;
        return (C6558l) next;
    }

    public static int purchase(C5257l c5257l, int i, int i2, int i3) {
        AbstractC12442l.admob(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        AbstractC10464l.billing(AbstractC10464l.billing(i4, i5), 1 << i3);
        if (c5257l.loadAd() < i) {
            return -1;
        }
        int iMopub = c5257l.mopub(i);
        if (iMopub == i4) {
            if (c5257l.loadAd() < i2) {
                return -1;
            }
            int iMopub2 = c5257l.mopub(i2);
            iMopub += iMopub2;
            if (iMopub2 == i5) {
                if (c5257l.loadAd() < i3) {
                    return -1;
                }
                return c5257l.mopub(i3) + iMopub;
            }
        }
        return iMopub;
    }

    public static void subs(C5257l c5257l) {
        int iMopub;
        int iMopub2 = c5257l.mopub(2);
        if (iMopub2 == 0) {
            c5257l.metrica(6);
            return;
        }
        int iPurchase = purchase(c5257l, 5, 8, 16) + 1;
        if (iMopub2 == 1) {
            c5257l.metrica(iPurchase * 7);
            return;
        }
        if (iMopub2 == 2) {
            boolean zBilling = c5257l.billing();
            int i = zBilling ? 1 : 5;
            int i2 = zBilling ? 7 : 5;
            int i3 = zBilling ? 8 : 6;
            int i4 = 0;
            while (i4 < iPurchase) {
                if (c5257l.billing()) {
                    c5257l.metrica(7);
                    iMopub = 0;
                } else {
                    if (c5257l.mopub(2) == 3 && c5257l.mopub(i2) * i != 0) {
                        c5257l.vip();
                    }
                    iMopub = c5257l.mopub(i3) * i;
                    if (iMopub != 0 && iMopub != 180) {
                        c5257l.vip();
                    }
                    c5257l.vip();
                }
                if (iMopub != 0 && iMopub != 180 && c5257l.billing()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static final void yandex(C6943l c6943l, float f, long j) {
        c6943l.getClass();
        float fCeil = 0.0f;
        if (!C14467l.loadAd(f, Float.NaN)) {
            fCeil = C14467l.loadAd(f, 0.0f) ? 1.0f : (float) Math.ceil(f * c6943l.f14561l);
        }
        c6943l.purchase((byte) 8, c6943l.f14565l, c6943l.f14556l);
        C0580l c0580l = c6943l.f14557l;
        if (c0580l != null) {
            c0580l.yandex |= 256;
            c0580l.firebase = fCeil;
        }
        c6943l.purchase((byte) 35, c6943l.f14565l, c6943l.f14556l);
        InterfaceC1489l interfaceC1489l = c6943l.f14565l;
        InterfaceC1489l interfaceC1489l2 = c6943l.f14556l;
        C1280l c1280l = C1280l.yandex;
        if (interfaceC1489l == c1280l) {
            if ((c6943l.f14568l & 1) != 0) {
                C16977l c16977l = c6943l.f14558l;
                if (c16977l == null || (interfaceC1489l = (InterfaceC1489l) c16977l.loadAd(50)) == null) {
                    interfaceC1489l = AbstractC18011l.yandex;
                }
            } else {
                interfaceC1489l = null;
            }
        }
        if (interfaceC1489l2 == c1280l) {
            if ((c6943l.f14568l & 1) != 0) {
                C16977l c16977l2 = c6943l.f14559l;
                if (c16977l2 == null || (interfaceC1489l2 = (InterfaceC1489l) c16977l2.loadAd(50)) == null) {
                    interfaceC1489l2 = AbstractC18011l.yandex;
                }
            } else {
                interfaceC1489l2 = null;
            }
        }
        c6943l.f14568l = (interfaceC1489l == null || interfaceC1489l2 == null) ? c6943l.f14568l & (-2) : c6943l.f14568l | 1;
        c6943l.billing(50, interfaceC1489l, interfaceC1489l2);
        C0580l c0580l2 = c6943l.f14557l;
        if (c0580l2 != null) {
            c0580l2.amazon(j);
        }
    }

    public abstract boolean amazon();

    public abstract void billing(boolean z);

    public abstract InputFilter[] crashlytics(InputFilter[] inputFilterArr);

    public abstract TransformationMethod isPro(TransformationMethod transformationMethod);

    public abstract void mopub(boolean z);
}
