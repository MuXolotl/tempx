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

/* JADX INFO: renamed from: lؘُٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10876l extends AbstractC10840l {
    public static final HashSet yandex;

    static {
        HashSet hashSet = new HashSet();
        yandex = hashSet;
        hashSet.add(InterfaceC8134l.f16958l);
        hashSet.add(InterfaceC8134l.f16977l);
        hashSet.add(InterfaceC8134l.f16968l);
        hashSet.add(InterfaceC2522l.f5387l);
        hashSet.add(InterfaceC2522l.f5409l);
        hashSet.add(InterfaceC2522l.f5350l);
    }

    public C10876l() {
        super(yandex);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C7211l) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C7211l) key).getEncoded());
            }
        } else {
            if (!(key instanceof C0002l)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C0002l) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C7211l) || (key instanceof C0002l)) {
            return key;
        }
        C18073l.smaato("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C2756l c2756l) {
        C7211l c7211l = new C7211l();
        c7211l.f15041l = c2756l.f5964l;
        C10146l c10146l = (C10146l) AbstractC7799l.yandex(c2756l);
        c7211l.f15043l = c10146l;
        c7211l.f15042l = AbstractC9008l.mopub(((C18493l) c10146l.f16541l).f36123l);
        return c7211l;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C17029l c17029l) {
        C0002l c0002l = new C0002l();
        C1658l c1658l = (C1658l) AbstractC7678l.yandex(c17029l);
        c0002l.f852l = c1658l;
        c0002l.f851l = AbstractC9008l.mopub(((C18493l) c1658l.f16541l).f36123l);
        return c0002l;
    }
}
