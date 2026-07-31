package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.C13812l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C2756l;
import defpackage.C2820l;
import defpackage.C2822l;
import defpackage.C4124l;
import defpackage.C8339l;
import defpackage.C8729l;
import defpackage.Cfor;
import defpackage.InterfaceC8134l;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jcajce.provider.asymmetric.util.BasePQCKeyFactorySpi;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSAKeyFactorySpi extends BasePQCKeyFactorySpi {
    private static final Set<Cfor> hashKeyOids;
    private static final Set<Cfor> pureKeyOids;
    private final boolean isHashOnly;

    public static class Hash extends MLDSAKeyFactorySpi {
        public Hash() {
            super((Set<Cfor>) MLDSAKeyFactorySpi.hashKeyOids);
        }
    }

    public static class HashMLDSA44 extends MLDSAKeyFactorySpi {
        public HashMLDSA44() {
            super(InterfaceC8134l.f16951implements);
        }
    }

    public static class HashMLDSA65 extends MLDSAKeyFactorySpi {
        public HashMLDSA65() {
            super(InterfaceC8134l.f16942const);
        }
    }

    public static class HashMLDSA87 extends MLDSAKeyFactorySpi {
        public HashMLDSA87() {
            super(InterfaceC8134l.f16988return);
        }
    }

    public static class MLDSA44 extends MLDSAKeyFactorySpi {
        public MLDSA44() {
            super(InterfaceC8134l.f16997transient);
        }
    }

    public static class MLDSA65 extends MLDSAKeyFactorySpi {
        public MLDSA65() {
            super(InterfaceC8134l.f16986protected);
        }
    }

    public static class MLDSA87 extends MLDSAKeyFactorySpi {
        public MLDSA87() {
            super(InterfaceC8134l.f17000while);
        }
    }

    public static class Pure extends MLDSAKeyFactorySpi {
        public Pure() {
            super((Set<Cfor>) MLDSAKeyFactorySpi.pureKeyOids);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        pureKeyOids = hashSet;
        HashSet hashSet2 = new HashSet();
        hashKeyOids = hashSet2;
        Cfor cfor = InterfaceC8134l.f16997transient;
        hashSet.add(cfor);
        Cfor cfor2 = InterfaceC8134l.f16986protected;
        hashSet.add(cfor2);
        Cfor cfor3 = InterfaceC8134l.f17000while;
        hashSet.add(cfor3);
        hashSet2.add(cfor);
        hashSet2.add(cfor2);
        hashSet2.add(cfor3);
        hashSet2.add(InterfaceC8134l.f16951implements);
        hashSet2.add(InterfaceC8134l.f16942const);
        hashSet2.add(InterfaceC8134l.f16988return);
    }

    public MLDSAKeyFactorySpi(Cfor cfor) {
        super(cfor);
        this.isHashOnly = cfor.ad(InterfaceC8134l.f16951implements) || cfor.ad(InterfaceC8134l.f16942const) || cfor.ad(InterfaceC8134l.f16988return);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BasePQCKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        C8729l c8729l;
        if (!(keySpec instanceof C2822l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        C2822l c2822l = (C2822l) keySpec;
        byte[] bArr = c2822l.f6148l;
        boolean z = c2822l.f6149l;
        C13812l parameters = Utils.getParameters(c2822l.f6146l.f32815l);
        if (z) {
            if (!z) {
                C8339l.smaato("KeySpec represents long form");
                return null;
            }
            c8729l = new C8729l(parameters, AbstractC14024l.crashlytics(bArr), null);
        } else {
            if (z) {
                C8339l.smaato("KeySpec represents seed");
                return null;
            }
            C8729l c8729l2 = new C8729l(parameters, AbstractC14024l.crashlytics(bArr), null);
            if (z) {
                C8339l.smaato("KeySpec represents long form");
                return null;
            }
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c2822l.f6147l);
            if (bArrCrashlytics != null && !AbstractC14024l.smaato(bArrCrashlytics, AbstractC14024l.mopub(c8729l2.f17955l, c8729l2.f17961l))) {
                C18073l.subscription("public key data does not match private key data");
                return null;
            }
            c8729l = c8729l2;
        }
        return new BCMLDSAPrivateKey(c8729l);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BasePQCKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof C2820l)) {
            return super.engineGeneratePublic(keySpec);
        }
        C2820l c2820l = (C2820l) keySpec;
        return new BCMLDSAPublicKey(new C4124l(Utils.getParameters(c2820l.f6143l.f32815l), AbstractC14024l.crashlytics(c2820l.f6142l)));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCMLDSAPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C2822l.class.isAssignableFrom(cls)) {
                BCMLDSAPrivateKey bCMLDSAPrivateKey = (BCMLDSAPrivateKey) key;
                byte[] seed = bCMLDSAPrivateKey.getSeed();
                return seed != null ? new C2822l(bCMLDSAPrivateKey.getParameterSpec(), seed) : new C2822l(bCMLDSAPrivateKey.getParameterSpec(), bCMLDSAPrivateKey.getPrivateData(), bCMLDSAPrivateKey.getPublicKey().getPublicData());
            }
            if (C2820l.class.isAssignableFrom(cls)) {
                BCMLDSAPrivateKey bCMLDSAPrivateKey2 = (BCMLDSAPrivateKey) key;
                return new C2820l(bCMLDSAPrivateKey2.getParameterSpec(), bCMLDSAPrivateKey2.getPublicKey().getPublicData());
            }
        } else {
            if (!(key instanceof BCMLDSAPublicKey)) {
                throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (C2820l.class.isAssignableFrom(cls)) {
                BCMLDSAPublicKey bCMLDSAPublicKey = (BCMLDSAPublicKey) key;
                return new C2820l(bCMLDSAPublicKey.getParameterSpec(), bCMLDSAPublicKey.getPublicData());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCMLDSAPrivateKey) || (key instanceof BCMLDSAPublicKey)) {
            return key;
        }
        C18073l.smaato("unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) {
        C13812l c13812l;
        BCMLDSAPrivateKey bCMLDSAPrivateKey = new BCMLDSAPrivateKey(c2756l);
        if (!this.isHashOnly || bCMLDSAPrivateKey.getAlgorithm().indexOf("WITH") > 0) {
            return bCMLDSAPrivateKey;
        }
        C8729l keyParams = bCMLDSAPrivateKey.getKeyParams();
        C13812l c13812l2 = (C13812l) keyParams.f16541l;
        C13812l c13812l3 = (C13812l) keyParams.f16541l;
        if (c13812l2.equals(C13812l.amazon)) {
            c13812l = C13812l.mopub;
        } else if (c13812l3.equals(C13812l.purchase)) {
            c13812l = C13812l.admob;
        } else {
            if (!c13812l3.equals(C13812l.billing)) {
                C8339l.smaato("unknown ML-DSA parameters");
                return null;
            }
            c13812l = C13812l.subs;
        }
        return new BCMLDSAPrivateKey(new C8729l(c13812l, AbstractC14024l.crashlytics(keyParams.f17955l), AbstractC14024l.crashlytics(keyParams.f17960l), AbstractC14024l.crashlytics(keyParams.f17959l), AbstractC14024l.crashlytics(keyParams.f17962l), AbstractC14024l.crashlytics(keyParams.f17956l), AbstractC14024l.crashlytics(keyParams.f17957l), AbstractC14024l.crashlytics(keyParams.f17961l), AbstractC14024l.crashlytics(keyParams.f17958l)));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) {
        return new BCMLDSAPublicKey(c17029l);
    }

    public MLDSAKeyFactorySpi(Set<Cfor> set) {
        super(set);
        this.isHashOnly = false;
    }
}
