package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC16336l;
import defpackage.AbstractC2017l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.C0045l;
import defpackage.C0272l;
import defpackage.C0361l;
import defpackage.C0655l;
import defpackage.C10012l;
import defpackage.C10352l;
import defpackage.C10754l;
import defpackage.C11733l;
import defpackage.C17711l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C1838l;
import defpackage.C18595l;
import defpackage.C2657l;
import defpackage.C4148l;
import defpackage.C4998l;
import defpackage.C5153l;
import defpackage.C5911l;
import defpackage.C6265l;
import defpackage.C7026l;
import defpackage.C7260l;
import defpackage.C7633l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8470l;
import defpackage.C8582l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC11004l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC17797l;
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

    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new C4998l(metrica.loadAd()), 16);
        }
    }

    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new C4998l(new C10012l()), 8);
        }
    }

    public static class ECIESwithSHA256 extends ECIES {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ECIESwithSHA256() {
            super(new C2657l(), new C2657l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ECIESwithSHA256andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA256andAESCBC() {
            C4998l c4998l = new C4998l(metrica.loadAd());
            int i = AbstractC14832l.yandex;
            super(c4998l, 16, new C2657l(), new C2657l());
        }
    }

    public static class ECIESwithSHA256andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA256andDESedeCBC() {
            C4998l c4998l = new C4998l(new C10012l());
            int i = AbstractC14832l.yandex;
            super(c4998l, 8, new C2657l(), new C2657l());
        }
    }

    public static class ECIESwithSHA384 extends ECIES {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ECIESwithSHA384() {
            super(new C5153l(), new C5153l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ECIESwithSHA384andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA384andAESCBC() {
            C4998l c4998l = new C4998l(metrica.loadAd());
            int i = AbstractC14832l.yandex;
            super(c4998l, 16, new C5153l(), new C5153l());
        }
    }

    public static class ECIESwithSHA384andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA384andDESedeCBC() {
            C4998l c4998l = new C4998l(new C10012l());
            int i = AbstractC14832l.yandex;
            super(c4998l, 8, new C5153l(), new C5153l());
        }
    }

    public static class ECIESwithSHA512 extends ECIES {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ECIESwithSHA512() {
            super(new C17711l(), new C17711l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ECIESwithSHA512andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA512andAESCBC() {
            C4998l c4998l = new C4998l(metrica.loadAd());
            int i = AbstractC14832l.yandex;
            super(c4998l, 16, new C17711l(), new C17711l());
        }
    }

    public static class ECIESwithSHA512andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA512andDESedeCBC() {
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
        AbstractC8831l abstractC8831l = this.key;
        C7838l c7838l = ((AbstractC2017l) abstractC8831l).f4542l;
        AbstractC8831l abstractC8831l2 = this.otherKeyParameter;
        int i3 = this.state;
        if (abstractC8831l2 != null) {
            try {
                if (i3 == 1 || i3 == 3) {
                    this.engine.amazon(true, abstractC8831l2, abstractC8831l, c7260l);
                } else {
                    this.engine.amazon(false, abstractC8831l, abstractC8831l2, c7260l);
                }
                return this.engine.purchase(byteArray.length, byteArray);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        }
        if (i3 != 1 && i3 != 3) {
            if (i3 != 2 && i3 != 4) {
                C8339l.smaato("cipher not initialised");
                return null;
            }
            try {
                C8582l c8582l = this.engine;
                C7026l c7026l = new C7026l(6, false);
                c7026l.f14720l = c7838l;
                c8582l.purchase = false;
                c8582l.billing = abstractC8831l;
                c8582l.firebase = c7026l;
                c8582l.crashlytics(c7260l);
                return this.engine.purchase(byteArray.length, byteArray);
            } catch (C10352l e2) {
                throw new BadBlockException("unable to process block", e2);
            }
        }
        C6265l c6265l = new C6265l();
        SecureRandom secureRandomLoadAd = this.random;
        c7838l.f16362l.bitLength();
        if (secureRandomLoadAd == null) {
            secureRandomLoadAd = AbstractC8776l.loadAd();
        } else {
            ThreadLocal threadLocal = AbstractC8776l.yandex;
        }
        c6265l.f13227l = secureRandomLoadAd;
        c6265l.f13228l = c7838l;
        AbstractC16336l.amazon(c7838l.f16360l);
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
        final boolean z = this.engineSpec.f4249l;
        C18595l c18595l = new C18595l(c6265l, new InterfaceC17797l() { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.1
            @Override // defpackage.InterfaceC17797l
            public byte[] getEncoded(AbstractC8831l abstractC8831l3) {
                return ((C4148l) abstractC8831l3).f8515l.admob(z);
            }
        }, 21);
        try {
            C8582l c8582l2 = this.engine;
            AbstractC8831l abstractC8831l3 = this.key;
            c8582l2.purchase = true;
            c8582l2.mopub = abstractC8831l3;
            c8582l2.isPro = c18595l;
            c8582l2.crashlytics(c7260l);
            return this.engine.purchase(byteArray.length, byteArray);
        } catch (Exception e3) {
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
        if (key instanceof InterfaceC11004l) {
            return ((InterfaceC11004l) key).getParameters().f25097l.smaato();
        }
        C8339l.metrica("not an EC key");
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
        int iSmaato = this.otherKeyParameter == null ? (((((AbstractC2017l) abstractC8831l).f4542l.f16360l.smaato() + 7) / 8) * 2) + 1 : 0;
        int size = this.buffer.size() + i;
        C8470l c8470l = this.engine.amazon;
        int i3 = this.state;
        if (c8470l != null) {
            if (i3 != 1 && i3 != 3) {
                if (i3 != 2 && i3 != 4) {
                    C8339l.smaato("cipher not initialised");
                    return 0;
                }
                size = (size - i2) - iSmaato;
            }
            size = c8470l.crashlytics(size);
        } else if (i3 == 2 || i3 == 4) {
            size = (size - i2) - iSmaato;
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
                C18073l.smaato("must be passed recipient's public EC key for encryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i != 2 && i != 4) {
            C18073l.smaato("must be passed EC key");
            return;
        } else {
            if (!(key instanceof PrivateKey)) {
                C18073l.smaato("must be passed recipient's private EC key for decryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = ECUtils.generatePrivateKeyParameter((PrivateKey) key);
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

    public static class ECIES extends IESCipher {
        public ECIES(InterfaceC16922l interfaceC16922l, InterfaceC16922l interfaceC16922l2) {
            super(new C8582l(new C11733l(), new C0045l(interfaceC16922l), new C0361l(interfaceC16922l2)));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ECIES() {
            this(new C0655l(), new C0655l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(InterfaceC10952l interfaceC10952l, int i, InterfaceC16922l interfaceC16922l, InterfaceC16922l interfaceC16922l2) {
            super(new C8582l(new C11733l(), new C0045l(interfaceC16922l), new C0361l(interfaceC16922l2), new C8470l(interfaceC10952l)), i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ECIESwithCipher(InterfaceC10952l interfaceC10952l, int i) {
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
