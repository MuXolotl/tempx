package defpackage;

import android.net.Uri;

/* JADX INFO: renamed from: lؕۤؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3743l {
    public final AbstractC1186l amazon;
    public final C13464l crashlytics;
    public final C14728l loadAd;
    public final Uri yandex;

    public C3743l(Uri uri, C14728l c14728l, C13464l c13464l, AbstractC1186l abstractC1186l) {
        this.yandex = uri;
        this.loadAd = c14728l;
        this.crashlytics = c13464l;
        this.amazon = abstractC1186l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3743l)) {
            return false;
        }
        C3743l c3743l = (C3743l) obj;
        return this.yandex.equals(c3743l.yandex) && this.loadAd.equals(c3743l.loadAd) && this.crashlytics.equals(c3743l.crashlytics) && this.amazon.equals(c3743l.amazon);
    }

    public final int hashCode() {
        return ((((((this.amazon.hashCode() ^ ((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003)) * 1000003) ^ C14823l.f29002l.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.yandex.toString();
        int length = string.length();
        String string2 = this.loadAd.toString();
        int length2 = string2.length();
        C14823l c14823l = C14823l.f29002l;
        String strValueOf = String.valueOf(this.crashlytics);
        String strValueOf2 = String.valueOf(this.amazon);
        String string3 = c14823l.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        AbstractC9361l.appmetrica(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        AbstractC9361l.appmetrica(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
        return AbstractC9361l.ad(sb, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
