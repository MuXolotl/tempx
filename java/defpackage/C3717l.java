package defpackage;

/* JADX INFO: renamed from: lٍؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3717l extends AbstractC16594l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f7777l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f7778l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0266l f7779l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C5284l f7780l;

    public C3717l(C0266l c0266l, int i) {
        super(i, c0266l.f1260l, 1);
        this.f7779l = c0266l;
        this.f7778l = c0266l.signatures();
        this.f7777l = -1;
        crashlytics();
    }

    @Override // defpackage.AbstractC16594l, java.util.ListIterator
    public final void add(Object obj) {
        yandex();
        int i = this.f32567l;
        C0266l c0266l = this.f7779l;
        c0266l.add(i, obj);
        this.f32567l++;
        this.f32566l = c0266l.pro();
        this.f7778l = c0266l.signatures();
        this.f7777l = -1;
        crashlytics();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void crashlytics() {
        C0266l c0266l = this.f7779l;
        Object[] objArr = c0266l.f1265l;
        if (objArr == null) {
            this.f7780l = null;
            return;
        }
        int i = (c0266l.f1260l - 1) & (-32);
        int i2 = this.f32567l;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (c0266l.f1264l / 5) + 1;
        C5284l c5284l = this.f7780l;
        if (c5284l == null) {
            this.f7780l = new C5284l(objArr, i2, i, i3);
            return;
        }
        c5284l.f32567l = i2;
        c5284l.f32566l = i;
        c5284l.f11400l = i3;
        if (c5284l.f11399l.length < i3) {
            c5284l.f11399l = new Object[i3];
        }
        c5284l.f11399l[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        c5284l.f11401l = r0;
        c5284l.crashlytics(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        yandex();
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f32567l;
        this.f7777l = i;
        C5284l c5284l = this.f7780l;
        C0266l c0266l = this.f7779l;
        if (c5284l == null) {
            Object[] objArr = c0266l.f1259l;
            this.f32567l = i + 1;
            return objArr[i];
        }
        if (c5284l.hasNext()) {
            this.f32567l++;
            return c5284l.next();
        }
        Object[] objArr2 = c0266l.f1259l;
        int i2 = this.f32567l;
        this.f32567l = i2 + 1;
        return objArr2[i2 - c5284l.f32566l];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        yandex();
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f32567l;
        this.f7777l = i - 1;
        C5284l c5284l = this.f7780l;
        C0266l c0266l = this.f7779l;
        if (c5284l == null) {
            Object[] objArr = c0266l.f1259l;
            int i2 = i - 1;
            this.f32567l = i2;
            return objArr[i2];
        }
        int i3 = c5284l.f32566l;
        if (i <= i3) {
            this.f32567l = i - 1;
            return c5284l.previous();
        }
        Object[] objArr2 = c0266l.f1259l;
        int i4 = i - 1;
        this.f32567l = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.AbstractC16594l, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        yandex();
        int i = this.f7777l;
        if (i == -1) {
            C18073l.admob();
            return;
        }
        C0266l c0266l = this.f7779l;
        c0266l.ad(i);
        int i2 = this.f7777l;
        if (i2 < this.f32567l) {
            this.f32567l = i2;
        }
        this.f32566l = c0266l.pro();
        this.f7778l = c0266l.signatures();
        this.f7777l = -1;
        crashlytics();
    }

    @Override // defpackage.AbstractC16594l, java.util.ListIterator
    public final void set(Object obj) {
        yandex();
        int i = this.f7777l;
        if (i == -1) {
            C18073l.admob();
            return;
        }
        C0266l c0266l = this.f7779l;
        c0266l.set(i, obj);
        this.f7778l = c0266l.signatures();
        crashlytics();
    }

    public final void yandex() {
        if (this.f7778l == this.f7779l.signatures()) {
            return;
        }
        C8339l.mopub();
    }
}
