package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.C10146l;
import defpackage.C1658l;
import defpackage.C17029l;
import defpackage.C17454l;
import defpackage.C18073l;
import defpackage.C18493l;
import defpackage.C2756l;
import defpackage.C7461l;
import defpackage.C8339l;
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
public class MLKEMKeyFactorySpi extends BasePQCKeyFactorySpi {
    private static final Set<Cfor> keyOids;

    public static class MLKEM1024 extends MLKEMKeyFactorySpi {
        public MLKEM1024() {
            super(InterfaceC8134l.f16968l);
        }
    }

    public static class MLKEM512 extends MLKEMKeyFactorySpi {
        public MLKEM512() {
            super(InterfaceC8134l.f16958l);
        }
    }

    public static class MLKEM768 extends MLKEMKeyFactorySpi {
        public MLKEM768() {
            super(InterfaceC8134l.f16977l);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        keyOids = hashSet;
        hashSet.add(InterfaceC8134l.f16958l);
        hashSet.add(InterfaceC8134l.f16977l);
        hashSet.add(InterfaceC8134l.f16968l);
    }

    public MLKEMKeyFactorySpi() {
        super(keyOids);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BasePQCKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        C10146l c10146l;
        if (!(keySpec instanceof C7461l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        C7461l c7461l = (C7461l) keySpec;
        byte[] bArr = c7461l.f15432l;
        boolean z = c7461l.f15433l;
        C18493l parameters = Utils.getParameters(c7461l.f15430l.f15658l);
        if (z) {
            if (!z) {
                C8339l.smaato("KeySpec represents long form");
                return null;
            }
            c10146l = new C10146l(parameters, AbstractC14024l.crashlytics(bArr), null);
        } else {
            if (z) {
                C8339l.smaato("KeySpec represents seed");
                return null;
            }
            C10146l c10146l2 = new C10146l(parameters, AbstractC14024l.crashlytics(bArr), null);
            if (z) {
                C8339l.smaato("KeySpec represents long form");
                return null;
            }
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c7461l.f15431l);
            if (bArrCrashlytics != null && !AbstractC14024l.smaato(bArrCrashlytics, AbstractC14024l.mopub(c10146l2.f20662l, c10146l2.f20657l))) {
                C18073l.subscription("public key data does not match private key data");
                return null;
            }
            c10146l = c10146l2;
        }
        return new BCMLKEMPrivateKey(c10146l);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BasePQCKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof C17454l)) {
            return super.engineGeneratePublic(keySpec);
        }
        C17454l c17454l = (C17454l) keySpec;
        return new BCMLKEMPublicKey(new C1658l(Utils.getParameters(c17454l.f34003l.f15658l), AbstractC14024l.crashlytics(c17454l.f34002l)));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCMLKEMPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C7461l.class.isAssignableFrom(cls)) {
                BCMLKEMPrivateKey bCMLKEMPrivateKey = (BCMLKEMPrivateKey) key;
                byte[] seed = bCMLKEMPrivateKey.getSeed();
                return seed != null ? new C7461l(bCMLKEMPrivateKey.getParameterSpec(), seed) : new C7461l(bCMLKEMPrivateKey.getParameterSpec(), bCMLKEMPrivateKey.getPrivateData(), bCMLKEMPrivateKey.getPublicKey().getPublicData());
            }
            if (C17454l.class.isAssignableFrom(cls)) {
                BCMLKEMPrivateKey bCMLKEMPrivateKey2 = (BCMLKEMPrivateKey) key;
                return new C17454l(bCMLKEMPrivateKey2.getParameterSpec(), bCMLKEMPrivateKey2.getPublicKey().getPublicData());
            }
        } else {
            if (!(key instanceof BCMLKEMPublicKey)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (C17454l.class.isAssignableFrom(cls)) {
                BCMLKEMPublicKey bCMLKEMPublicKey = (BCMLKEMPublicKey) key;
                return new C17454l(bCMLKEMPublicKey.getParameterSpec(), bCMLKEMPublicKey.getPublicData());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCMLKEMPrivateKey) || (key instanceof BCMLKEMPublicKey)) {
            return key;
        }
        C18073l.smaato("unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) {
        return new BCMLKEMPrivateKey(c2756l);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) {
        return new BCMLKEMPublicKey(c17029l);
    }

    public MLKEMKeyFactorySpi(Cfor cfor) {
        super(cfor);
    }
}
