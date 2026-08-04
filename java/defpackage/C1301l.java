package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؒۙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1301l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C14690l c14690l = (C14690l) obj;
        c1080l.m788class(c14690l.yandex());
        long j = c14690l.f28753l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 3, Long.valueOf(j));
        }
        C0884l.f2536l.yandex().subs(c1080l, 2, c14690l.f28755l);
        EnumC15312l enumC15312l = c14690l.f28754l;
        if (enumC15312l != EnumC15312l.RECOMMENDATIONS) {
            EnumC15312l.f29924l.subs(c1080l, 1, enumC15312l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC15312l.RECOMMENDATIONS;
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        while (true) {
            long j = jLongValue;
            while (true) {
                int iMopub = c7084l.mopub();
                if (iMopub == -1) {
                    return new C14690l((EnumC15312l) objCrashlytics, arrayList, j, c7084l.purchase(jAmazon));
                }
                if (iMopub == 1) {
                    try {
                        objCrashlytics = EnumC15312l.f29924l.crashlytics(c7084l);
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                    }
                } else if (iMopub == 2) {
                    arrayList.add(C0884l.f2536l.crashlytics(c7084l));
                } else if (iMopub != 3) {
                    c7084l.remoteconfig(iMopub);
                }
            }
            jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C14690l c14690l = (C14690l) obj;
        int iPurchase = c14690l.yandex().purchase();
        EnumC15312l enumC15312l = c14690l.f28754l;
        if (enumC15312l != EnumC15312l.RECOMMENDATIONS) {
            iPurchase += EnumC15312l.f29924l.firebase(1, enumC15312l);
        }
        int iFirebase = C0884l.f2536l.yandex().firebase(2, c14690l.f28755l) + iPurchase;
        long j = c14690l.f28753l;
        if (j == 0) {
            return iFirebase;
        }
        return AbstractC7532l.firebase.firebase(3, Long.valueOf(j)) + iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C14690l c14690l = (C14690l) obj;
        EnumC15312l enumC15312l = c14690l.f28754l;
        if (enumC15312l != EnumC15312l.RECOMMENDATIONS) {
            EnumC15312l.f29924l.admob(c13161l, 1, enumC15312l);
        }
        C0884l.f2536l.yandex().admob(c13161l, 2, c14690l.f28755l);
        long j = c14690l.f28753l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 3, Long.valueOf(j));
        }
        c13161l.m3586switch(c14690l.yandex());
    }
}
