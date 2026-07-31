package defpackage;

/* JADX INFO: renamed from: lٍؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9314l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f19126l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f19127l;

    public C9314l(C18097l c18097l, byte[] bArr) {
        super((Object) c18097l, false);
        int iCrashlytics = c18097l.loadAd.crashlytics();
        int i = iCrashlytics * 2;
        if (bArr.length != i) {
            C8339l.metrica("public key encoding does not match parameters");
            throw null;
        }
        this.f19126l = AbstractC14024l.vip(0, iCrashlytics, bArr);
        this.f19127l = AbstractC14024l.vip(iCrashlytics, i, bArr);
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.mopub(this.f19126l, this.f19127l);
    }
}
