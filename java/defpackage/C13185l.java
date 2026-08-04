package defpackage;

/* JADX INFO: renamed from: lؙْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13185l extends AbstractC15076l {
    public static final AbstractC15076l billing;
    public static final AbstractC15076l purchase;

    static {
        AbstractC15076l abstractC15076lLoadAd = new C13185l(null, new C5128l(0)).loadAd();
        purchase = abstractC15076lLoadAd;
        C13185l c13185l = new C13185l(abstractC15076lLoadAd, new C5128l(0));
        boolean z = !c13185l.crashlytics;
        Boolean bool = Boolean.TRUE;
        AbstractC12442l.ads("Can't mutate after handing to trace", z);
        AbstractC12442l.ads("Key already present", !c13185l.crashlytics());
        c13185l.loadAd.put(AbstractC15076l.amazon, bool);
        billing = c13185l.loadAd();
    }
}
