package defpackage;

/* JADX INFO: renamed from: lٌؙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6349l implements InterfaceC13232l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f13312l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f13311l = -1;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f13310l = -1;

    public C6349l(int i) {
        this.f13312l = i;
    }

    @Override // defpackage.InterfaceC13232l
    public final boolean mopub(CharSequence charSequence, int i, int i2, C2049l c2049l) {
        int i3 = this.f13312l;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f13311l = i;
        this.f13310l = i2;
        return false;
    }

    @Override // defpackage.InterfaceC13232l
    public final Object loadAd() {
        return this;
    }
}
