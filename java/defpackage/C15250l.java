package defpackage;

/* JADX INFO: renamed from: lۣٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C15250l {
    public static final C17000l Companion = new C17000l();
    public static final InterfaceC1220l[] billing = {null, AbstractC9968l.crashlytics(2, new C6573l(27)), null, null, null};
    public final String amazon;
    public final int crashlytics;
    public final EnumC16632l loadAd;
    public final String purchase;
    public final int yandex;

    public /* synthetic */ C15250l(int i, int i2, EnumC16632l enumC16632l, int i3, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C9223l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = enumC16632l;
        this.crashlytics = i3;
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15250l)) {
            return false;
        }
        C15250l c15250l = (C15250l) obj;
        return this.yandex == c15250l.yandex && this.loadAd == c15250l.loadAd && this.crashlytics == c15250l.crashlytics && AbstractC8576l.yandex(this.amazon, c15250l.amazon) && AbstractC8576l.yandex(this.purchase, c15250l.purchase);
    }

    public final int hashCode() {
        int iHashCode = (((this.loadAd.hashCode() + (this.yandex * 31)) * 31) + this.crashlytics) * 31;
        String str = this.amazon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.purchase;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosPhotoSizesDto(height=");
        sb.append(this.yandex);
        sb.append(", type=");
        sb.append(this.loadAd);
        sb.append(", width=");
        sb.append(this.crashlytics);
        sb.append(", url=");
        sb.append(this.amazon);
        sb.append(", src=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
