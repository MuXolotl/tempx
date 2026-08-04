package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import javax.crypto.KeyAgreement;

/* JADX INFO: renamed from: lٜٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C17423l {
    public final /* synthetic */ int yandex;
    public static final C15578l loadAd = new C15578l(-942249008, false, new C13982l(2));
    public static final C15578l crashlytics = new C15578l(-866005904, false, new C13982l(5));
    public static final C15578l amazon = new C15578l(-178126935, false, new C13982l(6));
    public static final C15578l purchase = new C15578l(1912750781, false, new C13982l(7));
    public static final C15578l billing = new C15578l(-807991070, false, new C13982l(8));
    public static final C15578l mopub = new C15578l(258122638, false, new C1104l(20));
    public static final C15578l admob = new C15578l(-159347324, false, new C1104l(21));
    public static final C15578l subs = new C15578l(1157792424, false, new C1104l(22));
    public static final C15578l isPro = new C15578l(35946994, false, new C1104l(23));
    public static final C15578l firebase = new C15578l(-1206527493, false, new C13982l(3));
    public static final C15578l smaato = new C15578l(-1375695819, false, new C13982l(4));

    public /* synthetic */ C17423l(int i) {
        this.yandex = i;
    }

    public static KeyPair billing(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C12437l.purchase.yandex.appmetrica("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static String firebase(InterfaceC14189l interfaceC14189l, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = AbstractC9050l.yandex;
        }
        return charset.equals(AbstractC9050l.yandex) ? AbstractC17291l.mopub(interfaceC14189l) : AbstractC15788l.loadAd(charset.newDecoder(), interfaceC14189l);
    }

    public static byte[] isPro(EllipticCurve ellipticCurve, EnumC5521l enumC5521l, ECPoint eCPoint) throws GeneralSecurityException {
        AbstractC12312l.loadAd(eCPoint, ellipticCurve);
        int iPurchase = purchase(ellipticCurve);
        int iOrdinal = enumC5521l.ordinal();
        if (iOrdinal == 0) {
            int i = (iPurchase * 2) + 1;
            byte[] bArr = new byte[i];
            byte[] bArrBilling = AbstractC17185l.billing(eCPoint.getAffineX());
            byte[] bArrBilling2 = AbstractC17185l.billing(eCPoint.getAffineY());
            System.arraycopy(bArrBilling2, 0, bArr, i - bArrBilling2.length, bArrBilling2.length);
            System.arraycopy(bArrBilling, 0, bArr, (iPurchase + 1) - bArrBilling.length, bArrBilling.length);
            bArr[0] = 4;
            return bArr;
        }
        if (iOrdinal == 1) {
            int i2 = iPurchase + 1;
            byte[] bArr2 = new byte[i2];
            byte[] bArrBilling3 = AbstractC17185l.billing(eCPoint.getAffineX());
            System.arraycopy(bArrBilling3, 0, bArr2, i2 - bArrBilling3.length, bArrBilling3.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        if (iOrdinal != 2) {
            throw new GeneralSecurityException("invalid format:".concat(String.valueOf(enumC5521l)));
        }
        int i3 = iPurchase * 2;
        byte[] bArr3 = new byte[i3];
        byte[] bArrBilling4 = AbstractC17185l.billing(eCPoint.getAffineX());
        if (bArrBilling4.length > iPurchase) {
            bArrBilling4 = Arrays.copyOfRange(bArrBilling4, bArrBilling4.length - iPurchase, bArrBilling4.length);
        }
        byte[] bArrBilling5 = AbstractC17185l.billing(eCPoint.getAffineY());
        if (bArrBilling5.length > iPurchase) {
            bArrBilling5 = Arrays.copyOfRange(bArrBilling5, bArrBilling5.length - iPurchase, bArrBilling5.length);
        }
        System.arraycopy(bArrBilling5, 0, bArr3, i3 - bArrBilling5.length, bArrBilling5.length);
        System.arraycopy(bArrBilling4, 0, bArr3, iPurchase - bArrBilling4.length, bArrBilling4.length);
        return bArr3;
    }

    public static BigInteger loadAd(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerAmazon = AbstractC12312l.amazon(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerAmazon);
        if (bigIntegerAmazon.signum() != 1) {
            C18073l.pro("p must be positive");
            return null;
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerAmazon);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerAmazon.testBit(0) && bigIntegerAmazon.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerAmazon.add(BigInteger.ONE).shiftRight(2), bigIntegerAmazon);
            } else if (!bigIntegerAmazon.testBit(0) || bigIntegerAmazon.testBit(1)) {
                bigIntegerAdd = null;
            } else {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerAmazon.subtract(bigIntegerAdd).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerAmazon);
                    if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerAmazon);
                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                        if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerAmazon)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerAmazon.add(bigIntegerMod4).shiftRight(1);
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerAmazon).multiply(bigIntegerMod3)).mod(bigIntegerAmazon);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerAmazon);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerAmazon);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerAmazon);
                                    bigIntegerMod5 = bigIntegerMod7;
                                } else {
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                C18073l.pro("p is not prime");
                                return null;
                            }
                            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                            i++;
                            if (i == 128 && !bigIntegerAmazon.isProbablePrime(80)) {
                                C18073l.pro("p is not prime");
                                return null;
                            }
                        }
                    }
                }
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerAmazon).compareTo(bigIntegerMod2) != 0) {
                C18262l.ads("Could not find a modular square root");
                return null;
            }
        }
        return z != bigIntegerAdd.testBit(0) ? bigIntegerAmazon.subtract(bigIntegerAdd).mod(bigIntegerAmazon) : bigIntegerAdd;
    }

    public static ECParameterSpec mopub(EnumC1618l enumC1618l) {
        int iOrdinal = enumC1618l.ordinal();
        if (iOrdinal == 0) {
            return AbstractC12312l.yandex;
        }
        if (iOrdinal == 1) {
            return AbstractC12312l.loadAd;
        }
        if (iOrdinal == 2) {
            return AbstractC12312l.crashlytics;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(enumC1618l)));
    }

    public static int purchase(EllipticCurve ellipticCurve) {
        return (AbstractC12312l.amazon(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static final InterfaceC17807l remoteconfig(C6956l c6956l, int i) {
        InterfaceC1878l interfaceC1878l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).amazon;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return interfaceC1878l.billing();
        }
        if (iInmobi == 1) {
            return interfaceC1878l.crashlytics();
        }
        if (iInmobi == 2) {
            return interfaceC1878l.purchase();
        }
        if (iInmobi == 3) {
            return interfaceC1878l.amazon();
        }
        if (iInmobi == 4) {
            return interfaceC1878l.loadAd();
        }
        if (iInmobi == 5) {
            return interfaceC1878l.yandex();
        }
        C18725l.billing();
        return null;
    }

    public static final byte[] smaato(String str, Charset charset) {
        return charset.equals(AbstractC9050l.yandex) ? AbstractC16648l.tapsense(str) : AbstractC17082l.loadAd(charset.newEncoder(), str, 0, str.length());
    }

    public static ECPoint subs(EllipticCurve ellipticCurve, EnumC5521l enumC5521l, byte[] bArr) throws GeneralSecurityException {
        int iPurchase = purchase(ellipticCurve);
        int iOrdinal = enumC5521l.ordinal();
        boolean z = false;
        if (iOrdinal == 0) {
            if (bArr.length != (iPurchase * 2) + 1) {
                C18262l.ads("invalid point size");
                return null;
            }
            if (bArr[0] != 4) {
                C18262l.ads("invalid point format");
                return null;
            }
            int i = iPurchase + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
            AbstractC12312l.loadAd(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(enumC5521l)));
            }
            if (bArr.length != iPurchase * 2) {
                C18262l.ads("invalid point size");
                return null;
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iPurchase)), new BigInteger(1, Arrays.copyOfRange(bArr, iPurchase, bArr.length)));
            AbstractC12312l.loadAd(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        BigInteger bigIntegerAmazon = AbstractC12312l.amazon(ellipticCurve);
        if (bArr.length != iPurchase + 1) {
            C18262l.ads("compressed point has wrong length");
            return null;
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                C18262l.ads("invalid format");
                return null;
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() != -1 && bigInteger.compareTo(bigIntegerAmazon) < 0) {
            return new ECPoint(bigInteger, loadAd(bigInteger, z, ellipticCurve));
        }
        C18262l.ads("x is out of range");
        return null;
    }

    public static void vip(C18476l c18476l, CharSequence charSequence, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = charSequence.length();
        }
        Charset charset = AbstractC9050l.yandex;
        AbstractC17291l.subs(c18476l, charSequence.toString(), 0, i);
    }

    public static byte[] yandex(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        try {
            if (!AbstractC12312l.billing(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            AbstractC12312l.loadAd(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = ((KeyFactory) C12437l.billing.yandex.appmetrica("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) C12437l.amazon.yandex.appmetrica("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(AbstractC12312l.amazon(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                loadAd(bigInteger, true, curve);
                return bArrGenerateSecret;
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public final Object admob(Intent intent, int i) {
        List arrayList;
        z = false;
        boolean z = false;
        switch (this.yandex) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = C2580l.f5619l;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Uri uri = clipData.getItemAt(i2).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) AbstractC16901l.m4217extends(arrayList);
            case 2:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        return AbstractC8676l.subscription(AbstractC16901l.m4226l(arrayList2, AbstractC8669l.m2420volatile(stringArrayExtra)));
                    }
                }
                return C14054l.f27396l;
            case 3:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i4 : intArrayExtra2) {
                        if (i4 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return new C6597l(intent, i);
            default:
                return new C6597l(intent, i);
        }
    }

    public Intent amazon(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.yandex) {
            case 0:
                return crashlytics(context, (Uri) obj);
            case 1:
                C4660l c4660l = (C4660l) obj;
                if (AbstractC5121l.firebase()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(AbstractC5121l.subs(c4660l.yandex));
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(AbstractC5121l.subs(c4660l.yandex));
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity == null) {
                    C8339l.smaato("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(AbstractC5121l.subs(c4660l.yandex));
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent3;
            case 2:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 3:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
            case 4:
                return (Intent) obj;
            default:
                C12185l c12185l = (C12185l) obj;
                Intent intent4 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent5 = c12185l.f24204l;
                if (intent5 != null && (bundleExtra = intent5.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent4.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent5.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent5.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c12185l = new C12185l(c12185l.f24205l, null, c12185l.f24203l, c12185l.f24206l);
                    }
                }
                intent4.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c12185l);
                if (C13734l.m3727volatile(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent4);
                }
                return intent4;
        }
    }

    public Intent crashlytics(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (Build.VERSION.SDK_INT >= 26 && uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        return intent;
    }
}
