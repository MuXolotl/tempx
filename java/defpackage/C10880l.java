package defpackage;

/* JADX INFO: renamed from: lؘُۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10880l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C17642l c17642l = (C17642l) obj;
        c1080l.m788class(c17642l.yandex());
        long j = c17642l.f34328l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C17642l(jLongValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C17642l c17642l = (C17642l) obj;
        int iPurchase = c17642l.yandex().purchase();
        long j = c17642l.f34328l;
        if (j == 0) {
            return iPurchase;
        }
        return AbstractC7532l.firebase.firebase(1, Long.valueOf(j)) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C17642l c17642l = (C17642l) obj;
        long j = c17642l.f34328l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 1, Long.valueOf(j));
        }
        c13161l.m3586switch(c17642l.yandex());
    }
}
