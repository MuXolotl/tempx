package defpackage;

import java.net.ProtocolException;

/* JADX INFO: renamed from: lٔٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14962l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C16210l c16210l = (C16210l) obj;
        c1080l.m788class(c16210l.yandex());
        C3844l c3844l = c16210l.f31720l;
        if (!AbstractC8576l.yandex(c3844l, C3844l.f7950l)) {
            AbstractC7532l.metrica.subs(c1080l, 2, c3844l);
        }
        C18031l c18031l = c16210l.f31721l;
        if (c18031l != null) {
            C18031l.f35314l.subs(c1080l, 1, c18031l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) throws ProtocolException {
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        C3844l c3844lSubs = C3844l.f7950l;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C16210l((C18031l) objCrashlytics, c3844lSubs, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                objCrashlytics = C18031l.f35314l.crashlytics(c7084l);
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                AbstractC7532l.metrica.getClass();
                c3844lSubs = c7084l.subs();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C16210l c16210l = (C16210l) obj;
        C3844l c3844l = c16210l.f31720l;
        int iPurchase = c16210l.yandex().purchase();
        C18031l c18031l = c16210l.f31721l;
        if (c18031l != null) {
            iPurchase += C18031l.f35314l.firebase(1, c18031l);
        }
        return !AbstractC8576l.yandex(c3844l, C3844l.f7950l) ? AbstractC7532l.metrica.firebase(2, c3844l) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C16210l c16210l = (C16210l) obj;
        C3844l c3844l = c16210l.f31720l;
        C18031l c18031l = c16210l.f31721l;
        if (c18031l != null) {
            C18031l.f35314l.admob(c13161l, 1, c18031l);
        }
        if (!AbstractC8576l.yandex(c3844l, C3844l.f7950l)) {
            AbstractC7532l.metrica.admob(c13161l, 2, c3844l);
        }
        c13161l.m3586switch(c16210l.yandex());
    }
}
