package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC14024l;
import defpackage.C0272l;
import defpackage.C0361l;
import defpackage.C10556l;
import defpackage.C13886l;
import defpackage.C16023l;
import defpackage.C18073l;
import defpackage.InterfaceC2232l;
import defpackage.InterfaceC9719l;
import defpackage.remoteconfig;
import defpackage.smaato;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BaseMac extends MacSpi implements PBE {
    private int keySize;
    private InterfaceC2232l macEngine;
    private int pbeHash;
    private int scheme;

    public BaseMac(InterfaceC2232l interfaceC2232l) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 160;
        this.macEngine = interfaceC2232l;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i;
        InterfaceC9719l interfaceC9719lMakePBEMacParameters;
        if (key == null) {
            C18073l.smaato("key is null");
            return;
        }
        if (key instanceof C16023l) {
            try {
                SecretKey secretKey = (SecretKey) key;
                try {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                        PBEKey pBEKey = (PBEKey) secretKey;
                        pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    boolean zStartsWith = this.macEngine.getAlgorithmName().startsWith("GOST");
                    int i2 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (zStartsWith) {
                        i = 6;
                    } else {
                        InterfaceC2232l interfaceC2232l = this.macEngine;
                        if (!(interfaceC2232l instanceof C0361l) || ((C0361l) interfaceC2232l).getAlgorithmName().startsWith("SHA-1")) {
                            i = 1;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-224")) {
                            i = 7;
                            i2 = 224;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-256")) {
                            i = 4;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-384")) {
                            i = 8;
                            i2 = 384;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-512")) {
                            i = 9;
                            i2 = AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        } else {
                            if (!this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                                throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.macEngine.getAlgorithmName());
                            }
                            i = 2;
                        }
                        i2 = 160;
                    }
                    interfaceC9719lMakePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i, i2, pBEParameterSpec);
                } catch (Exception unused) {
                    C18073l.pro("PKCS12 requires a PBEParameterSpec");
                    return;
                }
            } catch (Exception unused2) {
                C18073l.smaato("PKCS12 requires a SecretKey/PBEKey");
                return;
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                interfaceC9719lMakePBEMacParameters = bCPBEKey.getParam();
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    C18073l.pro("PBE requires PBE parameters to be set.");
                    return;
                }
                interfaceC9719lMakePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            interfaceC9719lMakePBEMacParameters = new C13886l(key.getEncoded());
        }
        C13886l c13886l = interfaceC9719lMakePBEMacParameters instanceof C0272l ? (C13886l) ((C0272l) interfaceC9719lMakePBEMacParameters).f1272l : (C13886l) interfaceC9719lMakePBEMacParameters;
        if (algorithmParameterSpec instanceof smaato) {
            smaato smaatoVar = (smaato) algorithmParameterSpec;
            interfaceC9719lMakePBEMacParameters = new remoteconfig(c13886l, smaatoVar.f36569l, smaatoVar.getIV(), AbstractC14024l.crashlytics(smaatoVar.f36570l));
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            interfaceC9719lMakePBEMacParameters = new C0272l(c13886l, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            interfaceC9719lMakePBEMacParameters = new C0272l(new C10556l(c13886l.f27156l, rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
        } else if (algorithmParameterSpec == null) {
            interfaceC9719lMakePBEMacParameters = new C13886l(key.getEncoded());
        } else if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
            interfaceC9719lMakePBEMacParameters = GcmSpecUtil.extractAeadParameters(c13886l, algorithmParameterSpec);
        } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        try {
            this.macEngine.init(interfaceC9719lMakePBEMacParameters);
        } catch (Exception e) {
            throw new InvalidAlgorithmParameterException(AbstractC12900l.admob(e, new StringBuilder("cannot initialize MAC: ")));
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
        this.macEngine.update(b);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.macEngine.update(bArr, i, i2);
    }

    public BaseMac(int i, InterfaceC2232l interfaceC2232l) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = i;
        this.macEngine = interfaceC2232l;
    }

    public BaseMac(InterfaceC2232l interfaceC2232l, int i, int i2, int i3) {
        this.macEngine = interfaceC2232l;
        this.scheme = i;
        this.pbeHash = i2;
        this.keySize = i3;
    }
}
