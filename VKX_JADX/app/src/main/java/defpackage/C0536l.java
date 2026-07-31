package defpackage;

/* JADX INFO: renamed from: lّؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0536l implements InterfaceC12244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f1846l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f1847l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f1848l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f1849l;

    public C0536l(int i, int i2, int i3) {
        this.f1848l = i2;
        this.f1847l = i3;
        int i4 = (i / i2) * i2;
        this.f1846l = new C10086l(AbstractC8576l.adcel(Math.max(i4 - i3, 0), i4 + i2 + i3), C7472l.f15463l);
        this.f1849l = i;
    }

    public final void crashlytics(int i) {
        if (i != this.f1849l) {
            this.f1849l = i;
            int i2 = this.f1848l;
            int i3 = (i / i2) * i2;
            int i4 = this.f1847l;
            this.f1846l.setValue(AbstractC8576l.adcel(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        return (C8934l) this.f1846l.getValue();
    }
}
