package defpackage;

import j$.time.ZoneId;

/* JADX INFO: renamed from: lْٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C15876l {
    public static final C4341l loadAd;
    public final ZoneId yandex;

    static {
        C3425l.Companion.getClass();
        loadAd = new C4341l(ZoneId.of("UTC"));
    }

    public C15876l(ZoneId zoneId) {
        this.yandex = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15876l) {
            return this.yandex.equals(((C15876l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex.toString();
    }
}
