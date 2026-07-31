package defpackage;

/* JADX INFO: renamed from: lؙؑؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0017l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C8592l c8592l = (C8592l) obj;
        c1080l.m788class(c8592l.yandex());
        int i = c8592l.f17708l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 2, Integer.valueOf(i));
        }
        int i2 = c8592l.f17709l;
        if (i2 != 0) {
            AbstractC7532l.admob.subs(c1080l, 1, Integer.valueOf(i2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C8592l(iIntValue, iIntValue2, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                iIntValue = ((Number) AbstractC7532l.admob.crashlytics(c7084l)).intValue();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                iIntValue2 = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C8592l c8592l = (C8592l) obj;
        int iPurchase = c8592l.yandex().purchase();
        int i = c8592l.f17709l;
        if (i != 0) {
            iPurchase += AbstractC7532l.admob.firebase(1, Integer.valueOf(i));
        }
        int i2 = c8592l.f17708l;
        return i2 != 0 ? AbstractC9029l.isPro(i2, AbstractC7532l.mopub, 2, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C8592l c8592l = (C8592l) obj;
        int i = c8592l.f17709l;
        if (i != 0) {
            AbstractC7532l.admob.admob(c13161l, 1, Integer.valueOf(i));
        }
        int i2 = c8592l.f17708l;
        if (i2 != 0) {
            AbstractC7532l.mopub.admob(c13161l, 2, Integer.valueOf(i2));
        }
        c13161l.m3586switch(c8592l.yandex());
    }
}
