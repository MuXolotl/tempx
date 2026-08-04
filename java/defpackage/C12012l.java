package defpackage;

/* JADX INFO: renamed from: lِِٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12012l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C3039l c3039l = (C3039l) obj;
        c1080l.m788class(c3039l.yandex());
        String str = c3039l.f6556l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 2, str);
        }
        int i = c3039l.f6557l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 1, Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        int iIntValue = 0;
        String strSmaato = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C3039l(iIntValue, strSmaato, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                AbstractC7532l.startapp.getClass();
                strSmaato = c7084l.smaato();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C3039l c3039l = (C3039l) obj;
        String str = c3039l.f6556l;
        int iPurchase = c3039l.yandex().purchase();
        int i = c3039l.f6557l;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, AbstractC7532l.mopub, 1, iPurchase);
        }
        return !AbstractC8576l.yandex(str, "") ? AbstractC7532l.startapp.firebase(2, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C3039l c3039l = (C3039l) obj;
        String str = c3039l.f6556l;
        int i = c3039l.f6557l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 1, Integer.valueOf(i));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 2, str);
        }
        c13161l.m3586switch(c3039l.yandex());
    }
}
