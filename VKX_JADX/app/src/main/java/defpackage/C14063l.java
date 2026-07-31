package defpackage;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

/* JADX INFO: renamed from: lَٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14063l extends DHParameterSpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f27408l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BigInteger f27409l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final BigInteger f27410l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C14396l f27411l;

    public C14063l(C2396l c2396l) {
        this(c2396l.f5160l, c2396l.f5162l, c2396l.f5158l, c2396l.f5156l, c2396l.f5159l, c2396l.f5161l);
        this.f27411l = c2396l.f5157l;
    }

    public final C2396l yandex() {
        return new C2396l(getP(), getG(), this.f27410l, this.f27408l, getL(), this.f27409l, this.f27411l);
    }

    public C14063l(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(bigInteger, bigInteger3, i2);
        this.f27410l = bigInteger2;
        this.f27409l = bigInteger4;
        this.f27408l = i;
    }
}
