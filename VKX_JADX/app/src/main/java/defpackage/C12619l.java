package defpackage;

import java.net.ProtocolException;

/* JADX INFO: renamed from: lٌّٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12619l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C5552l c5552l = (C5552l) obj;
        C3844l c3844l = c5552l.f11837l;
        c1080l.m788class(c5552l.yandex());
        int i = c5552l.f11836l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 2, Integer.valueOf(i));
        }
        if (AbstractC8576l.yandex(c3844l, C3844l.f7950l)) {
            return;
        }
        AbstractC7532l.metrica.subs(c1080l, 1, c3844l);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) throws ProtocolException {
        long jAmazon = c7084l.amazon();
        C3844l c3844lSubs = C3844l.f7950l;
        int iIntValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C5552l(c3844lSubs, iIntValue, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                AbstractC7532l.metrica.getClass();
                c3844lSubs = c7084l.subs();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C5552l c5552l = (C5552l) obj;
        int iPurchase = c5552l.yandex().purchase();
        C3844l c3844l = c5552l.f11837l;
        if (!AbstractC8576l.yandex(c3844l, C3844l.f7950l)) {
            iPurchase += AbstractC7532l.metrica.firebase(1, c3844l);
        }
        int i = c5552l.f11836l;
        return i != 0 ? AbstractC9029l.isPro(i, AbstractC7532l.mopub, 2, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C5552l c5552l = (C5552l) obj;
        C3844l c3844l = c5552l.f11837l;
        if (!AbstractC8576l.yandex(c3844l, C3844l.f7950l)) {
            AbstractC7532l.metrica.admob(c13161l, 1, c3844l);
        }
        int i = c5552l.f11836l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 2, Integer.valueOf(i));
        }
        c13161l.m3586switch(c5552l.yandex());
    }
}
