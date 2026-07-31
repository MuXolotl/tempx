package defpackage;

/* JADX INFO: renamed from: lؘُٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16319l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C3259l c3259l = (C3259l) obj;
        String str = c3259l.f6984l;
        String str2 = c3259l.f6979l;
        String str3 = c3259l.f6980l;
        c1080l.m788class(c3259l.yandex());
        EnumC3503l enumC3503l = c3259l.f6983l;
        if (enumC3503l != EnumC3503l.BLUR_ARTWORK) {
            EnumC3503l.f7397l.subs(c1080l, 6, enumC3503l);
        }
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 5, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.subs(c1080l, 4, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 3, str);
        }
        boolean z = c3259l.f6981l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            c16786l2.subs(c1080l, 2, Boolean.valueOf(z));
        }
        boolean z2 = c3259l.f6982l;
        if (z2) {
            c16786l2.subs(c1080l, 1, Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC3503l.BLUR_ARTWORK;
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        String strSmaato3 = strSmaato2;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C3259l(zBooleanValue, zBooleanValue2, strSmaato, strSmaato2, strSmaato3, (EnumC3503l) objCrashlytics, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            C16786l c16786l2 = AbstractC7532l.startapp;
            switch (iMopub) {
                case 1:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 2:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
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
                    try {
                        objCrashlytics = EnumC3503l.f7397l.crashlytics(c7084l);
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                    }
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C3259l c3259l = (C3259l) obj;
        String str = c3259l.f6980l;
        String str2 = c3259l.f6979l;
        String str3 = c3259l.f6984l;
        int iPurchase = c3259l.yandex().purchase();
        boolean z = c3259l.f6982l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 1, iPurchase);
        }
        boolean z2 = c3259l.f6981l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l, 2, iPurchase);
        }
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l2.firebase(3, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            iPurchase += c16786l2.firebase(4, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l2.firebase(5, str);
        }
        EnumC3503l enumC3503l = c3259l.f6983l;
        return enumC3503l != EnumC3503l.BLUR_ARTWORK ? EnumC3503l.f7397l.firebase(6, enumC3503l) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C3259l c3259l = (C3259l) obj;
        String str = c3259l.f6980l;
        String str2 = c3259l.f6979l;
        String str3 = c3259l.f6984l;
        boolean z = c3259l.f6982l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 1, Boolean.valueOf(z));
        }
        boolean z2 = c3259l.f6981l;
        if (z2) {
            c16786l.admob(c13161l, 2, Boolean.valueOf(z2));
        }
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l2.admob(c13161l, 3, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l2.admob(c13161l, 4, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l2.admob(c13161l, 5, str);
        }
        EnumC3503l enumC3503l = c3259l.f6983l;
        if (enumC3503l != EnumC3503l.BLUR_ARTWORK) {
            EnumC3503l.f7397l.admob(c13161l, 6, enumC3503l);
        }
        c13161l.m3586switch(c3259l.yandex());
    }
}
