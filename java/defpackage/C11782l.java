package defpackage;

/* JADX INFO: renamed from: lِِۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11782l extends AbstractC4634l implements Comparable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f23590l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f23591l;

    public C11782l(int i, C11916l c11916l, int i2, C9205l c9205l, int i3) {
        int i4;
        super(i, c11916l, i2);
        this.f23590l = AbstractC4338l.tapsense(i3, c9205l.f18945l) ? 1 : 0;
        C5978l c5978l = this.f9432l;
        int i5 = c5978l.license;
        int i6 = -1;
        if (i5 != -1 && (i4 = c5978l.pro) != -1) {
            i6 = i5 * i4;
        }
        this.f23591l = i6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f23591l, ((C11782l) obj).f23591l);
    }

    @Override // defpackage.AbstractC4634l
    public final /* bridge */ /* synthetic */ boolean loadAd(AbstractC4634l abstractC4634l) {
        return false;
    }

    @Override // defpackage.AbstractC4634l
    public final int yandex() {
        return this.f23590l;
    }
}
