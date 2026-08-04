package defpackage;

/* JADX INFO: renamed from: lٍۢؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9884l extends AbstractC16594l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f20114l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f20115l = 0;

    public C9884l(int i, int i2, Object[] objArr) {
        super(i, i2, 1);
        this.f20114l = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f20115l;
        Object obj = this.f20114l;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C4875l.firebase();
                    return null;
                }
                int i2 = this.f32567l;
                this.f32567l = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.f32567l++;
                    return obj;
                }
                C4875l.firebase();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f20115l;
        Object obj = this.f20114l;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    C4875l.firebase();
                    return null;
                }
                int i2 = this.f32567l - 1;
                this.f32567l = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.f32567l--;
                    return obj;
                }
                C4875l.firebase();
                return null;
        }
    }

    public C9884l(int i, Object obj) {
        super(i, 1, 1);
        this.f20114l = obj;
    }
}
