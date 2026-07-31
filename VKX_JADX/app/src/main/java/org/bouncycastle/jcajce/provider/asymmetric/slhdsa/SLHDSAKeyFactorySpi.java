package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import defpackage.AbstractC10840l;
import defpackage.AbstractC14814l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C2756l;
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

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSAKeyFactorySpi extends AbstractC10840l {
    private static final Set<Cfor> hashKeyOids;
    private static final Set<Cfor> pureKeyOids;

    public static class Hash extends SLHDSAKeyFactorySpi {
        public Hash() {
            super((Set<Cfor>) SLHDSAKeyFactorySpi.hashKeyOids);
        }
    }

    public static class HashSha2_128f extends SLHDSAKeyFactorySpi {
        public HashSha2_128f() {
            super(InterfaceC8134l.f16956l);
        }
    }

    public static class HashSha2_128s extends SLHDSAKeyFactorySpi {
        public HashSha2_128s() {
            super(InterfaceC8134l.f16976l);
        }
    }

    public static class HashSha2_192f extends SLHDSAKeyFactorySpi {
        public HashSha2_192f() {
            super(InterfaceC8134l.f16969l);
        }
    }

    public static class HashSha2_192s extends SLHDSAKeyFactorySpi {
        public HashSha2_192s() {
            super(InterfaceC8134l.f16970l);
        }
    }

    public static class HashSha2_256f extends SLHDSAKeyFactorySpi {
        public HashSha2_256f() {
            super(InterfaceC8134l.f16973l);
        }
    }

    public static class HashSha2_256s extends SLHDSAKeyFactorySpi {
        public HashSha2_256s() {
            super(InterfaceC8134l.f16963l);
        }
    }

    public static class HashShake_128f extends SLHDSAKeyFactorySpi {
        public HashShake_128f() {
            super(InterfaceC8134l.f16964l);
        }
    }

    public static class HashShake_128s extends SLHDSAKeyFactorySpi {
        public HashShake_128s() {
            super(InterfaceC8134l.f16974l);
        }
    }

    public static class HashShake_192f extends SLHDSAKeyFactorySpi {
        public HashShake_192f() {
            super(InterfaceC8134l.f16960l);
        }
    }

    public static class HashShake_192s extends SLHDSAKeyFactorySpi {
        public HashShake_192s() {
            super(InterfaceC8134l.f16965l);
        }
    }

    public static class HashShake_256f extends SLHDSAKeyFactorySpi {
        public HashShake_256f() {
            super(InterfaceC8134l.f16966l);
        }
    }

    public static class HashShake_256s extends SLHDSAKeyFactorySpi {
        public HashShake_256s() {
            super(InterfaceC8134l.f16962l);
        }
    }

    public static class Pure extends SLHDSAKeyFactorySpi {
        public Pure() {
            super((Set<Cfor>) SLHDSAKeyFactorySpi.pureKeyOids);
        }
    }

    public static class Sha2_128f extends SLHDSAKeyFactorySpi {
        public Sha2_128f() {
            super(InterfaceC8134l.f16967l);
        }
    }

    public static class Sha2_128s extends SLHDSAKeyFactorySpi {
        public Sha2_128s() {
            super(InterfaceC8134l.f16981l);
        }
    }

    public static class Sha2_192f extends SLHDSAKeyFactorySpi {
        public Sha2_192f() {
            super(InterfaceC8134l.f16978l);
        }
    }

    public static class Sha2_192s extends SLHDSAKeyFactorySpi {
        public Sha2_192s() {
            super(InterfaceC8134l.f16980l);
        }
    }

    public static class Sha2_256f extends SLHDSAKeyFactorySpi {
        public Sha2_256f() {
            super(InterfaceC8134l.f16959l);
        }
    }

    public static class Sha2_256s extends SLHDSAKeyFactorySpi {
        public Sha2_256s() {
            super(InterfaceC8134l.f16961l);
        }
    }

    public static class Shake_128f extends SLHDSAKeyFactorySpi {
        public Shake_128f() {
            super(InterfaceC8134l.f16971l);
        }
    }

    public static class Shake_128s extends SLHDSAKeyFactorySpi {
        public Shake_128s() {
            super(InterfaceC8134l.f16979l);
        }
    }

    public static class Shake_192f extends SLHDSAKeyFactorySpi {
        public Shake_192f() {
            super(InterfaceC8134l.f16955l);
        }
    }

    public static class Shake_192s extends SLHDSAKeyFactorySpi {
        public Shake_192s() {
            super(InterfaceC8134l.f16972l);
        }
    }

    public static class Shake_256f extends SLHDSAKeyFactorySpi {
        public Shake_256f() {
            super(InterfaceC8134l.f16975l);
        }
    }

    public static class Shake_256s extends SLHDSAKeyFactorySpi {
        public Shake_256s() {
            super(InterfaceC8134l.f16957l);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        pureKeyOids = hashSet;
        HashSet hashSet2 = new HashSet();
        hashKeyOids = hashSet2;
        Cfor cfor = InterfaceC8134l.f16967l;
        hashSet.add(cfor);
        Cfor cfor2 = InterfaceC8134l.f16981l;
        hashSet.add(cfor2);
        Cfor cfor3 = InterfaceC8134l.f16978l;
        hashSet.add(cfor3);
        Cfor cfor4 = InterfaceC8134l.f16980l;
        hashSet.add(cfor4);
        Cfor cfor5 = InterfaceC8134l.f16959l;
        hashSet.add(cfor5);
        Cfor cfor6 = InterfaceC8134l.f16961l;
        hashSet.add(cfor6);
        Cfor cfor7 = InterfaceC8134l.f16971l;
        hashSet.add(cfor7);
        Cfor cfor8 = InterfaceC8134l.f16979l;
        hashSet.add(cfor8);
        Cfor cfor9 = InterfaceC8134l.f16955l;
        hashSet.add(cfor9);
        Cfor cfor10 = InterfaceC8134l.f16972l;
        hashSet.add(cfor10);
        Cfor cfor11 = InterfaceC8134l.f16975l;
        hashSet.add(cfor11);
        Cfor cfor12 = InterfaceC8134l.f16957l;
        hashSet.add(cfor12);
        hashSet2.add(cfor);
        hashSet2.add(cfor2);
        hashSet2.add(cfor3);
        hashSet2.add(cfor4);
        hashSet2.add(cfor5);
        hashSet2.add(cfor6);
        hashSet2.add(cfor7);
        hashSet2.add(cfor8);
        hashSet2.add(cfor9);
        hashSet2.add(cfor10);
        hashSet2.add(cfor11);
        hashSet2.add(cfor12);
        hashSet2.add(InterfaceC8134l.f16956l);
        hashSet2.add(InterfaceC8134l.f16976l);
        hashSet2.add(InterfaceC8134l.f16969l);
        hashSet2.add(InterfaceC8134l.f16970l);
        hashSet2.add(InterfaceC8134l.f16973l);
        hashSet2.add(InterfaceC8134l.f16963l);
        hashSet2.add(InterfaceC8134l.f16964l);
        hashSet2.add(InterfaceC8134l.f16974l);
        hashSet2.add(InterfaceC8134l.f16960l);
        hashSet2.add(InterfaceC8134l.f16965l);
        hashSet2.add(InterfaceC8134l.f16966l);
        hashSet2.add(InterfaceC8134l.f16962l);
    }

    public SLHDSAKeyFactorySpi(Cfor cfor) {
        super(cfor);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCSLHDSAPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCSLHDSAPublicKey)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC14814l.metrica(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCSLHDSAPrivateKey) || (key instanceof BCSLHDSAPublicKey)) {
            return key;
        }
        C18073l.smaato("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) {
        return new BCSLHDSAPrivateKey(c2756l);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) {
        return new BCSLHDSAPublicKey(c17029l);
    }

    public SLHDSAKeyFactorySpi(Set<Cfor> set) {
        super(set);
    }
}
