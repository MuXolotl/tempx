package defpackage;

/* JADX INFO: renamed from: lَؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0722l implements InterfaceC11386l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f2215l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f2216l;

    public C0722l(long j, int i) {
        this.f2216l = j;
        this.f2215l = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0722l)) {
            return false;
        }
        C0722l c0722l = (C0722l) obj;
        return this.f2216l == c0722l.f2216l && this.f2215l == c0722l.f2215l;
    }

    public final int hashCode() {
        long j = this.f2216l;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f2215l;
    }

    @Override // defpackage.InterfaceC11386l
    public final int loadAd() {
        return this.f2215l;
    }

    public final String toString() {
        return "TimestampImpl(seconds=" + this.f2216l + ", nanoSeconds=" + this.f2215l + ")";
    }

    @Override // defpackage.InterfaceC11386l
    public final long yandex() {
        return this.f2216l;
    }
}
