package defpackage;

import j$.time.LocalTime;
import java.io.Serializable;

/* JADX INFO: renamed from: lؘْٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C1604l.class)
public final class C5864l implements Comparable<C5864l>, Serializable {
    public static final C16096l Companion = new C16096l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LocalTime f12356l;

    static {
        LocalTime localTime = LocalTime.MIN;
        LocalTime localTime2 = LocalTime.MAX;
    }

    public C5864l(LocalTime localTime) {
        this.f12356l = localTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5864l c5864l) {
        return this.f12356l.compareTo(c5864l.f12356l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5864l) {
            return AbstractC8576l.yandex(this.f12356l, ((C5864l) obj).f12356l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12356l.hashCode();
    }

    public final String toString() {
        return this.f12356l.toString();
    }
}
