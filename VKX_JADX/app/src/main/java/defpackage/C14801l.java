package defpackage;

/* JADX INFO: renamed from: lٍَٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C14801l {
    public static final C14628l Companion = new C14628l();
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public /* synthetic */ C14801l(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C15052l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        this.loadAd = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.crashlytics = j / 1000;
        } else {
            this.crashlytics = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14801l) && this.yandex == ((C14801l) obj).yandex;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC12900l.smaato(new StringBuilder("Time(ms="), this.yandex, ')');
    }

    public C14801l(long j) {
        this.yandex = j;
        this.loadAd = j * 1000;
        this.crashlytics = j / 1000;
    }
}
