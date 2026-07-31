package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public enum a implements q {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");

    public final String a;

    static {
        Duration.l(1L);
        Duration.l(1000L);
        Duration.l(1000000L);
        Duration.k(1L, 0);
        Duration.k(60L, 0);
        Duration.k(3600L, 0);
        Duration.k(43200L, 0);
        Duration.k(86400L, 0);
        Duration.k(604800L, 0);
        Duration.k(2629746L, 0);
        Duration.k(31556952L, 0);
        Duration.k(315569520L, 0);
        Duration.k(3155695200L, 0);
        Duration.k(31556952000L, 0);
        Duration.k(31556952000000000L, 0);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
    }

    a(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public final l j(l lVar, long j) {
        return lVar.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
