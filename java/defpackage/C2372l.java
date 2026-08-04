package defpackage;

/* JADX INFO: renamed from: lؔؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2372l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f5130l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f5131l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f5132l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f5133l;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f5130l, ((C2372l) obj).f5130l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(string: ");
        sb.append(this.f5131l);
        sb.append(", score: ");
        sb.append(this.f5130l);
        sb.append(", index: ");
        return AbstractC14814l.remoteconfig(this.f5133l, ")", sb);
    }
}
