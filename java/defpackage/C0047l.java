package defpackage;

import android.net.Uri;

/* JADX INFO: renamed from: lؑؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0047l {
    public final boolean loadAd;
    public final Uri yandex;

    public C0047l(boolean z, Uri uri) {
        this.yandex = uri;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0047l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0047l c0047l = (C0047l) obj;
        return AbstractC8576l.yandex(this.yandex, c0047l.yandex) && this.loadAd == c0047l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237);
    }
}
