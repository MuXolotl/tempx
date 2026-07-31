package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: renamed from: lْؔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2595l extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C2595l(int i) {
        this.yandex = i;
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.yandex) {
            case 0:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e) {
                        C18725l.amazon(e);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 1:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e2) {
                        C18725l.amazon(e2);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 2:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString(), e3);
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            case 3:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e4) {
                        C18725l.amazon(e4);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 4:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e5) {
                        C18725l.amazon(e5);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 5:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e6) {
                        C18725l.amazon(e6);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 6:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e7) {
                        C18725l.amazon(e7);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 7:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e8) {
                        C18725l.amazon(e8);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 8:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e9) {
                        C18725l.amazon(e9);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            default:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C2756l.vip(Ccase.advert(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e10) {
                        C18725l.amazon(e10);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.yandex) {
            case 0:
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
            case 1:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e2) {
                    C18725l.amazon(e2);
                    return null;
                }
            case 2:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e3) {
                    throw new InvalidKeySpecException(e3.toString(), e3);
                }
            case 3:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e4) {
                    C18725l.amazon(e4);
                    return null;
                }
            case 4:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e5) {
                    C18725l.amazon(e5);
                    return null;
                }
            case 5:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e6) {
                    C18725l.amazon(e6);
                    return null;
                }
            case 6:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e7) {
                    C18725l.amazon(e7);
                    return null;
                }
            case 7:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e8) {
                    C18725l.amazon(e8);
                    return null;
                }
            case 8:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e9) {
                    C18725l.amazon(e9);
                    return null;
                }
            default:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    C18262l.vip(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return generatePublic(C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e10) {
                    C18725l.amazon(e10);
                    return null;
                }
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        switch (this.yandex) {
            case 0:
                if (key instanceof C17001l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C17001l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C17718l)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C17718l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
            case 1:
                if (key instanceof C3681l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C3681l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C17574l)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C17574l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
            case 2:
                if (key instanceof C12087l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C12087l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C15763l)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C15763l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "unknown key specification: ", "."));
            case 3:
                if (key instanceof C16268l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C16268l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1933l)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1933l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
            case 4:
                if (key instanceof C5789l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C5789l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C16398l)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C16398l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
            case 5:
                if (key instanceof C6954l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C6954l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C14716l)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C14716l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
            case 6:
                if (key instanceof C11540l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C11540l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C11010l)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C11010l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
            case 7:
                if (key instanceof C14531l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C14531l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C15104l)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C15104l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
            case 8:
                if (key instanceof C6482l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C6482l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C6661l)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C6661l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "unknown key specification: ", "."));
            default:
                if (key instanceof C5952l) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C5952l) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C7494l)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C7494l) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "unknown key specification: ", "."));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        switch (this.yandex) {
            case 0:
                if ((key instanceof C17001l) || (key instanceof C17718l)) {
                    return key;
                }
                C18073l.smaato("Unsupported key type");
                return null;
            case 1:
                if ((key instanceof C3681l) || (key instanceof C17574l)) {
                    return key;
                }
                C18073l.smaato("Unsupported key type");
                return null;
            case 2:
                if ((key instanceof C12087l) || (key instanceof C15763l)) {
                    return key;
                }
                C18073l.smaato("unsupported key type");
                return null;
            case 3:
                if ((key instanceof C16268l) || (key instanceof C1933l)) {
                    return key;
                }
                C18073l.smaato("Unsupported key type");
                return null;
            case 4:
                if ((key instanceof C5789l) || (key instanceof C16398l)) {
                    return key;
                }
                C18073l.smaato("Unsupported key type");
                return null;
            case 5:
                if ((key instanceof C6954l) || (key instanceof C14716l)) {
                    return key;
                }
                C18073l.smaato("Unsupported key type");
                return null;
            case 6:
                if ((key instanceof C11540l) || (key instanceof C11010l)) {
                    return key;
                }
                C18073l.smaato("Unsupported key type");
                return null;
            case 7:
                if ((key instanceof C14531l) || (key instanceof C15104l)) {
                    return key;
                }
                C18073l.smaato("Unsupported key type");
                return null;
            case 8:
                if ((key instanceof C6482l) || (key instanceof C6661l)) {
                    return key;
                }
                C18073l.smaato("unsupported key type");
                return null;
            default:
                if ((key instanceof C5952l) || (key instanceof C7494l)) {
                    return key;
                }
                C18073l.smaato("unsupported key type");
                return null;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C2756l c2756l) {
        switch (this.yandex) {
            case 0:
                C17001l c17001l = new C17001l();
                c17001l.f33130l = c2756l.f5964l;
                c17001l.f33131l = (C12344l) AbstractC6159l.loadAd(c2756l);
                return c17001l;
            case 1:
                C3681l c3681l = new C3681l();
                c3681l.f7763l = c2756l.f5964l;
                c3681l.f7764l = (C18465l) AbstractC6159l.loadAd(c2756l);
                return c3681l;
            case 2:
                C12087l c12087l = new C12087l();
                c12087l.f24017l = c2756l.f5964l;
                c12087l.f24018l = (AbstractC17897l) AbstractC6159l.loadAd(c2756l);
                return c12087l;
            case 3:
                C16268l c16268l = new C16268l();
                c16268l.f31836l = c2756l.f5964l;
                c16268l.f31837l = (C11529l) AbstractC6159l.loadAd(c2756l);
                return c16268l;
            case 4:
                C5789l c5789l = new C5789l();
                c5789l.f12202l = c2756l.f5964l;
                c5789l.f12203l = (C9779l) AbstractC6159l.loadAd(c2756l);
                return c5789l;
            case 5:
                C6954l c6954l = new C6954l();
                c6954l.f14585l = c2756l.f5964l;
                c6954l.f14586l = (C18116l) AbstractC6159l.loadAd(c2756l);
                return c6954l;
            case 6:
                C11540l c11540l = new C11540l();
                c11540l.f23210l = c2756l.f5964l;
                c11540l.f23211l = (C7400l) AbstractC6159l.loadAd(c2756l);
                return c11540l;
            case 7:
                C14531l c14531l = new C14531l();
                c14531l.f28452l = c2756l.f5964l;
                c14531l.f28454l = C18507l.vip(c2756l.f5961l.f20786l).f36130l.f20787l;
                c14531l.f28453l = (C10075l) AbstractC6159l.loadAd(c2756l);
                return c14531l;
            case 8:
                C6482l c6482l = new C6482l();
                c6482l.f13533l = c2756l.f5964l;
                c6482l.f13534l = C12115l.vip(c2756l.f5961l.f20786l).f24092l.f20787l;
                c6482l.f13535l = (C5745l) AbstractC6159l.loadAd(c2756l);
                return c6482l;
            default:
                C5952l c5952l = new C5952l();
                c5952l.f12554l = c2756l.f5964l;
                c5952l.f12556l = C13700l.vip(c2756l.f5961l.f20786l).f26757l.f20787l;
                c5952l.f12555l = (C3910l) AbstractC6159l.loadAd(c2756l);
                return c5952l;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C17029l c17029l) {
        switch (this.yandex) {
            case 0:
                C17718l c17718l = new C17718l();
                c17718l.f34536l = (C13781l) AbstractC7766l.yandex(c17029l);
                return c17718l;
            case 1:
                C17574l c17574l = new C17574l();
                c17574l.f34201l = (C13410l) AbstractC7766l.yandex(c17029l);
                return c17574l;
            case 2:
                C15763l c15763l = new C15763l();
                c15763l.f30945l = (AbstractC17897l) AbstractC7766l.yandex(c17029l);
                return c15763l;
            case 3:
                C1933l c1933l = new C1933l();
                c1933l.f4403l = (C17794l) AbstractC7766l.yandex(c17029l);
                return c1933l;
            case 4:
                C16398l c16398l = new C16398l();
                c16398l.f32090l = (C18069l) AbstractC7766l.yandex(c17029l);
                return c16398l;
            case 5:
                C14716l c14716l = new C14716l();
                c14716l.f28779l = (C17871l) AbstractC7766l.yandex(c17029l);
                return c14716l;
            case 6:
                C11010l c11010l = new C11010l();
                c11010l.f22179l = (C0856l) AbstractC7766l.yandex(c17029l);
                return c11010l;
            case 7:
                C15104l c15104l = new C15104l();
                c15104l.f29635l = C18507l.vip(c17029l.f33175l.f20786l).f36130l.f20787l;
                c15104l.f29634l = (C13596l) AbstractC7766l.yandex(c17029l);
                return c15104l;
            case 8:
                C6661l c6661l = new C6661l();
                C1671l c1671l = (C1671l) AbstractC7766l.yandex(c17029l);
                c6661l.f14012l = c1671l;
                c6661l.f14011l = AbstractC8020l.admob(c1671l.f25990l);
                return c6661l;
            default:
                C7494l c7494l = new C7494l();
                C4492l c4492l = (C4492l) AbstractC7766l.yandex(c17029l);
                c7494l.f15497l = c4492l;
                c7494l.f15498l = AbstractC8020l.admob(c4492l.f25990l);
                return c7494l;
        }
    }
}
