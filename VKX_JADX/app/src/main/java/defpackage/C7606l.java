package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؚۣٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7606l {
    public HashSet admob;
    public Set amazon;
    public HashSet billing;
    public Set crashlytics;
    public HashSet firebase;
    public HashSet isPro;
    public Set loadAd;
    public HashSet mopub;
    public Set purchase;
    public HashSet smaato;
    public HashSet subs;
    public Set yandex;

    public static boolean adcel(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] strArrLoadAd = AbstractC9008l.loadAd(str2);
        String[] strArrLoadAd2 = AbstractC9008l.loadAd(str);
        if (strArrLoadAd2.length > strArrLoadAd.length) {
            int length = strArrLoadAd2.length - strArrLoadAd.length;
            if (!strArrLoadAd2[length - 1].equals("")) {
                for (int i = 0; i < strArrLoadAd.length; i++) {
                    if (strArrLoadAd[i].equalsIgnoreCase(strArrLoadAd2[length + i])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int admob(Collection collection) {
        int iAds = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            iAds = (obj instanceof byte[] ? AbstractC14024l.ads((byte[]) obj) : obj.hashCode()) + iAds;
        }
        return iAds;
    }

    public static int billing(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean firebase(Set set, String str) {
        boolean zAdcel;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String strSubstring = (String) it.next();
            int iIndexOf = strSubstring.indexOf(64);
            if (iIndexOf > 0) {
                zAdcel = str.equalsIgnoreCase(strSubstring);
            } else {
                String strSubstring2 = str.substring(str.indexOf(64) + 1);
                if (iIndexOf == 0) {
                    strSubstring = strSubstring.substring(1);
                } else if (strSubstring.startsWith(".")) {
                    zAdcel = adcel(strSubstring2, strSubstring);
                }
                zAdcel = strSubstring2.equalsIgnoreCase(strSubstring);
            }
            if (zAdcel) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPro(String str, String str2) {
        return str2.equalsIgnoreCase(str) || adcel(str2, str);
    }

    public static String metrica(HashSet hashSet) {
        StringBuilder sbAd = AbstractC5020l.ad("[");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (sbAd.length() > 1) {
                sbAd.append(",");
            }
            C16437l c16437lVip = C16437l.vip(it.next());
            sbAd.append(c16437lVip.f32137l.inmobi());
            sbAd.append(":");
            try {
                byte[] encoded = c16437lVip.f32136l.billing().getEncoded();
                C1561l c1561l = AbstractC8535l.yandex;
                sbAd.append(AbstractC8535l.purchase(0, encoded.length, encoded));
            } catch (IOException e) {
                sbAd.append(e.toString());
            }
        }
        sbAd.append("]");
        return sbAd.toString();
    }

    public static String mopub(applovin applovinVar) {
        return AbstractC9008l.yandex(C10604l.premium(applovinVar).f21525l);
    }

    public static boolean purchase(Collection collection, Collection collection2) {
        boolean z;
        boolean zEquals;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Object next = it.next();
                if (obj == next) {
                    zEquals = true;
                } else if (obj == null || next == null) {
                    zEquals = false;
                } else {
                    zEquals = ((obj instanceof byte[]) && (next instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) next) : obj.equals(next);
                }
                if (zEquals) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static boolean remoteconfig(Set set, String str) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String strSubstring = str.substring(str.indexOf(58) + 1);
            int iIndexOf = strSubstring.indexOf("//");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 2);
            }
            int iLastIndexOf = strSubstring.lastIndexOf(58);
            if (iLastIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            }
            String strSubstring2 = strSubstring.substring(strSubstring.indexOf(58) + 1);
            String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(64) + 1);
            int iIndexOf2 = strSubstring3.indexOf(47);
            if (iIndexOf2 != -1) {
                strSubstring3 = strSubstring3.substring(0, iIndexOf2);
            }
            if (str2.startsWith(".") ? adcel(strSubstring3, str2) : strSubstring3.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean smaato(Set set, byte[] bArr) {
        boolean zEquals;
        Iterator it = set.iterator();
        do {
            zEquals = false;
            if (!it.hasNext()) {
                return false;
            }
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr.length;
            if (length == bArr2.length / 2) {
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr2, length, bArr3, 0, length);
                byte[] bArr4 = new byte[length];
                byte[] bArr5 = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
                    bArr5[i] = (byte) (bArr[i] & bArr3[i]);
                }
                zEquals = Arrays.equals(bArr4, bArr5);
            }
        } while (!zEquals);
        return true;
    }

    public static boolean startapp(Cclass cclass, Cclass cclass2) {
        if (cclass2.size() >= 1 && cclass2.size() <= cclass.size()) {
            C16138l c16138lMetrica = C16138l.metrica(cclass2.mo173throws(0));
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= cclass.size()) {
                    i = i2;
                    break;
                }
                if (AbstractC11342l.admob(c16138lMetrica, C16138l.metrica(cclass.mo173throws(i)))) {
                    break;
                }
                i2 = i;
                i++;
            }
            if (cclass2.size() <= cclass.size() - i) {
                for (int i3 = 0; i3 < cclass2.size(); i3++) {
                    C16138l c16138lMetrica2 = C16138l.metrica(cclass2.mo173throws(i3));
                    C16138l c16138lMetrica3 = C16138l.metrica(cclass.mo173throws(i + i3));
                    if (c16138lMetrica2.f31596l.f842l.length == c16138lMetrica3.f31596l.f842l.length && c16138lMetrica2.vip().f16751l.ad(c16138lMetrica3.vip().f16751l)) {
                        if (c16138lMetrica2.f31596l.f842l.length == 1 && c16138lMetrica2.vip().f16751l.ad(C5836l.f12292l)) {
                            if (c16138lMetrica3.vip().f16750l.toString().startsWith(c16138lMetrica2.vip().f16750l.toString())) {
                            }
                        } else if (AbstractC11342l.admob(c16138lMetrica2, c16138lMetrica3)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static String vip(Set set) {
        StringBuilder sbAd = AbstractC5020l.ad("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            boolean z = true;
            if (sbAd.length() > 1) {
                sbAd.append(",");
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length / 2; i++) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(Integer.toString(bArr[i] & 255));
            }
            sb.append("/");
            for (int length = bArr.length / 2; length < bArr.length; length++) {
                if (z) {
                    z = false;
                } else {
                    sb.append(".");
                }
                sb.append(Integer.toString(bArr[length] & 255));
            }
            sbAd.append(sb.toString());
        }
        sbAd.append("]");
        return sbAd.toString();
    }

    public final void amazon(String str) {
        HashSet hashSet = this.subs;
        if (hashSet != null) {
            if ((str.length() != 0 || hashSet.size() != 0) && !firebase(hashSet, str)) {
                throw new C12391l("Subject email address is not from a permitted subtree.");
            }
        }
    }

    public final void crashlytics(C10915l c10915l) {
        HashSet hashSet = this.mopub;
        Cclass cclassInmobi = Cclass.inmobi(c10915l);
        if (hashSet != null) {
            if (hashSet.isEmpty() && cclassInmobi.size() == 0) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (startapp(cclassInmobi, (Cclass) it.next())) {
                    return;
                }
            }
            throw new C12391l("Subject distinguished name is not from a permitted subtree");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7606l)) {
            return false;
        }
        C7606l c7606l = (C7606l) obj;
        return purchase(c7606l.yandex, this.yandex) && purchase(c7606l.loadAd, this.loadAd) && purchase(c7606l.crashlytics, this.crashlytics) && purchase(c7606l.purchase, this.purchase) && purchase(c7606l.amazon, this.amazon) && purchase(c7606l.billing, this.billing) && purchase(c7606l.mopub, this.mopub) && purchase(c7606l.admob, this.admob) && purchase(c7606l.subs, this.subs) && purchase(c7606l.firebase, this.firebase) && purchase(c7606l.isPro, this.isPro) && purchase(c7606l.smaato, this.smaato);
    }

    public final int hashCode() {
        return admob(this.smaato) + admob(this.isPro) + admob(this.firebase) + admob(this.subs) + admob(this.admob) + admob(this.mopub) + admob(this.billing) + admob(this.amazon) + admob(this.purchase) + admob(this.crashlytics) + admob(this.loadAd) + admob(this.yandex);
    }

    public final void loadAd(C12378l c12378l) {
        applovin applovinVar = c12378l.f24470l;
        int i = c12378l.f24469l;
        if (i == 0) {
            HashSet hashSet = this.smaato;
            C16437l c16437lVip = C16437l.vip(applovinVar);
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (C16437l.vip(it.next()).equals(c16437lVip)) {
                        return;
                    }
                }
                throw new C12391l("Subject OtherName is not from a permitted subtree.");
            }
            return;
        }
        if (i == 1) {
            amazon(mopub(applovinVar));
            return;
        }
        if (i == 2) {
            HashSet hashSet2 = this.admob;
            String strMopub = mopub(applovinVar);
            if (hashSet2 != null) {
                if (strMopub.length() == 0 && hashSet2.size() == 0) {
                    return;
                }
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    if (isPro((String) it2.next(), strMopub)) {
                        return;
                    }
                }
                throw new C12391l("DNS is not from a permitted subtree.");
            }
            return;
        }
        if (i == 4) {
            crashlytics(C10915l.metrica(applovinVar));
            return;
        }
        if (i == 6) {
            HashSet hashSet3 = this.isPro;
            String strMopub2 = mopub(applovinVar);
            if (hashSet3 != null) {
                if ((strMopub2.length() != 0 || hashSet3.size() != 0) && !remoteconfig(hashSet3, strMopub2)) {
                    throw new C12391l("URI is not from a permitted subtree.");
                }
                return;
            }
            return;
        }
        if (i != 7) {
            return;
        }
        HashSet hashSet4 = this.firebase;
        byte[] bArr = Cthrow.premium(applovinVar).f36593l;
        if (hashSet4 != null) {
            if ((bArr.length != 0 || hashSet4.size() != 0) && !smaato(hashSet4, bArr)) {
                throw new C12391l("IP is not from a permitted subtree.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0386  */
    /* JADX WARN: Code duplicated, block: B:189:0x03be  */
    /* JADX WARN: Code duplicated, block: B:246:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0182  */
    public final void subs(C5722l[] c5722lArr) {
        Iterator it;
        int i;
        int i2;
        int i3;
        Iterator it2;
        int i4;
        byte[] bArrMopub;
        HashMap map = new HashMap();
        int i5 = 0;
        for (int i6 = 0; i6 != c5722lArr.length; i6++) {
            C5722l c5722l = c5722lArr[i6];
            Integer numValueOf = Integer.valueOf(c5722l.f12104l.f24469l);
            Set hashSet = (Set) map.get(numValueOf);
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(numValueOf, hashSet);
            }
            hashSet.add(c5722l);
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            Set set = (Set) entry.getValue();
            if (iIntValue != 0) {
                int i7 = 1;
                if (iIntValue != 1) {
                    int i8 = 2;
                    if (iIntValue != 2) {
                        int i9 = 4;
                        if (iIntValue == 4) {
                            it = it3;
                            i = i5;
                            HashSet<Cclass> hashSet2 = this.mopub;
                            HashSet hashSet3 = new HashSet();
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                Cclass cclassInmobi = Cclass.inmobi(((C5722l) it4.next()).f12104l.f24470l);
                                if (hashSet2 != null) {
                                    for (Cclass cclass : hashSet2) {
                                        if (startapp(cclassInmobi, cclass)) {
                                            hashSet3.add(cclassInmobi);
                                        } else if (startapp(cclass, cclassInmobi)) {
                                            hashSet3.add(cclass);
                                        }
                                    }
                                } else if (cclassInmobi != null) {
                                    hashSet3.add(cclassInmobi);
                                }
                            }
                            this.mopub = hashSet3;
                        } else if (iIntValue == 6) {
                            it = it3;
                            i = i5;
                            HashSet<String> hashSet4 = this.isPro;
                            HashSet hashSet5 = new HashSet();
                            Iterator it5 = set.iterator();
                            while (it5.hasNext()) {
                                String strMopub = mopub(((C5722l) it5.next()).f12104l.f24470l);
                                if (hashSet4 == null) {
                                    hashSet5.add(strMopub);
                                } else {
                                    for (String str : hashSet4) {
                                        if (str.indexOf(64) != -1) {
                                            String strSubstring = str.substring(str.indexOf(64) + 1);
                                            if (strMopub.indexOf(64) != -1) {
                                                if (str.equalsIgnoreCase(strMopub)) {
                                                    hashSet5.add(str);
                                                }
                                            } else if (strMopub.startsWith(".")) {
                                                if (adcel(strSubstring, strMopub)) {
                                                    hashSet5.add(str);
                                                }
                                            } else if (strSubstring.equalsIgnoreCase(strMopub)) {
                                                hashSet5.add(str);
                                            }
                                        } else if (str.startsWith(".")) {
                                            if (strMopub.indexOf(64) != -1) {
                                                if (adcel(strMopub.substring(strMopub.indexOf(64) + 1), str)) {
                                                    hashSet5.add(strMopub);
                                                }
                                            } else if (strMopub.startsWith(".")) {
                                                if (isPro(strMopub, str)) {
                                                    hashSet5.add(str);
                                                } else if (adcel(strMopub, str)) {
                                                    hashSet5.add(strMopub);
                                                }
                                            } else if (adcel(strMopub, str)) {
                                                hashSet5.add(strMopub);
                                            }
                                        } else if (strMopub.indexOf(64) != -1) {
                                            if (strMopub.substring(strMopub.indexOf(64) + 1).equalsIgnoreCase(str)) {
                                                hashSet5.add(strMopub);
                                            }
                                        } else if (strMopub.startsWith(".")) {
                                            if (adcel(str, strMopub)) {
                                                hashSet5.add(str);
                                            }
                                        } else if (str.equalsIgnoreCase(strMopub)) {
                                            hashSet5.add(str);
                                        }
                                    }
                                }
                            }
                            this.isPro = hashSet5;
                        } else {
                            if (iIntValue != 7) {
                                C8339l.smaato(AbstractC0653l.vip(iIntValue, "Unknown tag encountered: "));
                                return;
                            }
                            HashSet<byte[]> hashSet6 = this.firebase;
                            HashSet hashSet7 = new HashSet();
                            Iterator it6 = set.iterator();
                            while (it6.hasNext()) {
                                byte[] bArr = Cthrow.premium(((C5722l) it6.next()).f12104l.f24470l).f36593l;
                                if (hashSet6 == null) {
                                    hashSet7.add(bArr);
                                } else {
                                    for (byte[] bArr2 : hashSet6) {
                                        if (bArr2.length != bArr.length) {
                                            it2 = it3;
                                            i3 = i5;
                                            i2 = i8;
                                            i4 = i9;
                                        } else {
                                            int length = bArr2.length / i8;
                                            byte[] bArr3 = new byte[length];
                                            byte[] bArr4 = new byte[length];
                                            System.arraycopy(bArr2, i5, bArr3, i5, length);
                                            System.arraycopy(bArr2, length, bArr4, i5, length);
                                            byte[] bArr5 = new byte[length];
                                            i2 = i8;
                                            byte[] bArr6 = new byte[length];
                                            System.arraycopy(bArr, i5, bArr5, i5, length);
                                            System.arraycopy(bArr, length, bArr6, i5, length);
                                            byte[][] bArr7 = new byte[i9][];
                                            bArr7[i5] = bArr3;
                                            bArr7[i7] = bArr4;
                                            bArr7[i2] = bArr5;
                                            bArr7[3] = bArr6;
                                            byte[] bArr8 = bArr7[i5];
                                            byte[] bArr9 = bArr7[i7];
                                            byte[] bArr10 = bArr7[i2];
                                            byte[] bArr11 = bArr7[3];
                                            i3 = i5;
                                            int length2 = bArr8.length;
                                            byte[] bArr12 = new byte[length2];
                                            byte[] bArr13 = new byte[length2];
                                            int i10 = i7;
                                            byte[] bArr14 = new byte[length2];
                                            byte[] bArr15 = new byte[length2];
                                            it2 = it3;
                                            int i11 = i3;
                                            while (i11 < length2) {
                                                int i12 = i11;
                                                bArr12[i12] = (byte) (bArr8[i11] & bArr9[i11]);
                                                byte b = bArr8[i12];
                                                byte b2 = bArr9[i12];
                                                bArr13[i12] = (byte) ((b & b2) | (~b2));
                                                bArr14[i12] = (byte) (bArr10[i12] & bArr11[i12]);
                                                byte b3 = bArr10[i12];
                                                byte b4 = bArr11[i12];
                                                bArr15[i12] = (byte) ((b3 & b4) | (~b4));
                                                i11 = i12 + 1;
                                            }
                                            i4 = 4;
                                            byte[][] bArr16 = new byte[4][];
                                            bArr16[i3] = bArr12;
                                            bArr16[i10] = bArr13;
                                            bArr16[i2] = bArr14;
                                            bArr16[3] = bArr15;
                                            byte[] bArr17 = bArr16[i3];
                                            byte[] bArr18 = bArr16[i10];
                                            byte[] bArr19 = bArr16[i2];
                                            byte[] bArr20 = bArr16[3];
                                            if (billing(bArr18, bArr20) >= 0) {
                                                bArr18 = bArr20;
                                            }
                                            if (billing(billing(bArr17, bArr19) > 0 ? bArr17 : bArr19, bArr18) != i10) {
                                                byte[] bArr21 = new byte[bArr17.length];
                                                for (int i13 = i3; i13 < bArr17.length; i13++) {
                                                    bArr21[i13] = (byte) (bArr17[i13] | bArr19[i13]);
                                                }
                                                byte[] bArr22 = new byte[bArr9.length];
                                                for (int i14 = i3; i14 < bArr9.length; i14++) {
                                                    bArr22[i14] = (byte) (bArr9[i14] | bArr11[i14]);
                                                }
                                                bArrMopub = AbstractC14024l.mopub(bArr21, bArr22);
                                            }
                                            if (bArrMopub != null) {
                                                hashSet7.add(bArrMopub);
                                            }
                                            i8 = i2;
                                            i9 = i4;
                                            i5 = i3;
                                            it3 = it2;
                                            i7 = 1;
                                        }
                                        bArrMopub = null;
                                        if (bArrMopub != null) {
                                            hashSet7.add(bArrMopub);
                                        }
                                        i8 = i2;
                                        i9 = i4;
                                        i5 = i3;
                                        it3 = it2;
                                        i7 = 1;
                                    }
                                }
                                i8 = i8;
                                i9 = i9;
                                i5 = i5;
                                it3 = it3;
                                i7 = 1;
                            }
                            it = it3;
                            i = i5;
                            this.firebase = hashSet7;
                        }
                    } else {
                        it = it3;
                        i = i5;
                        HashSet<String> hashSet8 = this.admob;
                        HashSet hashSet9 = new HashSet();
                        Iterator it7 = set.iterator();
                        while (it7.hasNext()) {
                            String strMopub2 = mopub(((C5722l) it7.next()).f12104l.f24470l);
                            if (hashSet8 == null) {
                                hashSet9.add(strMopub2);
                            } else {
                                for (String str2 : hashSet8) {
                                    if (isPro(strMopub2, str2)) {
                                        hashSet9.add(str2);
                                    } else if (adcel(strMopub2, str2)) {
                                        hashSet9.add(strMopub2);
                                    }
                                }
                            }
                        }
                        this.admob = hashSet9;
                    }
                } else {
                    it = it3;
                    i = i5;
                    HashSet<String> hashSet10 = this.subs;
                    HashSet hashSet11 = new HashSet();
                    Iterator it8 = set.iterator();
                    while (it8.hasNext()) {
                        String strMopub3 = mopub(((C5722l) it8.next()).f12104l.f24470l);
                        if (hashSet10 == null) {
                            hashSet11.add(strMopub3);
                        } else {
                            for (String str3 : hashSet10) {
                                if (strMopub3.indexOf(64) != -1) {
                                    String strSubstring2 = strMopub3.substring(strMopub3.indexOf(64) + 1);
                                    if (str3.indexOf(64) == -1 ? !(!str3.startsWith(".") ? !strSubstring2.equalsIgnoreCase(str3) : !adcel(strSubstring2, str3)) : strMopub3.equalsIgnoreCase(str3)) {
                                        hashSet11.add(strMopub3);
                                    }
                                } else if (strMopub3.startsWith(".")) {
                                    if (str3.indexOf(64) != -1) {
                                        if (adcel(str3.substring(str3.indexOf(64) + 1), strMopub3)) {
                                            hashSet11.add(str3);
                                        }
                                    } else if (str3.startsWith(".")) {
                                        if (isPro(str3, strMopub3)) {
                                            hashSet11.add(strMopub3);
                                        } else if (adcel(str3, strMopub3)) {
                                            hashSet11.add(str3);
                                        }
                                    } else if (adcel(str3, strMopub3)) {
                                        hashSet11.add(str3);
                                    }
                                } else if (str3.indexOf(64) != -1) {
                                    if (str3.substring(str3.indexOf(64) + 1).equalsIgnoreCase(strMopub3)) {
                                        hashSet11.add(str3);
                                    }
                                } else if (str3.startsWith(".")) {
                                    if (adcel(strMopub3, str3)) {
                                        hashSet11.add(strMopub3);
                                    }
                                } else if (strMopub3.equalsIgnoreCase(str3)) {
                                    hashSet11.add(strMopub3);
                                }
                            }
                        }
                    }
                    this.subs = hashSet11;
                }
            } else {
                it = it3;
                i = i5;
                HashSet hashSet12 = this.smaato;
                HashSet hashSet13 = new HashSet();
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    C16437l c16437lVip = C16437l.vip(((C5722l) it9.next()).f12104l.f24470l);
                    if (c16437lVip != null) {
                        if (hashSet12 == null) {
                            hashSet13.add(c16437lVip);
                        } else {
                            Iterator it10 = hashSet12.iterator();
                            while (it10.hasNext()) {
                                if (c16437lVip.equals(C16437l.vip(it10.next()))) {
                                    hashSet13.add(c16437lVip);
                                }
                            }
                        }
                    }
                }
                this.smaato = hashSet13;
            }
            i5 = i;
            it3 = it;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("permitted:");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        if (this.mopub != null) {
            sb.append("DN:");
            sb.append(str);
            sb.append(this.mopub.toString());
            sb.append(str);
        }
        if (this.admob != null) {
            sb.append("DNS:");
            sb.append(str);
            sb.append(this.admob.toString());
            sb.append(str);
        }
        if (this.subs != null) {
            sb.append("Email:");
            sb.append(str);
            sb.append(this.subs.toString());
            sb.append(str);
        }
        if (this.isPro != null) {
            sb.append("URI:");
            sb.append(str);
            sb.append(this.isPro.toString());
            sb.append(str);
        }
        if (this.firebase != null) {
            sb.append("IP:");
            sb.append(str);
            sb.append(vip(this.firebase));
            sb.append(str);
        }
        if (this.smaato != null) {
            sb.append("OtherName:");
            sb.append(str);
            sb.append(metrica(this.smaato));
            sb.append(str);
        }
        sb.append("excluded:");
        sb.append(str);
        if (!this.yandex.isEmpty()) {
            sb.append("DN:");
            sb.append(str);
            sb.append(this.yandex.toString());
            sb.append(str);
        }
        if (!this.loadAd.isEmpty()) {
            sb.append("DNS:");
            sb.append(str);
            sb.append(this.loadAd.toString());
            sb.append(str);
        }
        if (!this.crashlytics.isEmpty()) {
            sb.append("Email:");
            sb.append(str);
            sb.append(this.crashlytics.toString());
            sb.append(str);
        }
        if (!this.amazon.isEmpty()) {
            sb.append("URI:");
            sb.append(str);
            sb.append(this.amazon.toString());
            sb.append(str);
        }
        if (!this.purchase.isEmpty()) {
            sb.append("IP:");
            sb.append(str);
            sb.append(vip(this.purchase));
            sb.append(str);
        }
        if (!this.billing.isEmpty()) {
            sb.append("OtherName:");
            sb.append(str);
            sb.append(metrica(this.billing));
            sb.append(str);
        }
        return sb.toString();
    }

    public final void yandex(C12378l c12378l) {
        applovin applovinVar = c12378l.f24470l;
        int i = c12378l.f24469l;
        if (i == 0) {
            HashSet hashSet = this.billing;
            C16437l c16437lVip = C16437l.vip(applovinVar);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (C16437l.vip(it.next()).equals(c16437lVip)) {
                    throw new C12391l("OtherName is from an excluded subtree.");
                }
            }
            return;
        }
        if (i == 1) {
            if (firebase(this.crashlytics, mopub(applovinVar))) {
                throw new C12391l("Email address is from an excluded subtree.");
            }
            return;
        }
        if (i == 2) {
            Set set = this.loadAd;
            String strMopub = mopub(applovinVar);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (isPro((String) it2.next(), strMopub)) {
                    throw new C12391l("DNS is from an excluded subtree.");
                }
            }
            return;
        }
        if (i != 4) {
            if (i == 6) {
                if (remoteconfig(this.amazon, mopub(applovinVar))) {
                    throw new C12391l("URI is from an excluded subtree.");
                }
                return;
            } else {
                if (i == 7 && smaato(this.purchase, Cthrow.premium(applovinVar).f36593l)) {
                    throw new C12391l("IP is from an excluded subtree.");
                }
                return;
            }
        }
        C10915l c10915lMetrica = C10915l.metrica(applovinVar);
        Set set2 = this.yandex;
        Cclass cclassInmobi = Cclass.inmobi(c10915lMetrica);
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            if (startapp(cclassInmobi, (Cclass) it3.next())) {
                throw new C12391l("Subject distinguished name is from an excluded subtree");
            }
        }
    }
}
