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

/* JADX INFO: renamed from: lٌؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0934l extends AbstractC10840l {
    static {
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC2522l.f5439l);
        hashSet.add(InterfaceC2522l.f5343l);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C0315l) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C0315l) key).getEncoded());
            }
        } else {
            if (!(key instanceof C6683l)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C6683l) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C0315l) || (key instanceof C6683l)) {
            return key;
        }
        C18073l.smaato("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C2756l c2756l) {
        C0315l c0315l = new C0315l();
        C5354l c5354l = (C5354l) AbstractC6159l.loadAd(c2756l);
        c0315l.f1362l = c2756l.f5964l;
        c0315l.f1361l = c5354l;
        c0315l.f1360l = AbstractC9008l.mopub(((C1738l) c5354l.f16541l).f4147l);
        return c0315l;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C17029l c17029l) {
        C6683l c6683l = new C6683l();
        C9841l c9841l = (C9841l) AbstractC7766l.yandex(c17029l);
        c6683l.f14036l = c9841l;
        c6683l.f14035l = AbstractC9008l.mopub(((C1738l) c9841l.f16541l).f4147l);
        return c6683l;
    }
}
