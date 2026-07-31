package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: renamed from: lٌِۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9130l extends Cnative {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Hashtable f18767l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Boolean f18768l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Boolean f18769l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f18773l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cclass f18774l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18775l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Vector f18772l = new Vector();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Vector f18771l = new Vector();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Vector f18770l = new Vector();

    static {
        Cfor cfor = new Cfor("2.5.4.6");
        Cfor cfor2 = new Cfor("2.5.4.10");
        Cfor cfor3 = new Cfor("2.5.4.11");
        Cfor cfor4 = new Cfor("2.5.4.12");
        Cfor cfor5 = new Cfor("2.5.4.3");
        Cfor cfor6 = new Cfor("2.5.4.5");
        Cfor cfor7 = new Cfor("2.5.4.9");
        Cfor cfor8 = new Cfor("2.5.4.7");
        Cfor cfor9 = new Cfor("2.5.4.8");
        Cfor cfor10 = new Cfor("2.5.4.4");
        Cfor cfor11 = new Cfor("2.5.4.42");
        Cfor cfor12 = new Cfor("2.5.4.43");
        Cfor cfor13 = new Cfor("2.5.4.44");
        Cfor cfor14 = new Cfor("2.5.4.45");
        Cfor cfor15 = new Cfor("2.5.4.15");
        Cfor cfor16 = new Cfor("2.5.4.17");
        Cfor cfor17 = new Cfor("2.5.4.46");
        Cfor cfor18 = new Cfor("2.5.4.65");
        Cfor cfor19 = new Cfor("1.3.6.1.5.5.7.9.1");
        Cfor cfor20 = new Cfor("1.3.6.1.5.5.7.9.2");
        Cfor cfor21 = new Cfor("1.3.6.1.5.5.7.9.3");
        Cfor cfor22 = new Cfor("1.3.6.1.5.5.7.9.4");
        Cfor cfor23 = new Cfor("1.3.6.1.5.5.7.9.5");
        Cfor cfor24 = new Cfor("1.3.36.8.3.14");
        Cfor cfor25 = new Cfor("2.5.4.16");
        new Cfor("2.5.4.54");
        Cfor cfor26 = InterfaceC18049l.f35340l;
        Cfor cfor27 = InterfaceC18049l.f35342l;
        Cfor cfor28 = InterfaceC0543l.f1878l;
        Cfor cfor29 = InterfaceC0543l.f1897l;
        Cfor cfor30 = InterfaceC0543l.f1896l;
        Cfor cfor31 = new Cfor("0.9.2342.19200300.100.1.25");
        Cfor cfor32 = new Cfor("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        f18767l = hashtable;
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = new Hashtable();
        f18768l = new Boolean(true);
        f18769l = new Boolean(false);
        hashtable.put(cfor, "C");
        hashtable.put(cfor2, "O");
        hashtable.put(cfor4, "T");
        hashtable.put(cfor3, "OU");
        hashtable.put(cfor5, "CN");
        hashtable.put(cfor8, "L");
        hashtable.put(cfor9, "ST");
        hashtable.put(cfor6, "SERIALNUMBER");
        hashtable.put(cfor28, "E");
        hashtable.put(cfor31, "DC");
        hashtable.put(cfor32, "UID");
        hashtable.put(cfor7, "STREET");
        hashtable.put(cfor10, "SURNAME");
        hashtable.put(cfor11, "GIVENNAME");
        hashtable.put(cfor12, "INITIALS");
        hashtable.put(cfor13, "GENERATION");
        hashtable.put(cfor30, "unstructuredAddress");
        hashtable.put(cfor29, "unstructuredName");
        hashtable.put(cfor14, "UniqueIdentifier");
        hashtable.put(cfor17, "DN");
        hashtable.put(cfor18, "Pseudonym");
        hashtable.put(cfor25, "PostalAddress");
        hashtable.put(cfor24, "NameAtBirth");
        hashtable.put(cfor22, "CountryOfCitizenship");
        hashtable.put(cfor23, "CountryOfResidence");
        hashtable.put(cfor21, "Gender");
        hashtable.put(cfor20, "PlaceOfBirth");
        hashtable.put(cfor19, "DateOfBirth");
        hashtable.put(cfor16, "PostalCode");
        hashtable.put(cfor15, "BusinessCategory");
        hashtable.put(cfor26, "TelephoneNumber");
        hashtable.put(cfor27, "Name");
        hashtable2.put(cfor, "C");
        hashtable2.put(cfor2, "O");
        hashtable2.put(cfor3, "OU");
        hashtable2.put(cfor5, "CN");
        hashtable2.put(cfor8, "L");
        hashtable2.put(cfor9, "ST");
        hashtable2.put(cfor7, "STREET");
        hashtable2.put(cfor31, "DC");
        hashtable2.put(cfor32, "UID");
        hashtable3.put(cfor, "C");
        hashtable3.put(cfor2, "O");
        hashtable3.put(cfor3, "OU");
        hashtable3.put(cfor5, "CN");
        hashtable3.put(cfor8, "L");
        hashtable3.put(cfor9, "ST");
        hashtable3.put(cfor7, "STREET");
        hashtable4.put("c", cfor);
        hashtable4.put("o", cfor2);
        hashtable4.put("t", cfor4);
        hashtable4.put("ou", cfor3);
        hashtable4.put("cn", cfor5);
        hashtable4.put("l", cfor8);
        hashtable4.put("st", cfor9);
        hashtable4.put("sn", cfor6);
        hashtable4.put("serialnumber", cfor6);
        hashtable4.put("street", cfor7);
        hashtable4.put("emailaddress", cfor28);
        hashtable4.put("dc", cfor31);
        hashtable4.put("e", cfor28);
        hashtable4.put("uid", cfor32);
        hashtable4.put("surname", cfor10);
        hashtable4.put("givenname", cfor11);
        hashtable4.put("initials", cfor12);
        hashtable4.put("generation", cfor13);
        hashtable4.put("unstructuredaddress", cfor30);
        hashtable4.put("unstructuredname", cfor29);
        hashtable4.put("uniqueidentifier", cfor14);
        hashtable4.put("dn", cfor17);
        hashtable4.put("pseudonym", cfor18);
        hashtable4.put("postaladdress", cfor25);
        hashtable4.put("nameofbirth", cfor24);
        hashtable4.put("countryofcitizenship", cfor22);
        hashtable4.put("countryofresidence", cfor23);
        hashtable4.put("gender", cfor21);
        hashtable4.put("placeofbirth", cfor20);
        hashtable4.put("dateofbirth", cfor19);
        hashtable4.put("postalcode", cfor16);
        hashtable4.put("businesscategory", cfor15);
        hashtable4.put("telephonenumber", cfor26);
        hashtable4.put("name", cfor27);
    }

    public C9130l(Cclass cclass) {
        Vector vector;
        this.f18774l = cclass;
        Enumeration enumerationMo170package = cclass.mo170package();
        while (enumerationMo170package.hasMoreElements()) {
            Cinterface cinterfaceApplovin = Cinterface.applovin(((applovin) enumerationMo170package.nextElement()).billing());
            int i = 0;
            while (true) {
                applovin[] applovinVarArr = cinterfaceApplovin.f842l;
                if (i < applovinVarArr.length) {
                    Cclass cclassInmobi = Cclass.inmobi(applovinVarArr[i].billing());
                    if (cclassInmobi.size() != 2) {
                        C8339l.metrica("badly sized pair");
                        throw null;
                    }
                    this.f18772l.addElement(Cfor.m192throws(cclassInmobi.mo173throws(0)));
                    applovin applovinVarMo173throws = cclassInmobi.mo173throws(1);
                    if (!(applovinVarMo173throws instanceof Cdefault) || (applovinVarMo173throws instanceof C2761l)) {
                        try {
                            Vector vector2 = this.f18771l;
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            byte[] bArrRemoteconfig = applovinVarMo173throws.billing().remoteconfig("DER");
                            C1561l c1561l = AbstractC8535l.yandex;
                            byte[] bArrAmazon = AbstractC8535l.amazon(0, bArrRemoteconfig.length, bArrRemoteconfig);
                            int length = bArrAmazon.length;
                            char[] cArr = new char[length];
                            for (int i2 = 0; i2 != length; i2++) {
                                cArr[i2] = (char) (bArrAmazon[i2] & 255);
                            }
                            sb.append(new String(cArr));
                            vector2.addElement(sb.toString());
                        } catch (IOException unused) {
                            C8339l.metrica("cannot encode value");
                            throw null;
                        }
                    } else {
                        String strMopub = ((Cdefault) applovinVarMo173throws).mopub();
                        if (strMopub.length() <= 0 || strMopub.charAt(0) != '#') {
                            vector = this.f18771l;
                        } else {
                            vector = this.f18771l;
                            strMopub = "\\".concat(strMopub);
                        }
                        vector.addElement(strMopub);
                    }
                    this.f18770l.addElement(i != 0 ? f18768l : f18769l);
                    i++;
                }
            }
        }
    }

    public static C9130l ads(Object obj) {
        if (obj instanceof C9130l) {
            return (C9130l) obj;
        }
        if (obj instanceof C10915l) {
            return new C9130l(Cclass.inmobi(((C10915l) obj).f22038l));
        }
        if (obj != null) {
            return new C9130l(Cclass.inmobi(obj));
        }
        return null;
    }

    public static String metrica(String str) {
        String strAmazon = AbstractC9008l.amazon(str.trim());
        if (strAmazon.length() <= 0 || strAmazon.charAt(0) != '#') {
            return strAmazon;
        }
        try {
            applovin applovinVarAdvert = Ccase.advert(AbstractC8535l.loadAd(strAmazon.length() - 1, strAmazon));
            return applovinVarAdvert instanceof Cdefault ? AbstractC9008l.amazon(((Cdefault) applovinVarAdvert).mopub().trim()) : strAmazon;
        } catch (IOException e) {
            C11983l.ad(e, "unknown encoding in name: ");
            return null;
        }
    }

    public static String tapsense(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static void vip(StringBuffer stringBuffer, Hashtable hashtable, Cfor cfor, String str) {
        String strInmobi = (String) hashtable.get(cfor);
        if (strInmobi == null) {
            strInmobi = cfor.inmobi();
        }
        stringBuffer.append(strInmobi);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            char cCharAt = stringBuffer.charAt(length);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        break;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        if (this.f18774l == null) {
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
            Vector vector = this.f18772l;
            if (vector.size() != 0) {
                throw null;
            }
            C2930l c2930l = new C2930l(appmetricaVar2, true);
            c2930l.f6383l = -1;
            appmetricaVar.purchase(c2930l);
            C11138l c11138l = new C11138l(appmetricaVar);
            c11138l.f22357l = -1;
            this.f18774l = c11138l;
        }
        return this.f18774l;
    }

    @Override // defpackage.Cnative
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        if (obj != this) {
            if ((obj instanceof C9130l) || (obj instanceof Cclass)) {
                if (!billing().ad(((applovin) obj).billing())) {
                    try {
                        C9130l c9130lAds = ads(obj);
                        Vector vector = this.f18772l;
                        int size = vector.size();
                        Vector vector2 = c9130lAds.f18772l;
                        if (size == vector2.size()) {
                            if (size != 0) {
                                boolean[] zArr = new boolean[size];
                                if (vector.elementAt(0).equals(vector2.elementAt(0))) {
                                    i3 = 1;
                                    i = 0;
                                    i2 = size;
                                } else {
                                    i = size - 1;
                                    i2 = -1;
                                    i3 = -1;
                                }
                                while (i != i2) {
                                    Cfor cfor = (Cfor) vector.elementAt(i);
                                    String str = (String) this.f18771l.elementAt(i);
                                    for (int i4 = 0; i4 < size; i4++) {
                                        if (!zArr[i4] && cfor.ad((Cfor) vector2.elementAt(i4))) {
                                            String str2 = (String) c9130lAds.f18771l.elementAt(i4);
                                            String strMetrica = metrica(str);
                                            String strMetrica2 = metrica(str2);
                                            if (strMetrica.equals(strMetrica2) || tapsense(strMetrica).equals(tapsense(strMetrica2))) {
                                                zArr[i4] = true;
                                                i += i3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.Cnative
    public final int hashCode() {
        if (this.f18773l) {
            return this.f18775l;
        }
        this.f18773l = true;
        int i = 0;
        while (true) {
            Vector vector = this.f18772l;
            if (i == vector.size()) {
                return this.f18775l;
            }
            String strTapsense = tapsense(metrica((String) this.f18771l.elementAt(i)));
            int iHashCode = vector.elementAt(i).hashCode() ^ this.f18775l;
            this.f18775l = iHashCode;
            this.f18775l = iHashCode ^ strTapsense.hashCode();
            i++;
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        int i = 0;
        while (true) {
            Vector vector2 = this.f18772l;
            if (i >= vector2.size()) {
                break;
            }
            boolean zBooleanValue = ((Boolean) this.f18770l.elementAt(i)).booleanValue();
            Hashtable hashtable = f18767l;
            Vector vector3 = this.f18771l;
            if (zBooleanValue) {
                stringBuffer2.append('+');
                vip(stringBuffer2, hashtable, (Cfor) vector2.elementAt(i), (String) vector3.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                vip(stringBuffer2, hashtable, (Cfor) vector2.elementAt(i), (String) vector3.elementAt(i));
                vector.addElement(stringBuffer2);
            }
            i++;
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            stringBuffer.append(vector.elementAt(i2).toString());
        }
        return stringBuffer.toString();
    }
}
