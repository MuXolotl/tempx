package defpackage;

/* JADX INFO: renamed from: lًٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C8011l extends AbstractC4350l {
    public static final C9912l crashlytics = new C9912l(5);
    public final C18152l loadAd = new C18152l(0);

    @Override // defpackage.AbstractC4350l
    public final void loadAd() {
        C18152l c18152l = this.loadAd;
        int i = c18152l.f35537l;
        if (i > 0) {
            c18152l.billing(0).getClass();
            C18725l.loadAd();
            return;
        }
        Object[] objArr = c18152l.f35538l;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c18152l.f35537l = 0;
    }
}
