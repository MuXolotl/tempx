package defpackage;

/* JADX INFO: renamed from: lؚؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1681l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C1682l c1682l = (C1682l) obj;
        String str = c1682l.f4048l;
        String str2 = c1682l.f4050l;
        String str3 = c1682l.f4046l;
        c1080l.m788class(c1682l.yandex());
        String str4 = c1682l.f4049l;
        boolean zYandex = AbstractC8576l.yandex(str4, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 6, str4);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            c16786l.subs(c1080l, 5, str3);
        }
        int i = c1682l.f4045l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 4, Integer.valueOf(i));
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.subs(c1080l, 3, str2);
        }
        EnumC16913l enumC16913l = c1682l.f4047l;
        if (enumC16913l != EnumC16913l.SOCKS5) {
            EnumC16913l.f32984l.subs(c1080l, 2, enumC16913l);
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC16913l.SOCKS5;
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        String strSmaato3 = strSmaato2;
        String strSmaato4 = strSmaato3;
        int iIntValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C1682l(strSmaato, (EnumC16913l) objCrashlytics, strSmaato2, iIntValue, strSmaato3, strSmaato4, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            switch (iMopub) {
                case 1:
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 2:
                    try {
                        objCrashlytics = EnumC16913l.f32984l.crashlytics(c7084l);
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                    }
                    break;
                case 3:
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                    break;
                case 4:
                    iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
                    break;
                case 5:
                    c16786l.getClass();
                    strSmaato3 = c7084l.smaato();
                    break;
                case 6:
                    c16786l.getClass();
                    strSmaato4 = c7084l.smaato();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C1682l c1682l = (C1682l) obj;
        String str = c1682l.f4049l;
        String str2 = c1682l.f4046l;
        String str3 = c1682l.f4050l;
        int iPurchase = c1682l.yandex().purchase();
        String str4 = c1682l.f4048l;
        boolean zYandex = AbstractC8576l.yandex(str4, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str4);
        }
        EnumC16913l enumC16913l = c1682l.f4047l;
        if (enumC16913l != EnumC16913l.SOCKS5) {
            iPurchase += EnumC16913l.f32984l.firebase(2, enumC16913l);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            iPurchase += c16786l.firebase(3, str3);
        }
        int i = c1682l.f4045l;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, AbstractC7532l.mopub, 4, iPurchase);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            iPurchase += c16786l.firebase(5, str2);
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l.firebase(6, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C1682l c1682l = (C1682l) obj;
        String str = c1682l.f4049l;
        String str2 = c1682l.f4046l;
        String str3 = c1682l.f4050l;
        String str4 = c1682l.f4048l;
        boolean zYandex = AbstractC8576l.yandex(str4, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str4);
        }
        EnumC16913l enumC16913l = c1682l.f4047l;
        if (enumC16913l != EnumC16913l.SOCKS5) {
            EnumC16913l.f32984l.admob(c13161l, 2, enumC16913l);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            c16786l.admob(c13161l, 3, str3);
        }
        int i = c1682l.f4045l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 4, Integer.valueOf(i));
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.admob(c13161l, 5, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 6, str);
        }
        c13161l.m3586switch(c1682l.yandex());
    }
}
