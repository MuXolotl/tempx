package defpackage;

/* JADX INFO: renamed from: lُؖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C10842l {
    public static final C2824l Companion = new C2824l();
    public static final InterfaceC1220l[] purchase = {null, null, null, AbstractC9968l.crashlytics(2, new C14499l(12))};
    public final EnumC11498l amazon;
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C10842l(int i, String str, int i2, int i3, EnumC11498l enumC11498l) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C8015l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = enumC11498l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10842l)) {
            return false;
        }
        C10842l c10842l = (C10842l) obj;
        return AbstractC8576l.yandex(this.yandex, c10842l.yandex) && this.loadAd == c10842l.loadAd && this.crashlytics == c10842l.crashlytics && this.amazon == c10842l.amazon;
    }

    public final int hashCode() {
        return this.amazon.hashCode() + (((((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics) * 31);
    }

    public final String toString() {
        return "AudioPhotoSizesDto(src=" + this.yandex + ", width=" + this.loadAd + ", height=" + this.crashlytics + ", type=" + this.amazon + ')';
    }
}
