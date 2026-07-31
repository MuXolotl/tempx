package defpackage;

/* JADX INFO: renamed from: lۧؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18715l extends AbstractC8002l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final byte[] f36474l = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18715l(C18715l c18715l) {
        super(f36474l);
        c18715l.getClass();
        loadAd(c18715l);
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 64;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C18715l(this);
    }

    public C18715l() {
        super(f36474l);
    }
}
