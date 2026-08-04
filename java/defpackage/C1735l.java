package defpackage;

import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;
import java.io.Serializable;

/* JADX INFO: renamed from: lٌٍؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C1023l.class)
public final class C1735l implements Comparable<C1735l>, Serializable {
    public static final C13435l Companion = new C13435l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LocalDateTime f4137l;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
    }

    public C1735l(LocalDateTime localDateTime) {
        this.f4137l = localDateTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1735l c1735l) {
        return this.f4137l.compareTo((ChronoLocalDateTime<?>) c1735l.f4137l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1735l) {
            return AbstractC8576l.yandex(this.f4137l, ((C1735l) obj).f4137l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4137l.hashCode();
    }

    public final String toString() {
        return this.f4137l.toString();
    }
}
