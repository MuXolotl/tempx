package defpackage;

/* JADX INFO: renamed from: lؗۖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5087l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C6170l c6170l = (C6170l) obj;
        String str = c6170l.f13008l;
        String str2 = c6170l.f13009l;
        c1080l.m788class(c6170l.yandex());
        boolean z = c6170l.f13012l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 6, Boolean.valueOf(z));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 5, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 4, str);
        }
        c16786l.subs(c1080l, 3, c6170l.f13013l);
        long j = c6170l.f13010l;
        C16786l c16786l2 = AbstractC7532l.isPro;
        if (j != 0) {
            c16786l2.subs(c1080l, 2, Long.valueOf(j));
        }
        long j2 = c6170l.f13011l;
        if (j2 != 0) {
            c16786l2.subs(c1080l, 1, Long.valueOf(j2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        long jLongValue2 = 0;
        String strSmaato = null;
        String strSmaato2 = "";
        String strSmaato3 = strSmaato2;
        boolean zBooleanValue = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C6170l(jLongValue, jLongValue2, strSmaato, strSmaato2, strSmaato3, zBooleanValue, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.isPro;
            C16786l c16786l2 = AbstractC7532l.startapp;
            switch (iMopub) {
                case 1:
                    jLongValue = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    break;
                case 2:
                    jLongValue2 = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    break;
                case 3:
                    c16786l2.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 4:
                    c16786l2.getClass();
                    strSmaato2 = c7084l.smaato();
                    break;
                case 5:
                    c16786l2.getClass();
                    strSmaato3 = c7084l.smaato();
                    break;
                case 6:
                    zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C6170l c6170l = (C6170l) obj;
        String str = c6170l.f13009l;
        String str2 = c6170l.f13008l;
        int iPurchase = c6170l.yandex().purchase();
        long j = c6170l.f13011l;
        C16786l c16786l = AbstractC7532l.isPro;
        if (j != 0) {
            iPurchase += c16786l.firebase(1, Long.valueOf(j));
        }
        long j2 = c6170l.f13010l;
        if (j2 != 0) {
            iPurchase += c16786l.firebase(2, Long.valueOf(j2));
        }
        String str3 = c6170l.f13013l;
        C16786l c16786l2 = AbstractC7532l.startapp;
        int iFirebase = c16786l2.firebase(3, str3) + iPurchase;
        if (!AbstractC8576l.yandex(str2, "")) {
            iFirebase += c16786l2.firebase(4, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iFirebase += c16786l2.firebase(5, str);
        }
        boolean z = c6170l.f13012l;
        return z ? AbstractC9029l.firebase(z, AbstractC7532l.billing, 6, iFirebase) : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C6170l c6170l = (C6170l) obj;
        String str = c6170l.f13009l;
        String str2 = c6170l.f13008l;
        long j = c6170l.f13011l;
        C16786l c16786l = AbstractC7532l.isPro;
        if (j != 0) {
            c16786l.admob(c13161l, 1, Long.valueOf(j));
        }
        long j2 = c6170l.f13010l;
        if (j2 != 0) {
            c16786l.admob(c13161l, 2, Long.valueOf(j2));
        }
        String str3 = c6170l.f13013l;
        C16786l c16786l2 = AbstractC7532l.startapp;
        c16786l2.admob(c13161l, 3, str3);
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l2.admob(c13161l, 4, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l2.admob(c13161l, 5, str);
        }
        boolean z = c6170l.f13012l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 6, Boolean.valueOf(z));
        }
        c13161l.m3586switch(c6170l.yandex());
    }
}
