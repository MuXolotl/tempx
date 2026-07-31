package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: renamed from: lؖۗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4330l {
    public final EnumC14251l crashlytics;
    public final byte[] loadAd;
    public final String yandex;

    public C4330l(String str, byte[] bArr, EnumC14251l enumC14251l) {
        this.yandex = str;
        this.loadAd = bArr;
        this.crashlytics = enumC14251l;
    }

    public static C10111l yandex() {
        C10111l c10111l = new C10111l(7, false);
        c10111l.f20589l = EnumC14251l.f27853l;
        return c10111l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4330l) {
            C4330l c4330l = (C4330l) obj;
            if (this.yandex.equals(c4330l.yandex) && Arrays.equals(this.loadAd, c4330l.loadAd) && this.crashlytics.equals(c4330l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.loadAd)) * 1000003);
    }

    public final C4330l loadAd(EnumC14251l enumC14251l) {
        C10111l c10111lYandex = yandex();
        c10111lYandex.m2885volatile(this.yandex);
        if (enumC14251l == null) {
            C6541l.subs("Null priority");
            return null;
        }
        c10111lYandex.f20589l = enumC14251l;
        c10111lYandex.f20586l = this.loadAd;
        return c10111lYandex.amazon();
    }

    public final String toString() {
        byte[] bArr = this.loadAd;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.yandex);
        sb.append(", ");
        sb.append(this.crashlytics);
        sb.append(", ");
        return AbstractC0653l.ads(sb, strEncodeToString, ")");
    }
}
