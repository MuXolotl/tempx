package defpackage;

import android.util.Size;

/* JADX INFO: renamed from: lؙِ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6410l {
    public final int admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int isPro;
    public final String loadAd;
    public final int mopub;
    public final int purchase;
    public final int subs;
    public final int yandex;

    public C6410l(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.yandex = i;
        if (str == null) {
            C6541l.subs("Null mediaType");
            throw null;
        }
        this.loadAd = str;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = i5;
        this.mopub = i6;
        this.admob = i7;
        this.subs = i8;
        this.isPro = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6410l) {
            C6410l c6410l = (C6410l) obj;
            if (this.yandex == c6410l.yandex && this.loadAd.equals(c6410l.loadAd) && this.crashlytics == c6410l.crashlytics && this.amazon == c6410l.amazon && this.purchase == c6410l.purchase && this.billing == c6410l.billing && this.mopub == c6410l.mopub && this.admob == c6410l.admob && this.subs == c6410l.subs && this.isPro == c6410l.isPro) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.isPro ^ ((((((((((((((((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics) * 1000003) ^ this.amazon) * 1000003) ^ this.purchase) * 1000003) ^ this.billing) * 1000003) ^ this.mopub) * 1000003) ^ this.admob) * 1000003) ^ this.subs) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.yandex);
        sb.append(", mediaType=");
        sb.append(this.loadAd);
        sb.append(", bitrate=");
        sb.append(this.crashlytics);
        sb.append(", frameRate=");
        sb.append(this.amazon);
        sb.append(", width=");
        sb.append(this.purchase);
        sb.append(", height=");
        sb.append(this.billing);
        sb.append(", profile=");
        sb.append(this.mopub);
        sb.append(", bitDepth=");
        sb.append(this.admob);
        sb.append(", chromaSubsampling=");
        sb.append(this.subs);
        sb.append(", hdrFormat=");
        return AbstractC14814l.remoteconfig(this.isPro, "}", sb);
    }

    public final Size yandex() {
        return new Size(this.purchase, this.billing);
    }
}
