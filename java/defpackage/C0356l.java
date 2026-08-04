package defpackage;

/* JADX INFO: renamed from: lٌٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0356l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C10036l c10036l = (C10036l) obj;
        c1080l.m788class(c10036l.yandex());
        boolean z = c10036l.f20457l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 2, Boolean.valueOf(z));
        }
        C11193l.f22546l.subs(c1080l, 1, c10036l.f20458l);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        boolean zBooleanValue = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C10036l((C11193l) objCrashlytics, zBooleanValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                objCrashlytics = C11193l.f22546l.crashlytics(c7084l);
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C10036l c10036l = (C10036l) obj;
        int iFirebase = C11193l.f22546l.firebase(1, c10036l.f20458l) + c10036l.yandex().purchase();
        boolean z = c10036l.f20457l;
        return z ? AbstractC9029l.firebase(z, AbstractC7532l.billing, 2, iFirebase) : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C10036l c10036l = (C10036l) obj;
        C11193l.f22546l.admob(c13161l, 1, c10036l.f20458l);
        boolean z = c10036l.f20457l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 2, Boolean.valueOf(z));
        }
        c13161l.m3586switch(c10036l.yandex());
    }
}
