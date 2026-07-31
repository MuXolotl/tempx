package defpackage;

/* JADX INFO: renamed from: lٟؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3814l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C2729l c2729l = (C2729l) obj;
        String str = c2729l.f5924l;
        c1080l.m788class(c2729l.yandex());
        String str2 = c2729l.f5926l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 6, str2);
        }
        long j = c2729l.f5923l;
        C16786l c16786l2 = AbstractC7532l.firebase;
        if (j != 0) {
            c16786l2.subs(c1080l, 5, Long.valueOf(j));
        }
        long j2 = c2729l.f5922l;
        if (j2 != 0) {
            c16786l2.subs(c1080l, 4, Long.valueOf(j2));
        }
        boolean z = c2729l.f5927l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 3, Boolean.valueOf(z));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 2, str);
        }
        long j3 = c2729l.f5925l;
        if (j3 != 0) {
            c16786l2.subs(c1080l, 1, Long.valueOf(j3));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        long jLongValue2 = 0;
        long jLongValue3 = 0;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        boolean zBooleanValue = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C2729l(jLongValue, strSmaato, zBooleanValue, jLongValue2, jLongValue3, strSmaato2, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            C16786l c16786l2 = AbstractC7532l.firebase;
            switch (iMopub) {
                case 1:
                    jLongValue = ((Number) c16786l2.crashlytics(c7084l)).longValue();
                    break;
                case 2:
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 3:
                    zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
                    break;
                case 4:
                    jLongValue2 = ((Number) c16786l2.crashlytics(c7084l)).longValue();
                    break;
                case 5:
                    jLongValue3 = ((Number) c16786l2.crashlytics(c7084l)).longValue();
                    break;
                case 6:
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C2729l c2729l = (C2729l) obj;
        String str = c2729l.f5926l;
        String str2 = c2729l.f5924l;
        int iPurchase = c2729l.yandex().purchase();
        long j = c2729l.f5925l;
        C16786l c16786l = AbstractC7532l.firebase;
        if (j != 0) {
            iPurchase += c16786l.firebase(1, Long.valueOf(j));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l2.firebase(2, str2);
        }
        boolean z = c2729l.f5927l;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, AbstractC7532l.billing, 3, iPurchase);
        }
        long j2 = c2729l.f5922l;
        if (j2 != 0) {
            iPurchase += c16786l.firebase(4, Long.valueOf(j2));
        }
        long j3 = c2729l.f5923l;
        if (j3 != 0) {
            iPurchase += c16786l.firebase(5, Long.valueOf(j3));
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l2.firebase(6, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C2729l c2729l = (C2729l) obj;
        String str = c2729l.f5926l;
        String str2 = c2729l.f5924l;
        long j = c2729l.f5925l;
        C16786l c16786l = AbstractC7532l.firebase;
        if (j != 0) {
            c16786l.admob(c13161l, 1, Long.valueOf(j));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l2.admob(c13161l, 2, str2);
        }
        boolean z = c2729l.f5927l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 3, Boolean.valueOf(z));
        }
        long j2 = c2729l.f5922l;
        if (j2 != 0) {
            c16786l.admob(c13161l, 4, Long.valueOf(j2));
        }
        long j3 = c2729l.f5923l;
        if (j3 != 0) {
            c16786l.admob(c13161l, 5, Long.valueOf(j3));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l2.admob(c13161l, 6, str);
        }
        c13161l.m3586switch(c2729l.yandex());
    }
}
