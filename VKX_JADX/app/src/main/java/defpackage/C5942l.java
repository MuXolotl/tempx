package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؘۙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5942l extends Cnative {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final BigInteger f12506l = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public BigInteger f12507l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f12508l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17203l f12509l;

    public C5942l(C17203l c17203l, byte[] bArr, int i) {
        this.f12509l = c17203l;
        this.f12508l = AbstractC14024l.crashlytics(bArr);
        this.f12507l = BigInteger.valueOf(i);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f12509l);
        appmetricaVar.purchase(new C11327l(this.f12508l));
        BigInteger bigInteger = this.f12507l;
        if (!bigInteger.equals(f12506l)) {
            appmetricaVar.purchase(new Cstrictfp(bigInteger));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
