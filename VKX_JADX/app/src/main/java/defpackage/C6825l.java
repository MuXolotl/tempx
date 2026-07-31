package defpackage;

/* JADX INFO: renamed from: lؙۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6825l extends AbstractC16594l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f14250l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f14251l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1637l f14252l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C3358l f14253l;

    public C6825l(C1637l c1637l, int i) {
        super(i, c1637l.f3972l, 0);
        this.f14252l = c1637l;
        this.f14251l = c1637l.signatures();
        this.f14250l = -1;
        amazon();
    }

    @Override // defpackage.AbstractC16594l, java.util.ListIterator
    public final void add(Object obj) {
        yandex();
        this.f14252l.add(this.f32567l, obj);
        this.f32567l++;
        crashlytics();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void amazon() {
        C1637l c1637l = this.f14252l;
        Object[] objArr = c1637l.f3971l;
        if (objArr == null) {
            this.f14253l = null;
            return;
        }
        int i = (c1637l.f3972l - 1) & (-32);
        int i2 = this.f32567l;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (c1637l.f3969l / 5) + 1;
        C3358l c3358l = this.f14253l;
        if (c3358l == null) {
            this.f14253l = new C3358l(objArr, i2, i, i3);
            return;
        }
        c3358l.f32567l = i2;
        c3358l.f32566l = i;
        c3358l.f7157l = i3;
        if (c3358l.f7156l.length < i3) {
            c3358l.f7156l = new Object[i3];
        }
        c3358l.f7156l[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        c3358l.f7158l = r0;
        c3358l.crashlytics(i2 - r0, 1);
    }

    public final void crashlytics() {
        C1637l c1637l = this.f14252l;
        this.f32566l = c1637l.pro();
        this.f14251l = c1637l.signatures();
        this.f14250l = -1;
        amazon();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        yandex();
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f32567l;
        this.f14250l = i;
        C3358l c3358l = this.f14253l;
        C1637l c1637l = this.f14252l;
        if (c3358l == null) {
            Object[] objArr = c1637l.f3970l;
            this.f32567l = i + 1;
            return objArr[i];
        }
        if (c3358l.hasNext()) {
            this.f32567l++;
            return c3358l.next();
        }
        Object[] objArr2 = c1637l.f3970l;
        int i2 = this.f32567l;
        this.f32567l = i2 + 1;
        return objArr2[i2 - c3358l.f32566l];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        yandex();
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f32567l;
        this.f14250l = i - 1;
        C3358l c3358l = this.f14253l;
        C1637l c1637l = this.f14252l;
        if (c3358l == null) {
            Object[] objArr = c1637l.f3970l;
            int i2 = i - 1;
            this.f32567l = i2;
            return objArr[i2];
        }
        int i3 = c3358l.f32566l;
        if (i <= i3) {
            this.f32567l = i - 1;
            return c3358l.previous();
        }
        Object[] objArr2 = c1637l.f3970l;
        int i4 = i - 1;
        this.f32567l = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.AbstractC16594l, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        yandex();
        int i = this.f14250l;
        if (i == -1) {
            C18073l.admob();
            return;
        }
        this.f14252l.ad(i);
        int i2 = this.f14250l;
        if (i2 < this.f32567l) {
            this.f32567l = i2;
        }
        crashlytics();
    }

    @Override // defpackage.AbstractC16594l, java.util.ListIterator
    public final void set(Object obj) {
        yandex();
        int i = this.f14250l;
        if (i == -1) {
            C18073l.admob();
            return;
        }
        C1637l c1637l = this.f14252l;
        c1637l.set(i, obj);
        this.f14251l = c1637l.signatures();
        amazon();
    }

    public final void yandex() {
        if (this.f14251l == this.f14252l.signatures()) {
            return;
        }
        C8339l.mopub();
    }
}
