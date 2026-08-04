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

/* JADX INFO: renamed from: lؙؑۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0161l extends AbstractC10840l {
    public static final HashSet yandex;

    static {
        HashSet hashSet = new HashSet();
        yandex = hashSet;
        hashSet.add(InterfaceC2522l.f5477l);
        hashSet.add(InterfaceC2522l.f5420l);
        hashSet.add(InterfaceC2522l.f5446l);
        hashSet.add(InterfaceC2522l.f5336l);
    }

    public C0161l() {
        super(yandex);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C16082l) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C16082l) key).getEncoded());
            }
        } else {
            if (!(key instanceof C16429l)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C16429l) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C16082l) || (key instanceof C16429l)) {
            return key;
        }
        C18073l.smaato("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C2756l c2756l) {
        C16082l c16082l = new C16082l();
        c16082l.f31525l = c2756l.f5964l;
        c16082l.f31526l = (C6818l) AbstractC6159l.loadAd(c2756l);
        return c16082l;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C17029l c17029l) {
        C16429l c16429l = new C16429l();
        c16429l.f32127l = (C17099l) AbstractC7766l.yandex(c17029l);
        return c16429l;
    }
}
