package defpackage;

/* JADX INFO: renamed from: lؘٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14718l {
    public static final C5042l Companion = new C5042l();
    public final String amazon;
    public final boolean crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C14718l(int i, String str, String str2, String str3, boolean z) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C8167l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = z;
        this.amazon = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14718l)) {
            return false;
        }
        C14718l c14718l = (C14718l) obj;
        return AbstractC8576l.yandex(this.yandex, c14718l.yandex) && AbstractC8576l.yandex(this.loadAd, c14718l.loadAd) && this.crashlytics == c14718l.crashlytics && AbstractC8576l.yandex(this.amazon, c14718l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + (this.crashlytics ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixSettingsOptionDto(id=");
        sb.append(this.yandex);
        sb.append(", icon=");
        sb.append(this.loadAd);
        sb.append(", selected=");
        sb.append(this.crashlytics);
        sb.append(", title=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }
}
