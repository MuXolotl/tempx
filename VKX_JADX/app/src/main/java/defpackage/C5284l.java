package defpackage;

/* JADX INFO: renamed from: lؗۦٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5284l extends AbstractC16594l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object[] f11399l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f11400l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f11401l;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C5284l(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, 1);
        this.f11400l = i3;
        Object[] objArr2 = new Object[i3];
        this.f11399l = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f11401l = r5;
        objArr2[0] = objArr;
        crashlytics(i - r5, 1);
    }

    public final void amazon(int i) {
        int i2 = 0;
        while (AbstractC14707l.crashlytics(this.f32567l, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            crashlytics(this.f32567l, ((this.f11400l - 1) - (i2 / 5)) + 1);
        }
    }

    public final void crashlytics(int i, int i2) {
        int i3 = (this.f11400l - i2) * 5;
        while (i2 < this.f11400l) {
            Object[] objArr = this.f11399l;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[AbstractC14707l.crashlytics(i, i3)];
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
            this.f11401l = true;
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
        if (this.f11401l) {
            this.f11401l = false;
            return yandex();
        }
        amazon(31);
        return yandex();
    }

    public final Object yandex() {
        return ((Object[]) this.f11399l[this.f11400l - 1])[this.f32567l & 31];
    }
}
