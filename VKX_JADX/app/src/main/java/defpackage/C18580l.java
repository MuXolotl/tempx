package defpackage;

/* JADX INFO: renamed from: lۛٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18580l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f36277l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f36278l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f36279l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f36280l;

    public C18580l(int i, int i2, String str, String str2) {
        this.f36279l = i;
        this.f36278l = i2;
        this.f36277l = str;
        this.f36280l = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18580l c18580l = (C18580l) obj;
        int i = this.f36279l - c18580l.f36279l;
        return i == 0 ? this.f36278l - c18580l.f36278l : i;
    }
}
