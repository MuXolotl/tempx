package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lٍٍٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14788l {
    public static final byte[] isPro = {0, 0};
    public byte[] admob;
    public C1180l amazon;
    public byte[] billing;
    public C9314l crashlytics;
    public byte[] loadAd;
    public byte[] mopub;
    public SecureRandom purchase;
    public byte[] subs;
    public byte[] yandex;

    public final byte[] yandex(byte[] bArr) {
        SecureRandom secureRandom = this.purchase;
        if (secureRandom != null) {
            secureRandom.nextBytes(this.loadAd);
        } else {
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.amazon.f3173l.yandex);
            byte[] bArr2 = this.loadAd;
            System.arraycopy(bArrCrashlytics, 0, bArr2, 0, bArr2.length);
        }
        return AbstractC6716l.admob((C18097l) this.amazon.f16541l, this.admob, this.subs, this.billing, this.mopub, this.yandex, bArr, this.loadAd);
    }
}
