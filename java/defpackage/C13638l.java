package defpackage;

/* JADX INFO: renamed from: lْۚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13638l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C4700l c4700l = (C4700l) obj;
        c1080l.m788class(c4700l.yandex());
        int i = c4700l.f9549l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 2, Integer.valueOf(i));
        }
        boolean z = c4700l.f9550l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        int iIntValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C4700l(zBooleanValue, iIntValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C4700l c4700l = (C4700l) obj;
        int iPurchase = c4700l.yandex().purchase();
        boolean z = c4700l.f9550l;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, AbstractC7532l.billing, 1, iPurchase);
        }
        int i = c4700l.f9549l;
        return i != 0 ? AbstractC9029l.isPro(i, AbstractC7532l.mopub, 2, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C4700l c4700l = (C4700l) obj;
        boolean z = c4700l.f9550l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 1, Boolean.valueOf(z));
        }
        int i = c4700l.f9549l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 2, Integer.valueOf(i));
        }
        c13161l.m3586switch(c4700l.yandex());
    }
}
