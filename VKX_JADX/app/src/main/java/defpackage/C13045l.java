package defpackage;

/* JADX INFO: renamed from: lْؐۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13045l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C11656l c11656l = (C11656l) obj;
        String str = c11656l.f23374l;
        c1080l.m788class(c11656l.yandex());
        String str2 = c11656l.f23375l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 3, str2);
        }
        long j = c11656l.f23373l;
        if (j != 0) {
            AbstractC7532l.isPro.subs(c1080l, 2, Long.valueOf(j));
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        while (true) {
            long j = jLongValue;
            while (true) {
                int iMopub = c7084l.mopub();
                if (iMopub == -1) {
                    return new C11656l(strSmaato, j, strSmaato2, c7084l.purchase(jAmazon));
                }
                C16786l c16786l = AbstractC7532l.startapp;
                if (iMopub == 1) {
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                } else if (iMopub != 2) {
                    if (iMopub != 3) {
                        c7084l.remoteconfig(iMopub);
                    } else {
                        c16786l.getClass();
                        strSmaato2 = c7084l.smaato();
                    }
                }
            }
            jLongValue = ((Number) AbstractC7532l.isPro.crashlytics(c7084l)).longValue();
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C11656l c11656l = (C11656l) obj;
        String str = c11656l.f23375l;
        int iPurchase = c11656l.yandex().purchase();
        String str2 = c11656l.f23374l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str2);
        }
        long j = c11656l.f23373l;
        if (j != 0) {
            iPurchase += AbstractC7532l.isPro.firebase(2, Long.valueOf(j));
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l.firebase(3, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C11656l c11656l = (C11656l) obj;
        String str = c11656l.f23375l;
        String str2 = c11656l.f23374l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str2);
        }
        long j = c11656l.f23373l;
        if (j != 0) {
            AbstractC7532l.isPro.admob(c13161l, 2, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 3, str);
        }
        c13161l.m3586switch(c11656l.yandex());
    }
}
