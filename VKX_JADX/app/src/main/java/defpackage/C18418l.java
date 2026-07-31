package defpackage;

/* JADX INFO: renamed from: lٚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18418l extends AbstractC16594l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5284l f35962l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object[] f35963l;

    public C18418l(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 1);
        this.f35963l = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f35962l = new C5284l(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        C5284l c5284l = this.f35962l;
        if (c5284l.hasNext()) {
            this.f32567l++;
            return c5284l.next();
        }
        int i = this.f32567l;
        this.f32567l = i + 1;
        return this.f35963l[i - c5284l.f32566l];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f32567l;
        C5284l c5284l = this.f35962l;
        int i2 = c5284l.f32566l;
        if (i <= i2) {
            this.f32567l = i - 1;
            return c5284l.previous();
        }
        int i3 = i - 1;
        this.f32567l = i3;
        return this.f35963l[i3 - i2];
    }
}
