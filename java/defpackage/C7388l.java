package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;

/* JADX INFO: renamed from: lؚٜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7388l extends AbstractC10840l {
    public static final HashSet yandex;

    static {
        HashSet hashSet = new HashSet();
        yandex = hashSet;
        hashSet.add(InterfaceC2522l.f5476l);
        hashSet.add(InterfaceC2522l.f5473l);
        hashSet.add(InterfaceC2522l.f5361l);
    }

    public C7388l() {
        super(yandex);
    }

    @Override // defpackage.AbstractC10840l, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                C18725l.amazon(e);
                return null;
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // defpackage.AbstractC10840l, java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            C18262l.vip(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e) {
            C18725l.amazon(e);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C2618l) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C2618l) key).getEncoded());
            }
        } else {
            if (!(key instanceof C8847l)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C8847l) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C2618l) || (key instanceof C8847l)) {
            return key;
        }
        C18073l.smaato("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C2756l c2756l) {
        C2618l c2618l = new C2618l();
        c2618l.f5692l = c2756l.f5964l;
        c2618l.f5693l = (C10002l) AbstractC6159l.loadAd(c2756l);
        return c2618l;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C17029l c17029l) {
        C8847l c8847l = new C8847l();
        c8847l.f18193l = (C7006l) AbstractC7766l.yandex(c17029l);
        return c8847l;
    }
}
