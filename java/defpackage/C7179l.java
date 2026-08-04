package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lُؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7179l {
    public final LinkedHashMap admob;
    public final LinkedHashMap amazon;
    public final LinkedHashMap billing;
    public final Size crashlytics;
    public final LinkedHashMap loadAd;
    public final LinkedHashMap mopub;
    public final Size purchase;
    public final LinkedHashMap subs;
    public final Size yandex;

    public C7179l(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size == null) {
            C6541l.subs("Null analysisSize");
            throw null;
        }
        this.yandex = size;
        this.loadAd = linkedHashMap;
        if (size2 == null) {
            C6541l.subs("Null previewSize");
            throw null;
        }
        this.crashlytics = size2;
        this.amazon = linkedHashMap2;
        this.purchase = size3;
        this.billing = linkedHashMap3;
        this.mopub = linkedHashMap4;
        this.admob = linkedHashMap5;
        this.subs = linkedHashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7179l)) {
            return false;
        }
        C7179l c7179l = (C7179l) obj;
        return this.yandex.equals(c7179l.yandex) && this.loadAd.equals(c7179l.loadAd) && this.crashlytics.equals(c7179l.crashlytics) && this.amazon.equals(c7179l.amazon) && this.purchase.equals(c7179l.purchase) && this.billing.equals(c7179l.billing) && this.mopub.equals(c7179l.mopub) && this.admob.equals(c7179l.admob) && this.subs.equals(c7179l.subs);
    }

    public final int hashCode() {
        return this.subs.hashCode() ^ ((((((((((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ this.billing.hashCode()) * 1000003) ^ this.mopub.hashCode()) * 1000003) ^ this.admob.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.yandex + ", s720pSizeMap=" + this.loadAd + ", previewSize=" + this.crashlytics + ", s1440pSizeMap=" + this.amazon + ", recordSize=" + this.purchase + ", maximumSizeMap=" + this.billing + ", maximum4x3SizeMap=" + this.mopub + ", maximum16x9SizeMap=" + this.admob + ", ultraMaximumSizeMap=" + this.subs + "}";
    }
}
