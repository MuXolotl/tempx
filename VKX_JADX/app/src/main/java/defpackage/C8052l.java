package defpackage;

/* JADX INFO: renamed from: lًٗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8052l extends AbstractC16594l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C3358l f16778l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object[] f16779l;

    public C8052l(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 0);
        this.f16779l = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f16778l = new C3358l(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        C3358l c3358l = this.f16778l;
        if (c3358l.hasNext()) {
            this.f32567l++;
            return c3358l.next();
        }
        int i = this.f32567l;
        this.f32567l = i + 1;
        return this.f16779l[i - c3358l.f32566l];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f32567l;
        C3358l c3358l = this.f16778l;
        int i2 = c3358l.f32566l;
        if (i <= i2) {
            this.f32567l = i - 1;
            return c3358l.previous();
        }
        int i3 = i - 1;
        this.f32567l = i3;
        return this.f16779l[i3 - i2];
    }
}
