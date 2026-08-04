package defpackage;

/* JADX INFO: renamed from: lَُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7187l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C11193l c11193l = (C11193l) obj;
        c1080l.m788class(c11193l.yandex());
        int i = c11193l.f22547l;
        C16786l c16786l = AbstractC7532l.mopub;
        if (i != 0) {
            c16786l.subs(c1080l, 2, Integer.valueOf(i));
        }
        int i2 = c11193l.f22548l;
        if (i2 != 0) {
            c16786l.subs(c1080l, 1, Integer.valueOf(i2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C11193l(iIntValue, iIntValue2, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.mopub;
            if (iMopub == 1) {
                iIntValue = ((Number) c16786l.crashlytics(c7084l)).intValue();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                iIntValue2 = ((Number) c16786l.crashlytics(c7084l)).intValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C11193l c11193l = (C11193l) obj;
        int iPurchase = c11193l.yandex().purchase();
        int i = c11193l.f22548l;
        C16786l c16786l = AbstractC7532l.mopub;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, c16786l, 1, iPurchase);
        }
        int i2 = c11193l.f22547l;
        return i2 != 0 ? AbstractC9029l.isPro(i2, c16786l, 2, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C11193l c11193l = (C11193l) obj;
        int i = c11193l.f22548l;
        C16786l c16786l = AbstractC7532l.mopub;
        if (i != 0) {
            c16786l.admob(c13161l, 1, Integer.valueOf(i));
        }
        int i2 = c11193l.f22547l;
        if (i2 != 0) {
            c16786l.admob(c13161l, 2, Integer.valueOf(i2));
        }
        c13161l.m3586switch(c11193l.yandex());
    }
}
