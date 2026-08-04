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

/* JADX INFO: renamed from: lٕؐۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C15365l extends AbstractC10840l {
    public static final HashSet yandex;

    static {
        HashSet hashSet = new HashSet();
        yandex = hashSet;
        hashSet.add(InterfaceC2522l.f5453l);
        hashSet.add(InterfaceC2522l.f5455l);
        hashSet.add(InterfaceC2522l.f5346l);
        hashSet.add(InterfaceC2522l.f5435l);
        hashSet.add(InterfaceC2522l.f5432l);
        hashSet.add(InterfaceC2522l.f5384l);
    }

    public C15365l() {
        super(yandex);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C14534l) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C14534l) key).getEncoded());
            }
        } else {
            if (!(key instanceof C14159l)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C14159l) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C14534l) || (key instanceof C14159l)) {
            return key;
        }
        C18073l.smaato("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C2756l c2756l) {
        C14534l c14534l = new C14534l();
        C18301l c18301l = (C18301l) AbstractC6159l.loadAd(c2756l);
        c14534l.f28458l = c2756l.f5964l;
        c14534l.f28457l = c18301l;
        c14534l.f28456l = AbstractC9008l.mopub(((C18260l) c18301l.f16541l).loadAd);
        return c14534l;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C17029l c17029l) {
        C14159l c14159l = new C14159l();
        C13671l c13671l = (C13671l) AbstractC7766l.yandex(c17029l);
        c14159l.f27689l = c13671l;
        c14159l.f27688l = AbstractC9008l.mopub(((C18260l) c13671l.f16541l).loadAd);
        return c14159l;
    }
}
