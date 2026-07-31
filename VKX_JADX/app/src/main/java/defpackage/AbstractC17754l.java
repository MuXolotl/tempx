package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17754l {
    public static final C3797l yandex = C3797l.appmetrica("k", "x", "y");

    public static InterfaceC15782l loadAd(C3122l c3122l, C10712l c10712l) {
        c3122l.billing();
        C15659l c15659lYandex = null;
        C2982l c2982lBilling = null;
        boolean z = false;
        C2982l c2982lBilling2 = null;
        while (c3122l.mo1287synchronized() != 4) {
            int iMo1288throw = c3122l.mo1288throw(yandex);
            if (iMo1288throw == 0) {
                c15659lYandex = yandex(c3122l, c10712l);
            } else if (iMo1288throw != 1) {
                if (iMo1288throw != 2) {
                    c3122l.mo1286switch();
                    c3122l.mo1275continue();
                } else if (c3122l.mo1287synchronized() == 6) {
                    c3122l.mo1275continue();
                    z = true;
                } else {
                    c2982lBilling = AbstractC2069l.billing(c3122l, c10712l, true);
                }
            } else if (c3122l.mo1287synchronized() == 6) {
                c3122l.mo1275continue();
                z = true;
            } else {
                c2982lBilling2 = AbstractC2069l.billing(c3122l, c10712l, true);
            }
        }
        c3122l.vip();
        if (z) {
            c10712l.yandex("Lottie doesn't support expressions.");
        }
        return c15659lYandex != null ? c15659lYandex : new C12574l(c2982lBilling2, c2982lBilling);
    }

    public static C15659l yandex(C3122l c3122l, C10712l c10712l) throws C8413l, EOFException {
        ArrayList arrayList = new ArrayList();
        if (c3122l.mo1287synchronized() == 1) {
            c3122l.yandex();
            while (c3122l.ads()) {
                C3122l c3122l2 = c3122l;
                C10712l c10712l2 = c10712l;
                arrayList.add(new C12786l(c10712l2, AbstractC7844l.loadAd(c3122l2, c10712l2, AbstractC4218l.crashlytics(), C17334l.f33659l, c3122l.mo1287synchronized() == 3, false)));
                c3122l = c3122l2;
                c10712l = c10712l2;
            }
            c3122l.mopub();
            AbstractC18594l.loadAd(arrayList);
        } else {
            arrayList.add(new C4529l(AbstractC14878l.loadAd(c3122l, AbstractC4218l.crashlytics())));
        }
        return new C15659l(arrayList);
    }
}
