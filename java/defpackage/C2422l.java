package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؔؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2422l extends C14785l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f5180l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BigInteger f5181l;

    public C2422l(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(i, secureRandom);
        if (i < 12) {
            C8339l.metrica("key strength too small");
            throw null;
        }
        if (!bigInteger.testBit(0)) {
            C8339l.metrica("public exponent cannot be even");
            throw null;
        }
        this.f5181l = bigInteger;
        this.f5180l = i2;
    }
}
