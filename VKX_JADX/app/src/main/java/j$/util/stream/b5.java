package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b5 extends d5 {
    @Override // j$.util.stream.a
    public final boolean M() {
        return true;
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.o(this.f) ? this : new z4(this, y6.r);
    }
}
