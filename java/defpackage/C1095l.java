package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؒٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1095l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C10638l c10638l = (C10638l) obj;
        c1080l.m788class(c10638l.yandex());
        C9024l.f18583l.yandex().subs(c1080l, 1, c10638l.f21587l);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C10638l(arrayList, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                arrayList.add(C9024l.f18583l.crashlytics(c7084l));
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C10638l c10638l = (C10638l) obj;
        return C9024l.f18583l.yandex().firebase(1, c10638l.f21587l) + c10638l.yandex().purchase();
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C10638l c10638l = (C10638l) obj;
        C9024l.f18583l.yandex().admob(c13161l, 1, c10638l.f21587l);
        c13161l.m3586switch(c10638l.yandex());
    }
}
