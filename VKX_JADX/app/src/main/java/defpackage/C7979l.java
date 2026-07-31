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

/* JADX INFO: renamed from: lًؙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7979l extends AbstractC10840l {
    public static final HashSet yandex;

    static {
        HashSet hashSet = new HashSet();
        yandex = hashSet;
        hashSet.add(InterfaceC2522l.f5402l);
        hashSet.add(InterfaceC2522l.f5478l);
        hashSet.add(InterfaceC2522l.f5340l);
        hashSet.add(InterfaceC2522l.f5370l);
        hashSet.add(InterfaceC2522l.f5378l);
        hashSet.add(InterfaceC2522l.f5407l);
        hashSet.add(InterfaceC2522l.f5483l);
        hashSet.add(InterfaceC2522l.f5427l);
        hashSet.add(InterfaceC2522l.f5362l);
        hashSet.add(InterfaceC2522l.f5430l);
        hashSet.add(InterfaceC2522l.f5364l);
        hashSet.add(InterfaceC2522l.f5377l);
        hashSet.add(InterfaceC2522l.f5410l);
        hashSet.add(InterfaceC2522l.f5433l);
        hashSet.add(InterfaceC2522l.f5337l);
        hashSet.add(InterfaceC2522l.f5428l);
        hashSet.add(InterfaceC2522l.f5369l);
        hashSet.add(InterfaceC2522l.f5390l);
        hashSet.add(InterfaceC2522l.f5436l);
        hashSet.add(InterfaceC2522l.f5341l);
        hashSet.add(InterfaceC2522l.f5465l);
        hashSet.add(InterfaceC2522l.f5393l);
        hashSet.add(InterfaceC2522l.f5382l);
        hashSet.add(InterfaceC2522l.f5429l);
        hashSet.add(InterfaceC2522l.f5399l);
        hashSet.add(InterfaceC2522l.f5352l);
        hashSet.add(InterfaceC2522l.f5414l);
        hashSet.add(InterfaceC2522l.f5466l);
        hashSet.add(InterfaceC2522l.f5443l);
        hashSet.add(InterfaceC2522l.f5344l);
        hashSet.add(InterfaceC2522l.f5366l);
        hashSet.add(InterfaceC2522l.f5345l);
        hashSet.add(InterfaceC2522l.f5367l);
        hashSet.add(InterfaceC2522l.f5474l);
        hashSet.add(InterfaceC2522l.f5395l);
        hashSet.add(InterfaceC2522l.f5452l);
        hashSet.add(InterfaceC2522l.f5383l);
        hashSet.add(InterfaceC2522l.f5379l);
        hashSet.add(InterfaceC2522l.f5354l);
        hashSet.add(InterfaceC2522l.f5418l);
        hashSet.add(InterfaceC2522l.f5416l);
        hashSet.add(InterfaceC2522l.f5457l);
        hashSet.add(InterfaceC2522l.f5357l);
        hashSet.add(InterfaceC2522l.f5368l);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C5375l) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C5375l) key).getEncoded());
            }
        } else {
            if (!(key instanceof C15598l)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C15598l) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C5375l) || (key instanceof C15598l)) {
            return key;
        }
        C18073l.smaato("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C2756l c2756l) {
        C5375l c5375l = new C5375l();
        c5375l.f11509l = c2756l.f5964l;
        c5375l.f11510l = (C5200l) AbstractC6159l.loadAd(c2756l);
        return c5375l;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C17029l c17029l) {
        C15598l c15598l = new C15598l();
        c15598l.f30456l = (C6676l) AbstractC7766l.yandex(c17029l);
        return c15598l;
    }
}
