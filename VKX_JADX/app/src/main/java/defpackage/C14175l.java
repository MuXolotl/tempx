package defpackage;

/* JADX INFO: renamed from: lٖٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14175l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15697l c15697l = (C15697l) obj;
        c1080l.m788class(c15697l.yandex());
        EnumC1177l enumC1177l = c15697l.f30838l;
        if (enumC1177l != EnumC1177l.LINEAR) {
            EnumC1177l.f3165l.subs(c1080l, 3, enumC1177l);
        }
        int i = c15697l.f30836l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 2, Integer.valueOf(i));
        }
        boolean z = c15697l.f30837l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC1177l.LINEAR;
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        int iIntValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15697l(zBooleanValue, iIntValue, (EnumC1177l) objCrashlytics, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
            } else if (iMopub == 2) {
                iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            } else if (iMopub != 3) {
                c7084l.remoteconfig(iMopub);
            } else {
                try {
                    objCrashlytics = EnumC1177l.f3165l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15697l c15697l = (C15697l) obj;
        int iPurchase = c15697l.yandex().purchase();
        boolean z = c15697l.f30837l;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, AbstractC7532l.billing, 1, iPurchase);
        }
        int i = c15697l.f30836l;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, AbstractC7532l.mopub, 2, iPurchase);
        }
        EnumC1177l enumC1177l = c15697l.f30838l;
        return enumC1177l != EnumC1177l.LINEAR ? EnumC1177l.f3165l.firebase(3, enumC1177l) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15697l c15697l = (C15697l) obj;
        boolean z = c15697l.f30837l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 1, Boolean.valueOf(z));
        }
        int i = c15697l.f30836l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 2, Integer.valueOf(i));
        }
        EnumC1177l enumC1177l = c15697l.f30838l;
        if (enumC1177l != EnumC1177l.LINEAR) {
            EnumC1177l.f3165l.admob(c13161l, 3, enumC1177l);
        }
        c13161l.m3586switch(c15697l.yandex());
    }
}
