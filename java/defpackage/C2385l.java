package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lّؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2385l extends AbstractC1440l {
    public final C16751l loadAd;
    public final int yandex;

    public C2385l(int i, C16751l c16751l) {
        this.yandex = i;
        this.loadAd = c16751l;
    }

    public static C10023l loadAd() {
        C10023l c10023l = new C10023l();
        c10023l.f20419l = null;
        c10023l.f20418l = C16751l.f32754l;
        return c10023l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2385l)) {
            return false;
        }
        C2385l c2385l = (C2385l) obj;
        return c2385l.yandex == this.yandex && c2385l.loadAd == this.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(C2385l.class, Integer.valueOf(this.yandex), this.loadAd);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.loadAd) + ", " + this.yandex + "-byte key)";
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.loadAd != C16751l.f32754l;
    }
}
