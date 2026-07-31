package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.AbstractC11721l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC16784l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.C0045l;
import defpackage.C0272l;
import defpackage.C0361l;
import defpackage.C0655l;
import defpackage.C0833l;
import defpackage.C10012l;
import defpackage.C10352l;
import defpackage.C10754l;
import defpackage.C10905l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C1838l;
import defpackage.C18595l;
import defpackage.C2396l;
import defpackage.C4998l;
import defpackage.C5008l;
import defpackage.C5501l;
import defpackage.C7260l;
import defpackage.C7438l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.C8470l;
import defpackage.C8582l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC17797l;
import defpackage.InterfaceC9719l;
import defpackage.metrica;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
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
    private final int ivLength;
    private AbstractC8831l key;
    private AbstractC8831l otherKeyParameter;
    private SecureRandom random;
    private int state;

    public static class IES extends IESCipher {
        public IES() {
            C10905l c10905l = new C10905l();
            int i = AbstractC14832l.yandex;
            super(new C8582l(c10905l, new C0045l(new C0655l()), new C0361l(new C0655l())));
        }
    }

    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            C10905l c10905l = new C10905l();
            int i = AbstractC14832l.yandex;
            super(new C8582l(c10905l, new C0045l(new C0655l()), new C0361l(new C0655l()), new C8470l(new C4998l(metrica.loadAd()))), 16);
        }
    }

    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            C10905l c10905l = new C10905l();
            int i = AbstractC14832l.yandex;
            super(new C8582l(c10905l, new C0045l(new C0655l()), new C0361l(new C0655l()), new C8470l(new C4998l(new C10012l()))), 8);
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
        C2396l c2396l = ((AbstractC11721l) abstractC8831l).f23457l;
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
        if (i3 == 1 || i3 == 3) {
            C5008l c5008l = new C5008l(5, false);
            c5008l.mo274throws(new C0833l(c2396l, this.random));
            C18595l c18595l = new C18595l(c5008l, new InterfaceC17797l() { // from class: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher.1
                @Override // defpackage.InterfaceC17797l
                public byte[] getEncoded(AbstractC8831l abstractC8831l3) {
                    int iBitLength = (((AbstractC11721l) abstractC8831l3).f23457l.f5158l.bitLength() + 7) / 8;
                    byte[] bArr2 = new byte[iBitLength];
                    BigInteger bigInteger = ((C7438l) abstractC8831l3).f15399l;
                    BigInteger bigInteger2 = AbstractC16784l.yandex;
                    byte[] byteArray2 = bigInteger.toByteArray();
                    if (byteArray2[0] == 0 && byteArray2.length != 1) {
                        int length = byteArray2.length - 1;
                        byte[] bArr3 = new byte[length];
                        System.arraycopy(byteArray2, 1, bArr3, 0, length);
                        byteArray2 = bArr3;
                    }
                    if (byteArray2.length <= iBitLength) {
                        System.arraycopy(byteArray2, 0, bArr2, iBitLength - byteArray2.length, byteArray2.length);
                        return bArr2;
                    }
                    C8339l.metrica("Senders's public key longer than expected.");
                    return null;
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
        if (i3 != 2 && i3 != 4) {
            C8339l.smaato("IESCipher not initialised");
            return null;
        }
        try {
            C8582l c8582l2 = this.engine;
            C2396l c2396l2 = ((AbstractC11721l) abstractC8831l).f23457l;
            C5501l c5501l = new C5501l(7, false);
            c5501l.f11764l = c2396l2;
            c8582l2.purchase = false;
            c8582l2.billing = abstractC8831l;
            c8582l2.firebase = c5501l;
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
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        C8339l.metrica("not a DH key");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int size;
        AbstractC8831l abstractC8831l = this.key;
        if (abstractC8831l == null) {
            C8339l.smaato("cipher not initialised");
            return 0;
        }
        int i2 = this.engine.crashlytics.f1426l;
        int iBitLength = this.otherKeyParameter == null ? (((((AbstractC11721l) abstractC8831l).f23457l.f5158l.bitLength() + 7) * 2) / 8) + 1 : 0;
        C8470l c8470l = this.engine.amazon;
        if (c8470l != null) {
            int i3 = this.state;
            if (i3 != 1 && i3 != 3) {
                if (i3 != 2 && i3 != 4) {
                    C8339l.smaato("cipher not initialised");
                    return 0;
                }
                i = (i - i2) - iBitLength;
            }
            i = c8470l.crashlytics(i);
        }
        int i4 = this.state;
        if (i4 == 1 || i4 == 3) {
            size = this.buffer.size() + i2 + iBitLength;
        } else {
            if (i4 != 2 && i4 != 4) {
                C8339l.smaato("IESCipher not initialised");
                return 0;
            }
            size = (this.buffer.size() - i2) - iBitLength;
        }
        return size + i;
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
            if (!(key instanceof DHPublicKey)) {
                C18073l.smaato("must be passed recipient's public DH key for encryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter((PublicKey) key);
        } else if (i != 2 && i != 4) {
            C18073l.smaato("must be passed EC key");
            return;
        } else {
            if (!(key instanceof DHPrivateKey)) {
                C18073l.smaato("must be passed recipient's private DH key for decryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter((PrivateKey) key);
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
