package defpackage;

/* JADX INFO: renamed from: lۣ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18259l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C12788l c12788l = (C12788l) obj;
        c1080l.m788class(c12788l.yandex());
        boolean z = c12788l.f25164l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C12788l(zBooleanValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C12788l c12788l = (C12788l) obj;
        int iPurchase = c12788l.yandex().purchase();
        boolean z = c12788l.f25164l;
        return z ? AbstractC9029l.firebase(z, AbstractC7532l.billing, 1, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C12788l c12788l = (C12788l) obj;
        boolean z = c12788l.f25164l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 1, Boolean.valueOf(z));
        }
        c13161l.m3586switch(c12788l.yandex());
    }
}
