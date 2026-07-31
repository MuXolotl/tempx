package defpackage;

/* JADX INFO: renamed from: lٓٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C17104l.class)
public final class C14146l extends AbstractC5303l {
    public static final C7128l Companion = new C7128l();
    public final String amazon;
    public final long crashlytics;
    public final long purchase;

    public C14146l(long j) {
        this.crashlytics = j;
        if (j <= 0) {
            C10754l.metrica(AbstractC2812l.subscription(j, "Unit duration must be positive, but was ", " ns."));
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.amazon = "HOUR";
            this.purchase = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.amazon = "MINUTE";
            this.purchase = j / 60000000000L;
            return;
        }
        if (j % 1000000000 == 0) {
            this.amazon = "SECOND";
            this.purchase = j / 1000000000;
        } else if (j % 1000000 == 0) {
            this.amazon = "MILLISECOND";
            this.purchase = j / 1000000;
        } else if (j % 1000 == 0) {
            this.amazon = "MICROSECOND";
            this.purchase = j / 1000;
        } else {
            this.amazon = "NANOSECOND";
            this.purchase = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14146l) {
            return this.crashlytics == ((C14146l) obj).crashlytics;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.crashlytics;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final C14146l loadAd(int i) {
        return new C14146l(AbstractC6873l.amazon(this.crashlytics, i));
    }

    public final String toString() {
        long j = this.purchase;
        String str = this.amazon;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }
}
