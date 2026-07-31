package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.io.Serializable;

/* JADX INFO: renamed from: lٍؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C6311l.class)
public final class C0378l implements Comparable<C0378l>, Serializable {
    public static final C1460l Companion = new C1460l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LocalDate f1462l;

    static {
        LocalDate localDate = LocalDate.MIN;
        LocalDate localDate2 = LocalDate.MAX;
    }

    public C0378l(int i, int i2, int i3) {
        try {
            this(LocalDate.of(i, i2, i3));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0378l c0378l) {
        return this.f1462l.compareTo((ChronoLocalDate) c0378l.f1462l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0378l) {
            return AbstractC8576l.yandex(this.f1462l, ((C0378l) obj).f1462l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1462l.hashCode();
    }

    public final String toString() {
        return this.f1462l.toString();
    }

    public C0378l(LocalDate localDate) {
        this.f1462l = localDate;
    }
}
