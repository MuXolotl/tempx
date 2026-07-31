package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16928l {
    public static final /* synthetic */ int amazon = 0;
    public final String crashlytics;
    public final int loadAd;
    public final C10136l yandex;

    static {
        C10136l c10136l = C10136l.crashlytics;
    }

    public C16928l(C10136l c10136l, int i, String str) {
        this.yandex = c10136l;
        this.loadAd = i;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16928l)) {
            return false;
        }
        C16928l c16928l = (C16928l) obj;
        return AbstractC8576l.yandex(this.yandex, c16928l.yandex) && this.loadAd == c16928l.loadAd && AbstractC8576l.yandex(this.crashlytics, c16928l.crashlytics);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, 0, 0, Integer.valueOf(this.loadAd), this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.yandex);
        sb.append(", encodeFrameRate=0, bitrate=0, aspectRatio=");
        sb.append(this.loadAd);
        sb.append(", mimeType=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, '}');
    }
}
