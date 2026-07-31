package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC12994l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14715l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC9008l;
import defpackage.AbstractC9238l;
import defpackage.C11974l;
import defpackage.C12333l;
import defpackage.C2313l;
import defpackage.C6404l;
import defpackage.C8339l;
import defpackage.C9800l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC1898l;
import defpackage.InterfaceC2572l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC4787l;
import defpackage.InterfaceC5594l;
import defpackage.InterfaceC6152l;
import defpackage.InterfaceC8134l;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, Cfor> defaultOids;
    private static final Hashtable des;
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids;
    private AbstractC9238l hybridSpec;
    protected final String kaAlgorithm;
    protected final InterfaceC6152l kdf;
    protected byte[] ukmParameters;
    protected byte[] ukmParametersSalt;

    static {
        HashMap map = new HashMap();
        defaultOids = map;
        HashMap map2 = new HashMap();
        keySizes = map2;
        HashMap map3 = new HashMap();
        nameTable = map3;
        Hashtable hashtable = new Hashtable();
        oids = hashtable;
        Hashtable hashtable2 = new Hashtable();
        des = hashtable2;
        Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        map2.put("DES", 64);
        map2.put("DESEDE", 192);
        map2.put("BLOWFISH", 128);
        map2.put("AES", numValueOf);
        map2.put(InterfaceC8134l.pro.inmobi(), 128);
        map2.put(InterfaceC8134l.inmobi.inmobi(), 192);
        map2.put(InterfaceC8134l.f16946extends.inmobi(), numValueOf);
        map2.put(InterfaceC8134l.ad.inmobi(), 128);
        map2.put(InterfaceC8134l.f16996throws.inmobi(), 192);
        Cfor cfor = InterfaceC8134l.f16949for;
        map2.put(cfor.inmobi(), numValueOf);
        map2.put(InterfaceC8134l.isVip.inmobi(), 128);
        map2.put(InterfaceC8134l.f16993synchronized.inmobi(), 192);
        map2.put(InterfaceC8134l.f16940catch.inmobi(), numValueOf);
        map2.put(InterfaceC8134l.advert.inmobi(), 128);
        map2.put(InterfaceC8134l.f16984package.inmobi(), 192);
        map2.put(InterfaceC8134l.f16995throw.inmobi(), numValueOf);
        Cfor cfor2 = InterfaceC8134l.signatures;
        map2.put(cfor2.inmobi(), 128);
        map2.put(InterfaceC8134l.f16990strictfp.inmobi(), 192);
        map2.put(InterfaceC8134l.f16945else.inmobi(), numValueOf);
        Cfor cfor3 = InterfaceC8134l.applovin;
        map2.put(cfor3.inmobi(), 128);
        map2.put(InterfaceC8134l.f16982native.inmobi(), 192);
        map2.put(InterfaceC8134l.f16992switch.inmobi(), numValueOf);
        map2.put(InterfaceC8134l.premium.inmobi(), 128);
        map2.put(InterfaceC8134l.f16999volatile.inmobi(), 192);
        map2.put(InterfaceC8134l.f16939case.inmobi(), numValueOf);
        Cfor cfor4 = InterfaceC5594l.amazon;
        map2.put(cfor4.inmobi(), 128);
        Cfor cfor5 = InterfaceC5594l.purchase;
        map2.put(cfor5.inmobi(), 192);
        Cfor cfor6 = InterfaceC5594l.billing;
        map2.put(cfor6.inmobi(), numValueOf);
        Cfor cfor7 = InterfaceC1898l.crashlytics;
        map2.put(cfor7.inmobi(), 128);
        Cfor cfor8 = InterfaceC0543l.f1891l;
        map2.put(cfor8.inmobi(), 192);
        Cfor cfor9 = InterfaceC0543l.f1872implements;
        map2.put(cfor9.inmobi(), 192);
        Cfor cfor10 = InterfaceC4502l.loadAd;
        map2.put(cfor10.inmobi(), 64);
        Cfor cfor11 = InterfaceC11987l.purchase;
        map2.put(cfor11.inmobi(), numValueOf);
        map2.put(InterfaceC11987l.crashlytics.inmobi(), numValueOf);
        map2.put(InterfaceC11987l.amazon.inmobi(), numValueOf);
        Cfor cfor12 = InterfaceC0543l.f1905l;
        map2.put(cfor12.inmobi(), 160);
        Cfor cfor13 = InterfaceC0543l.f1881l;
        map2.put(cfor13.inmobi(), numValueOf);
        Cfor cfor14 = InterfaceC0543l.f1906l;
        map2.put(cfor14.inmobi(), 384);
        Cfor cfor15 = InterfaceC0543l.f1898l;
        map2.put(cfor15.inmobi(), Integer.valueOf(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        map.put("DESEDE", cfor9);
        map.put("AES", cfor);
        Cfor cfor16 = InterfaceC5594l.crashlytics;
        map.put("CAMELLIA", cfor16);
        Cfor cfor17 = InterfaceC1898l.yandex;
        map.put("SEED", cfor17);
        map.put("DES", cfor10);
        map3.put(InterfaceC4787l.purchase.inmobi(), "CAST5");
        map3.put(InterfaceC4787l.billing.inmobi(), "IDEA");
        map3.put(InterfaceC4787l.mopub.inmobi(), "Blowfish");
        map3.put(InterfaceC4787l.admob.inmobi(), "Blowfish");
        map3.put(InterfaceC4787l.subs.inmobi(), "Blowfish");
        map3.put(InterfaceC4787l.isPro.inmobi(), "Blowfish");
        map3.put(InterfaceC4502l.yandex.inmobi(), "DES");
        map3.put(cfor10.inmobi(), "DES");
        map3.put(InterfaceC4502l.amazon.inmobi(), "DES");
        map3.put(InterfaceC4502l.crashlytics.inmobi(), "DES");
        map3.put(InterfaceC4502l.purchase.inmobi(), "DESede");
        map3.put(cfor9.inmobi(), "DESede");
        map3.put(cfor8.inmobi(), "DESede");
        map3.put(InterfaceC0543l.f1882l.inmobi(), "RC2");
        map3.put(cfor12.inmobi(), "HmacSHA1");
        map3.put(InterfaceC0543l.f1883l.inmobi(), "HmacSHA224");
        map3.put(cfor13.inmobi(), "HmacSHA256");
        map3.put(cfor14.inmobi(), "HmacSHA384");
        map3.put(cfor15.inmobi(), "HmacSHA512");
        map3.put(InterfaceC5594l.yandex.inmobi(), "Camellia");
        map3.put(InterfaceC5594l.loadAd.inmobi(), "Camellia");
        map3.put(cfor16.inmobi(), "Camellia");
        map3.put(cfor4.inmobi(), "Camellia");
        map3.put(cfor5.inmobi(), "Camellia");
        map3.put(cfor6.inmobi(), "Camellia");
        map3.put(cfor7.inmobi(), "SEED");
        map3.put(cfor17.inmobi(), "SEED");
        map3.put(InterfaceC1898l.loadAd.inmobi(), "SEED");
        map3.put(cfor11.inmobi(), "GOST28147");
        map3.put(cfor2.inmobi(), "AES");
        map3.put(cfor3.inmobi(), "AES");
        map3.put(cfor3.inmobi(), "AES");
        hashtable.put("DESEDE", cfor9);
        hashtable.put("AES", cfor);
        hashtable.put("DES", cfor10);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(cfor10.inmobi(), "DES");
        hashtable2.put(cfor9.inmobi(), "DES");
        hashtable2.put(cfor8.inmobi(), "DES");
    }

    public BaseAgreementSpi(String str, InterfaceC6152l interfaceC6152l) {
        this.kaAlgorithm = str;
        this.kdf = interfaceC6152l;
    }

    private byte[] calcSecret() {
        return doCalcSecret();
    }

    public static String getAlgorithm(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(InterfaceC8134l.license.inmobi())) {
            return "AES";
        }
        if (str.startsWith(InterfaceC2572l.loadAd.inmobi())) {
            return "Serpent";
        }
        String str2 = nameTable.get(AbstractC9008l.mopub(str));
        return str2 != null ? str2 : str;
    }

    public static int getKeySize(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String strMopub = AbstractC9008l.mopub(str);
        Map<String, Integer> map = keySizes;
        if (map.containsKey(strMopub)) {
            return map.get(strMopub).intValue();
        }
        return -1;
    }

    private byte[] getSharedSecretBytes(byte[] bArr, String str, int i) throws NoSuchAlgorithmException {
        InterfaceC6152l interfaceC6152l = this.kdf;
        if (interfaceC6152l == null) {
            if (i <= 0) {
                return bArr;
            }
            int i2 = i / 8;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            AbstractC14024l.loadAd(bArr);
            return bArr2;
        }
        if (i < 0) {
            throw new NoSuchAlgorithmException(AbstractC14814l.startapp("unknown algorithm encountered: ", str));
        }
        int i3 = i / 8;
        byte[] bArr3 = new byte[i3];
        if (!(interfaceC6152l instanceof C11974l)) {
            interfaceC6152l.billing(interfaceC6152l instanceof C2313l ? new C12333l(bArr, this.ukmParametersSalt, this.ukmParameters) : new C9800l(bArr, this.ukmParameters));
        } else {
            if (str == null) {
                throw new NoSuchAlgorithmException("algorithm OID is null");
            }
            Cfor cforM190private = Cfor.m190private(str);
            if (cforM190private == null) {
                throw new NoSuchAlgorithmException("no OID for algorithm: ".concat(str));
            }
            byte[] bArr4 = this.ukmParameters;
            C6404l c6404l = new C6404l();
            c6404l.yandex = cforM190private;
            c6404l.loadAd = i;
            c6404l.crashlytics = bArr;
            c6404l.amazon = bArr4;
            this.kdf.billing(c6404l);
        }
        this.kdf.purchase(i3, bArr3);
        AbstractC14024l.loadAd(bArr);
        return bArr3;
    }

    public static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    public abstract byte[] doCalcSecret();

    public abstract void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom);

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        String strMopub = AbstractC9008l.mopub(str);
        Hashtable hashtable = oids;
        String strInmobi = hashtable.containsKey(strMopub) ? ((Cfor) hashtable.get(strMopub)).inmobi() : str;
        byte[] sharedSecretBytes = getSharedSecretBytes(calcSecret(), strInmobi, getKeySize(strInmobi));
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            AbstractC14715l.crashlytics(sharedSecretBytes);
        }
        return new SecretKeySpec(sharedSecretBytes, algorithm);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            doInitFromKey(key, null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        doInitFromKey(key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws ShortBufferException {
        byte[] bArrEngineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= bArrEngineGenerateSecret.length) {
            System.arraycopy(bArrEngineGenerateSecret, 0, bArr, i, bArrEngineGenerateSecret.length);
            return bArrEngineGenerateSecret.length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.kaAlgorithm);
        sb.append(" key agreement: need ");
        throw new ShortBufferException(AbstractC14814l.remoteconfig(bArrEngineGenerateSecret.length, " bytes", sb));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.kdf == null) {
            return calcSecret();
        }
        byte[] bArrCalcSecret = calcSecret();
        try {
            return getSharedSecretBytes(bArrCalcSecret, null, bArrCalcSecret.length * 8);
        } catch (NoSuchAlgorithmException e) {
            C8339l.smaato(e.getMessage());
            return null;
        }
    }
}
