package defpackage;

/* JADX INFO: renamed from: lِؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2563l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15309l c15309l = (C15309l) obj;
        c1080l.m788class(c15309l.yandex());
        boolean z = c15309l.f29920l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 3, Boolean.valueOf(z));
        }
        int i = c15309l.f29918l;
        if (i != 0) {
            AbstractC7532l.admob.subs(c1080l, 2, Integer.valueOf(i));
        }
        long j = c15309l.f29919l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        int iIntValue = 0;
        boolean zBooleanValue = false;
        while (true) {
            long j = jLongValue;
            while (true) {
                int iMopub = c7084l.mopub();
                if (iMopub == -1) {
                    return new C15309l(j, iIntValue, zBooleanValue, c7084l.purchase(jAmazon));
                }
                if (iMopub != 1) {
                    if (iMopub == 2) {
                        iIntValue = ((Number) AbstractC7532l.admob.crashlytics(c7084l)).intValue();
                    } else if (iMopub != 3) {
                        c7084l.remoteconfig(iMopub);
                    } else {
                        zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
                    }
                }
            }
            jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15309l c15309l = (C15309l) obj;
        int iPurchase = c15309l.yandex().purchase();
        long j = c15309l.f29919l;
        if (j != 0) {
            iPurchase += AbstractC7532l.firebase.firebase(1, Long.valueOf(j));
        }
        int i = c15309l.f29918l;
        if (i != 0) {
            iPurchase += AbstractC7532l.admob.firebase(2, Integer.valueOf(i));
        }
        boolean z = c15309l.f29920l;
        return z ? AbstractC9029l.firebase(z, AbstractC7532l.billing, 3, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15309l c15309l = (C15309l) obj;
        long j = c15309l.f29919l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 1, Long.valueOf(j));
        }
        int i = c15309l.f29918l;
        if (i != 0) {
            AbstractC7532l.admob.admob(c13161l, 2, Integer.valueOf(i));
        }
        boolean z = c15309l.f29920l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 3, Boolean.valueOf(z));
        }
        c13161l.m3586switch(c15309l.yandex());
    }
}
