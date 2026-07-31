package defpackage;

/* JADX INFO: renamed from: lٍٍۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9965l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C18482l c18482l = (C18482l) obj;
        String str = c18482l.f36100l;
        String str2 = c18482l.f36103l;
        String str3 = c18482l.f36095l;
        String str4 = c18482l.f36096l;
        String str5 = c18482l.f36102l;
        String str6 = c18482l.f36097l;
        c1080l.m788class(c18482l.yandex());
        C18413l c18413l = c18482l.f36098l;
        if (c18413l != null) {
            C18413l.f35957l.subs(c1080l, 12, c18413l);
        }
        C6771l c6771l = c18482l.f36105l;
        if (c6771l != null) {
            C6771l.f14190l.subs(c1080l, 11, c6771l);
        }
        C0318l c0318l = c18482l.f36094l;
        if (c0318l != null) {
            C0318l.f1363l.subs(c1080l, 10, c0318l);
        }
        EnumC10382l enumC10382l = c18482l.f36101l;
        if (enumC10382l != EnumC10382l.StockOrUnknown) {
            EnumC10382l.f21190l.subs(c1080l, 9, enumC10382l);
        }
        boolean z = c18482l.f36104l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 8, Boolean.valueOf(z));
        }
        boolean zYandex = AbstractC8576l.yandex(str6, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 7, str6);
        }
        if (!AbstractC8576l.yandex(str5, "")) {
            c16786l.subs(c1080l, 6, str5);
        }
        if (!AbstractC8576l.yandex(str4, "")) {
            c16786l.subs(c1080l, 5, str4);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            c16786l.subs(c1080l, 4, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.subs(c1080l, 3, str2);
        }
        int i = c18482l.f36099l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 2, Integer.valueOf(i));
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC10382l.StockOrUnknown;
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        String strSmaato3 = strSmaato2;
        String strSmaato4 = strSmaato3;
        String strSmaato5 = strSmaato4;
        int iIntValue = 0;
        boolean zBooleanValue = false;
        Object objCrashlytics2 = null;
        Object objCrashlytics3 = null;
        Object objCrashlytics4 = null;
        String strSmaato6 = strSmaato5;
        while (true) {
            Object obj = objCrashlytics;
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C18482l(strSmaato6, iIntValue, strSmaato, strSmaato2, strSmaato3, strSmaato4, strSmaato5, zBooleanValue, (EnumC10382l) obj, (C0318l) objCrashlytics2, (C6771l) objCrashlytics3, (C18413l) objCrashlytics4, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            switch (iMopub) {
                case 1:
                    c16786l.getClass();
                    strSmaato6 = c7084l.smaato();
                    objCrashlytics = obj;
                    break;
                case 2:
                    iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
                    objCrashlytics = obj;
                    break;
                case 3:
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                    objCrashlytics = obj;
                    break;
                case 4:
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                    objCrashlytics = obj;
                    break;
                case 5:
                    c16786l.getClass();
                    strSmaato3 = c7084l.smaato();
                    objCrashlytics = obj;
                    break;
                case 6:
                    c16786l.getClass();
                    strSmaato4 = c7084l.smaato();
                    objCrashlytics = obj;
                    break;
                case 7:
                    c16786l.getClass();
                    strSmaato5 = c7084l.smaato();
                    objCrashlytics = obj;
                    break;
                case 8:
                    zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
                    objCrashlytics = obj;
                    break;
                case 9:
                    try {
                        objCrashlytics = EnumC10382l.f21190l.crashlytics(c7084l);
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                        objCrashlytics = obj;
                        strSmaato6 = strSmaato6;
                        objCrashlytics2 = objCrashlytics2;
                    }
                    break;
                case 10:
                    objCrashlytics2 = C0318l.f1363l.crashlytics(c7084l);
                    objCrashlytics = obj;
                    break;
                case 11:
                    objCrashlytics3 = C6771l.f14190l.crashlytics(c7084l);
                    objCrashlytics = obj;
                    break;
                case 12:
                    objCrashlytics4 = C18413l.f35957l.crashlytics(c7084l);
                    objCrashlytics = obj;
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    objCrashlytics = obj;
                    strSmaato6 = strSmaato6;
                    objCrashlytics2 = objCrashlytics2;
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C18482l c18482l = (C18482l) obj;
        String str = c18482l.f36097l;
        String str2 = c18482l.f36102l;
        String str3 = c18482l.f36096l;
        String str4 = c18482l.f36095l;
        String str5 = c18482l.f36103l;
        int iPurchase = c18482l.yandex().purchase();
        String str6 = c18482l.f36100l;
        boolean zYandex = AbstractC8576l.yandex(str6, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str6);
        }
        int i = c18482l.f36099l;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, AbstractC7532l.mopub, 2, iPurchase);
        }
        if (!AbstractC8576l.yandex(str5, "")) {
            iPurchase += c16786l.firebase(3, str5);
        }
        if (!AbstractC8576l.yandex(str4, "")) {
            iPurchase += c16786l.firebase(4, str4);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            iPurchase += c16786l.firebase(5, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            iPurchase += c16786l.firebase(6, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(7, str);
        }
        boolean z = c18482l.f36104l;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, AbstractC7532l.billing, 8, iPurchase);
        }
        EnumC10382l enumC10382l = c18482l.f36101l;
        if (enumC10382l != EnumC10382l.StockOrUnknown) {
            iPurchase += EnumC10382l.f21190l.firebase(9, enumC10382l);
        }
        C0318l c0318l = c18482l.f36094l;
        if (c0318l != null) {
            iPurchase += C0318l.f1363l.firebase(10, c0318l);
        }
        C6771l c6771l = c18482l.f36105l;
        if (c6771l != null) {
            iPurchase += C6771l.f14190l.firebase(11, c6771l);
        }
        C18413l c18413l = c18482l.f36098l;
        return c18413l != null ? C18413l.f35957l.firebase(12, c18413l) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C18482l c18482l = (C18482l) obj;
        String str = c18482l.f36097l;
        String str2 = c18482l.f36102l;
        String str3 = c18482l.f36096l;
        String str4 = c18482l.f36095l;
        String str5 = c18482l.f36103l;
        String str6 = c18482l.f36100l;
        boolean zYandex = AbstractC8576l.yandex(str6, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str6);
        }
        int i = c18482l.f36099l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 2, Integer.valueOf(i));
        }
        if (!AbstractC8576l.yandex(str5, "")) {
            c16786l.admob(c13161l, 3, str5);
        }
        if (!AbstractC8576l.yandex(str4, "")) {
            c16786l.admob(c13161l, 4, str4);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            c16786l.admob(c13161l, 5, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.admob(c13161l, 6, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 7, str);
        }
        boolean z = c18482l.f36104l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 8, Boolean.valueOf(z));
        }
        EnumC10382l enumC10382l = c18482l.f36101l;
        if (enumC10382l != EnumC10382l.StockOrUnknown) {
            EnumC10382l.f21190l.admob(c13161l, 9, enumC10382l);
        }
        C0318l c0318l = c18482l.f36094l;
        if (c0318l != null) {
            C0318l.f1363l.admob(c13161l, 10, c0318l);
        }
        C6771l c6771l = c18482l.f36105l;
        if (c6771l != null) {
            C6771l.f14190l.admob(c13161l, 11, c6771l);
        }
        C18413l c18413l = c18482l.f36098l;
        if (c18413l != null) {
            C18413l.f35957l.admob(c13161l, 12, c18413l);
        }
        c13161l.m3586switch(c18482l.yandex());
    }
}
