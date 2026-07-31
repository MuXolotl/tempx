package defpackage;

/* JADX INFO: renamed from: lؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2092l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C18233l c18233l = (C18233l) obj;
        c1080l.m788class(c18233l.yandex());
        boolean z = c18233l.f35743l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 2, Boolean.valueOf(z));
        }
        EnumC14435l enumC14435l = c18233l.f35744l;
        if (enumC14435l != EnumC14435l.VK) {
            EnumC14435l.f28277l.subs(c1080l, 1, enumC14435l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC14435l.VK;
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C18233l((EnumC14435l) objCrashlytics, zBooleanValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                try {
                    objCrashlytics = EnumC14435l.f28277l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C18233l c18233l = (C18233l) obj;
        int iPurchase = c18233l.yandex().purchase();
        EnumC14435l enumC14435l = c18233l.f35744l;
        if (enumC14435l != EnumC14435l.VK) {
            iPurchase += EnumC14435l.f28277l.firebase(1, enumC14435l);
        }
        boolean z = c18233l.f35743l;
        return z ? AbstractC9029l.firebase(z, AbstractC7532l.billing, 2, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C18233l c18233l = (C18233l) obj;
        EnumC14435l enumC14435l = c18233l.f35744l;
        if (enumC14435l != EnumC14435l.VK) {
            EnumC14435l.f28277l.admob(c13161l, 1, enumC14435l);
        }
        boolean z = c18233l.f35743l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 2, Boolean.valueOf(z));
        }
        c13161l.m3586switch(c18233l.yandex());
    }
}
