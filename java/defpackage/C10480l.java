package defpackage;

import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;

/* JADX INFO: renamed from: lَٟٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C13685l.class)
public final class C10480l implements Comparable<C10480l>, Serializable {
    public static final C13803l Companion = new C13803l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final YearMonth f21340l;

    public C10480l(YearMonth yearMonth) {
        this.f21340l = yearMonth;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C10480l c10480l) {
        return this.f21340l.compareTo(c10480l.f21340l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10480l) {
            return AbstractC8576l.yandex(this.f21340l, ((C10480l) obj).f21340l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21340l.hashCode();
    }

    public final String toString() {
        return ((DateTimeFormatter) AbstractC0888l.yandex.getValue()).format(this.f21340l);
    }
}
