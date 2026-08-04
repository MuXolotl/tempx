package defpackage;

/* JADX INFO: renamed from: lٗٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17243l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C6771l c6771l = (C6771l) obj;
        c1080l.m788class(c6771l.yandex());
        String str = c6771l.f14191l;
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        AbstractC7532l.startapp.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C6771l(c7084l.purchase(jAmazon), strSmaato);
            }
            if (iMopub == 1) {
                AbstractC7532l.startapp.getClass();
                strSmaato = c7084l.smaato();
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C6771l c6771l = (C6771l) obj;
        int iPurchase = c6771l.yandex().purchase();
        String str = c6771l.f14191l;
        return !AbstractC8576l.yandex(str, "") ? AbstractC7532l.startapp.firebase(1, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C6771l c6771l = (C6771l) obj;
        String str = c6771l.f14191l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 1, str);
        }
        c13161l.m3586switch(c6771l.yandex());
    }
}
