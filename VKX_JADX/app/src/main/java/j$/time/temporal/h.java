package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public enum h implements q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.k(31556952L, 0);
        Duration.k(7889238L, 0);
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public final l j(l lVar, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            g gVar = i.c;
            return lVar.c(j$.com.android.tools.r8.a.R(lVar.j(gVar), j), gVar);
        }
        if (i == 2) {
            return lVar.d(j / 4, a.YEARS).d((j % 4) * 3, a.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
