package defpackage;

/* JADX INFO: renamed from: lُۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15271l {
    public static final C13645l mopub = AbstractC15212l.purchase(new C5562l(9), new C14813l((byte) 0, 15));
    public final C10086l billing;
    public final C13765l yandex;
    public final C13765l loadAd = new C13765l(0.0f);
    public final C15308l crashlytics = new C15308l(0);
    public C8896l amazon = C8896l.purchase;
    public long purchase = C12814l.loadAd;

    public C15271l(EnumC7283l enumC7283l, float f) {
        this.yandex = new C13765l(f);
        this.billing = new C10086l(enumC7283l, C7472l.f15463l);
    }

    public final void yandex(EnumC7283l enumC7283l, C8896l c8896l, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.loadAd.subs(f2);
        float f3 = c8896l.yandex;
        float f4 = c8896l.loadAd;
        C8896l c8896l2 = this.amazon;
        float f5 = c8896l2.yandex;
        C13765l c13765l = this.yandex;
        if (f3 != f5 || f4 != c8896l2.loadAd) {
            boolean z = enumC7283l == EnumC7283l.f15126l;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? c8896l.amazon : c8896l.crashlytics;
            float fAdmob = c13765l.admob();
            float f7 = i;
            float f8 = fAdmob + f7;
            if (f6 <= f8 && (f3 >= fAdmob || f6 - f3 <= f7)) {
                f = (f3 >= fAdmob || f6 - f3 > f7) ? 0.0f : f3 - fAdmob;
            } else {
                f = f6 - f8;
            }
            c13765l.subs(c13765l.admob() + f);
            this.amazon = c8896l;
        }
        c13765l.subs(AbstractC8576l.amazon(c13765l.admob(), 0.0f, f2));
        this.crashlytics.subs(i);
    }
}
