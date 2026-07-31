package defpackage;

/* JADX INFO: renamed from: lٍٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17007l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C18031l c18031l = (C18031l) obj;
        c1080l.m788class(c18031l.yandex());
        String str = c18031l.f35315l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 2, str);
        }
        long j = c18031l.f35316l;
        if (j != 0) {
            AbstractC7532l.isPro.subs(c1080l, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        String strSmaato = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C18031l(jLongValue, strSmaato, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                jLongValue = ((Number) AbstractC7532l.isPro.crashlytics(c7084l)).longValue();
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
        C18031l c18031l = (C18031l) obj;
        String str = c18031l.f35315l;
        int iPurchase = c18031l.yandex().purchase();
        long j = c18031l.f35316l;
        if (j != 0) {
            iPurchase += AbstractC7532l.isPro.firebase(1, Long.valueOf(j));
        }
        return !AbstractC8576l.yandex(str, "") ? AbstractC7532l.startapp.firebase(2, str) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C18031l c18031l = (C18031l) obj;
        String str = c18031l.f35315l;
        long j = c18031l.f35316l;
        if (j != 0) {
            AbstractC7532l.isPro.admob(c13161l, 1, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 2, str);
        }
        c13161l.m3586switch(c18031l.yandex());
    }
}
