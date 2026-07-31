package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC12396l;
import defpackage.AbstractC12492l;
import defpackage.AbstractC1757l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC8831l;
import defpackage.C10198l;
import defpackage.C11104l;
import defpackage.C11138l;
import defpackage.C13353l;
import defpackage.C14114l;
import defpackage.C1438l;
import defpackage.C14685l;
import defpackage.C15654l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2444l;
import defpackage.C2756l;
import defpackage.C6254l;
import defpackage.C6972l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC12995l;
import defpackage.InterfaceC14611l;
import defpackage.InterfaceC2716l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private static final byte Ed25519_type = 112;
    private static final byte Ed448_type = 113;
    private static final byte x25519_type = 110;
    private static final byte x448_type = 111;
    String algorithm;
    private final boolean isXdh;
    private final int specificBase;
    static final byte[] x448Prefix = AbstractC8535l.yandex("3042300506032b656f033900");
    static final byte[] x25519Prefix = AbstractC8535l.yandex("302a300506032b656e032100");
    static final byte[] Ed448Prefix = AbstractC8535l.yandex("3043300506032b6571033a00");
    static final byte[] Ed25519Prefix = AbstractC8535l.yandex("302a300506032b6570032100");

    public static class Ed25519 extends KeyFactorySpi {
        public Ed25519() {
            super("Ed25519", false, 112);
        }
    }

    public static class Ed448 extends KeyFactorySpi {
        public Ed448() {
            super("Ed448", false, 113);
        }
    }

    public static class EdDSA extends KeyFactorySpi {
        public EdDSA() {
            super("EdDSA", false, 0);
        }
    }

    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super("X25519", true, 110);
        }
    }

    public static class X448 extends KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z, int i) {
        this.algorithm = str;
        this.isXdh = z;
        this.specificBase = i;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof C6972l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        AbstractC8831l abstractC8831lLoadAd = AbstractC12492l.loadAd(((C6972l) keySpec).getEncoded());
        if (abstractC8831lLoadAd instanceof C1438l) {
            return new BCEdDSAPrivateKey((C1438l) abstractC8831lLoadAd);
        }
        C8339l.smaato("openssh private key not Ed25519 private key");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i = this.specificBase;
            if (i == 0 || i == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    C17029l c17029lVip = C17029l.vip(encoded);
                    C10198l c10198l = new C10198l(c17029lVip.f33175l.f20787l);
                    C13353l c13353l = new C13353l(c17029lVip.f33174l.applovin(), 0);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        new C11138l(c10198l, c13353l).tapsense(byteArrayOutputStream, "DER");
                        encoded = byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
                        throw new InvalidKeySpecException(AbstractC5020l.adcel(e, new StringBuilder("attempt to reconstruct key failed: ")));
                    }
                }
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(x25519Prefix, encoded);
                    case 111:
                        return new BCXDHPublicKey(x448Prefix, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(Ed25519Prefix, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(Ed448Prefix, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else {
            if (keySpec instanceof C14114l) {
                byte[] encoded2 = ((C14114l) keySpec).getEncoded();
                switch (this.specificBase) {
                    case 110:
                        return new BCXDHPublicKey(new C15654l(encoded2));
                    case 111:
                        return new BCXDHPublicKey(new C14685l(encoded2));
                    case 112:
                        return new BCEdDSAPublicKey(new C6254l(encoded2));
                    case 113:
                        return new BCEdDSAPublicKey(new C11104l(encoded2));
                    default:
                        C18073l.subscription("factory not a specific type, cannot recognise raw encoding");
                        return null;
                }
            }
            if (keySpec instanceof C2444l) {
                AbstractC8831l abstractC8831lBilling = AbstractC12396l.billing(((C2444l) keySpec).getEncoded());
                if (abstractC8831lBilling instanceof C6254l) {
                    return new BCEdDSAPublicKey(new byte[0], ((C6254l) abstractC8831lBilling).getEncoded());
                }
                C8339l.smaato("openssh public key not Ed25519 public key");
                return null;
            }
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(C6972l.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new C6972l(AbstractC12492l.yandex(new C1438l(Cthrow.premium(Ccase.advert(Cthrow.premium(Cclass.inmobi(key.getEncoded()).mo173throws(2)).f36593l)).f36593l)));
            } catch (IOException e) {
                throw new InvalidKeySpecException(e.getMessage(), e.getCause());
            }
        }
        if (!cls.isAssignableFrom(C2444l.class) || !(key instanceof BCEdDSAPublicKey)) {
            if (cls.isAssignableFrom(C14114l.class)) {
                if (key instanceof InterfaceC12995l) {
                    return new C14114l(((InterfaceC12995l) key).getUEncoding());
                }
                if (key instanceof InterfaceC14611l) {
                    return new C14114l(((InterfaceC14611l) key).getPointEncoding());
                }
            }
            return super.engineGetKeySpec(key, cls);
        }
        try {
            byte[] encoded = key.getEncoded();
            byte[] bArr = Ed25519Prefix;
            int length = bArr.length;
            boolean z = false;
            if (length == encoded.length - 32) {
                for (int i = 0; i < length; i++) {
                    if (bArr[i] == encoded[i]) {
                    }
                }
                z = true;
            }
            if (z) {
                return new C2444l(AbstractC12396l.purchase(new C6254l(encoded, bArr.length)));
            }
            throw new InvalidKeySpecException("Invalid Ed25519 public key encoding");
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.getMessage(), e2.getCause());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        Cfor cfor = c2756l.f5961l.f20787l;
        if (this.isXdh) {
            int i = this.specificBase;
            if ((i == 0 || i == 111) && cfor.ad(InterfaceC2716l.loadAd)) {
                return new BCXDHPrivateKey(c2756l);
            }
            int i2 = this.specificBase;
            if ((i2 == 0 || i2 == 110) && cfor.ad(InterfaceC2716l.yandex)) {
                return new BCXDHPrivateKey(c2756l);
            }
        } else {
            Cfor cfor2 = InterfaceC2716l.amazon;
            if (cfor.ad(cfor2) || cfor.ad(InterfaceC2716l.crashlytics)) {
                int i3 = this.specificBase;
                if ((i3 == 0 || i3 == 113) && cfor.ad(cfor2)) {
                    return new BCEdDSAPrivateKey(c2756l);
                }
                int i4 = this.specificBase;
                if ((i4 == 0 || i4 == 112) && cfor.ad(InterfaceC2716l.crashlytics)) {
                    return new BCEdDSAPrivateKey(c2756l);
                }
            }
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognized"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cfor cfor = c17029l.f33175l.f20787l;
        if (this.isXdh) {
            int i = this.specificBase;
            if ((i == 0 || i == 111) && cfor.ad(InterfaceC2716l.loadAd)) {
                return new BCXDHPublicKey(c17029l);
            }
            int i2 = this.specificBase;
            if ((i2 == 0 || i2 == 110) && cfor.ad(InterfaceC2716l.yandex)) {
                return new BCXDHPublicKey(c17029l);
            }
        } else {
            Cfor cfor2 = InterfaceC2716l.amazon;
            if (cfor.ad(cfor2) || cfor.ad(InterfaceC2716l.crashlytics)) {
                int i3 = this.specificBase;
                if ((i3 == 0 || i3 == 113) && cfor.ad(cfor2)) {
                    return new BCEdDSAPublicKey(c17029l);
                }
                int i4 = this.specificBase;
                if ((i4 == 0 || i4 == 112) && cfor.ad(InterfaceC2716l.crashlytics)) {
                    return new BCEdDSAPublicKey(c17029l);
                }
            }
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognized"));
        return null;
    }
}
