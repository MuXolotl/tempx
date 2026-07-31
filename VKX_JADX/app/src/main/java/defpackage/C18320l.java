package defpackage;

/* JADX INFO: renamed from: l٘ۤٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18320l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C12102l c12102l = (C12102l) obj;
        c1080l.m788class(c12102l.yandex());
        C18031l c18031l = c12102l.f24049l;
        if (c18031l != null) {
            C18031l.f35314l.subs(c1080l, 1, c18031l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C12102l((C18031l) objCrashlytics, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                objCrashlytics = C18031l.f35314l.crashlytics(c7084l);
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C12102l c12102l = (C12102l) obj;
        int iPurchase = c12102l.yandex().purchase();
        C18031l c18031l = c12102l.f24049l;
        return c18031l != null ? C18031l.f35314l.firebase(1, c18031l) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C12102l c12102l = (C12102l) obj;
        C18031l c18031l = c12102l.f24049l;
        if (c18031l != null) {
            C18031l.f35314l.admob(c13161l, 1, c18031l);
        }
        c13161l.m3586switch(c12102l.yandex());
    }
}
