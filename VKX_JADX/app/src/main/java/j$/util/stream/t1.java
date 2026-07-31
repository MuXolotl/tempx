package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public enum t1 {
    ANY(true, true),
    ALL(false, false),
    NONE(true, false);

    public final boolean a;
    public final boolean b;

    t1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
