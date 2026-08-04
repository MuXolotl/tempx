package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: renamed from: l٘ؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17658l extends AbstractC0294l {
    public C7504l admob;
    public final C7119l mopub;

    public C17658l(C4154l c4154l, C11491l c11491l, InterfaceC13490l interfaceC13490l) {
        super(c4154l, c11491l, interfaceC13490l);
        this.mopub = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
    
        if (r0.invoke(r3, r7) == r10) goto L25;
     */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m4405continue(defpackage.C17658l r16, defpackage.C4154l r17, defpackage.C17466l r18, defpackage.AbstractC0283l r19) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17658l.m4405continue(l٘ؔٔ, lٖؖٓ, lٗۡؖ, lّؑۧ):java.lang.Object");
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static C17466l m4406interface(C7119l c7119l) {
        C17466l c17466l = null;
        C11129l c11129lPurchase = AbstractC6900l.purchase(new amazon(new C3379l(c7119l, 1), 0 == true ? 1 : 0, 3));
        while (c11129lPurchase.hasNext()) {
            C17466l c17466lYandex = (C17466l) c11129lPurchase.next();
            if (c17466l != null) {
                c17466lYandex = c17466l.yandex(c17466lYandex);
            }
            c17466l = c17466lYandex;
        }
        return c17466l;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final boolean m4407class(C9185l c9185l) {
        boolean z;
        boolean z2;
        boolean z3;
        C7119l c7119l;
        C4154l c4154l = (C4154l) this.loadAd;
        C15730l c15730l = (C15730l) AbstractC16901l.m4217extends(c9185l.yandex);
        if (c15730l != null) {
            List listLoadAd = c15730l.loadAd();
            int size = listLoadAd.size();
            int i = 0;
            z3 = false;
            while (true) {
                c7119l = this.mopub;
                if (i >= size) {
                    break;
                }
                C6624l c6624l = (C6624l) listLoadAd.get(i);
                long j = c6624l.amazon ^ (-9223372034707292160L);
                if (!(c4154l.isPro(c4154l.billing(j)) == 0.0f)) {
                    z3 = !(c7119l.amazon(new C17466l(j, c6624l.yandex, false)) instanceof C15230l) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = c15730l.smaato ^ (-9223372034707292160L);
            boolean z4 = c9185l.billing == 12;
            if (!(c4154l.isPro(c4154l.billing(j2)) == 0.0f) || z4) {
                if (!(c7119l.amazon(new C17466l(j2, c15730l.loadAd, z4)) instanceof C15230l) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.crashlytics) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
