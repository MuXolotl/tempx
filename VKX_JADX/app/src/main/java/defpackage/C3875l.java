package defpackage;

/* JADX INFO: renamed from: lؖؓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3875l extends C1626l implements Comparable {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f8009l;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3875l c3875l = (C3875l) obj;
        if (crashlytics(4) != c3875l.crashlytics(4)) {
            return crashlytics(4) ? 1 : -1;
        }
        long j = this.f8496l - c3875l.f8496l;
        if (j == 0) {
            j = this.f8009l - c3875l.f8009l;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
