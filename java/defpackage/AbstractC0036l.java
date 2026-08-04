package defpackage;

/* JADX INFO: renamed from: lؚؑؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0036l extends AbstractC16178l {
    public static final C5837l crashlytics = new C5837l(0);
    public static final C5837l amazon = new C5837l(1);
    public static final C5837l purchase = new C5837l(2);
    public static final C3419l billing = new C3419l();
    public static final C5837l mopub = new C5837l(3);
    public static final C5837l admob = new C5837l(4);
    public static final C5837l subs = new C5837l(5);
    public static final C15198l isPro = new C15198l();

    public abstract void purchase(C7972l c7972l, C9173l c9173l);

    @Override // defpackage.AbstractC16178l, defpackage.InterfaceC7922l
    public final void yandex(C7972l c7972l, C2434l c2434l) {
        C9173l c9173l = c2434l.loadAd;
        if (c9173l != null) {
            purchase(c7972l, c9173l);
        }
    }
}
