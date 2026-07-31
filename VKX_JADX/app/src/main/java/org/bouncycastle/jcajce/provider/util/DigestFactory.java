package org.bouncycastle.jcajce.provider.util;

import defpackage.AbstractC14832l;
import defpackage.AbstractC9008l;
import defpackage.C0655l;
import defpackage.C10032l;
import defpackage.C17711l;
import defpackage.C17951l;
import defpackage.C2657l;
import defpackage.C3077l;
import defpackage.C5153l;
import defpackage.C9102l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC8134l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class DigestFactory {
    private static Set md5 = new HashSet();
    private static Set sha1 = new HashSet();
    private static Set sha224 = new HashSet();
    private static Set sha256 = new HashSet();
    private static Set sha384 = new HashSet();
    private static Set sha512 = new HashSet();
    private static Set sha512_224 = new HashSet();
    private static Set sha512_256 = new HashSet();
    private static Set sha3_224 = new HashSet();
    private static Set sha3_256 = new HashSet();
    private static Set sha3_384 = new HashSet();
    private static Set sha3_512 = new HashSet();
    private static Set shake128 = new HashSet();
    private static Set shake256 = new HashSet();
    private static Map oids = new HashMap();

    static {
        md5.add("MD5");
        Set set = md5;
        Cfor cfor = InterfaceC0543l.f1910l;
        set.add(cfor.inmobi());
        sha1.add("SHA1");
        sha1.add("SHA-1");
        Set set2 = sha1;
        Cfor cfor2 = InterfaceC4502l.billing;
        set2.add(cfor2.inmobi());
        sha224.add("SHA224");
        sha224.add("SHA-224");
        Set set3 = sha224;
        Cfor cfor3 = InterfaceC8134l.amazon;
        set3.add(cfor3.inmobi());
        sha256.add("SHA256");
        sha256.add("SHA-256");
        Set set4 = sha256;
        Cfor cfor4 = InterfaceC8134l.yandex;
        set4.add(cfor4.inmobi());
        sha384.add("SHA384");
        sha384.add("SHA-384");
        Set set5 = sha384;
        Cfor cfor5 = InterfaceC8134l.loadAd;
        set5.add(cfor5.inmobi());
        sha512.add("SHA512");
        sha512.add("SHA-512");
        Set set6 = sha512;
        Cfor cfor6 = InterfaceC8134l.crashlytics;
        set6.add(cfor6.inmobi());
        sha512_224.add("SHA512(224)");
        sha512_224.add("SHA-512(224)");
        Set set7 = sha512_224;
        Cfor cfor7 = InterfaceC8134l.purchase;
        set7.add(cfor7.inmobi());
        sha512_256.add("SHA512(256)");
        sha512_256.add("SHA-512(256)");
        Set set8 = sha512_256;
        Cfor cfor8 = InterfaceC8134l.billing;
        set8.add(cfor8.inmobi());
        sha3_224.add("SHA3-224");
        Set set9 = sha3_224;
        Cfor cfor9 = InterfaceC8134l.mopub;
        set9.add(cfor9.inmobi());
        sha3_256.add("SHA3-256");
        Set set10 = sha3_256;
        Cfor cfor10 = InterfaceC8134l.admob;
        set10.add(cfor10.inmobi());
        sha3_384.add("SHA3-384");
        Set set11 = sha3_384;
        Cfor cfor11 = InterfaceC8134l.subs;
        set11.add(cfor11.inmobi());
        sha3_512.add("SHA3-512");
        Set set12 = sha3_512;
        Cfor cfor12 = InterfaceC8134l.isPro;
        set12.add(cfor12.inmobi());
        shake128.add("SHAKE128");
        Set set13 = shake128;
        Cfor cfor13 = InterfaceC8134l.firebase;
        set13.add(cfor13.inmobi());
        shake256.add("SHAKE256");
        Set set14 = shake256;
        Cfor cfor14 = InterfaceC8134l.smaato;
        set14.add(cfor14.inmobi());
        oids.put("MD5", cfor);
        oids.put(cfor.inmobi(), cfor);
        oids.put("SHA1", cfor2);
        oids.put("SHA-1", cfor2);
        oids.put(cfor2.inmobi(), cfor2);
        oids.put("SHA224", cfor3);
        oids.put("SHA-224", cfor3);
        oids.put(cfor3.inmobi(), cfor3);
        oids.put("SHA256", cfor4);
        oids.put("SHA-256", cfor4);
        oids.put(cfor4.inmobi(), cfor4);
        oids.put("SHA384", cfor5);
        oids.put("SHA-384", cfor5);
        oids.put(cfor5.inmobi(), cfor5);
        oids.put("SHA512", cfor6);
        oids.put("SHA-512", cfor6);
        oids.put(cfor6.inmobi(), cfor6);
        oids.put("SHA512(224)", cfor7);
        oids.put("SHA-512(224)", cfor7);
        oids.put(cfor7.inmobi(), cfor7);
        oids.put("SHA512(256)", cfor8);
        oids.put("SHA-512(256)", cfor8);
        oids.put(cfor8.inmobi(), cfor8);
        oids.put("SHA3-224", cfor9);
        oids.put(cfor9.inmobi(), cfor9);
        oids.put("SHA3-256", cfor10);
        oids.put(cfor10.inmobi(), cfor10);
        oids.put("SHA3-384", cfor11);
        oids.put(cfor11.inmobi(), cfor11);
        oids.put("SHA3-512", cfor12);
        oids.put(cfor12.inmobi(), cfor12);
        oids.put("SHAKE128", cfor13);
        oids.put(cfor13.inmobi(), cfor13);
        oids.put("SHAKE256", cfor14);
        oids.put(cfor14.inmobi(), cfor14);
    }

    public static InterfaceC16922l getDigest(String str) {
        String strMopub = AbstractC9008l.mopub(str);
        if (sha1.contains(strMopub)) {
            int i = AbstractC14832l.yandex;
            return new C0655l();
        }
        if (md5.contains(strMopub)) {
            int i2 = AbstractC14832l.yandex;
            return new C3077l();
        }
        if (sha224.contains(strMopub)) {
            int i3 = AbstractC14832l.yandex;
            return new C9102l();
        }
        if (sha256.contains(strMopub)) {
            int i4 = AbstractC14832l.yandex;
            return new C2657l();
        }
        if (sha384.contains(strMopub)) {
            int i5 = AbstractC14832l.yandex;
            return new C5153l();
        }
        if (sha512.contains(strMopub)) {
            int i6 = AbstractC14832l.yandex;
            return new C17711l();
        }
        if (sha512_224.contains(strMopub)) {
            int i7 = AbstractC14832l.yandex;
            return new C10032l(224, 0);
        }
        if (sha512_256.contains(strMopub)) {
            int i8 = AbstractC14832l.yandex;
            return new C10032l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);
        }
        if (sha3_224.contains(strMopub)) {
            return AbstractC14832l.yandex();
        }
        if (sha3_256.contains(strMopub)) {
            return AbstractC14832l.loadAd();
        }
        if (sha3_384.contains(strMopub)) {
            return AbstractC14832l.crashlytics();
        }
        if (sha3_512.contains(strMopub)) {
            return AbstractC14832l.amazon();
        }
        if (shake128.contains(strMopub)) {
            int i9 = AbstractC14832l.yandex;
            return new C17951l(128);
        }
        if (!shake256.contains(strMopub)) {
            return null;
        }
        int i10 = AbstractC14832l.yandex;
        return new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public static Cfor getOID(String str) {
        return (Cfor) oids.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        if (sha1.contains(str) && sha1.contains(str2)) {
            return true;
        }
        if (sha224.contains(str) && sha224.contains(str2)) {
            return true;
        }
        if (sha256.contains(str) && sha256.contains(str2)) {
            return true;
        }
        if (sha384.contains(str) && sha384.contains(str2)) {
            return true;
        }
        if (sha512.contains(str) && sha512.contains(str2)) {
            return true;
        }
        if (sha512_224.contains(str) && sha512_224.contains(str2)) {
            return true;
        }
        if (sha512_256.contains(str) && sha512_256.contains(str2)) {
            return true;
        }
        if (sha3_224.contains(str) && sha3_224.contains(str2)) {
            return true;
        }
        if (sha3_256.contains(str) && sha3_256.contains(str2)) {
            return true;
        }
        if (sha3_384.contains(str) && sha3_384.contains(str2)) {
            return true;
        }
        if (sha3_512.contains(str) && sha3_512.contains(str2)) {
            return true;
        }
        return md5.contains(str) && md5.contains(str2);
    }
}
