package defpackage;

/* JADX INFO: renamed from: lؘٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5679l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C18413l c18413l = (C18413l) obj;
        String str = c18413l.f35959l;
        c1080l.m788class(c18413l.yandex());
        String str2 = c18413l.f35958l;
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
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        String strSmaato2 = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C18413l(strSmaato, strSmaato2, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            if (iMopub == 1) {
                c16786l.getClass();
                strSmaato = c7084l.smaato();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                c16786l.getClass();
                strSmaato2 = c7084l.smaato();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C18413l c18413l = (C18413l) obj;
        String str = c18413l.f35958l;
        int iPurchase = c18413l.yandex().purchase();
        String str2 = c18413l.f35959l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str2);
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l.firebase(2, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C18413l c18413l = (C18413l) obj;
        String str = c18413l.f35958l;
        String str2 = c18413l.f35959l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 2, str);
        }
        c13161l.m3586switch(c18413l.yandex());
    }
}
