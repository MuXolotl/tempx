package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌٜٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8875l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C12447l c12447l = (C12447l) obj;
        c1080l.m788class(c12447l.yandex());
        long j = c12447l.f24572l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 2, Long.valueOf(j));
        }
        C8188l.f17083l.yandex().subs(c1080l, 1, c12447l.f24571l);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C12447l(arrayList, jLongValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                arrayList.add(C8188l.f17083l.crashlytics(c7084l));
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C12447l c12447l = (C12447l) obj;
        int iFirebase = C8188l.f17083l.yandex().firebase(1, c12447l.f24571l) + c12447l.yandex().purchase();
        long j = c12447l.f24572l;
        if (j == 0) {
            return iFirebase;
        }
        return AbstractC7532l.firebase.firebase(2, Long.valueOf(j)) + iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C12447l c12447l = (C12447l) obj;
        C8188l.f17083l.yandex().admob(c13161l, 1, c12447l.f24571l);
        long j = c12447l.f24572l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 2, Long.valueOf(j));
        }
        c13161l.m3586switch(c12447l.yandex());
    }
}
