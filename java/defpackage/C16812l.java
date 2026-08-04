package defpackage;

/* JADX INFO: renamed from: lٗؐؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16812l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15302l c15302l = (C15302l) obj;
        c1080l.m788class(c15302l.yandex());
        int i = c15302l.f29911l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 1, Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        int iIntValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15302l(iIntValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15302l c15302l = (C15302l) obj;
        int iPurchase = c15302l.yandex().purchase();
        int i = c15302l.f29911l;
        return i != 0 ? AbstractC9029l.isPro(i, AbstractC7532l.mopub, 1, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15302l c15302l = (C15302l) obj;
        int i = c15302l.f29911l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 1, Integer.valueOf(i));
        }
        c13161l.m3586switch(c15302l.yandex());
    }
}
