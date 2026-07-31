package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4246l {
    public final C12431l loadAd;
    public final String yandex;

    public C4246l(String str, C12431l c12431l) {
        this.yandex = str;
        this.loadAd = c12431l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4246l)) {
            return false;
        }
        C4246l c4246l = (C4246l) obj;
        return Objects.equals(this.yandex, c4246l.yandex) && Objects.equals(this.loadAd, c4246l.loadAd);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistData [mStreamInfo=");
        sb.append(this.loadAd);
        sb.append(", mUri=");
        return AbstractC0653l.ads(sb, this.yandex, "]");
    }
}
