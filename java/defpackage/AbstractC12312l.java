package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: renamed from: lّؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12312l {
    public static final ECParameterSpec yandex = purchase("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    public static final ECParameterSpec loadAd = purchase("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    public static final ECParameterSpec crashlytics = purchase("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    public static final BigInteger amazon = BigInteger.valueOf(2);
    public static final BigInteger purchase = BigInteger.valueOf(3);
    public static final BigInteger billing = BigInteger.valueOf(4);
    public static final BigInteger mopub = BigInteger.valueOf(8);

    public static C3169l admob(ECPoint eCPoint, BigInteger bigInteger) {
        if (eCPoint.equals(ECPoint.POINT_INFINITY)) {
            return C3169l.amazon;
        }
        BigInteger bigIntegerMod = new BigInteger(1, AbstractC14640l.yandex((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        BigInteger bigIntegerMod2 = bigIntegerMod.multiply(bigIntegerMod).mod(bigInteger);
        return new C3169l(eCPoint.getAffineX().multiply(bigIntegerMod2).mod(bigInteger), eCPoint.getAffineY().multiply(bigIntegerMod2.multiply(bigIntegerMod).mod(bigInteger)).mod(bigInteger), bigIntegerMod);
    }

    public static BigInteger amazon(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        C18262l.ads("Only curves over prime order fields are supported");
        return null;
    }

    public static boolean billing(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    public static C3169l crashlytics(C3169l c3169l, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = c3169l.loadAd;
        BigInteger bigInteger4 = c3169l.crashlytics;
        BigInteger bigInteger5 = c3169l.loadAd;
        BigInteger bigInteger6 = c3169l.yandex;
        if (bigInteger3.equals(BigInteger.ZERO)) {
            return C3169l.amazon;
        }
        BigInteger bigIntegerMod = bigInteger6.multiply(bigInteger6).mod(bigInteger2);
        BigInteger bigIntegerMod2 = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerMod3 = bigIntegerMod2.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod4 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigIntegerAdd = bigInteger6.add(bigIntegerMod2);
        BigInteger bigIntegerSubtract = bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod3);
        BigInteger bigInteger7 = amazon;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigInteger7);
        BigInteger bigIntegerAdd2 = bigIntegerMod.multiply(purchase).add(bigInteger.multiply(bigIntegerMod4).multiply(bigIntegerMod4).mod(bigInteger2));
        BigInteger bigIntegerMod5 = bigIntegerAdd2.multiply(bigIntegerAdd2).mod(bigInteger2).subtract(bigIntegerMultiply.multiply(bigInteger7)).mod(bigInteger2);
        BigInteger bigIntegerMod6 = bigIntegerAdd2.multiply(bigIntegerMultiply.subtract(bigIntegerMod5)).mod(bigInteger2).subtract(bigIntegerMod3.multiply(mopub)).mod(bigInteger2);
        BigInteger bigIntegerAdd3 = bigInteger5.add(bigInteger4);
        return new C3169l(bigIntegerMod5, bigIntegerMod6, bigIntegerAdd3.multiply(bigIntegerAdd3).mod(bigInteger2).subtract(bigIntegerMod2).subtract(bigIntegerMod4).mod(bigInteger2));
    }

    public static void loadAd(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger bigIntegerAmazon = amazon(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            C18262l.ads("point is at infinity");
            return;
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerAmazon) >= 0) {
            C18262l.ads("x is out of range");
            return;
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerAmazon) >= 0) {
            C18262l.ads("y is out of range");
        } else {
            if (affineY.multiply(affineY).mod(bigIntegerAmazon).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerAmazon))) {
                return;
            }
            C18262l.ads("Point is not on curve");
        }
    }

    public static ECPoint mopub(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        ECPoint eCPoint;
        if (!billing(eCParameterSpec, yandex) && !billing(eCParameterSpec, loadAd) && !billing(eCParameterSpec, crashlytics)) {
            C18262l.ads("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            C18262l.ads("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            C18262l.ads("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        loadAd(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerAmazon = amazon(curve);
        C3169l c3169lAdmob = admob(ECPoint.POINT_INFINITY, bigIntegerAmazon);
        C3169l c3169lAdmob2 = admob(generator, bigIntegerAmazon);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                c3169lAdmob = yandex(c3169lAdmob, c3169lAdmob2, a, bigIntegerAmazon);
                c3169lAdmob2 = crashlytics(c3169lAdmob2, a, bigIntegerAmazon);
            } else {
                c3169lAdmob2 = yandex(c3169lAdmob, c3169lAdmob2, a, bigIntegerAmazon);
                c3169lAdmob = crashlytics(c3169lAdmob, a, bigIntegerAmazon);
            }
        }
        if (c3169lAdmob.crashlytics.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = c3169lAdmob.crashlytics.modInverse(bigIntegerAmazon);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerAmazon);
            eCPoint = new ECPoint(c3169lAdmob.yandex.multiply(bigIntegerMod).mod(bigIntegerAmazon), c3169lAdmob.loadAd.multiply(bigIntegerMod).mod(bigIntegerAmazon).multiply(bigIntegerModInverse).mod(bigIntegerAmazon));
        }
        loadAd(eCPoint, curve);
        return eCPoint;
    }

    public static ECParameterSpec purchase(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static C3169l yandex(C3169l c3169l, C3169l c3169l2, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = c3169l.crashlytics;
        BigInteger bigInteger4 = BigInteger.ZERO;
        boolean zEquals = bigInteger3.equals(bigInteger4);
        BigInteger bigInteger5 = c3169l.crashlytics;
        if (zEquals) {
            return c3169l2;
        }
        boolean zEquals2 = c3169l2.crashlytics.equals(bigInteger4);
        BigInteger bigInteger6 = c3169l2.crashlytics;
        if (zEquals2) {
            return c3169l;
        }
        BigInteger bigIntegerMod = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerMod2 = bigInteger6.multiply(bigInteger6).mod(bigInteger2);
        BigInteger bigIntegerMod3 = c3169l.yandex.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod4 = c3169l2.yandex.multiply(bigIntegerMod).mod(bigInteger2);
        BigInteger bigIntegerMod5 = c3169l.loadAd.multiply(bigInteger6).mod(bigInteger2).multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod6 = c3169l2.loadAd.multiply(bigInteger5).mod(bigInteger2).multiply(bigIntegerMod).mod(bigInteger2);
        if (bigIntegerMod3.equals(bigIntegerMod4)) {
            return !bigIntegerMod5.equals(bigIntegerMod6) ? C3169l.amazon : crashlytics(c3169l, bigInteger, bigInteger2);
        }
        BigInteger bigIntegerMod7 = bigIntegerMod4.subtract(bigIntegerMod3).mod(bigInteger2);
        BigInteger bigIntegerMod8 = bigIntegerMod7.multiply(billing).multiply(bigIntegerMod7).mod(bigInteger2);
        BigInteger bigIntegerMod9 = bigIntegerMod7.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerSubtract = bigIntegerMod6.subtract(bigIntegerMod5);
        BigInteger bigInteger7 = amazon;
        BigInteger bigIntegerMod10 = bigIntegerSubtract.multiply(bigInteger7).mod(bigInteger2);
        BigInteger bigIntegerMod11 = bigIntegerMod3.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerMod12 = bigIntegerMod10.multiply(bigIntegerMod10).mod(bigInteger2).subtract(bigIntegerMod9).subtract(bigIntegerMod11.multiply(bigInteger7)).mod(bigInteger2);
        BigInteger bigIntegerMod13 = bigIntegerMod10.multiply(bigIntegerMod11.subtract(bigIntegerMod12)).subtract(bigIntegerMod5.multiply(bigInteger7).multiply(bigIntegerMod9)).mod(bigInteger2);
        BigInteger bigIntegerAdd = bigInteger5.add(bigInteger6);
        return new C3169l(bigIntegerMod12, bigIntegerMod13, bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod2).multiply(bigIntegerMod7).mod(bigInteger2));
    }
}
