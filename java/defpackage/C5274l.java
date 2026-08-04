package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* JADX INFO: renamed from: lؗۥً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5274l implements InterfaceC0625l {
    public final int admob;
    public final Size amazon;
    public final C8581l billing;
    public final EnumC8920l crashlytics;
    public final int isPro;
    public final int loadAd;
    public final int mopub;
    public final int purchase;
    public final int subs;
    public final String yandex;

    public C5274l(String str, int i, EnumC8920l enumC8920l, Size size, int i2, C8581l c8581l, int i3, int i4, int i5, int i6) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = enumC8920l;
        this.amazon = size;
        this.purchase = i2;
        this.billing = c8581l;
        this.mopub = i3;
        this.admob = i4;
        this.subs = i5;
        this.isPro = i6;
    }

    public static C18289l amazon() {
        C18289l c18289l = new C18289l(2);
        c18289l.crashlytics = -1;
        c18289l.isPro = 1;
        c18289l.billing = 2130708361;
        c18289l.mopub = C8581l.amazon;
        return c18289l;
    }

    @Override // defpackage.InterfaceC0625l
    public final String crashlytics() {
        return this.yandex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5274l) {
            C5274l c5274l = (C5274l) obj;
            if (this.yandex.equals(c5274l.yandex) && this.loadAd == c5274l.loadAd && this.crashlytics.equals(c5274l.crashlytics) && this.amazon.equals(c5274l.amazon) && this.purchase == c5274l.purchase && this.billing.equals(c5274l.billing) && this.mopub == c5274l.mopub && this.admob == c5274l.admob && this.subs == c5274l.subs && this.isPro == c5274l.isPro) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.isPro ^ ((((((((((((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003) ^ this.purchase) * 1000003) ^ this.billing.hashCode()) * 1000003) ^ this.mopub) * 1000003) ^ this.admob) * 1000003) ^ this.subs) * 1000003);
    }

    @Override // defpackage.InterfaceC0625l
    public final EnumC8920l loadAd() {
        return this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.yandex);
        sb.append(", profile=");
        sb.append(this.loadAd);
        sb.append(", inputTimebase=");
        sb.append(this.crashlytics);
        sb.append(", resolution=");
        sb.append(this.amazon);
        sb.append(", colorFormat=");
        sb.append(this.purchase);
        sb.append(", dataSpace=");
        sb.append(this.billing);
        sb.append(", captureFrameRate=");
        sb.append(this.mopub);
        sb.append(", encodeFrameRate=");
        sb.append(this.admob);
        sb.append(", IFrameInterval=");
        sb.append(this.subs);
        sb.append(", bitrate=");
        return AbstractC14814l.remoteconfig(this.isPro, "}", sb);
    }

    @Override // defpackage.InterfaceC0625l
    public final MediaFormat yandex() {
        Size size = this.amazon;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.yandex, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.purchase);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.isPro);
        int i = this.admob;
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i);
        int i2 = this.mopub;
        if (i2 > i) {
            mediaFormatCreateVideoFormat.setInteger("capture-rate", i2);
            mediaFormatCreateVideoFormat.setInteger("operating-rate", i2);
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.subs);
        int i3 = this.loadAd;
        if (i3 != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i3);
        }
        C8581l c8581l = this.billing;
        int i4 = c8581l.yandex;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i4);
        }
        int i5 = c8581l.loadAd;
        if (i5 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i5);
        }
        int i6 = c8581l.crashlytics;
        if (i6 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i6);
        }
        return mediaFormatCreateVideoFormat;
    }
}
