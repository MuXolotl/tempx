package defpackage;

/* JADX INFO: renamed from: lؚٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7473l {
    public final C13765l admob;
    public final InterfaceC8714l loadAd;
    public final C13765l mopub;
    public final InterfaceC2262l yandex;
    public final C8610l crashlytics = AbstractC8020l.mopub(new C6387l(this, 1));
    public final C10086l amazon = AbstractC8020l.smaato(Boolean.FALSE);
    public final C13765l purchase = new C13765l(0.0f);
    public final C13765l billing = new C13765l(0.0f);
    public final C16801l subs = new C16801l();

    public C7473l(InterfaceC2262l interfaceC2262l, InterfaceC8714l interfaceC8714l, float f, float f2) {
        this.yandex = interfaceC2262l;
        this.loadAd = interfaceC8714l;
        this.mopub = new C13765l(f2);
        this.admob = new C13765l(f);
    }

    public final boolean loadAd() {
        return ((Boolean) this.amazon.getValue()).booleanValue();
    }

    public final float yandex() {
        return ((Number) this.crashlytics.getValue()).floatValue();
    }
}
