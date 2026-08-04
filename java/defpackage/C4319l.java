package defpackage;

/* JADX INFO: renamed from: lؖۖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4319l extends C9548l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C4319l f8858l = new C4319l();

    @Override // defpackage.AbstractC2426l, defpackage.InterfaceC11126l
    public final boolean loadAd(C10915l c10915l, C10915l c10915l2) {
        if (c10915l.f22039l.length == c10915l2.f22039l.length) {
            C16138l[] c16138lArrAds = c10915l.ads();
            C16138l[] c16138lArrAds2 = c10915l2.ads();
            for (int i = 0; i != c16138lArrAds.length; i++) {
                if (AbstractC11342l.admob(c16138lArrAds[i], c16138lArrAds2[i])) {
                }
            }
            return true;
        }
        return false;
    }
}
