package defpackage;

/* JADX INFO: renamed from: lؗ۠ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5200l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3125l f11275l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f11276l;

    public C5200l(C3125l c3125l, byte[] bArr) {
        super(true);
        this.f11276l = AbstractC14024l.crashlytics(bArr);
        this.f11275l = c3125l;
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.crashlytics(this.f11276l);
    }

    public final C3125l yandex() {
        return this.f11275l;
    }
}
