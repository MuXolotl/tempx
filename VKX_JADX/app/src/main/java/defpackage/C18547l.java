package defpackage;

/* JADX INFO: renamed from: lۙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18547l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f36211l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f36212l;

    public C18547l(C8719l c8719l, byte[] bArr, byte[] bArr2) {
        super((Object) c8719l, false);
        C16825l c16825l = c8719l.f17938l;
        if (bArr.length != c16825l.crashlytics) {
            C8339l.metrica("'t' has invalid length");
            throw null;
        }
        if (bArr2.length != 32) {
            C8339l.metrica("'rho' has invalid length");
            throw null;
        }
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
        this.f36211l = bArrCrashlytics;
        this.f36212l = AbstractC14024l.crashlytics(bArr2);
        if (c16825l.yandex(bArrCrashlytics)) {
            return;
        }
        C8339l.metrica("Modulus check failed for ML-KEM public key");
        throw null;
    }

    public C18547l(C8719l c8719l, byte[] bArr) {
        super((Object) c8719l, false);
        C16825l c16825l = c8719l.f17938l;
        if (bArr.length != c16825l.purchase) {
            C8339l.metrica("'encoding' has invalid length");
            throw null;
        }
        byte[] bArrVip = AbstractC14024l.vip(0, bArr.length - 32, bArr);
        this.f36211l = bArrVip;
        this.f36212l = AbstractC14024l.vip(bArr.length - 32, bArr.length, bArr);
        if (c16825l.yandex(bArrVip)) {
            return;
        }
        C8339l.metrica("Modulus check failed for ML-KEM public key");
        throw null;
    }
}
