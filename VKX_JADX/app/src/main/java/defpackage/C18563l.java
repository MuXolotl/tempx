package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lۚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18563l extends AbstractC3302l {
    public final C17162l loadAd;
    public final int yandex;

    public C18563l(int i, C17162l c17162l) {
        this.yandex = i;
        this.loadAd = c17162l;
    }

    public static C0458l loadAd() {
        C0458l c0458l = new C0458l(3, false);
        c0458l.f1691l = null;
        c0458l.f1690l = C17162l.purchase;
        return c0458l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18563l)) {
            return false;
        }
        C18563l c18563l = (C18563l) obj;
        return c18563l.yandex == this.yandex && c18563l.loadAd == this.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(C18563l.class, Integer.valueOf(this.yandex), this.loadAd);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.loadAd) + ", " + this.yandex + "-byte key)";
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.loadAd != C17162l.purchase;
    }
}
