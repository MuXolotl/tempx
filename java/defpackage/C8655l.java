package defpackage;

/* JADX INFO: renamed from: lًٌ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C5630l.class)
public final class C8655l extends AbstractC5543l {
    public static final C17662l Companion = new C17662l();
    public final int crashlytics;

    public C8655l(int i) {
        this.crashlytics = i;
        if (i > 0) {
            return;
        }
        C10754l.metrica(AbstractC15560l.tapsense("Unit duration must be positive, but was ", i, " months."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8655l) {
            return this.crashlytics == ((C8655l) obj).crashlytics;
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics ^ 131072;
    }

    public final String toString() {
        int i = this.crashlytics;
        if (i % 1200 == 0) {
            return AbstractC5303l.yandex(i / 1200, "CENTURY");
        }
        if (i % 12 == 0) {
            return AbstractC5303l.yandex(i / 12, "YEAR");
        }
        return i % 3 == 0 ? AbstractC5303l.yandex(i / 3, "QUARTER") : AbstractC5303l.yandex(i, "MONTH");
    }
}
