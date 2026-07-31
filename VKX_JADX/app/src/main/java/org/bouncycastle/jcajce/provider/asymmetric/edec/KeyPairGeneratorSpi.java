package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C10975l;
import defpackage.C11467l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C3316l;
import defpackage.C5008l;
import defpackage.C5138l;
import defpackage.C5911l;
import defpackage.C6051l;
import defpackage.C8339l;
import defpackage.InterfaceC2716l;
import defpackage.InterfaceC8145l;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 2;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 4;
    private static final int XDH = -2;
    private final int algorithmDeclared;
    private int algorithmInitialized;
    private InterfaceC8145l generator;
    private SecureRandom secureRandom;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1);
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(2);
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3);
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(4);
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(KeyPairGeneratorSpi.XDH);
        }
    }

    public KeyPairGeneratorSpi(int i) {
        this.algorithmDeclared = i;
        if (getAlgorithmFamily(i) != i) {
            this.algorithmInitialized = i;
        }
    }

    private static int getAlgorithmFamily(int i) {
        if (i == 1 || i == 2) {
            return -1;
        }
        return (i == 3 || i == 4) ? XDH : i;
    }

    private static int getAlgorithmForName(String str) throws InvalidAlgorithmParameterException {
        if (str.equalsIgnoreCase("X25519") || str.equals(InterfaceC2716l.yandex.inmobi())) {
            return 3;
        }
        if (str.equalsIgnoreCase("Ed25519") || str.equals(InterfaceC2716l.crashlytics.inmobi())) {
            return 1;
        }
        if (str.equalsIgnoreCase("X448") || str.equals(InterfaceC2716l.loadAd.inmobi())) {
            return 4;
        }
        if (str.equalsIgnoreCase("Ed448") || str.equals(InterfaceC2716l.amazon.inmobi())) {
            return 2;
        }
        throw new InvalidAlgorithmParameterException("invalid parameterSpec name: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r4 == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r4 == 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getAlgorithmForStrength(int r5) {
        /*
            r4 = this;
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r1 = "key size not configurable"
            r2 = -1
            r3 = -2
            if (r5 == r0) goto L2a
            r0 = 256(0x100, float:3.59E-43)
            if (r5 == r0) goto L2a
            r0 = 448(0x1c0, float:6.28E-43)
            if (r5 != r0) goto L24
            int r4 = r4.algorithmDeclared
            r5 = 4
            if (r4 == r3) goto L23
            r0 = 2
            if (r4 == r2) goto L22
            if (r4 == r0) goto L22
            if (r4 != r5) goto L1d
            goto L23
        L1d:
            defpackage.C11467l.license(r1)
        L20:
            r4 = 0
            return r4
        L22:
            return r0
        L23:
            return r5
        L24:
            java.lang.String r4 = "unknown key size"
            defpackage.C11467l.license(r4)
            goto L20
        L2a:
            int r4 = r4.algorithmDeclared
            r5 = 3
            if (r4 == r3) goto L38
            r0 = 1
            if (r4 == r2) goto L37
            if (r4 == r0) goto L37
            if (r4 != r5) goto L1d
            goto L38
        L37:
            return r0
        L38:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi.getAlgorithmForStrength(int):int");
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            return ((ECGenParameterSpec) algorithmParameterSpec).getName();
        }
        return algorithmParameterSpec instanceof C6051l ? ((C6051l) algorithmParameterSpec).f12824l : ECUtil.getNameFrom(algorithmParameterSpec);
    }

    private InterfaceC8145l setupGenerator() {
        if (this.secureRandom == null) {
            this.secureRandom = AbstractC8776l.loadAd();
        }
        int i = this.algorithmInitialized;
        if (i == 1) {
            C5138l c5138l = new C5138l((char) 0, 12);
            SecureRandom secureRandomLoadAd = this.secureRandom;
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
            c5138l.f11181l = secureRandomLoadAd;
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
            return c5138l;
        }
        if (i == 2) {
            C10975l c10975l = new C10975l(10, false);
            SecureRandom secureRandomLoadAd2 = this.secureRandom;
            if (secureRandomLoadAd2 == null) {
                secureRandomLoadAd2 = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal2 = AbstractC8776l.yandex;
            }
            c10975l.f22121l = secureRandomLoadAd2;
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
            return c10975l;
        }
        if (i == 3) {
            C3316l c3316l = new C3316l(27, false);
            SecureRandom secureRandomLoadAd3 = this.secureRandom;
            if (secureRandomLoadAd3 == null) {
                secureRandomLoadAd3 = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal3 = AbstractC8776l.yandex;
            }
            c3316l.f7072l = secureRandomLoadAd3;
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
            return c3316l;
        }
        if (i != 4) {
            C8339l.smaato("generator not correctly initialized");
            return null;
        }
        C5008l c5008l = new C5008l(27, false);
        SecureRandom secureRandomLoadAd4 = this.secureRandom;
        if (secureRandomLoadAd4 == null) {
            secureRandomLoadAd4 = AbstractC8776l.loadAd();
        } else {
            ThreadLocal threadLocal4 = AbstractC8776l.yandex;
        }
        c5008l.f10245l = secureRandomLoadAd4;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
        return c5008l;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.algorithmInitialized == 0) {
            C8339l.smaato("generator not correctly initialized");
            return null;
        }
        if (this.generator == null) {
            this.generator = setupGenerator();
        }
        C18595l c18595lPurchase = this.generator.purchase();
        int i = this.algorithmInitialized;
        if (i == 1 || i == 2) {
            return new KeyPair(new BCEdDSAPublicKey((AbstractC8831l) c18595lPurchase.f36317l), new BCEdDSAPrivateKey((AbstractC8831l) c18595lPurchase.f36316l));
        }
        if (i == 3 || i == 4) {
            return new KeyPair(new BCXDHPublicKey((AbstractC8831l) c18595lPurchase.f36317l), new BCXDHPrivateKey((AbstractC8831l) c18595lPurchase.f36316l));
        }
        C8339l.smaato("generator not correctly initialized");
        return null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            C11467l.pro(algorithmParameterSpec, "invalid parameterSpec: ");
            return;
        }
        int algorithmForName = getAlgorithmForName(nameFromParams);
        int i = this.algorithmDeclared;
        if (i != algorithmForName && i != getAlgorithmFamily(algorithmForName)) {
            C18073l.pro("parameterSpec for wrong curve type");
            return;
        }
        this.algorithmInitialized = algorithmForName;
        this.secureRandom = secureRandom;
        this.generator = null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.algorithmInitialized = getAlgorithmForStrength(i);
        this.secureRandom = secureRandom;
        this.generator = null;
    }
}
