package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؚٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13997l implements Iterable, InterfaceC2167l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f27303l;

    public C13997l(String str) {
        if (str != null) {
            this.f27303l = str;
        } else {
            C8339l.metrica("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return new C10145l(0, this);
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        return Boolean.valueOf(!this.f27303l.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13997l) {
            return this.f27303l.equals(((C13997l) obj).f27303l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27303l.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10145l(1, this);
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        return new C13997l(this.f27303l);
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        return this.f27303l;
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        String str = this.f27303l;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
  0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        C7502l c7502l2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                C8339l.metrica(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strMopub = "undefined";
        String str3 = this.f27303l;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    AbstractC13831l.purchase(1, "hasOwnProperty", arrayList);
                    InterfaceC2167l interfaceC2167lPurchase = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                    boolean zEquals = "length".equals(interfaceC2167lPurchase.mopub());
                    C18597l c18597l = InterfaceC2167l.f4807l;
                    if (zEquals) {
                        return c18597l;
                    }
                    double dDoubleValue = interfaceC2167lPurchase.remoteconfig().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? InterfaceC2167l.f4804l : c18597l;
                }
                C8339l.metrica("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    AbstractC13831l.purchase(0, "toString", arrayList);
                    return this;
                }
                C8339l.metrica("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    AbstractC13831l.purchase(0, "toLocaleLowerCase", arrayList);
                    return new C13997l(str3.toLowerCase());
                }
                C8339l.metrica("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    AbstractC13831l.mopub(1, "charAt", arrayList);
                    int iSmaato = arrayList.isEmpty() ? 0 : (int) AbstractC13831l.smaato(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue());
                    return (iSmaato < 0 || iSmaato >= str3.length()) ? InterfaceC2167l.f4806l : new C13997l(String.valueOf(str3.charAt(iSmaato)));
                }
                C8339l.metrica("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(i4)).mopub());
                        }
                        return new C13997l(sb.toString());
                    }
                    return this;
                }
                C8339l.metrica("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    AbstractC13831l.purchase(0, "toLowerCase", arrayList);
                    return new C13997l(str3.toLowerCase(Locale.ENGLISH));
                }
                C8339l.metrica("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    AbstractC13831l.mopub(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub()).matcher(str3);
                    return matcher.find() ? new C14259l(Double.valueOf(matcher.start())) : new C14259l(Double.valueOf(-1.0d));
                }
                C8339l.metrica("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    AbstractC13831l.purchase(0, "toLocaleUpperCase", arrayList);
                    return new C13997l(str3.toUpperCase());
                }
                C8339l.metrica("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    AbstractC13831l.mopub(2, "lastIndexOf", arrayList);
                    String strMopub2 = arrayList.size() > 0 ? ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue();
                    return new C14259l(Double.valueOf(str3.lastIndexOf(strMopub2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : AbstractC13831l.smaato(dDoubleValue2)))));
                }
                C8339l.metrica("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    AbstractC13831l.purchase(0, "toUpperCase", arrayList);
                    return new C13997l(str3.toUpperCase(Locale.ENGLISH));
                }
                C8339l.metrica("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    AbstractC13831l.purchase(0, "toUpperCase", arrayList);
                    return new C13997l(str3.trim());
                }
                C8339l.metrica("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    AbstractC13831l.mopub(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub()).matcher(str3);
                    return matcher2.find() ? new C5181l(Arrays.asList(new C13997l(matcher2.group()))) : InterfaceC2167l.f4800l;
                }
                C8339l.metrica("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    AbstractC13831l.mopub(2, "slice", arrayList);
                    double dSmaato = AbstractC13831l.smaato(!arrayList.isEmpty() ? ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue() : 0.0d);
                    double dMax = dSmaato < 0.0d ? Math.max(((double) str3.length()) + dSmaato, 0.0d) : Math.min(dSmaato, str3.length());
                    double dSmaato2 = AbstractC13831l.smaato(arrayList.size() > 1 ? ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new C13997l(str3.substring(i5, Math.max(0, ((int) (dSmaato2 < 0.0d ? Math.max(((double) str3.length()) + dSmaato2, 0.0d) : Math.min(dSmaato2, str3.length()))) - i5) + i5));
                }
                C8339l.metrica("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    AbstractC13831l.mopub(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new C5181l(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strMopub3 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub();
                        long jFirebase = arrayList.size() > 1 ? ((long) AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())) & 4294967295L : 2147483647L;
                        if (jFirebase == 0) {
                            return new C5181l();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strMopub3), ((int) jFirebase) + 1);
                        int length = strArrSplit.length;
                        if (!strMopub3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jFirebase) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new C13997l(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new C5181l(arrayList2);
                }
                C8339l.metrica("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    AbstractC13831l.mopub(2, "substring", arrayList);
                    int iSmaato2 = !arrayList.isEmpty() ? (int) AbstractC13831l.smaato(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()) : 0;
                    int iSmaato3 = arrayList.size() > 1 ? (int) AbstractC13831l.smaato(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iSmaato2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iSmaato3, 0), str3.length());
                    return new C13997l(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                C8339l.metrica("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    AbstractC13831l.mopub(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    InterfaceC2167l interfaceC2167lYandex = InterfaceC2167l.f4805l;
                    if (!zIsEmpty2) {
                        strMopub = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub();
                        if (arrayList.size() > 1) {
                            interfaceC2167lYandex = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                        }
                    }
                    String str4 = strMopub;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (interfaceC2167lYandex instanceof AbstractC10453l) {
                            interfaceC2167lYandex = ((AbstractC10453l) interfaceC2167lYandex).yandex(c7502l, Arrays.asList(new C13997l(str4), new C14259l(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strMopub4 = interfaceC2167lYandex.mopub();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new C13997l(AbstractC9361l.ad(new StringBuilder(strSubstring.length() + String.valueOf(strMopub4).length() + strSubstring2.length()), strSubstring, strMopub4, strSubstring2));
                    }
                    return this;
                }
                C8339l.metrica("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    AbstractC13831l.mopub(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        c7502l2 = c7502l;
                    } else {
                        c7502l2 = c7502l;
                        strMopub = ((C17516l) c7502l2.f15510l).purchase(c7502l2, (InterfaceC2167l) arrayList.get(0)).mopub();
                    }
                    return new C14259l(Double.valueOf(str3.indexOf(strMopub, (int) AbstractC13831l.smaato(arrayList.size() < 2 ? 0.0d : ((C17516l) c7502l2.f15510l).purchase(c7502l2, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue()))));
                }
                C8339l.metrica("Command not supported");
                return null;
            default:
                C8339l.metrica("Command not supported");
                return null;
        }
    }

    public final String toString() {
        String str = this.f27303l;
        return AbstractC9361l.ad(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
