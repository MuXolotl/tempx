package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC2017l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.C0045l;
import defpackage.C0272l;
import defpackage.C0361l;
import defpackage.C0655l;
import defpackage.C10012l;
import defpackage.C10352l;
import defpackage.C10754l;
import defpackage.C14685l;
import defpackage.C14706l;
import defpackage.C14785l;
import defpackage.C15654l;
import defpackage.C16244l;
import defpackage.C17711l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C1838l;
import defpackage.C18595l;
import defpackage.C2657l;
import defpackage.C3316l;
import defpackage.C4998l;
import defpackage.C5008l;
import defpackage.C5153l;
import defpackage.C6246l;
import defpackage.C7260l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.C8470l;
import defpackage.C8582l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC17797l;
import defpackage.InterfaceC5727l;
import defpackage.InterfaceC8145l;
import defpackage.InterfaceC9719l;
import defpackage.metrica;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class IESCipher extends BaseCipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private C8582l engine;
    private AlgorithmParameters engineParam;
    private C1838l engineSpec;
    private final InterfaceC12575l helper;
    private int ivLength;
    private AbstractC8831l key;
    private AbstractC8831l otherKeyParameter;
    private SecureRandom random;
    private int state;

    public static class XIESwithAESCBC extends XIESwithCipher {
        public XIESwithAESCBC() {
            super(new C4998l(metrica.loadAd()), 16);
        }
    }

    public static class XIESwithDESedeCBC extends XIESwithCipher {
        public XIESwithDESedeCBC() {
            super(new C4998l(new C10012l()), 8);
        }
    }

    public static class XIESwithSHA256 extends XIES {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XIESwithSHA256() {
            super(new C2657l(), new C2657l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class XIESwithSHA256andAESCBC extends XIESwithCipher {
        public XIESwithSHA256andAESCBC() {
            C4998l c4998l = new C4998l(metrica.loadAd());
            int i = AbstractC14832l.yandex;
            super(c4998l, 16, new C2657l(), new C2657l());
        }
    }

    public static class XIESwithSHA256andDESedeCBC extends XIESwithCipher {
        public XIESwithSHA256andDESedeCBC() {
            C4998l c4998l = new C4998l(new C10012l());
            int i = AbstractC14832l.yandex;
            super(c4998l, 8, new C2657l(), new C2657l());
        }
    }

    public static class XIESwithSHA384 extends XIES {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XIESwithSHA384() {
            super(new C5153l(), new C5153l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class XIESwithSHA384andAESCBC extends XIESwithCipher {
        public XIESwithSHA384andAESCBC() {
            C4998l c4998l = new C4998l(metrica.loadAd());
            int i = AbstractC14832l.yandex;
            super(c4998l, 16, new C5153l(), new C5153l());
        }
    }

    public static class XIESwithSHA384andDESedeCBC extends XIESwithCipher {
        public XIESwithSHA384andDESedeCBC() {
            C4998l c4998l = new C4998l(new C10012l());
            int i = AbstractC14832l.yandex;
            super(c4998l, 8, new C5153l(), new C5153l());
        }
    }

    public static class XIESwithSHA512 extends XIES {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XIESwithSHA512() {
            super(new C17711l(), new C17711l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class XIESwithSHA512andAESCBC extends XIESwithCipher {
        public XIESwithSHA512andAESCBC() {
            C4998l c4998l = new C4998l(metrica.loadAd());
            int i = AbstractC14832l.yandex;
            super(c4998l, 16, new C17711l(), new C17711l());
        }
    }

    public static class XIESwithSHA512andDESedeCBC extends XIESwithCipher {
        public XIESwithSHA512andDESedeCBC() {
            C4998l c4998l = new C4998l(new C10012l());
            int i = AbstractC14832l.yandex;
            super(c4998l, 8, new C17711l(), new C17711l());
        }
    }

    public IESCipher(C8582l c8582l) {
        this.helper = new C7633l();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c8582l;
        this.ivLength = 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadBlockException {
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.engineSpec.f4246l);
        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(this.engineSpec.f4245l);
        C1838l c1838l = this.engineSpec;
        InterfaceC9719l c7260l = new C7260l(c1838l.f4244l, c1838l.f4248l, bArrCrashlytics, bArrCrashlytics2);
        byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(this.engineSpec.f4247l);
        if (bArrCrashlytics3 != null) {
            c7260l = new C0272l(c7260l, bArrCrashlytics3, 0, bArrCrashlytics3.length);
        }
        AbstractC8831l abstractC8831l = this.otherKeyParameter;
        if (abstractC8831l != null) {
            try {
                int i3 = this.state;
                if (i3 == 1 || i3 == 3) {
                    this.engine.amazon(true, abstractC8831l, this.key, c7260l);
                } else {
                    this.engine.amazon(false, this.key, abstractC8831l, c7260l);
                }
                return this.engine.purchase(byteArray.length, byteArray);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        }
        AbstractC8831l abstractC8831l2 = this.key;
        final boolean z = (abstractC8831l2 instanceof C15654l) || (abstractC8831l2 instanceof C16244l);
        int i4 = z ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 448;
        int i5 = this.state;
        if (i5 == 1 || i5 == 3) {
            InterfaceC8145l c3316l = z ? new C3316l(27, false) : new C5008l(27, false);
            c3316l.mo274throws(new C14785l(i4, this.random));
            C18595l c18595l = new C18595l(c3316l, new InterfaceC17797l() { // from class: org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher.1
                @Override // defpackage.InterfaceC17797l
                public byte[] getEncoded(AbstractC8831l abstractC8831l3) {
                    return z ? AbstractC14024l.crashlytics(((C15654l) abstractC8831l3).f30601l) : AbstractC14024l.crashlytics(((C14685l) abstractC8831l3).f28737l);
                }
            }, 21);
            try {
                C8582l c8582l = this.engine;
                AbstractC8831l abstractC8831l3 = this.key;
                c8582l.purchase = true;
                c8582l.mopub = abstractC8831l3;
                c8582l.isPro = c18595l;
                c8582l.crashlytics(c7260l);
                return this.engine.purchase(byteArray.length, byteArray);
            } catch (Exception e2) {
                throw new BadBlockException("unable to process block", e2);
            }
        }
        if (i5 != 2 && i5 != 4) {
            C8339l.smaato("cipher not initialised");
            return null;
        }
        try {
            C8582l c8582l2 = this.engine;
            C14706l c14706l = new C14706l(z, 8);
            c8582l2.purchase = false;
            c8582l2.billing = abstractC8831l2;
            c8582l2.firebase = c14706l;
            c8582l2.crashlytics(c7260l);
            return this.engine.purchase(byteArray.length, byteArray);
        } catch (C10352l e3) {
            throw new BadBlockException("unable to process block", e3);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        C8470l c8470l = this.engine.amazon;
        if (c8470l == null) {
            return 0;
        }
        return c8470l.firebase.license();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        C1838l c1838l = this.engineSpec;
        if (c1838l != null) {
            return AbstractC14024l.crashlytics(c1838l.f4247l);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        String strStartapp;
        if (key instanceof InterfaceC5727l) {
            String algorithm = ((InterfaceC5727l) key).getAlgorithm();
            if ("X25519".equalsIgnoreCase(algorithm)) {
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if ("X448".equalsIgnoreCase(algorithm)) {
                return 448;
            }
            strStartapp = AbstractC14814l.startapp("unknown XDH key algorithm ", algorithm);
        } else {
            strStartapp = "not an XDH key";
        }
        C8339l.metrica(strStartapp);
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        AbstractC8831l abstractC8831l = this.key;
        if (abstractC8831l == null) {
            C8339l.smaato("cipher not initialised");
            return 0;
        }
        int i2 = this.engine.crashlytics.f1426l;
        int iSmaato = this.otherKeyParameter == null ? ((((AbstractC2017l) abstractC8831l).f4542l.f16360l.smaato() + 7) / 8) * 2 : 0;
        int size = this.buffer.size() + i;
        C8470l c8470l = this.engine.amazon;
        if (c8470l != null) {
            int i3 = this.state;
            if (i3 != 1 && i3 != 3) {
                if (i3 != 2 && i3 != 4) {
                    C8339l.smaato("cipher not initialised");
                    return 0;
                }
                size = (size - i2) - iSmaato;
            }
            size = c8470l.crashlytics(size);
        }
        int i4 = this.state;
        if (i4 == 1 || i4 == 3) {
            return i2 + iSmaato + size;
        }
        if (i4 == 2 || i4 == 4) {
            return size;
        }
        C8339l.smaato("cipher not initialised");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters algorithmParametersAdvert = this.helper.advert("IES");
                this.engineParam = algorithmParametersAdvert;
                algorithmParametersAdvert.init(this.engineSpec);
            } catch (Exception e) {
                C10754l.Signature(e);
                return null;
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C1838l c1838lGuessParameterSpec;
        AbstractC8831l abstractC8831lGeneratePublicKeyParameter;
        this.otherKeyParameter = null;
        if (algorithmParameterSpec == null && this.ivLength == 0) {
            c1838lGuessParameterSpec = IESUtil.guessParameterSpec(this.engine.amazon, null);
        } else {
            if (!(algorithmParameterSpec instanceof C1838l)) {
                C18073l.pro("must be passed IES parameters");
                return;
            }
            c1838lGuessParameterSpec = (C1838l) algorithmParameterSpec;
        }
        this.engineSpec = c1838lGuessParameterSpec;
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.engineSpec.f4247l);
        int i2 = this.ivLength;
        if (i2 != 0 && (bArrCrashlytics == null || bArrCrashlytics.length != i2)) {
            throw new InvalidAlgorithmParameterException(AbstractC14814l.remoteconfig(this.ivLength, " bytes long", new StringBuilder("NONCE in IES Parameters needs to be ")));
        }
        if (i == 1 || i == 3) {
            if (!(key instanceof PublicKey)) {
                C18073l.smaato("must be passed recipient's public XDH key for encryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = EdECUtil.generatePublicKeyParameter((PublicKey) key);
        } else if (i != 2 && i != 4) {
            C18073l.smaato("must be passed XDH key");
            return;
        } else {
            if (!(key instanceof PrivateKey)) {
                C18073l.smaato("must be passed recipient's private XDH key for decryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = EdECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = abstractC8831lGeneratePublicKeyParameter;
        this.random = secureRandom;
        this.state = i;
        this.buffer.reset();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String strMopub = AbstractC9008l.mopub(str);
        if (strMopub.equals("NONE")) {
            this.dhaesMode = false;
        } else if (strMopub.equals("DHAES")) {
            this.dhaesMode = true;
        } else {
            C8339l.metrica("can't support mode ".concat(str));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String strMopub = AbstractC9008l.mopub(str);
        if (!strMopub.equals("NOPADDING") && !strMopub.equals("PKCS5PADDING") && !strMopub.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
        return null;
    }

    public static class XIES extends IESCipher {
        public XIES(InterfaceC16922l interfaceC16922l, InterfaceC16922l interfaceC16922l2) {
            super(new C8582l(new C6246l(), new C0045l(interfaceC16922l), new C0361l(interfaceC16922l2)));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public XIES() {
            this(new C0655l(), new C0655l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class XIESwithCipher extends IESCipher {
        public XIESwithCipher(InterfaceC10952l interfaceC10952l, int i, InterfaceC16922l interfaceC16922l, InterfaceC16922l interfaceC16922l2) {
            super(new C8582l(new C6246l(), new C0045l(interfaceC16922l), new C0361l(interfaceC16922l2), new C8470l(interfaceC10952l)), i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public XIESwithCipher(InterfaceC10952l interfaceC10952l, int i) {
            this(interfaceC10952l, i, new C0655l(), new C0655l());
            int i2 = AbstractC14832l.yandex;
        }
    }

    public IESCipher(C8582l c8582l, int i) {
        this.helper = new C7633l();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c8582l;
        this.ivLength = i;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            C18262l.startapp(e.getMessage(), "cannot handle supplied parameter spec: ");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(C1838l.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(AbstractC5020l.ads(e, new StringBuilder("cannot recognise parameters: ")));
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadBlockException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }
}
