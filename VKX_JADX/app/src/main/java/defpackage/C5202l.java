package defpackage;

/* JADX INFO: renamed from: lؗ۠ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5202l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        c1080l.m788class(((C15242l) obj).yandex());
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15242l(c7084l.purchase(jAmazon));
            }
            c7084l.remoteconfig(iMopub);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        return ((C15242l) obj).yandex().purchase();
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        c13161l.m3586switch(((C15242l) obj).yandex());
    }
}
