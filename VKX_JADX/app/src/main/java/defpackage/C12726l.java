package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: lّٝؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C12726l implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC8859l f25095l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f25096l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC11918l f25097l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final BigInteger f25098l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BigInteger f25099l;

    public C12726l(C6304l c6304l, AbstractC8859l abstractC8859l, BigInteger bigInteger) {
        this.f25097l = c6304l;
        this.f25095l = abstractC8859l.startapp();
        this.f25099l = bigInteger;
        this.f25098l = BigInteger.valueOf(1L);
        this.f25096l = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12726l)) {
            return false;
        }
        C12726l c12726l = (C12726l) obj;
        return this.f25097l.subs(c12726l.f25097l) && this.f25095l.amazon(c12726l.f25095l);
    }

    public final int hashCode() {
        return this.f25095l.hashCode() ^ this.f25097l.hashCode();
    }

    public C12726l(AbstractC11918l abstractC11918l, AbstractC8859l abstractC8859l, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f25097l = abstractC11918l;
        this.f25095l = abstractC8859l.startapp();
        this.f25099l = bigInteger;
        this.f25098l = bigInteger2;
        this.f25096l = bArr;
    }
}
