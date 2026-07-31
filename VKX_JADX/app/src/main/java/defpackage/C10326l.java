package defpackage;

/* JADX INFO: renamed from: lٍَٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10326l extends AbstractC15674l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C4720l f21051l;

    public C10326l(C4720l c4720l) {
        this.f21051l = c4720l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f30648l;
        this.f30648l = i + 2;
        Object[] objArr = this.f30650l;
        return new C6527l(this.f21051l, objArr[i], objArr[i + 1]);
    }
}
