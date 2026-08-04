package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: lؙؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12442l {
    public static final C15578l yandex = new C15578l(1492977131, false, new C7614l(23));
    public static final C15578l loadAd = new C15578l(862229331, false, new C10721l(25));

    public static C17076l Signature(long j, long j2, C6956l c6956l) {
        C17076l c17076l;
        long j3 = C9735l.firebase;
        C0764l c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
        C17076l c17076l2 = c0764l.f2318this;
        if (c17076l2 == null) {
            C17076l c17076l3 = new C17076l(AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 10), C9735l.loadAd(0.1f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)));
            c0764l.f2318this = c17076l3;
            c17076l = c17076l3;
        } else {
            c17076l = c17076l2;
        }
        return c17076l.yandex(j, j2, j3, j3);
    }

    public static C17076l ad(C0764l c0764l) {
        C17076l c17076l = c0764l.f2322try;
        if (c17076l != null) {
            return c17076l;
        }
        C17076l c17076l2 = new C17076l(AbstractC15038l.amazon(c0764l, 32), AbstractC15038l.amazon(c0764l, 15), C9735l.loadAd(0.1f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)));
        c0764l.f2322try = c17076l2;
        return c17076l2;
    }

    public static void adcel(int i, int i2, int i3) {
        String strCrashlytics;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strCrashlytics = crashlytics(i, i3, "start index");
            } else {
                strCrashlytics = (i2 < 0 || i2 > i3) ? crashlytics(i2, i3, "end index") : AbstractC11028l.smaato("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strCrashlytics);
        }
    }

    public static void admob(boolean z) {
        if (z) {
            return;
        }
        C11983l.crashlytics();
    }

    public static void ads(String str, boolean z) {
        if (z) {
            return;
        }
        C8339l.smaato(str);
    }

    public static int[] advert(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void amazon(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        C8339l.metrica(AbstractC11028l.smaato(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static Uri applovin(String str, String str2) {
        return Uri.parse(premium(str, str2));
    }

    public static C11607l appmetrica(C6956l c6956l) {
        C1919l c1919l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics;
        C11607l c11607l = c1919l.firebase;
        if (c11607l != null) {
            return c11607l;
        }
        C11607l c11607l2 = new C11607l(AbstractC2610l.yandex(c1919l, 7), AbstractC2610l.yandex(c1919l, 15));
        c1919l.firebase = c11607l2;
        return c11607l2;
    }

    public static void billing(long j, String str, boolean z) {
        if (z) {
            return;
        }
        C8339l.metrica(AbstractC11028l.smaato(str, Long.valueOf(j)));
    }

    public static String crashlytics(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC11028l.smaato("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC11028l.smaato("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
        return null;
    }

    public static void firebase(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        C8339l.metrica(AbstractC11028l.smaato(str, obj, comparable));
    }

    public static C12804l inmobi(C6956l c6956l) {
        C1919l c1919l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics;
        C12804l c12804l = c1919l.isPro;
        if (c12804l != null) {
            return c12804l;
        }
        C12804l c12804l2 = new C12804l(AbstractC2610l.yandex(c1919l, 7), AbstractC2610l.yandex(c1919l, 15), AbstractC2610l.yandex(c1919l, 13));
        c1919l.isPro = c12804l2;
        return c12804l2;
    }

    public static void isPro(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        C8339l.metrica(AbstractC11028l.smaato(str, obj));
    }

    public static C17076l isVip(long j, C6956l c6956l) {
        long j2 = C9735l.firebase;
        return tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex).yandex(j2, j, j2, C9735l.loadAd(0.38f, j));
    }

    public static C17076l license(C6956l c6956l) {
        return ad(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[LOOP:1: B:24:0x0086->B:26:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final C17032l loadAd(C7139l c7139l, AbstractC0283l abstractC0283l) {
        C4878l c4878l;
        C11644l c11644l;
        String str;
        C11644l c11644l2;
        C7139l c7139l2;
        C7434l c7434l;
        ArrayList arrayList;
        String str2;
        if (abstractC0283l instanceof C4878l) {
            c4878l = (C4878l) abstractC0283l;
            int i = c4878l.f9948l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4878l.f9948l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4878l = new C4878l(abstractC0283l);
            }
        } else {
            c4878l = new C4878l(abstractC0283l);
        }
        Object obj = c4878l.f9949l;
        int i2 = c4878l.f9948l;
        C11644l c11644l3 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            C3844l c3844l = (C3844l) obj;
            if (c3844l != null) {
                c7434l = new C7434l(c3844l);
                c7139l2 = null;
                c11644l2 = null;
                str = null;
            } else {
                c7139l = null;
                c11644l = null;
                c11644l2 = null;
                str = null;
            }
            c11644l3.m3145l(str, c7434l);
            C6952l c6952l = c7139l2.crashlytics;
            arrayList = new ArrayList(20);
            for (Map.Entry entry : c6952l.yandex.entrySet()) {
                str2 = (String) entry.getKey();
                for (String str3 : (List) entry.getValue()) {
                    AbstractC12081l.crashlytics(str2);
                    arrayList.add(str2);
                    arrayList.add(AbstractC12024l.m3330l(str3).toString());
                }
            }
            C8309l c8309l = new C8309l((String[]) arrayList.toArray(new String[0]));
            c11644l2.getClass();
            c11644l2.f23361l = c8309l.mopub();
            return new C17032l(c11644l2);
        }
        AbstractC2829l.crashlytics(obj);
        c11644l = new C11644l(28);
        c11644l.m3157l(c7139l.yandex);
        str = c7139l.loadAd;
        c11644l2 = c11644l;
        C11644l c11644l4 = c11644l;
        c7139l2 = c7139l;
        c7434l = null;
        c11644l3 = c11644l4;
        c11644l3.m3145l(str, c7434l);
        C6952l c6952l2 = c7139l2.crashlytics;
        arrayList = new ArrayList(20);
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            while (r1.hasNext()) {
                AbstractC12081l.crashlytics(str2);
                arrayList.add(str2);
                arrayList.add(AbstractC12024l.m3330l(str3).toString());
            }
        }
        C8309l c8309l2 = new C8309l((String[]) arrayList.toArray(new String[0]));
        c11644l2.getClass();
        c11644l2.f23361l = c8309l2.mopub();
        return new C17032l(c11644l2);
    }

    public static void metrica(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C6541l.subs(str);
    }

    public static void mopub(String str, boolean z, int i) {
        if (z) {
            return;
        }
        C8339l.metrica(AbstractC11028l.smaato(str, Integer.valueOf(i)));
    }

    public static String premium(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrAdvert = advert(str2);
        if (iArrAdvert[0] != -1) {
            sb.append(str2);
            signatures(iArrAdvert[1], iArrAdvert[2], sb);
            return sb.toString();
        }
        int[] iArrAdvert2 = advert(str);
        if (iArrAdvert[3] == 0) {
            sb.append((CharSequence) str, 0, iArrAdvert2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrAdvert[2] == 0) {
            sb.append((CharSequence) str, 0, iArrAdvert2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrAdvert[1];
        if (i != 0) {
            int i2 = iArrAdvert2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return signatures(iArrAdvert[1] + i2, i2 + iArrAdvert[2], sb);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrAdvert2[1]);
            sb.append(str2);
            int i3 = iArrAdvert2[1];
            return signatures(i3, iArrAdvert[2] + i3, sb);
        }
        int i4 = iArrAdvert2[0] + 2;
        int i5 = iArrAdvert2[1];
        if (i4 >= i5 || i5 != iArrAdvert2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrAdvert2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrAdvert2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return signatures(iArrAdvert2[1], i6 + iArrAdvert[2], sb);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrAdvert2[1];
        return signatures(i7, iArrAdvert[2] + i7 + 1, sb);
    }

    public static C7708l pro(long j, long j2, long j3, long j4, C6956l c6956l) {
        long j5 = C9735l.firebase;
        C0764l c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
        C7708l c7708l = c0764l.f2287break;
        if (c7708l == null) {
            C7708l c7708l2 = new C7708l(AbstractC15038l.amazon(c0764l, 32), AbstractC15038l.amazon(c0764l, 15), C9735l.loadAd(0.1f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 31), AbstractC15038l.amazon(c0764l, 14));
            c0764l.f2287break = c7708l2;
            c7708l = c7708l2;
        }
        long j6 = j != 16 ? j : c7708l.yandex;
        long j7 = j2 != 16 ? j2 : c7708l.loadAd;
        long j8 = j5 != 16 ? j5 : c7708l.crashlytics;
        if (j5 == 16) {
            j5 = c7708l.amazon;
        }
        return new C7708l(j6, j7, j8, j5, j3 != 16 ? j3 : c7708l.purchase, j4 != 16 ? j4 : c7708l.billing);
    }

    public static void purchase(long j, long j2, String str, boolean z) {
        if (z) {
            return;
        }
        C8339l.metrica(AbstractC11028l.smaato(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void remoteconfig(C12212l c12212l) {
        c12212l.getClass();
    }

    public static String signatures(int i, int i2, StringBuilder sb) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static void smaato(int i, int i2) {
        String strSmaato;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strSmaato = AbstractC11028l.smaato("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
                    return;
                }
                strSmaato = AbstractC11028l.smaato("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strSmaato);
        }
    }

    public static void startapp(int i, int i2) {
        if (i < 0 || i > i2) {
            C18262l.adcel(crashlytics(i, i2, "index"));
        }
    }

    public static void subs(boolean z, String str) {
        if (z) {
            return;
        }
        C8339l.metrica(str);
    }

    public static void subscription(boolean z) {
        if (z) {
            return;
        }
        C18073l.admob();
    }

    public static C17076l tapsense(C0764l c0764l, long j) {
        C17076l c17076l = c0764l.f2297finally;
        if (c17076l != null) {
            return c17076l;
        }
        long j2 = C9735l.isPro;
        C17076l c17076l2 = new C17076l(j2, j, j2, C9735l.loadAd(0.38f, j));
        c0764l.f2297finally = c17076l2;
        return c17076l2;
    }

    public static void vip(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        C6541l.subs(AbstractC11028l.smaato(str, obj));
    }

    public static final C5507l yandex(C18389l c18389l) {
        InterfaceC9473l interfaceC9473lMo1516l;
        int i = c18389l.f35915l;
        long j = c18389l.f35916l;
        long j2 = c18389l.f35905l;
        C8309l c8309l = c18389l.f35918l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c8309l.iterator();
        while (true) {
            C11521l c11521l = (C11521l) it;
            if (!c11521l.hasNext()) {
                break;
            }
            C8195l c8195l = (C8195l) c11521l.next();
            String str = (String) c8195l.f17098l;
            String str2 = (String) c8195l.f17097l;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        C6952l c6952l = new C6952l(AbstractC8676l.tapsense(linkedHashMap));
        AbstractC6897l abstractC6897l = c18389l.f35907l;
        return new C5507l(i, j, j2, c6952l, (abstractC6897l == null || (interfaceC9473lMo1516l = abstractC6897l.mo1516l()) == null) ? null : new C3640l(interfaceC9473lMo1516l), c18389l);
    }
}
