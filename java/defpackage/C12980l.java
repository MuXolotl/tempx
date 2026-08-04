package defpackage;

/* JADX INFO: renamed from: lّۥۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12980l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C9024l c9024l = (C9024l) obj;
        c1080l.m788class(c9024l.yandex());
        C2729l.f5921l.subs(c1080l, 2, c9024l.f18584l);
        C15968l.f31336l.subs(c1080l, 1, c9024l.f18585l);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        Object objCrashlytics2 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C9024l((C15968l) objCrashlytics, (C2729l) objCrashlytics2, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                objCrashlytics = C15968l.f31336l.crashlytics(c7084l);
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                objCrashlytics2 = C2729l.f5921l.crashlytics(c7084l);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C9024l c9024l = (C9024l) obj;
        return C2729l.f5921l.firebase(2, c9024l.f18584l) + C15968l.f31336l.firebase(1, c9024l.f18585l) + c9024l.yandex().purchase();
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C9024l c9024l = (C9024l) obj;
        C15968l.f31336l.admob(c13161l, 1, c9024l.f18585l);
        C2729l.f5921l.admob(c13161l, 2, c9024l.f18584l);
        c13161l.m3586switch(c9024l.yandex());
    }
}
