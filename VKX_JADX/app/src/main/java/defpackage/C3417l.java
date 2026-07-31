package defpackage;

/* JADX INFO: renamed from: lٕؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3417l {
    public static C3417l admob;
    public final InterfaceC16061l amazon;
    public final C15294l crashlytics;
    public final C11090l loadAd;
    public final C11090l purchase;
    public final EnumC9931l yandex;
    public float billing = Float.NaN;
    public float mopub = Float.NaN;

    public C3417l(EnumC9931l enumC9931l, C11090l c11090l, C15294l c15294l, InterfaceC16061l interfaceC16061l) {
        this.yandex = enumC9931l;
        this.loadAd = c11090l;
        this.crashlytics = c15294l;
        this.amazon = interfaceC16061l;
        this.purchase = AbstractC7709l.crashlytics(c11090l, enumC9931l);
    }

    public final long yandex(int i, long j) {
        int iSubs;
        float f = this.mopub;
        float f2 = this.billing;
        int i2 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = AbstractC4558l.yandex;
            C11090l c11090l = this.purchase;
            C2580l c2580l = C2580l.f5619l;
            InterfaceC16061l interfaceC16061l = this.amazon;
            C15294l c15294l = this.crashlytics;
            float fSubs = new C7546l(new C14442l(str, c11090l, c2580l, c2580l, interfaceC16061l, c15294l), 1, 1, AbstractC7563l.loadAd(0, 0, 0, 0, 15)).subs();
            i2 = 1;
            float fSubs2 = new C7546l(new C14442l(AbstractC4558l.loadAd, this.purchase, c2580l, c2580l, this.amazon, c15294l), 2, 1, AbstractC7563l.loadAd(0, 0, 0, 0, 15)).subs() - fSubs;
            this.mopub = fSubs;
            this.billing = fSubs2;
            f2 = fSubs2;
            f = fSubs;
        }
        if (i != i2) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iSubs = iRound >= 0 ? iRound : 0;
            int iMopub = C15519l.mopub(j);
            if (iSubs > iMopub) {
                iSubs = iMopub;
            }
        } else {
            iSubs = C15519l.subs(j);
        }
        return AbstractC7563l.yandex(C15519l.isPro(j), C15519l.admob(j), iSubs, C15519l.mopub(j));
    }
}
