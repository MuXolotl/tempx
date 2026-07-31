package defpackage;

/* JADX INFO: renamed from: lٍِۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12274l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15507l c15507l = (C15507l) obj;
        String str = c15507l.f30310l;
        c1080l.m788class(c15507l.yandex());
        String str2 = c15507l.f30307l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 4, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 3, str);
        }
        EnumC6418l enumC6418l = c15507l.f30308l;
        if (enumC6418l != EnumC6418l.Verbose) {
            EnumC6418l.f13431l.subs(c1080l, 2, enumC6418l);
        }
        long j = c15507l.f30309l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC6418l.Verbose;
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        while (true) {
            long j = jLongValue;
            while (true) {
                int iMopub = c7084l.mopub();
                if (iMopub == -1) {
                    return new C15507l(j, (EnumC6418l) objCrashlytics, strSmaato, strSmaato2, c7084l.purchase(jAmazon));
                }
                if (iMopub != 1) {
                    if (iMopub != 2) {
                        C16786l c16786l = AbstractC7532l.startapp;
                        if (iMopub == 3) {
                            c16786l.getClass();
                            strSmaato = c7084l.smaato();
                        } else if (iMopub != 4) {
                            c7084l.remoteconfig(iMopub);
                        } else {
                            c16786l.getClass();
                            strSmaato2 = c7084l.smaato();
                        }
                    } else {
                        try {
                            objCrashlytics = EnumC6418l.f13431l.crashlytics(c7084l);
                        } catch (C12016l e) {
                            c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                        }
                    }
                }
            }
            jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15507l c15507l = (C15507l) obj;
        String str = c15507l.f30307l;
        String str2 = c15507l.f30310l;
        int iPurchase = c15507l.yandex().purchase();
        long j = c15507l.f30309l;
        if (j != 0) {
            iPurchase += AbstractC7532l.firebase.firebase(1, Long.valueOf(j));
        }
        EnumC6418l enumC6418l = c15507l.f30308l;
        if (enumC6418l != EnumC6418l.Verbose) {
            iPurchase += EnumC6418l.f13431l.firebase(2, enumC6418l);
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(3, str2);
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l.firebase(4, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15507l c15507l = (C15507l) obj;
        String str = c15507l.f30307l;
        String str2 = c15507l.f30310l;
        long j = c15507l.f30309l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 1, Long.valueOf(j));
        }
        EnumC6418l enumC6418l = c15507l.f30308l;
        if (enumC6418l != EnumC6418l.Verbose) {
            EnumC6418l.f13431l.admob(c13161l, 2, enumC6418l);
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 3, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 4, str);
        }
        c13161l.m3586switch(c15507l.yandex());
    }
}
