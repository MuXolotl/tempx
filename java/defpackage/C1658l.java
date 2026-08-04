package defpackage;

/* JADX INFO: renamed from: lؘؘؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1658l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f4002l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f4003l;

    public C1658l(C18493l c18493l, byte[] bArr, byte[] bArr2) {
        super((Object) c18493l, false);
        C13409l c13409lCrashlytics = C13409l.crashlytics(c18493l);
        if (bArr.length != c13409lCrashlytics.crashlytics) {
            C8339l.metrica("'t' has invalid length");
            throw null;
        }
        if (bArr2.length != 32) {
            C8339l.metrica("'rho' has invalid length");
            throw null;
        }
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
        this.f4002l = bArrCrashlytics;
        this.f4003l = AbstractC14024l.crashlytics(bArr2);
        if (c13409lCrashlytics.yandex(bArrCrashlytics)) {
            return;
        }
        C8339l.metrica("Modulus check failed for ML-KEM public key");
        throw null;
    }

    public C1658l(C18493l c18493l, byte[] bArr) {
        super((Object) c18493l, false);
        C13409l c13409lCrashlytics = C13409l.crashlytics(c18493l);
        if (bArr.length != c13409lCrashlytics.mopub) {
            C8339l.metrica("'encoding' has invalid length");
            throw null;
        }
        byte[] bArrVip = AbstractC14024l.vip(0, bArr.length - 32, bArr);
        this.f4002l = bArrVip;
        this.f4003l = AbstractC14024l.vip(bArr.length - 32, bArr.length, bArr);
        if (c13409lCrashlytics.yandex(bArrVip)) {
            return;
        }
        C8339l.metrica("Modulus check failed for ML-KEM public key");
        throw null;
    }
}
