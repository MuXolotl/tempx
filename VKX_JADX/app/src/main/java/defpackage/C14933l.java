package defpackage;

/* JADX INFO: renamed from: lَٔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14933l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15744l c15744l = (C15744l) obj;
        c1080l.m788class(c15744l.yandex());
        float f = c15744l.f30926l;
        if (!Float.valueOf(f).equals(Float.valueOf(0.0f))) {
            AbstractC7532l.remoteconfig.subs(c1080l, 2, Float.valueOf(f));
        }
        boolean z = c15744l.f30927l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        float fFloatValue = 0.0f;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15744l(zBooleanValue, fFloatValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                fFloatValue = ((Number) AbstractC7532l.remoteconfig.crashlytics(c7084l)).floatValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15744l c15744l = (C15744l) obj;
        float f = c15744l.f30926l;
        int iPurchase = c15744l.yandex().purchase();
        boolean z = c15744l.f30927l;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, AbstractC7532l.billing, 1, iPurchase);
        }
        if (Float.valueOf(f).equals(Float.valueOf(0.0f))) {
            return iPurchase;
        }
        return AbstractC7532l.remoteconfig.firebase(2, Float.valueOf(f)) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15744l c15744l = (C15744l) obj;
        float f = c15744l.f30926l;
        boolean z = c15744l.f30927l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 1, Boolean.valueOf(z));
        }
        if (!Float.valueOf(f).equals(Float.valueOf(0.0f))) {
            AbstractC7532l.remoteconfig.admob(c13161l, 2, Float.valueOf(f));
        }
        c13161l.m3586switch(c15744l.yandex());
    }
}
