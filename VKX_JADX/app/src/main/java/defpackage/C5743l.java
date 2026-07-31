package defpackage;

/* JADX INFO: renamed from: lؘٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5743l {
    public final C6579l loadAd;
    public final C11867l yandex;

    public C5743l(C11867l c11867l, C6579l c6579l) {
        this.yandex = c11867l;
        this.loadAd = c6579l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5743l)) {
            return false;
        }
        C5743l c5743l = (C5743l) obj;
        return this.yandex.equals(c5743l.yandex) && this.loadAd.equals(c5743l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + ((this.yandex.hashCode() + (EnumC11503l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC11503l.SESSION_START + ", sessionData=" + this.yandex + ", applicationInfo=" + this.loadAd + ')';
    }
}
