package defpackage;

import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.metrica;
import androidx.recyclerview.widget.subs;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13170l {
    public Object admob;
    public ArrayList amazon;
    public Object billing;
    public final ArrayList crashlytics;
    public int loadAd;
    public Serializable mopub;
    public Object purchase;
    public Object subs;
    public final /* synthetic */ int yandex;

    public C13170l(C2045l c2045l, C14706l c14706l) {
        char c = 0;
        this.yandex = 0;
        this.crashlytics = new ArrayList();
        this.mopub = new IdentityHashMap();
        this.amazon = new ArrayList();
        this.admob = new appmetrica(c, 5);
        this.purchase = c2045l;
        if (c14706l.f28767l) {
            C14785l c14785l = new C14785l(c, 26);
            c14785l.f28907l = new SparseArray();
            c14785l.f28908l = 0;
            this.billing = c14785l;
        } else {
            C18675l c18675l = new C18675l();
            c18675l.f36444l = new SparseArray();
            this.billing = c18675l;
        }
        this.loadAd = 1;
        this.subs = new C14965l(22);
    }

    public static ArrayList firebase(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM3321extends = AbstractC12024l.m3321extends(str, '&', i, 4);
            if (iM3321extends == -1) {
                iM3321extends = str.length();
            }
            int iM3321extends2 = AbstractC12024l.m3321extends(str, '=', i, 4);
            if (iM3321extends2 == -1 || iM3321extends2 > iM3321extends) {
                arrayList.add(str.substring(i, iM3321extends));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM3321extends2));
                arrayList.add(str.substring(iM3321extends2 + 1, iM3321extends));
            }
            i = iM3321extends + 1;
        }
        return arrayList;
    }

    public C16150l admob(metrica metricaVar) {
        C16150l c16150l = (C16150l) ((IdentityHashMap) this.mopub).get(metricaVar);
        if (c16150l != null) {
            return c16150l;
        }
        C18073l.metrica("Cannot find wrapper for ", metricaVar, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    public void amazon() {
        int i;
        Iterator it = this.amazon.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            C16150l c16150l = (C16150l) it.next();
            int i2 = c16150l.crashlytics.f463l;
            i = 3;
            if (i2 == 3 || (i2 == 2 && c16150l.purchase == 0)) {
                break;
            }
        }
        C2045l c2045l = (C2045l) this.purchase;
        if (i != c2045l.f463l) {
            c2045l.f463l = i;
            c2045l.f465l.mopub();
        }
    }

    public int billing() {
        int i = this.loadAd;
        if (i != -1) {
            return i;
        }
        String str = (String) this.purchase;
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public C6705l crashlytics() {
        ArrayList arrayList;
        String str = (String) this.purchase;
        if (str == null) {
            C8339l.smaato("scheme == null");
            return null;
        }
        String strPurchase = AbstractC1068l.purchase(0, 0, 7, (String) this.billing);
        String strPurchase2 = AbstractC1068l.purchase(0, 0, 7, (String) this.mopub);
        String str2 = (String) this.admob;
        if (str2 == null) {
            C8339l.smaato("host == null");
            return null;
        }
        int iBilling = billing();
        ArrayList arrayList2 = this.crashlytics;
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC1068l.purchase(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.amazon;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC14055l.billing(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? AbstractC1068l.purchase(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.subs;
        return new C6705l(str, strPurchase, strPurchase2, str2, iBilling, arrayList3, arrayList, str4 != null ? AbstractC1068l.purchase(0, 0, 7, str4) : null, toString());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0025  */
    public void isPro(C6705l c6705l, String str) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        int iCrashlytics;
        int i3;
        char cCharAt;
        String str2 = str;
        byte[] bArr = AbstractC7712l.yandex;
        int iAdmob = AbstractC7712l.admob(0, str2.length(), str2);
        int iSubs = AbstractC7712l.subs(iAdmob, str2.length(), str2);
        byte b = -1;
        if (iSubs - iAdmob >= 2) {
            char cCharAt2 = str2.charAt(iAdmob);
            if ((AbstractC8576l.subs(cCharAt2, 97) >= 0 && AbstractC8576l.subs(cCharAt2, 122) <= 0) || (AbstractC8576l.subs(cCharAt2, 65) >= 0 && AbstractC8576l.subs(cCharAt2, 90) <= 0)) {
                int i4 = iAdmob + 1;
                while (true) {
                    if (i4 < iSubs) {
                        char cCharAt3 = str2.charAt(i4);
                        if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i4++;
                        } else if (cCharAt3 == ':') {
                            i = i4;
                            break;
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i5 = 1;
        if (i != -1) {
            obj2 = "http";
            obj = "https";
            if (str2.regionMatches(true, iAdmob, "https:", 0, 6)) {
                this.purchase = obj;
                iAdmob += 6;
                str2 = str;
            } else {
                str2 = str;
                if (!str2.regionMatches(true, iAdmob, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, i) + '\'');
                }
                this.purchase = obj2;
                iAdmob += 5;
            }
        } else {
            obj = "https";
            obj2 = "http";
            if (c6705l == null) {
                C8339l.metrica("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2.length() > 6 ? AbstractC12024l.m3332l(6, str2).concat("...") : str2));
                return;
            }
            this.purchase = c6705l.yandex;
        }
        int i6 = iAdmob;
        int i7 = 0;
        while (true) {
            i2 = i5;
            if (i6 >= iSubs || !((cCharAt = str2.charAt(i6)) == '/' || cCharAt == '\\')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        ArrayList arrayList = this.crashlytics;
        byte b2 = 35;
        if (i7 >= 2 || c6705l == null || !AbstractC8576l.yandex(c6705l.yandex, (String) this.purchase)) {
            int i8 = iAdmob + i7;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iCrashlytics = AbstractC7712l.crashlytics(i8, iSubs, str2, "@/\\?#");
                byte bCharAt = iCrashlytics != iSubs ? str2.charAt(iCrashlytics) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i9 == 0) {
                        int iAmazon = AbstractC7712l.amazon(str2, ':', i8, iCrashlytics);
                        String strYandex = AbstractC1068l.yandex(i8, iAmazon, 112, str2, " \"':;<=>@[]^`{}|/\\?#");
                        if (i10 != 0) {
                            strYandex = AbstractC9361l.ad(new StringBuilder(), (String) this.billing, "%40", strYandex);
                        }
                        this.billing = strYandex;
                        if (iAmazon != iCrashlytics) {
                            this.mopub = AbstractC1068l.yandex(iAmazon + 1, iCrashlytics, 112, str2, " \"':;<=>@[]^`{}|/\\?#");
                            i9 = i2;
                        }
                        i10 = i2;
                    } else {
                        this.mopub = ((String) this.mopub) + "%40" + AbstractC1068l.yandex(i8, iCrashlytics, 112, str2, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i8 = iCrashlytics + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            int i11 = i8;
            while (true) {
                if (i11 < iCrashlytics) {
                    char cCharAt4 = str2.charAt(i11);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i11++;
                            if (i11 >= iCrashlytics) {
                                break;
                            }
                        } while (str2.charAt(i11) != ']');
                    }
                    i11++;
                } else {
                    i11 = iCrashlytics;
                    break;
                }
            }
            int i12 = i11 + 1;
            if (i12 < iCrashlytics) {
                this.admob = AbstractC3623l.loadAd(AbstractC1068l.purchase(i8, i11, 4, str2));
                try {
                    i3 = Integer.parseInt(AbstractC1068l.yandex(i12, iCrashlytics, 120, str2, ""));
                    if (i2 > i3 || i3 >= 65536) {
                        i3 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.loadAd = i3;
                if (i3 == -1) {
                    C11467l.isPro(34, str2.substring(i12, iCrashlytics), "Invalid URL port: \"");
                    return;
                }
            } else {
                int i13 = -1;
                this.admob = AbstractC3623l.loadAd(AbstractC1068l.purchase(i8, i11, 4, str2));
                String str3 = (String) this.purchase;
                if (str3.equals(obj2)) {
                    i13 = 80;
                } else if (str3.equals(obj)) {
                    i13 = 443;
                }
                this.loadAd = i13;
            }
            if (((String) this.admob) == null) {
                C11467l.isPro(34, str2.substring(i8, i11), "Invalid URL host: \"");
                return;
            }
            iAdmob = iCrashlytics;
        } else {
            this.billing = c6705l.purchase();
            this.mopub = c6705l.yandex();
            this.admob = c6705l.amazon;
            this.loadAd = c6705l.purchase;
            arrayList.clear();
            arrayList.addAll(c6705l.crashlytics());
            if (iAdmob == iSubs || str2.charAt(iAdmob) == '#') {
                String strAmazon = c6705l.amazon();
                this.amazon = strAmazon != null ? firebase(AbstractC1068l.yandex(0, 0, 83, strAmazon, " \"'<>#")) : null;
            }
        }
        int iCrashlytics2 = AbstractC7712l.crashlytics(iAdmob, iSubs, str2, "?#");
        if (iAdmob != iCrashlytics2) {
            char cCharAt5 = str2.charAt(iAdmob);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iAdmob++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iAdmob < iCrashlytics2) {
                int iCrashlytics3 = AbstractC7712l.crashlytics(iAdmob, iCrashlytics2, str2, "/\\");
                boolean z = iCrashlytics3 < iCrashlytics2;
                String strYandex2 = AbstractC1068l.yandex(iAdmob, iCrashlytics3, 112, str2, " \"<>^`{}|/\\?#");
                if (!strYandex2.equals(".") && !strYandex2.equalsIgnoreCase("%2e")) {
                    if (!strYandex2.equals("..") && !strYandex2.equalsIgnoreCase("%2e.") && !strYandex2.equalsIgnoreCase(".%2e") && !strYandex2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) AbstractC14814l.firebase(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strYandex2);
                        } else {
                            arrayList.add(strYandex2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iAdmob = z ? iCrashlytics3 + 1 : iCrashlytics3;
            }
        }
        if (iCrashlytics2 < iSubs && str2.charAt(iCrashlytics2) == '?') {
            int iAmazon2 = AbstractC7712l.amazon(str2, '#', iCrashlytics2, iSubs);
            this.amazon = firebase(AbstractC1068l.yandex(iCrashlytics2 + 1, iAmazon2, 80, str2, " \"'<>#"));
            iCrashlytics2 = iAmazon2;
        }
        if (iCrashlytics2 >= iSubs || str2.charAt(iCrashlytics2) != '#') {
            return;
        }
        this.subs = AbstractC1068l.yandex(iCrashlytics2 + 1, iSubs, 48, str2, "");
    }

    public void loadAd(String str, String str2) {
        if (this.amazon == null) {
            this.amazon = new ArrayList();
        }
        this.amazon.add(AbstractC1068l.yandex(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        this.amazon.add(str2 != null ? AbstractC1068l.yandex(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }

    public appmetrica mopub(int i) {
        appmetrica appmetricaVar = (appmetrica) this.admob;
        if (appmetricaVar.f490l) {
            appmetricaVar = new appmetrica((char) 0, 5);
        } else {
            appmetricaVar.f490l = true;
        }
        int i2 = i;
        for (C16150l c16150l : this.amazon) {
            int i3 = c16150l.purchase;
            if (i3 > i2) {
                appmetricaVar.f492l = c16150l;
                appmetricaVar.f489l = i2;
                break;
            }
            i2 -= i3;
        }
        if (((C16150l) appmetricaVar.f492l) != null) {
            return appmetricaVar;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Cannot find wrapper for "));
        return null;
    }

    public int purchase(C16150l c16150l) {
        C16150l c16150l2;
        Iterator it = this.amazon.iterator();
        int i = 0;
        while (it.hasNext() && (c16150l2 = (C16150l) it.next()) != c16150l) {
            i += c16150l2.purchase;
        }
        return i;
    }

    public int subs(subs subsVar) {
        ArrayList arrayList = this.amazon;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C16150l) arrayList.get(i)).crashlytics == subsVar) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.yandex) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.purchase;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.billing).length() > 0 || ((String) this.mopub).length() > 0) {
                    sb.append((String) this.billing);
                    if (((String) this.mopub).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.mopub);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.admob;
                if (str2 != null) {
                    if (AbstractC12024l.inmobi(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.admob);
                        sb.append(']');
                    } else {
                        sb.append((String) this.admob);
                    }
                }
                int i = -1;
                if (this.loadAd != -1 || ((String) this.purchase) != null) {
                    int iBilling = billing();
                    String str3 = (String) this.purchase;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iBilling);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = 443;
                        }
                        if (iBilling != i) {
                            sb.append(':');
                            sb.append(iBilling);
                        }
                    }
                }
                ArrayList arrayList = this.crashlytics;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (this.amazon != null) {
                    sb.append('?');
                    ArrayList arrayList2 = this.amazon;
                    C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, arrayList2.size()));
                    int i3 = c7488lStartapp.f15488l;
                    int i4 = c7488lStartapp.f15487l;
                    int i5 = c7488lStartapp.f15486l;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i3);
                            String str5 = (String) arrayList2.get(i3 + 1);
                            if (i3 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append('=');
                                sb.append(str5);
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.subs) != null) {
                    sb.append('#');
                    sb.append((String) this.subs);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean yandex(int i, subs subsVar) {
        ArrayList arrayList = this.amazon;
        if (i < 0 || i > arrayList.size()) {
            C11467l.startapp(arrayList.size(), i, ". Given:", "Index must be between 0 and ");
            return false;
        }
        if (this.loadAd != 1) {
            AbstractC5641l.loadAd(subsVar.f464l, "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (subsVar.f464l) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iSubs = subs(subsVar);
        if ((iSubs == -1 ? null : (C16150l) arrayList.get(iSubs)) != null) {
            return false;
        }
        C16150l c16150l = new C16150l(subsVar, this, (InterfaceC9432l) this.billing, (C6565l) ((C14965l) this.subs).f29441l);
        arrayList.add(i, c16150l);
        Iterator it = this.crashlytics.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                subsVar.startapp(recyclerView);
            }
        }
        if (c16150l.purchase > 0) {
            ((C2045l) this.purchase).remoteconfig(purchase(c16150l), c16150l.purchase);
        }
        amazon();
        return true;
    }

    public C13170l() {
        this.yandex = 1;
        this.billing = "";
        this.mopub = "";
        this.loadAd = -1;
        this.crashlytics = AbstractC14055l.metrica("");
    }
}
