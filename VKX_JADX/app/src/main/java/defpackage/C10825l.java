package defpackage;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;

/* JADX INFO: renamed from: lُؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10825l extends ECParameterSpec {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f21882l;

    public C10825l(String str, AbstractC11918l abstractC11918l, AbstractC8859l abstractC8859l, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        ECField eCFieldF2m;
        InterfaceC3340l interfaceC3340l = abstractC11918l.yandex;
        if (AbstractC6974l.firebase(interfaceC3340l)) {
            eCFieldF2m = new ECFieldFp(interfaceC3340l.loadAd());
        } else {
            int[] iArr = ((C10044l) interfaceC3340l).loadAd.yandex;
            int[] iArrAmazon = AbstractC14024l.amazon(iArr);
            int[] iArrMetrica = AbstractC14024l.metrica(1, iArrAmazon.length - 1, iArrAmazon);
            int length = iArrMetrica.length - 1;
            for (int i = 0; i < length; i++) {
                int i2 = iArrMetrica[i];
                iArrMetrica[i] = iArrMetrica[length];
                iArrMetrica[length] = i2;
                length--;
            }
            eCFieldF2m = new ECFieldF2m(iArr[iArr.length - 1], iArrMetrica);
        }
        super(new EllipticCurve(eCFieldF2m, abstractC11918l.loadAd.signatures(), abstractC11918l.crashlytics.signatures(), bArr), EC5Util.convertPoint(abstractC8859l), bigInteger, bigInteger2.intValue());
        this.f21882l = str;
    }

    public C10825l(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f21882l = str;
    }
}
