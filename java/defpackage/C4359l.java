package defpackage;

/* JADX INFO: renamed from: lؖۘۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4359l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C5000l c5000l = (C5000l) obj;
        c1080l.m788class(c5000l.yandex());
        EnumC10564l enumC10564l = c5000l.f10236l;
        if (enumC10564l != EnumC10564l.VKX_PLUS) {
            EnumC10564l.f21479l.subs(c1080l, 1, enumC10564l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC10564l.VKX_PLUS;
        long jAmazon = c7084l.amazon();
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C5000l((EnumC10564l) objCrashlytics, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                try {
                    objCrashlytics = EnumC10564l.f21479l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C5000l c5000l = (C5000l) obj;
        int iPurchase = c5000l.yandex().purchase();
        EnumC10564l enumC10564l = c5000l.f10236l;
        return enumC10564l != EnumC10564l.VKX_PLUS ? EnumC10564l.f21479l.firebase(1, enumC10564l) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C5000l c5000l = (C5000l) obj;
        EnumC10564l enumC10564l = c5000l.f10236l;
        if (enumC10564l != EnumC10564l.VKX_PLUS) {
            EnumC10564l.f21479l.admob(c13161l, 1, enumC10564l);
        }
        c13161l.m3586switch(c5000l.yandex());
    }
}
