package defpackage;

/* JADX INFO: renamed from: lّ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18250l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15845l c15845l = (C15845l) obj;
        c1080l.m788class(c15845l.yandex());
        String str = c15845l.f31098l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 2, str);
        }
        long j = c15845l.f31099l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        String strSmaato = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15845l(jLongValue, strSmaato, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                AbstractC7532l.startapp.getClass();
                strSmaato = c7084l.smaato();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15845l c15845l = (C15845l) obj;
        String str = c15845l.f31098l;
        int iPurchase = c15845l.yandex().purchase();
        long j = c15845l.f31099l;
        if (j != 0) {
            iPurchase += AbstractC7532l.firebase.firebase(1, Long.valueOf(j));
        }
        return !AbstractC8576l.yandex(str, "") ? AbstractC7532l.startapp.firebase(2, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15845l c15845l = (C15845l) obj;
        String str = c15845l.f31098l;
        long j = c15845l.f31099l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 1, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 2, str);
        }
        c13161l.m3586switch(c15845l.yandex());
    }
}
