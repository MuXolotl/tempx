package defpackage;

/* JADX INFO: renamed from: lؑؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C1828l.class)
public final class C0066l extends AbstractC5543l {
    public static final C9509l Companion = new C9509l();
    public final int crashlytics;

    public C0066l(int i) {
        this.crashlytics = i;
        if (i > 0) {
            return;
        }
        C10754l.metrica(AbstractC15560l.tapsense("Unit duration must be positive, but was ", i, " days."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0066l) {
            return this.crashlytics == ((C0066l) obj).crashlytics;
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics ^ 65536;
    }

    public final String toString() {
        int i = this.crashlytics;
        return i % 7 == 0 ? AbstractC5303l.yandex(i / 7, "WEEK") : AbstractC5303l.yandex(i, "DAY");
    }
}
