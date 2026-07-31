package defpackage;

/* JADX INFO: renamed from: lٍّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12397l extends Exception {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f24492l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12397l(String str, Exception exc) {
        super(str, exc);
        AbstractC1051l.mopub(str, "Provided message must not be empty.");
        this.f24492l = 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12397l(String str, int i) {
        super(str);
        AbstractC1051l.mopub(str, "Provided message must not be empty.");
        this.f24492l = i;
    }
}
