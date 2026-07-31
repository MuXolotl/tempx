package defpackage;

/* JADX INFO: renamed from: lؙِؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6210l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C0247l c0247l = (C0247l) obj;
        String str = c0247l.f1243l;
        String str2 = c0247l.f1242l;
        String str3 = c0247l.f1245l;
        c1080l.m788class(c0247l.yandex());
        int i = c0247l.f1241l;
        if (i != 0) {
            AbstractC7532l.admob.subs(c1080l, 7, Integer.valueOf(i));
        }
        boolean z = c0247l.f1244l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 6, Boolean.valueOf(z));
        }
        boolean z2 = c0247l.f1240l;
        if (z2) {
            c16786l.subs(c1080l, 5, Boolean.valueOf(z2));
        }
        boolean z3 = c0247l.f1239l;
        if (z3) {
            c16786l.subs(c1080l, 4, Boolean.valueOf(z3));
        }
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l2.subs(c1080l, 3, str3);
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
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        int iIntValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C0247l(strSmaato, strSmaato2, strSmaato3, zBooleanValue, zBooleanValue2, zBooleanValue3, iIntValue, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            C16786l c16786l2 = AbstractC7532l.billing;
            switch (iMopub) {
                case 1:
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 2:
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                    break;
                case 3:
                    c16786l.getClass();
                    strSmaato3 = c7084l.smaato();
                    break;
                case 4:
                    zBooleanValue = ((Boolean) c16786l2.crashlytics(c7084l)).booleanValue();
                    break;
                case 5:
                    zBooleanValue2 = ((Boolean) c16786l2.crashlytics(c7084l)).booleanValue();
                    break;
                case 6:
                    zBooleanValue3 = ((Boolean) c16786l2.crashlytics(c7084l)).booleanValue();
                    break;
                case 7:
                    iIntValue = ((Number) AbstractC7532l.admob.crashlytics(c7084l)).intValue();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C0247l c0247l = (C0247l) obj;
        String str = c0247l.f1245l;
        String str2 = c0247l.f1242l;
        int iPurchase = c0247l.yandex().purchase();
        String str3 = c0247l.f1243l;
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            iPurchase += c16786l.firebase(2, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(3, str);
        }
        boolean z = c0247l.f1239l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l2, 4, iPurchase);
        }
        boolean z2 = c0247l.f1240l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l2, 5, iPurchase);
        }
        boolean z3 = c0247l.f1244l;
        if (z3) {
            iPurchase = AbstractC9029l.firebase(z3, c16786l2, 6, iPurchase);
        }
        int i = c0247l.f1241l;
        if (i == 0) {
            return iPurchase;
        }
        return AbstractC7532l.admob.firebase(7, Integer.valueOf(i)) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C0247l c0247l = (C0247l) obj;
        String str = c0247l.f1245l;
        String str2 = c0247l.f1242l;
        String str3 = c0247l.f1243l;
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.admob(c13161l, 2, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 3, str);
        }
        boolean z = c0247l.f1239l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            c16786l2.admob(c13161l, 4, Boolean.valueOf(z));
        }
        boolean z2 = c0247l.f1240l;
        if (z2) {
            c16786l2.admob(c13161l, 5, Boolean.valueOf(z2));
        }
        boolean z3 = c0247l.f1244l;
        if (z3) {
            c16786l2.admob(c13161l, 6, Boolean.valueOf(z3));
        }
        int i = c0247l.f1241l;
        if (i != 0) {
            AbstractC7532l.admob.admob(c13161l, 7, Integer.valueOf(i));
        }
        c13161l.m3586switch(c0247l.yandex());
    }
}
