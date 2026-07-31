package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC7960l;
import defpackage.C0361l;
import defpackage.C0655l;
import defpackage.C13886l;
import defpackage.C17711l;
import defpackage.C2657l;
import defpackage.C3077l;
import defpackage.C5153l;
import defpackage.InterfaceC2232l;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class TLSKDF {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$TLS12withSHA512", "SecretKeyFactory.TLS12WITHSHA512KDF", AbstractC11043l.subs(str, "$TLS12withSHA384", "SecretKeyFactory.TLS12WITHSHA384KDF", AbstractC11043l.subs(str, "$TLS12withSHA256", "SecretKeyFactory.TLS12WITHSHA256KDF", AbstractC11043l.subs(str, "$TLS11", "SecretKeyFactory.TLS11KDF", AbstractC11043l.subs(str, "$TLS10", "SecretKeyFactory.TLS10KDF", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
        }
    }

    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super("TLS10KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super("TLS11KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static class TLS12 extends TLSKeyMaterialFactory {
        private final InterfaceC2232l prf;

        public TLS12(String str, InterfaceC2232l interfaceC2232l) {
            super(str);
            this.prf = interfaceC2232l;
        }

        private byte[] PRF(AbstractC7960l abstractC7960l, InterfaceC2232l interfaceC2232l) {
            throw null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new C0361l(new C2657l()));
        }
    }

    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new C0361l(new C5153l()));
        }
    }

    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new C0361l(new C17711l()));
        }
    }

    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        public TLSKeyMaterialFactory(String str) {
            super(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] PRF_legacy(AbstractC7960l abstractC7960l) {
        int i = AbstractC14832l.yandex;
        new C0361l(new C3077l());
        new C0361l(new C0655l());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hmac_hash(InterfaceC2232l interfaceC2232l, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        interfaceC2232l.init(new C13886l(bArr));
        int macSize = interfaceC2232l.getMacSize();
        int length = ((bArr3.length + macSize) - 1) / macSize;
        int macSize2 = interfaceC2232l.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[interfaceC2232l.getMacSize()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            interfaceC2232l.update(bArr6, 0, bArr6.length);
            interfaceC2232l.doFinal(bArr4, 0);
            interfaceC2232l.update(bArr4, 0, macSize2);
            interfaceC2232l.update(bArr2, 0, bArr2.length);
            interfaceC2232l.doFinal(bArr5, 0);
            int i2 = macSize * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(macSize, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }
}
