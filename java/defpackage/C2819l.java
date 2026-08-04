package defpackage;

/* JADX INFO: renamed from: lٟؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2819l extends AbstractC8853l {
    public final C0005l crashlytics;

    public C2819l(C0005l c0005l) {
        this.crashlytics = c0005l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2819l.class == obj.getClass() && AbstractC8576l.yandex(this.crashlytics, ((C2819l) obj).crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.crashlytics + ", direction=-1)";
    }
}
