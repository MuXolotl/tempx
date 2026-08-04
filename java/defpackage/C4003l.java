package defpackage;

/* JADX INFO: renamed from: lٌؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4003l {
    public static final C18262l admob = new C18262l(7);
    public final int amazon;
    public final boolean billing;
    public final C1693l crashlytics;
    public final EnumC8938l loadAd;
    public final C18262l mopub;
    public final boolean purchase;
    public final AbstractC6968l yandex;

    public C4003l(AbstractC6968l abstractC6968l, EnumC8938l enumC8938l, int i, boolean z, boolean z2) {
        this.yandex = abstractC6968l;
        this.loadAd = enumC8938l;
        int iOrdinal = enumC8938l.ordinal();
        this.crashlytics = iOrdinal != 1 ? iOrdinal != 3 ? C1693l.f4070l : C1693l.f4074l : C1693l.f4069l;
        this.amazon = i;
        this.purchase = z;
        this.billing = z2;
        this.mopub = admob;
    }

    public final AbstractC6968l yandex() {
        this.mopub.getClass();
        return this.yandex;
    }
}
