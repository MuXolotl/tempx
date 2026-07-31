package defpackage;

/* JADX INFO: renamed from: lؖۜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4413l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C10434l c10434l = (C10434l) obj;
        String str = c10434l.f21250l;
        String str2 = c10434l.f21249l;
        String str3 = c10434l.f21247l;
        c1080l.m788class(c10434l.yandex());
        boolean z = c10434l.f21251l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 6, Boolean.valueOf(z));
        }
        boolean z2 = c10434l.f21248l;
        if (z2) {
            c16786l.subs(c1080l, 5, Boolean.valueOf(z2));
        }
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l2.subs(c1080l, 4, str3);
        }
        int i = c10434l.f21252l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 3, Integer.valueOf(i));
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l2.subs(c1080l, 2, str2);
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l2.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        String strSmaato3 = strSmaato2;
        int iIntValue = 0;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C10434l(strSmaato, strSmaato2, iIntValue, strSmaato3, zBooleanValue, zBooleanValue2, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            C16786l c16786l2 = AbstractC7532l.startapp;
            switch (iMopub) {
                case 1:
                    c16786l2.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 2:
                    c16786l2.getClass();
                    strSmaato2 = c7084l.smaato();
                    break;
                case 3:
                    iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
                    break;
                case 4:
                    c16786l2.getClass();
                    strSmaato3 = c7084l.smaato();
                    break;
                case 5:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 6:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C10434l c10434l = (C10434l) obj;
        String str = c10434l.f21247l;
        String str2 = c10434l.f21249l;
        int iPurchase = c10434l.yandex().purchase();
        String str3 = c10434l.f21250l;
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            iPurchase += c16786l.firebase(2, str2);
        }
        int i = c10434l.f21252l;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, AbstractC7532l.mopub, 3, iPurchase);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(4, str);
        }
        boolean z = c10434l.f21248l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l2, 5, iPurchase);
        }
        boolean z2 = c10434l.f21251l;
        return z2 ? AbstractC9029l.firebase(z2, c16786l2, 6, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C10434l c10434l = (C10434l) obj;
        String str = c10434l.f21247l;
        String str2 = c10434l.f21249l;
        String str3 = c10434l.f21250l;
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.admob(c13161l, 2, str2);
        }
        int i = c10434l.f21252l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 3, Integer.valueOf(i));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 4, str);
        }
        boolean z = c10434l.f21248l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            c16786l2.admob(c13161l, 5, Boolean.valueOf(z));
        }
        boolean z2 = c10434l.f21251l;
        if (z2) {
            c16786l2.admob(c13161l, 6, Boolean.valueOf(z2));
        }
        c13161l.m3586switch(c10434l.yandex());
    }
}
