package defpackage;

/* JADX INFO: renamed from: lّٜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3358l extends AbstractC16594l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object[] f7156l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f7157l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f7158l;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C3358l(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, 0);
        this.f7157l = i3;
        Object[] objArr2 = new Object[i3];
        this.f7156l = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f7158l = r5;
        objArr2[0] = objArr;
        crashlytics(i - r5, 1);
    }

    public final void amazon(int i) {
        int i2 = 0;
        while (AbstractC7310l.purchase(this.f32567l, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            crashlytics(this.f32567l, ((this.f7157l - 1) - (i2 / 5)) + 1);
        }
    }

    public final void crashlytics(int i, int i2) {
        int i3 = (this.f7157l - i2) * 5;
        while (i2 < this.f7157l) {
            Object[] objArr = this.f7156l;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[AbstractC7310l.purchase(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        Object objYandex = yandex();
        int i = this.f32567l + 1;
        this.f32567l = i;
        if (i == this.f32566l) {
            this.f7158l = true;
            return objYandex;
        }
        amazon(0);
        return objYandex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        this.f32567l--;
        if (this.f7158l) {
            this.f7158l = false;
            return yandex();
        }
        amazon(31);
        return yandex();
    }

    public final Object yandex() {
        return ((Object[]) this.f7156l[this.f7157l - 1])[this.f32567l & 31];
    }
}
