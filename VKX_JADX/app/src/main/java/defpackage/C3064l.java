package defpackage;

/* JADX INFO: renamed from: lَؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3064l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C6555l c6555l = (C6555l) obj;
        String str = c6555l.f13688l;
        String str2 = c6555l.f13686l;
        c1080l.m788class(c6555l.yandex());
        boolean z = c6555l.f13687l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 5, Boolean.valueOf(z));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 4, str2);
        }
        long j = c6555l.f13690l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 3, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 2, str);
        }
        int i = c6555l.f13689l;
        if (i != 0) {
            AbstractC7532l.admob.subs(c1080l, 1, Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        int iIntValue = 0;
        boolean zBooleanValue = false;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        long jLongValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C6555l(iIntValue, strSmaato, jLongValue, strSmaato2, zBooleanValue, c7084l.purchase(jAmazon));
            }
            if (iMopub != 1) {
                C16786l c16786l = AbstractC7532l.startapp;
                if (iMopub == 2) {
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                } else if (iMopub == 3) {
                    jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
                } else if (iMopub == 4) {
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                } else if (iMopub != 5) {
                    c7084l.remoteconfig(iMopub);
                } else {
                    zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
                }
            } else {
                iIntValue = ((Number) AbstractC7532l.admob.crashlytics(c7084l)).intValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C6555l c6555l = (C6555l) obj;
        String str = c6555l.f13686l;
        String str2 = c6555l.f13688l;
        int iPurchase = c6555l.yandex().purchase();
        int i = c6555l.f13689l;
        if (i != 0) {
            iPurchase += AbstractC7532l.admob.firebase(1, Integer.valueOf(i));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(2, str2);
        }
        long j = c6555l.f13690l;
        if (j != 0) {
            iPurchase += AbstractC7532l.firebase.firebase(3, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(4, str);
        }
        boolean z = c6555l.f13687l;
        return z ? AbstractC9029l.firebase(z, AbstractC7532l.billing, 5, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C6555l c6555l = (C6555l) obj;
        String str = c6555l.f13686l;
        String str2 = c6555l.f13688l;
        int i = c6555l.f13689l;
        if (i != 0) {
            AbstractC7532l.admob.admob(c13161l, 1, Integer.valueOf(i));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 2, str2);
        }
        long j = c6555l.f13690l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 3, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 4, str);
        }
        boolean z = c6555l.f13687l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 5, Boolean.valueOf(z));
        }
        c13161l.m3586switch(c6555l.yandex());
    }
}
