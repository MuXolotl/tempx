package defpackage;

/* JADX INFO: renamed from: lؘٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17728l extends IllegalStateException implements InterfaceC14404l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f34538l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f34539l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C17728l(long j, long j2) {
        StringBuilder sbSignature = AbstractC0653l.Signature(j2, "Body.size is too small. Body: ", ", Content-Length: ");
        sbSignature.append(j);
        super(sbSignature.toString());
        this.f34539l = j;
        this.f34538l = j2;
    }

    @Override // defpackage.InterfaceC14404l
    public final Throwable yandex() {
        C17728l c17728l = new C17728l(this.f34539l, this.f34538l);
        c17728l.initCause(this);
        return c17728l;
    }
}
