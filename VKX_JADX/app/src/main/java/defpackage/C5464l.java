package defpackage;

import android.util.Range;
import android.util.Size;

/* JADX INFO: renamed from: lؘّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5464l {
    public static final Range admob = new Range(0, 0);
    public final int amazon;
    public final InterfaceC17944l billing;
    public final C15421l crashlytics;
    public final Size loadAd;
    public final boolean mopub;
    public final Range purchase;
    public final Size yandex;

    public C5464l(Size size, Size size2, C15421l c15421l, int i, Range range, InterfaceC17944l interfaceC17944l, boolean z) {
        this.yandex = size;
        this.loadAd = size2;
        this.crashlytics = c15421l;
        this.amazon = i;
        this.purchase = range;
        this.billing = interfaceC17944l;
        this.mopub = z;
    }

    public static C6472l yandex(Size size) {
        C6472l c6472l = new C6472l(1);
        if (size == null) {
            C6541l.subs("Null resolution");
            return null;
        }
        c6472l.f13512l = size;
        c6472l.f13509l = size;
        c6472l.f13514l = 0;
        Range range = admob;
        if (range == null) {
            C6541l.subs("Null expectedFrameRateRange");
            return null;
        }
        c6472l.f13516l = range;
        c6472l.f13515l = C15421l.amazon;
        c6472l.f13511l = Boolean.FALSE;
        return c6472l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5464l) {
            C5464l c5464l = (C5464l) obj;
            if (this.yandex.equals(c5464l.yandex) && this.loadAd.equals(c5464l.loadAd) && this.crashlytics.equals(c5464l.crashlytics) && this.amazon == c5464l.amazon && this.purchase.equals(c5464l.purchase)) {
                InterfaceC17944l interfaceC17944l = c5464l.billing;
                InterfaceC17944l interfaceC17944l2 = this.billing;
                if (interfaceC17944l2 != null ? interfaceC17944l2.equals(interfaceC17944l) : interfaceC17944l == null) {
                    if (this.mopub == c5464l.mopub) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon) * 1000003) ^ this.purchase.hashCode()) * 1000003;
        InterfaceC17944l interfaceC17944l = this.billing;
        return (this.mopub ? 1231 : 1237) ^ ((iHashCode ^ (interfaceC17944l == null ? 0 : interfaceC17944l.hashCode())) * 1000003);
    }

    public final C6472l loadAd() {
        C6472l c6472l = new C6472l(1);
        c6472l.f13512l = this.yandex;
        c6472l.f13509l = this.loadAd;
        c6472l.f13515l = this.crashlytics;
        c6472l.f13514l = Integer.valueOf(this.amazon);
        c6472l.f13516l = this.purchase;
        c6472l.f13510l = this.billing;
        c6472l.f13511l = Boolean.valueOf(this.mopub);
        return c6472l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.yandex);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.loadAd);
        sb.append(", dynamicRange=");
        sb.append(this.crashlytics);
        sb.append(", sessionType=");
        sb.append(this.amazon);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.purchase);
        sb.append(", implementationOptions=");
        sb.append(this.billing);
        sb.append(", zslDisabled=");
        return AbstractC5020l.Signature(sb, this.mopub, "}");
    }
}
