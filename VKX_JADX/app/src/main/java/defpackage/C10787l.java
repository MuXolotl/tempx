package defpackage;

/* JADX INFO: renamed from: lَُؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10787l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C18508l c18508l = (C18508l) obj;
        String str = c18508l.f36133l;
        c1080l.m788class(c18508l.yandex());
        String str2 = c18508l.f36135l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 3, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 2, str);
        }
        EnumC13595l enumC13595l = c18508l.f36134l;
        if (enumC13595l != EnumC13595l.OPEN_URL) {
            EnumC13595l.f26611l.subs(c1080l, 1, enumC13595l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC13595l.OPEN_URL;
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        String strSmaato2 = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C18508l((EnumC13595l) objCrashlytics, strSmaato, strSmaato2, c7084l.purchase(jAmazon));
            }
            if (iMopub != 1) {
                C16786l c16786l = AbstractC7532l.startapp;
                if (iMopub == 2) {
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                } else if (iMopub != 3) {
                    c7084l.remoteconfig(iMopub);
                } else {
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                }
            } else {
                try {
                    objCrashlytics = EnumC13595l.f26611l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C18508l c18508l = (C18508l) obj;
        String str = c18508l.f36135l;
        String str2 = c18508l.f36133l;
        int iPurchase = c18508l.yandex().purchase();
        EnumC13595l enumC13595l = c18508l.f36134l;
        if (enumC13595l != EnumC13595l.OPEN_URL) {
            iPurchase += EnumC13595l.f26611l.firebase(1, enumC13595l);
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(2, str2);
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l.firebase(3, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C18508l c18508l = (C18508l) obj;
        String str = c18508l.f36135l;
        String str2 = c18508l.f36133l;
        EnumC13595l enumC13595l = c18508l.f36134l;
        if (enumC13595l != EnumC13595l.OPEN_URL) {
            EnumC13595l.f26611l.admob(c13161l, 1, enumC13595l);
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 2, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 3, str);
        }
        c13161l.m3586switch(c18508l.yandex());
    }
}
