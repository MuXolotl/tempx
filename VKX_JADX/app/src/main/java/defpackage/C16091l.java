package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lٕۣۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16091l {
    public String amazon;
    public final ArrayList crashlytics;
    public final HashMap loadAd;
    public final C0493l yandex;

    public C16091l(C0493l c0493l, String str, Uri uri, int i) {
        this.yandex = c0493l;
        HashMap map = new HashMap();
        this.loadAd = map;
        map.put(str, uri);
        this.amazon = str;
        ArrayList arrayList = new ArrayList();
        this.crashlytics = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static void amazon(Uri uri, String str, int i, ArrayList arrayList, C0493l c0493l, HashMap map, HashMap map2) throws C17655l {
        int i2;
        String str2;
        Integer num = (Integer) map.get(c0493l);
        int i3 = 1;
        if (num == null) {
            map2.put(c0493l, 0);
            if (str == null) {
                map2.put(c0493l, 1);
                str = ".";
            }
            C16091l c16091l = new C16091l(c0493l, str, uri, i);
            map.put(c0493l, Integer.valueOf(arrayList.size()));
            arrayList.add(c16091l);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) map2.get(c0493l);
            num2.getClass();
            int iIntValue = num2.intValue() + 1;
            if (iIntValue <= 1) {
                AbstractC12442l.mopub("invalid count: %s", iIntValue >= 0, iIntValue);
                str2 = iIntValue == 0 ? "" : ".";
            } else {
                long j = iIntValue;
                int i4 = (int) j;
                if (i4 != j) {
                    throw new ArrayIndexOutOfBoundsException(AbstractC2812l.ads(j, "Required array size too large: "));
                }
                char[] cArr = new char[i4];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i2 = i4 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i3, i2);
                str2 = new String(cArr);
            }
            map2.put(c0493l, Integer.valueOf(iIntValue));
            str = str2;
        }
        C16091l c16091l2 = (C16091l) arrayList.get(num.intValue());
        Uri uri2 = (Uri) c16091l2.loadAd.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw C17655l.loadAd("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup");
        }
        c16091l2.loadAd.put(str, uri);
        if (i != -1) {
            c16091l2.crashlytics.add(Integer.valueOf(i));
        }
    }

    public static AbstractC1186l loadAd(List list) throws C17655l {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C15979l c15979l = (C15979l) list.get(i);
            amazon(c15979l.yandex, c15979l.mopub, i, arrayList, new C0493l(c15979l.loadAd, c15979l.admob, null), map, map2);
        }
        return AbstractC1186l.Signature(arrayList);
    }

    public static AbstractC1186l yandex(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C4389l c4389l = (C4389l) list.get(i);
            Uri uri = c4389l.yandex;
            try {
                amazon(c4389l.yandex, null, i, arrayList, new C0493l(c4389l.loadAd, c4389l.amazon, c4389l.crashlytics), map, map2);
            } catch (C17655l unused) {
            }
        }
        return AbstractC1186l.Signature(arrayList);
    }

    public final Uri crashlytics() {
        Uri uri = (Uri) this.loadAd.get(this.amazon);
        uri.getClass();
        return uri;
    }
}
