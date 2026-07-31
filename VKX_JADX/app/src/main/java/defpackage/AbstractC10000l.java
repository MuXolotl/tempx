package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؐۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10000l {
    public static final C15578l yandex = new C15578l(-1249084711, false, new C14678l(5));
    public static final C15578l loadAd = new C15578l(1400716153, false, new C14678l(7));
    public static final C15578l crashlytics = new C15578l(-814973276, false, new C14678l(11));
    public static final C15578l amazon = new C15578l(737521832, false, new C14678l(12));
    public static final C15578l purchase = new C15578l(-1021838039, false, new C14678l(13));
    public static final C15578l billing = new C15578l(-116117818, false, new C5407l(8));
    public static final C15578l mopub = new C15578l(-1497159233, false, new C14678l(15));
    public static final C15578l admob = new C15578l(-919008061, false, new C14678l(16));
    public static final C15578l subs = new C15578l(-91298083, false, new C11891l(5));
    public static final C15578l isPro = new C15578l(474987611, false, new C14678l(17));
    public static final C15578l firebase = new C15578l(-7170286, false, new C14678l(14));
    public static final C15578l smaato = new C15578l(2131855876, false, new C14678l(18));
    public static final C15578l remoteconfig = new C15578l(-1031478652, false, new C14678l(19));
    public static final C15578l vip = new C15578l(62922019, false, new C14678l(20));
    public static final C15578l metrica = new C15578l(1657069095, false, new C14678l(21));
    public static final C15578l startapp = new C15578l(1554708011, false, new C14678l(22));
    public static final C15578l adcel = new C15578l(864012455, false, new C14678l(23));
    public static final C15578l ads = new C15578l(1164807125, false, new C5407l(9));
    public static final C15578l subscription = new C15578l(1765080390, false, new C14678l(24));
    public static final C15578l tapsense = new C15578l(627415676, false, new C14678l(6));
    public static final C15578l Signature = new C15578l(1205566848, false, new C14678l(8));
    public static final C15578l license = new C15578l(-1851117771, false, new C14678l(9));
    public static final C15578l pro = new C15578l(1819839750, false, new C5407l(7));
    public static final C15578l ad = new C15578l(-1378317716, false, new C14678l(10));

    public static void Signature(long j, byte[] bArr, int i) {
        isPro((int) (j >>> 32), i, bArr);
        isPro((int) (j & 4294967295L), i + 4, bArr);
    }

    public static final List ad(C14965l c14965l, C0554l c0554l) throws IOException {
        AbstractC3031l abstractC3031l = (AbstractC3031l) c0554l.f1958l;
        if (AbstractC8576l.yandex(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC2991l.billing(AbstractC17265l.yandex(c14965l), 5, "[MediaStoreController] Running MediaStore queries on main thread is not recommended!", null);
        }
        AbstractC1401l[] abstractC1401lArr = (AbstractC1401l[]) c0554l.f1956l;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1401l abstractC1401l : abstractC1401lArr) {
            if (!(abstractC1401l instanceof C2616l)) {
                arrayList.add(abstractC1401l);
            }
        }
        String strM4210case = AbstractC16901l.m4210case(arrayList, " AND ", null, null, new C1306l(28), 30);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1401l) it.next()).getClass();
        }
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((AbstractC1401l) it2.next()).getClass();
            arrayList3.add(null);
        }
        Cursor cursorQuery = ((ContentResolver) c14965l.f29441l).query((Uri) abstractC3031l.f6545l, (String[]) abstractC3031l.f6544l, strM4210case, (String[]) arrayList3.toArray(new String[0]), ((AbstractC12990l) c0554l.f1957l).yandex);
        if (cursorQuery == null) {
            return C2580l.f5619l;
        }
        try {
            ArrayList arrayList4 = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList4.add(((Function1) abstractC3031l.f6547l).invoke(cursorQuery));
            }
            cursorQuery.close();
            return arrayList4;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static void adcel(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = metrica(i, bArr);
            i += 4;
        }
    }

    public static final AbstractC18041l admob(AbstractC18041l abstractC18041l) {
        vip(abstractC18041l);
        if (abstractC18041l.getAnnotations().loadAd(AbstractC3333l.startapp) == null) {
            return null;
        }
        return ((AbstractC4946l) abstractC18041l.inmobi().get(crashlytics(abstractC18041l))).loadAd();
    }

    public static int ads(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static void advert(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2746l.yandex(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l = ViewOnLongClickListenerC13474l.f26451l;
        if (viewOnLongClickListenerC13474l != null && viewOnLongClickListenerC13474l.f26456l == view) {
            ViewOnLongClickListenerC13474l.loadAd(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC13474l(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l2 = ViewOnLongClickListenerC13474l.f26450l;
        if (viewOnLongClickListenerC13474l2 != null && viewOnLongClickListenerC13474l2.f26456l == view) {
            viewOnLongClickListenerC13474l2.yandex();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final AbstractC15211l amazon(AbstractC16860l abstractC16860l, InterfaceC3841l interfaceC3841l, AbstractC18041l abstractC18041l, List list, ArrayList arrayList, AbstractC18041l abstractC18041l2, boolean z) {
        InterfaceC17477l interfaceC17477lFirebase;
        InterfaceC3841l c2172l = C2782l.f6058l;
        int i = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC18041l != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(new C10636l(1, (AbstractC18041l) it.next()));
        }
        arrayList2.addAll(arrayList3);
        AbstractC3324l.crashlytics(arrayList2, abstractC18041l != null ? new C10636l(1, abstractC18041l) : null);
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            arrayList2.add(new C10636l(1, (AbstractC18041l) obj));
            i2 = i3;
        }
        arrayList2.add(new C10636l(1, abstractC18041l2));
        int size = list.size() + arrayList.size() + (abstractC18041l == null ? 0 : 1);
        if (z) {
            interfaceC17477lFirebase = abstractC16860l.license(size);
        } else {
            C3498l c3498l = AbstractC3974l.yandex;
            interfaceC17477lFirebase = abstractC16860l.firebase("Function" + size);
        }
        if (abstractC18041l != null) {
            C2312l c2312l = AbstractC3333l.startapp;
            if (!interfaceC3841l.isPro(c2312l)) {
                ArrayList arrayListM4215default = AbstractC16901l.m4215default(interfaceC3841l, new C16752l(abstractC16860l, c2312l, C14054l.f27396l));
                interfaceC3841l = arrayListM4215default.isEmpty() ? c2172l : new C2172l(i, arrayListM4215default);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            C2312l c2312l2 = AbstractC3333l.adcel;
            if (!interfaceC3841l.isPro(c2312l2)) {
                ArrayList arrayListM4215default2 = AbstractC16901l.m4215default(interfaceC3841l, new C16752l(abstractC16860l, c2312l2, Collections.singletonMap(AbstractC3974l.purchase, new C18009l(size2))));
                if (!arrayListM4215default2.isEmpty()) {
                    c2172l = new C2172l(i, arrayListM4215default2);
                }
                interfaceC3841l = c2172l;
            }
        }
        return AbstractC3605l.adcel(AbstractC3058l.tapsense(interfaceC3841l), interfaceC17477lFirebase, arrayList2);
    }

    public static final List billing(AbstractC18041l abstractC18041l) {
        vip(abstractC18041l);
        int iCrashlytics = crashlytics(abstractC18041l);
        if (iCrashlytics == 0) {
            return C2580l.f5619l;
        }
        List listSubList = abstractC18041l.inmobi().subList(0, iCrashlytics);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4946l) it.next()).loadAd());
        }
        return arrayList;
    }

    public static final int crashlytics(AbstractC18041l abstractC18041l) {
        InterfaceC1910l interfaceC1910lLoadAd = abstractC18041l.getAnnotations().loadAd(AbstractC3333l.adcel);
        if (interfaceC1910lLoadAd == null) {
            return 0;
        }
        return ((Number) ((C18009l) ((AbstractC0757l) AbstractC8676l.smaato(AbstractC3974l.purchase, interfaceC1910lLoadAd.admob()))).yandex).intValue();
    }

    public static void firebase(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    public static void isPro(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void license(int i, byte[] bArr, long[] jArr) {
        for (long j : jArr) {
            pro(j, bArr, i);
            i += 8;
        }
    }

    public static long loadAd(int i, byte[] bArr) {
        int iYandex = yandex(i, bArr);
        return (((long) yandex(i + 4, bArr)) & 4294967295L) | ((((long) iYandex) & 4294967295L) << 32);
    }

    public static int metrica(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final AbstractC1514l mopub(C16781l c16781l) {
        C2473l c2473lYandex;
        if (!c16781l.amazon() || c16781l.crashlytics() || (c2473lYandex = C1578l.loadAd.yandex(c16781l.subs().loadAd(), c16781l.mopub().loadAd())) == null) {
            return null;
        }
        return c2473lYandex.yandex;
    }

    public static void pro(long j, byte[] bArr, int i) {
        smaato((int) (4294967295L & j), i, bArr);
        smaato((int) (j >>> 32), i + 4, bArr);
    }

    public static final C3498l purchase(AbstractC18041l abstractC18041l) {
        String str;
        InterfaceC1910l interfaceC1910lLoadAd = abstractC18041l.getAnnotations().loadAd(AbstractC3333l.ads);
        if (interfaceC1910lLoadAd != null) {
            Object objM4224instanceof = AbstractC16901l.m4224instanceof(interfaceC1910lLoadAd.admob().values());
            C7391l c7391l = objM4224instanceof instanceof C7391l ? (C7391l) objM4224instanceof : null;
            if (c7391l != null && (str = (String) c7391l.yandex) != null) {
                if (!C3498l.billing(str)) {
                    str = null;
                }
                if (str != null) {
                    return C3498l.purchase(str);
                }
            }
        }
        return null;
    }

    public static void remoteconfig(byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            smaato(i2, i, bArr);
            i += 4;
        }
    }

    public static void smaato(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void startapp(int i, byte[] bArr, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = metrica(i, bArr);
            i += 4;
        }
    }

    public static final List subs(AbstractC18041l abstractC18041l) {
        vip(abstractC18041l);
        List listInmobi = abstractC18041l.inmobi();
        return listInmobi.subList(((!vip(abstractC18041l) || abstractC18041l.getAnnotations().loadAd(AbstractC3333l.startapp) == null) ? 0 : 1) + crashlytics(abstractC18041l), listInmobi.size() - 1);
    }

    public static long subscription(int i, byte[] bArr) {
        return ((((long) metrica(i + 4, bArr)) & 4294967295L) << 32) | (4294967295L & ((long) metrica(i, bArr)));
    }

    public static void tapsense(int i, byte[] bArr, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = subscription(i, bArr);
            i += 8;
        }
    }

    public static final boolean vip(AbstractC18041l abstractC18041l) {
        AbstractC1514l abstractC1514lMopub;
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        if (interfaceC15234lPro == null) {
            return false;
        }
        if ((interfaceC15234lPro instanceof InterfaceC17477l) && AbstractC16860l.m4205strictfp(interfaceC15234lPro)) {
            int i = AbstractC3759l.yandex;
            abstractC1514lMopub = mopub(AbstractC11125l.billing(interfaceC15234lPro));
        } else {
            abstractC1514lMopub = null;
        }
        return AbstractC8576l.yandex(abstractC1514lMopub, C1015l.amazon) || AbstractC8576l.yandex(abstractC1514lMopub, C9392l.amazon);
    }

    public static int yandex(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
