package defpackage;

/* JADX INFO: renamed from: lّٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12621l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15589l c15589l = (C15589l) obj;
        String str = c15589l.f30436l;
        String str2 = c15589l.f30435l;
        c1080l.m788class(c15589l.yandex());
        EnumC1496l enumC1496l = c15589l.f30434l;
        if (enumC1496l != EnumC1496l.f3744l) {
            EnumC1496l.f3745l.subs(c1080l, 4, enumC1496l);
        }
        int i = c15589l.f30437l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 3, Integer.valueOf(i));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 2, str2);
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC1496l.f3744l;
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        int iIntValue = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15589l(strSmaato, strSmaato2, iIntValue, (EnumC1496l) objCrashlytics, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            if (iMopub == 1) {
                c16786l.getClass();
                strSmaato = c7084l.smaato();
            } else if (iMopub == 2) {
                c16786l.getClass();
                strSmaato2 = c7084l.smaato();
            } else if (iMopub == 3) {
                iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            } else if (iMopub != 4) {
                c7084l.remoteconfig(iMopub);
            } else {
                try {
                    objCrashlytics = EnumC1496l.f3745l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15589l c15589l = (C15589l) obj;
        String str = c15589l.f30435l;
        int iPurchase = c15589l.yandex().purchase();
        String str2 = c15589l.f30436l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(2, str);
        }
        int i = c15589l.f30437l;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, AbstractC7532l.mopub, 3, iPurchase);
        }
        EnumC1496l enumC1496l = c15589l.f30434l;
        return enumC1496l != EnumC1496l.f3744l ? EnumC1496l.f3745l.firebase(4, enumC1496l) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15589l c15589l = (C15589l) obj;
        String str = c15589l.f30435l;
        String str2 = c15589l.f30436l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 2, str);
        }
        int i = c15589l.f30437l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 3, Integer.valueOf(i));
        }
        EnumC1496l enumC1496l = c15589l.f30434l;
        if (enumC1496l != EnumC1496l.f3744l) {
            EnumC1496l.f3745l.admob(c13161l, 4, enumC1496l);
        }
        c13161l.m3586switch(c15589l.yandex());
    }
}
