package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC17742l;
import defpackage.AbstractC5020l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C13353l;
import defpackage.C16842l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2756l;
import defpackage.C7130l;
import defpackage.C7633l;
import defpackage.C9556l;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC16863l;
import defpackage.InterfaceC2716l;
import defpackage.InterfaceC4368l;
import defpackage.InterfaceC4787l;
import defpackage.InterfaceC6796l;
import defpackage.InterfaceC8134l;
import defpackage.advert;
import defpackage.applovin;
import defpackage.appmetrica;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private static Map<Cfor, int[]> componentKeySizes;
    private static final C10198l ecDsaBrainpoolP256r1;
    private static final C10198l ecDsaBrainpoolP384r1;
    private static final C10198l ecDsaP256;
    private static final C10198l ecDsaP384;
    private static final C10198l ecDsaP521;
    private static final C10198l ed25519;
    private static final C10198l ed448;
    private static final C10198l mlDsa44;
    private static final C10198l mlDsa65;
    private static final C10198l mlDsa87;
    private static Map<Cfor, C10198l[]> pairings;
    private static final C10198l rsa;
    private InterfaceC12575l helper;

    static {
        C10198l c10198l = new C10198l(InterfaceC8134l.f16997transient);
        mlDsa44 = c10198l;
        C10198l c10198l2 = new C10198l(InterfaceC8134l.f16986protected);
        mlDsa65 = c10198l2;
        C10198l c10198l3 = new C10198l(InterfaceC8134l.f17000while);
        mlDsa87 = c10198l3;
        C10198l c10198l4 = new C10198l(InterfaceC2716l.crashlytics);
        ed25519 = c10198l4;
        C10198l c10198l5 = new C10198l(InterfaceC2716l.amazon);
        ed448 = c10198l5;
        C10198l c10198lCreateECAlgID = createECAlgID(InterfaceC16863l.f32907synchronized);
        ecDsaP256 = c10198lCreateECAlgID;
        C10198l c10198lCreateECAlgID2 = createECAlgID(InterfaceC16863l.signatures);
        ecDsaP384 = c10198lCreateECAlgID2;
        C10198l c10198lCreateECAlgID3 = createECAlgID(InterfaceC16863l.premium);
        ecDsaP521 = c10198lCreateECAlgID3;
        C10198l c10198lCreateECAlgID4 = createECAlgID(InterfaceC4368l.metrica);
        ecDsaBrainpoolP256r1 = c10198lCreateECAlgID4;
        C10198l c10198lCreateECAlgID5 = createECAlgID(InterfaceC4368l.subscription);
        ecDsaBrainpoolP384r1 = c10198lCreateECAlgID5;
        C10198l c10198l6 = new C10198l(InterfaceC0543l.f1922throw);
        rsa = c10198l6;
        pairings = new HashMap();
        componentKeySizes = new HashMap();
        Map<Cfor, C10198l[]> map = pairings;
        Cfor cfor = InterfaceC6796l.billing;
        map.put(cfor, new C10198l[]{c10198l, c10198l6});
        Map<Cfor, C10198l[]> map2 = pairings;
        Cfor cfor2 = InterfaceC6796l.mopub;
        map2.put(cfor2, new C10198l[]{c10198l, c10198l6});
        Map<Cfor, C10198l[]> map3 = pairings;
        Cfor cfor3 = InterfaceC6796l.admob;
        map3.put(cfor3, new C10198l[]{c10198l, c10198l4});
        Map<Cfor, C10198l[]> map4 = pairings;
        Cfor cfor4 = InterfaceC6796l.subs;
        map4.put(cfor4, new C10198l[]{c10198l, c10198lCreateECAlgID});
        Map<Cfor, C10198l[]> map5 = pairings;
        Cfor cfor5 = InterfaceC6796l.isPro;
        map5.put(cfor5, new C10198l[]{c10198l2, c10198l6});
        Map<Cfor, C10198l[]> map6 = pairings;
        Cfor cfor6 = InterfaceC6796l.firebase;
        map6.put(cfor6, new C10198l[]{c10198l2, c10198l6});
        Map<Cfor, C10198l[]> map7 = pairings;
        Cfor cfor7 = InterfaceC6796l.smaato;
        map7.put(cfor7, new C10198l[]{c10198l2, c10198l6});
        Map<Cfor, C10198l[]> map8 = pairings;
        Cfor cfor8 = InterfaceC6796l.remoteconfig;
        map8.put(cfor8, new C10198l[]{c10198l2, c10198l6});
        Map<Cfor, C10198l[]> map9 = pairings;
        Cfor cfor9 = InterfaceC6796l.vip;
        map9.put(cfor9, new C10198l[]{c10198l2, c10198lCreateECAlgID});
        Map<Cfor, C10198l[]> map10 = pairings;
        Cfor cfor10 = InterfaceC6796l.metrica;
        map10.put(cfor10, new C10198l[]{c10198l2, c10198lCreateECAlgID2});
        Map<Cfor, C10198l[]> map11 = pairings;
        Cfor cfor11 = InterfaceC6796l.startapp;
        map11.put(cfor11, new C10198l[]{c10198l2, c10198lCreateECAlgID4});
        Map<Cfor, C10198l[]> map12 = pairings;
        Cfor cfor12 = InterfaceC6796l.adcel;
        map12.put(cfor12, new C10198l[]{c10198l2, c10198l4});
        Map<Cfor, C10198l[]> map13 = pairings;
        Cfor cfor13 = InterfaceC6796l.ads;
        map13.put(cfor13, new C10198l[]{c10198l3, c10198lCreateECAlgID2});
        Map<Cfor, C10198l[]> map14 = pairings;
        Cfor cfor14 = InterfaceC6796l.subscription;
        map14.put(cfor14, new C10198l[]{c10198l3, c10198lCreateECAlgID5});
        Map<Cfor, C10198l[]> map15 = pairings;
        Cfor cfor15 = InterfaceC6796l.tapsense;
        map15.put(cfor15, new C10198l[]{c10198l3, c10198l5});
        Map<Cfor, C10198l[]> map16 = pairings;
        Cfor cfor16 = InterfaceC6796l.license;
        map16.put(cfor16, new C10198l[]{c10198l3, c10198l6});
        Map<Cfor, C10198l[]> map17 = pairings;
        Cfor cfor17 = InterfaceC6796l.pro;
        map17.put(cfor17, new C10198l[]{c10198l3, c10198lCreateECAlgID3});
        Map<Cfor, C10198l[]> map18 = pairings;
        Cfor cfor18 = InterfaceC6796l.Signature;
        map18.put(cfor18, new C10198l[]{c10198l3, c10198l6});
        componentKeySizes.put(cfor, new int[]{1312, 268});
        componentKeySizes.put(cfor2, new int[]{1312, 284});
        componentKeySizes.put(cfor3, new int[]{1312, 32});
        componentKeySizes.put(cfor4, new int[]{1312, 76});
        componentKeySizes.put(cfor5, new int[]{1952, PSKKeyManager.MAX_KEY_LENGTH_BYTES});
        componentKeySizes.put(cfor6, new int[]{1952, PSKKeyManager.MAX_KEY_LENGTH_BYTES});
        componentKeySizes.put(cfor7, new int[]{1952, 542});
        componentKeySizes.put(cfor8, new int[]{1952, 542});
        componentKeySizes.put(cfor9, new int[]{1952, 76});
        componentKeySizes.put(cfor10, new int[]{1952, 87});
        componentKeySizes.put(cfor11, new int[]{1952, 76});
        componentKeySizes.put(cfor12, new int[]{1952, 32});
        componentKeySizes.put(cfor13, new int[]{2592, 87});
        componentKeySizes.put(cfor14, new int[]{2592, 87});
        componentKeySizes.put(cfor15, new int[]{2592, 57});
        componentKeySizes.put(cfor16, new int[]{2592, 542});
        componentKeySizes.put(cfor18, new int[]{2592, PSKKeyManager.MAX_KEY_LENGTH_BYTES});
        componentKeySizes.put(cfor17, new int[]{2592, 93});
    }

    public KeyFactorySpi(InterfaceC12575l interfaceC12575l) {
        this.helper = interfaceC12575l;
    }

    private static C10198l createECAlgID(Cfor cfor) {
        return new C10198l(InterfaceC15427l.f30173l, new C7130l(cfor));
    }

    private List<KeyFactory> getKeyFactoriesFromIdentifier(Cfor cfor) throws NoSuchAlgorithmException {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        String[] pairing = CompositeIndex.getPairing(cfor);
        if (pairing == null) {
            throw new NoSuchAlgorithmException("Cannot create KeyFactories. Unsupported algorithm identifier.");
        }
        arrayList.add(this.helper.premium(CompositeIndex.getBaseName(pairing[0])));
        arrayList.add(this.helper.premium(CompositeIndex.getBaseName(pairing[1])));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private X509EncodedKeySpec[] getKeysSpecs(Cfor cfor, advert[] advertVarArr) throws IOException {
        X509EncodedKeySpec[] x509EncodedKeySpecArr = new X509EncodedKeySpec[advertVarArr.length];
        C17029l[] c17029lArr = new C17029l[advertVarArr.length];
        C10198l[] c10198lArr = pairings.get(cfor);
        if (c10198lArr == null) {
            C18262l.metrica("Cannot create key specs. Unsupported algorithm identifier.");
            return null;
        }
        c17029lArr[0] = new C17029l(c10198lArr[0], advertVarArr[0]);
        c17029lArr[1] = new C17029l(c10198lArr[1], advertVarArr[1]);
        x509EncodedKeySpecArr[0] = new X509EncodedKeySpec(c17029lArr[0].getEncoded());
        x509EncodedKeySpecArr[1] = new X509EncodedKeySpec(c17029lArr[1].getEncoded());
        return x509EncodedKeySpecArr;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (this.helper == null) {
            this.helper = new C7633l();
        }
        try {
            if (key instanceof PrivateKey) {
                return generatePrivate(C2756l.vip(key.getEncoded()));
            }
            if (key instanceof PublicKey) {
                return generatePublic(C17029l.vip(key.getEncoded()));
            }
            C18073l.smaato("Key not recognized");
            return null;
        } catch (IOException e) {
            throw new InvalidKeyException(AbstractC5020l.adcel(e, new StringBuilder("Key could not be parsed: ")));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        byte[] bArr;
        if (this.helper == null) {
            this.helper = new C7633l();
        }
        Cfor cfor = c2756l.f5961l.f20787l;
        if (InterfaceC4787l.Signature.ad(cfor) || InterfaceC4787l.license.ad(cfor)) {
            Cclass cclassInmobi = Cclass.inmobi(c2756l.ads());
            PrivateKey[] privateKeyArr = new PrivateKey[cclassInmobi.size()];
            for (int i = 0; i != cclassInmobi.size(); i++) {
                C2756l c2756lVip = C2756l.vip(Cclass.inmobi(cclassInmobi.mo173throws(i)));
                try {
                    privateKeyArr[i] = this.helper.premium(c2756lVip.f5961l.f20787l.inmobi()).generatePrivate(new PKCS8EncodedKeySpec(c2756lVip.getEncoded()));
                } catch (Exception e) {
                    throw new IOException(AbstractC12900l.admob(e, new StringBuilder("cannot decode generic composite: ")), e);
                }
            }
            return new C16842l(InterfaceC4787l.license, privateKeyArr);
        }
        try {
            List<KeyFactory> keyFactoriesFromIdentifier = getKeyFactoriesFromIdentifier(cfor);
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            try {
                bArr = Cthrow.premium(c2756l.ads()).f36593l;
            } catch (Exception unused) {
                bArr = c2756l.metrica().f36593l;
            }
            appmetricaVar.purchase(new C11327l(AbstractC14024l.vip(0, 32, bArr)));
            String algorithm = keyFactoriesFromIdentifier.get(1).getAlgorithm();
            appmetricaVar.purchase(algorithm.equals("Ed25519") ? new C11327l(AbstractC14024l.mopub(new byte[]{4, 32}, AbstractC14024l.vip(32, bArr.length, bArr))) : algorithm.equals("Ed448") ? new C11327l(AbstractC14024l.mopub(new byte[]{4, 57}, AbstractC14024l.vip(32, bArr.length, bArr))) : new C11327l(AbstractC14024l.vip(32, bArr.length, bArr)));
            applovin[] applovinVarArrM167switch = appmetricaVar.m167switch();
            PrivateKey[] privateKeyArr2 = new PrivateKey[applovinVarArrM167switch.length];
            C10198l[] c10198lArr = pairings.get(cfor);
            for (int i2 = 0; i2 < applovinVarArrM167switch.length; i2++) {
                applovin applovinVar = applovinVarArrM167switch[i2];
                if (applovinVar instanceof Cthrow) {
                    appmetrica appmetricaVar2 = new appmetrica(3, 0);
                    appmetricaVar2.purchase(c2756l.f5962l);
                    appmetricaVar2.purchase(c10198lArr[i2]);
                    appmetricaVar2.purchase(applovinVarArrM167switch[i2]);
                    C11138l c11138l = new C11138l(appmetricaVar2);
                    c11138l.f22357l = -1;
                    privateKeyArr2[i2] = keyFactoriesFromIdentifier.get(i2).generatePrivate(new PKCS8EncodedKeySpec(C2756l.vip(c11138l).getEncoded()));
                } else {
                    privateKeyArr2[i2] = keyFactoriesFromIdentifier.get(i2).generatePrivate(new PKCS8EncodedKeySpec(C2756l.vip(Cclass.inmobi(applovinVar)).getEncoded()));
                }
            }
            return new C16842l(cfor, privateKeyArr2);
        } catch (GeneralSecurityException e2) {
            throw AbstractC17742l.crashlytics(e2.getMessage(), e2);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cclass cclassInmobi;
        if (this.helper == null) {
            this.helper = new C7633l();
        }
        C10198l c10198l = c17029l.f33175l;
        advert advertVar = c17029l.f33174l;
        Cfor cfor = c10198l.f20787l;
        byte[][] bArrSplit = new byte[2][];
        try {
            cclassInmobi = Cclass.inmobi(advertVar.inmobi());
        } catch (Exception unused) {
            bArrSplit = split(cfor, advertVar);
            cclassInmobi = null;
        }
        int i = 0;
        if (InterfaceC4787l.Signature.ad(cfor) || InterfaceC4787l.license.ad(cfor)) {
            Cclass cclassInmobi2 = Cclass.inmobi(advertVar.inmobi());
            PublicKey[] publicKeyArr = new PublicKey[cclassInmobi2.size()];
            while (i != cclassInmobi2.size()) {
                C17029l c17029lVip = C17029l.vip(cclassInmobi2.mo173throws(i));
                try {
                    publicKeyArr[i] = this.helper.premium(c17029lVip.f33175l.f20787l.inmobi()).generatePublic(new X509EncodedKeySpec(c17029lVip.getEncoded()));
                    i++;
                } catch (Exception e) {
                    throw new IOException(AbstractC12900l.admob(e, new StringBuilder("cannot decode generic composite: ")), e);
                }
            }
            return new C9556l(InterfaceC4787l.license, publicKeyArr);
        }
        try {
            int length = cclassInmobi == null ? bArrSplit.length : cclassInmobi.size();
            List<KeyFactory> keyFactoriesFromIdentifier = getKeyFactoriesFromIdentifier(cfor);
            advert[] advertVarArr = new advert[length];
            for (int i2 = 0; i2 < length; i2++) {
                if (cclassInmobi == null) {
                    advertVarArr[i2] = new C13353l(bArrSplit[i2], 0);
                } else if (cclassInmobi.mo173throws(i2) instanceof C11327l) {
                    advertVarArr[i2] = new C13353l(((C11327l) cclassInmobi.mo173throws(i2)).f36593l, 0);
                } else {
                    advertVarArr[i2] = (C13353l) cclassInmobi.mo173throws(i2);
                }
            }
            X509EncodedKeySpec[] keysSpecs = getKeysSpecs(cfor, advertVarArr);
            PublicKey[] publicKeyArr2 = new PublicKey[length];
            while (i < length) {
                publicKeyArr2[i] = keyFactoriesFromIdentifier.get(i).generatePublic(keysSpecs[i]);
                i++;
            }
            return new C9556l(cfor, publicKeyArr2);
        } catch (GeneralSecurityException e2) {
            throw AbstractC17742l.crashlytics(e2.getMessage(), e2);
        }
    }

    public byte[][] split(Cfor cfor, advert advertVar) {
        int[] iArr = componentKeySizes.get(cfor);
        byte[] bArrInmobi = advertVar.inmobi();
        int i = iArr[0];
        byte[][] bArr = {new byte[i], new byte[bArrInmobi.length - i]};
        System.arraycopy(bArrInmobi, 0, bArr[0], 0, i);
        int i2 = iArr[0];
        byte[] bArr2 = bArr[1];
        System.arraycopy(bArrInmobi, i2, bArr2, 0, bArr2.length);
        return bArr;
    }

    public KeyFactorySpi() {
        this(null);
    }
}
