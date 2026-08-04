package defpackage;

/* JADX INFO: renamed from: lِٖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12051l implements InterfaceC14458l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f23979l;

    public C12051l(long j) {
        this.f23979l = j;
        if (j >= 0) {
            return;
        }
        C10754l.metrica(AbstractC2812l.subscription(j, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.InterfaceC14458l
    public final InterfaceC6942l amazon(C6930l c6930l) {
        C9604l c9604l = new C9604l(this, null);
        int i = AbstractC16600l.yandex;
        return AbstractC0622l.isPro(new C2347l(new C12867l(c9604l, c6930l, C17218l.f33421l, -2, 1), new C2051l(2, null, 15), 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C12051l) && this.f23979l == ((C12051l) obj).f23979l;
    }

    public final int hashCode() {
        long j = this.f23979l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        C10227l c10227l = new C10227l(2);
        long j = this.f23979l;
        if (j < Long.MAX_VALUE) {
            c10227l.add("replayExpiration=" + j + "ms");
        }
        return AbstractC2812l.tapsense(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC16901l.m4210case(AbstractC14055l.purchase(c10227l), null, null, null, null, 63), ')');
    }
}
