package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٖۢۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16717l {
    public static final AbstractC9743l firebase = new C11732l(new C2351l(7));
    public C3582l admob;
    public final Context amazon;
    public C9205l billing;
    public final Object crashlytics;
    public Boolean isPro;
    public C7713l loadAd;
    public Thread mopub;
    public final C8565l purchase;
    public C13736l subs;
    public C0477l yandex;

    public C16717l(Context context) {
        C8565l c8565l = new C8565l(23);
        C9205l c9205l = C9205l.f18932l;
        this.crashlytics = new Object();
        this.amazon = context.getApplicationContext();
        this.purchase = c8565l;
        if (c9205l != null) {
            this.billing = c9205l;
        } else {
            c9205l.getClass();
            C0725l c0725l = new C0725l(c9205l);
            c0725l.amazon(c9205l);
            this.billing = new C9205l(c0725l);
        }
        this.subs = C13736l.subs;
        boolean z = this.billing.f18941l;
    }

    public static void amazon(C10940l c10940l, C9205l c9205l, C17833l[] c17833lArr) {
        int i = c10940l.yandex;
        C8750l[] c8750lArr = c10940l.crashlytics;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            purchase(c8750lArr[i2], c9205l, map);
        }
        purchase(c10940l.billing, c9205l, map);
        for (int i3 = 0; i3 < i; i3++) {
            C0815l c0815l = (C0815l) map.get(Integer.valueOf(c10940l.loadAd[i3]));
            if (c0815l != null) {
                C11916l c11916l = c0815l.yandex;
                AbstractC1186l abstractC1186l = c0815l.loadAd;
                c17833lArr[i3] = (abstractC1186l.isEmpty() || c8750lArr[i3].loadAd(c11916l) == -1) ? null : new C17833l(c11916l, AbstractC9966l.subscription(abstractC1186l));
            }
        }
    }

    public static Pair billing(C17833l[] c17833lArr, int i) {
        for (int i2 = 0; i2 < c17833lArr.length; i2++) {
            C17833l c17833l = c17833lArr[i2];
            if (c17833l != null && c17833l.yandex.crashlytics == i) {
                return Pair.create(c17833l, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static void crashlytics(C10940l c10940l, C9205l c9205l, C17833l[] c17833lArr) {
        for (int i = 0; i < c10940l.yandex; i++) {
            int i2 = c10940l.loadAd[i];
            if (c9205l.f18942l.get(i) || c9205l.f10155strictfp.contains(Integer.valueOf(i2))) {
                c17833lArr[i] = null;
            }
        }
    }

    public static String isPro(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static void loadAd(C10940l c10940l, C9205l c9205l, C17833l[] c17833lArr) {
        int i = c10940l.yandex;
        for (int i2 = 0; i2 < i; i2++) {
            C8750l c8750l = c10940l.crashlytics[i2];
            Map map = (Map) c9205l.f18940l.get(i2);
            if (map != null && map.containsKey(c8750l)) {
                Map map2 = (Map) c9205l.f18940l.get(i2);
                if (map2 != null && map2.get(c8750l) != null) {
                    C18725l.loadAd();
                    return;
                }
                c17833lArr[i2] = null;
            }
        }
    }

    public static Pair metrica(int i, C10940l c10940l, int[][][] iArr, InterfaceC18044l interfaceC18044l, Comparator comparator) {
        int i2;
        RandomAccess randomAccessIsVip;
        C10940l c10940l2 = c10940l;
        ArrayList arrayList = new ArrayList();
        int i3 = c10940l2.yandex;
        int i4 = 0;
        while (i4 < i3) {
            if (i == c10940l2.loadAd[i4]) {
                C8750l c8750l = c10940l2.crashlytics[i4];
                for (int i5 = 0; i5 < c8750l.yandex; i5++) {
                    C11916l c11916lYandex = c8750l.yandex(i5);
                    C13708l c13708lSubs = interfaceC18044l.subs(i4, c11916lYandex, iArr[i4][i5]);
                    int i6 = c11916lYandex.yandex;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        AbstractC4634l abstractC4634l = (AbstractC4634l) c13708lSubs.get(i7);
                        int iYandex = abstractC4634l.yandex();
                        if (zArr[i7] || iYandex == 0) {
                            i2 = i3;
                        } else {
                            if (iYandex == 1) {
                                randomAccessIsVip = AbstractC1186l.isVip(abstractC4634l);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC4634l);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    AbstractC4634l abstractC4634l2 = (AbstractC4634l) c13708lSubs.get(i8);
                                    int i9 = i3;
                                    if (abstractC4634l2.yandex() == 2 && abstractC4634l.loadAd(abstractC4634l2)) {
                                        arrayList2.add(abstractC4634l2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessIsVip = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessIsVip);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            c10940l2 = c10940l;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((AbstractC4634l) list.get(i10)).f9429l;
        }
        AbstractC4634l abstractC4634l3 = (AbstractC4634l) list.get(0);
        return Pair.create(new C17833l(abstractC4634l3.f9430l, iArr2), Integer.valueOf(abstractC4634l3.f9431l));
    }

    public static int mopub(C5978l c5978l, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c5978l.amazon)) {
            return 4;
        }
        String strIsPro = isPro(str);
        String strIsPro2 = isPro(c5978l.amazon);
        if (strIsPro2 == null || strIsPro == null) {
            return (z && strIsPro2 == null) ? 1 : 0;
        }
        if (strIsPro2.startsWith(strIsPro) || strIsPro.startsWith(strIsPro2)) {
            return 3;
        }
        String str2 = AbstractC15323l.yandex;
        return strIsPro2.split("-", 2)[0].equals(strIsPro.split("-", 2)[0]) ? 2 : 0;
    }

    public static void purchase(C8750l c8750l, C4970l c4970l, HashMap map) {
        for (int i = 0; i < c8750l.yandex; i++) {
            C0815l c0815l = (C0815l) c4970l.f10156synchronized.get(c8750l.yandex(i));
            if (c0815l != null) {
                C11916l c11916l = c0815l.yandex;
                C0815l c0815l2 = (C0815l) map.get(Integer.valueOf(c11916l.crashlytics));
                if (c0815l2 == null || (c0815l2.loadAd.isEmpty() && !c0815l.loadAd.isEmpty())) {
                    map.put(Integer.valueOf(c11916l.crashlytics), c0815l);
                }
            }
        }
    }

    public static boolean remoteconfig(C9205l c9205l, int i, C5978l c5978l) {
        if ((i & 3584) == 0) {
            return false;
        }
        C2171l c2171l = c9205l.pro;
        if (c2171l.crashlytics && (i & 2048) == 0) {
            return false;
        }
        if (c2171l.loadAd) {
            boolean z = (c5978l.f12625volatile == 0 && c5978l.f12618native == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    public static C17833l vip(C8750l c8750l, int[][] iArr, C9205l c9205l) {
        if (c9205l.pro.yandex != 2) {
            int i = 0;
            C11916l c11916l = null;
            C15210l c15210l = null;
            for (int i2 = 0; i2 < c8750l.yandex; i2++) {
                C11916l c11916lYandex = c8750l.yandex(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < c11916lYandex.yandex; i3++) {
                    if (AbstractC4338l.tapsense(iArr2[i3], c9205l.f18945l)) {
                        C15210l c15210l2 = new C15210l(c11916lYandex.amazon[i3], iArr2[i3]);
                        if (c15210l != null) {
                            if (AbstractC12716l.yandex.crashlytics(c15210l2.f29807l, c15210l.f29807l).crashlytics(c15210l2.f29808l, c15210l.f29808l).purchase() > 0) {
                                c11916l = c11916lYandex;
                                i = i3;
                                c15210l = c15210l2;
                            }
                        } else {
                            c11916l = c11916lYandex;
                            i = i3;
                            c15210l = c15210l2;
                        }
                    }
                }
            }
            if (c11916l != null) {
                return new C17833l(c11916l, i);
            }
        }
        return null;
    }

    public static int yandex(C5978l c5978l, AbstractC1186l abstractC1186l) {
        for (int i = 0; i < abstractC1186l.size(); i++) {
            for (int i2 = 0; i2 < c5978l.crashlytics.size(); i2++) {
                if (((C3857l) c5978l.crashlytics.get(i2)).loadAd.equals(abstractC1186l.get(i))) {
                    return i;
                }
            }
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final C9205l admob() {
        C9205l c9205l;
        synchronized (this.crashlytics) {
            c9205l = this.billing;
        }
        return c9205l;
    }

    public final void firebase() {
        synchronized (this.crashlytics) {
            this.billing.getClass();
        }
    }

    public final void smaato() {
        C3582l c3582l;
        synchronized (this.crashlytics) {
            try {
                Thread thread = this.mopub;
                if (thread != null) {
                    AbstractC12442l.ads("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c3582l = this.admob) != null) {
            c3582l.purchase();
            this.admob = null;
        }
        this.yandex = null;
        this.loadAd = null;
    }

    public final void startapp(C9205l c9205l) {
        boolean zEquals;
        c9205l.getClass();
        synchronized (this.crashlytics) {
            zEquals = this.billing.equals(c9205l);
            this.billing = c9205l;
        }
        if (zEquals) {
            return;
        }
        if (c9205l.f18941l && this.amazon == null) {
            AbstractC6427l.vip("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C0477l c0477l = this.yandex;
        if (c0477l != null) {
            c0477l.f1746l.mopub(10);
        }
    }

    public final void subs() {
        boolean z;
        C0477l c0477l;
        C3582l c3582l;
        synchronized (this.crashlytics) {
            try {
                z = this.billing.f18941l && Build.VERSION.SDK_INT >= 32 && (c3582l = this.admob) != null && c3582l.loadAd;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (c0477l = this.yandex) == null) {
            return;
        }
        c0477l.f1746l.mopub(10);
    }
}
