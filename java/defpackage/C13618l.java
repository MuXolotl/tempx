package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lْۙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13618l extends AbstractC1440l {
    public final int loadAd;
    public final C1693l yandex;

    public C13618l(C1693l c1693l, int i) {
        this.yandex = c1693l;
        this.loadAd = i;
    }

    public static C13618l loadAd(C1693l c1693l, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new C13618l(c1693l, i);
        }
        C18262l.ads("Salt size must be between 8 and 12 bytes");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13618l)) {
            return false;
        }
        C13618l c13618l = (C13618l) obj;
        return c13618l.yandex == this.yandex && c13618l.loadAd == this.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(C13618l.class, this.yandex, Integer.valueOf(this.loadAd));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.yandex) + "salt_size_bytes: " + this.loadAd + ")";
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.yandex != C1693l.f4076l;
    }
}
