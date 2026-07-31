package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.AsyncRequestWorker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6604l {
    public static final C15578l yandex = new C15578l(-783438685, false, new C12496l(13));
    public static final C15578l loadAd = new C15578l(-1548944684, false, new C0263l(3));
    public static final C15578l crashlytics = new C15578l(1467479975, false, new C12496l(20));
    public static final C15578l amazon = new C15578l(878149658, false, new C12496l(21));
    public static final C15578l purchase = new C15578l(-333707765, false, new C0263l(9));
    public static final C15578l billing = new C15578l(-652535266, false, new C12496l(22));
    public static final C15578l mopub = new C15578l(956270747, false, new C12496l(23));
    public static final C15578l admob = new C15578l(-255586676, false, new C0263l(10));
    public static final C15578l subs = new C15578l(-574414177, false, new C12496l(24));
    public static final C15578l isPro = new C15578l(933765655, false, new C0263l(11));
    public static final C15578l firebase = new C15578l(-1993736907, false, new C0263l(7));
    public static final C15578l smaato = new C15578l(1438910333, false, new C11891l(8));
    public static final C15578l remoteconfig = new C15578l(675166319, false, new C12496l(25));
    public static final C15578l vip = new C15578l(-1167007637, false, new C0263l(12));
    public static final C15578l metrica = new C15578l(458567181, false, new C0263l(13));
    public static final C15578l startapp = new C15578l(-1796778755, false, new C12496l(26));
    public static final C15578l adcel = new C15578l(1861633919, false, new C12496l(27));
    public static final C15578l ads = new C15578l(1203901812, false, new C12496l(28));
    public static final C15578l subscription = new C15578l(-639733898, false, new C12496l(29));
    public static final C15578l tapsense = new C15578l(-660315019, false, new C12496l(14));
    public static final C15578l Signature = new C15578l(1791016567, false, new C12496l(15));
    public static final C15578l license = new C15578l(1410252287, false, new C0263l(4));
    public static final C15578l pro = new C15578l(680714465, false, new C0263l(5));
    public static final C15578l ad = new C15578l(-2117784987, false, new C12496l(16));
    public static final C15578l advert = new C15578l(-735643801, false, new C12496l(17));
    public static final C15578l isVip = new C15578l(946389916, false, new C12496l(18));
    public static final C15578l signatures = new C15578l(2039175198, false, new C12496l(19));
    public static final C15578l premium = new C15578l(-2136371737, false, new C0263l(6));
    public static final C15578l applovin = new C15578l(-1597013175, false, new C0263l(8));

    public static void crashlytics(int i, C13957l c13957l) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC11880l.m3278native(c13957l, i != 0 ? AbstractC11880l.inmobi(i) : null);
            return;
        }
        if (i == 0) {
            c13957l.setXfermode(null);
            return;
        }
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 1:
                mode = PorterDuff.Mode.SRC;
                break;
            case 2:
                mode = PorterDuff.Mode.DST;
                break;
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 8:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 10:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 11:
                mode = PorterDuff.Mode.XOR;
                break;
            case 12:
                mode = PorterDuff.Mode.ADD;
                break;
            case 13:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 14:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 15:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 16:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        c13957l.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }

    public static final boolean loadAd(Context context, Function1 function1) {
        if (!AbstractC5673l.yandex.get() && (!AbstractC8576l.yandex(Build.MANUFACTURER, "vivo") || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        C14354l c14354lInmobi = C11208l.inmobi();
        function1.invoke(c14354lInmobi);
        C11208l c11208l = (C11208l) c14354lInmobi.yandex();
        C13432l c13432lCrashlytics = C13432l.crashlytics(context);
        C10111l c10111l = new C10111l(AsyncRequestWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            int iLoadAd = c11208l.loadAd(null);
            byte[] bArr = new byte[iLoadAd];
            Logger logger = AbstractC11078l.loadAd;
            C16250l c16250l = new C16250l(bArr, iLoadAd);
            c11208l.remoteconfig(c16250l);
            if (c16250l.isVip() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            String str = AbstractC1696l.yandex;
            Byte[] bArr2 = new Byte[iLoadAd];
            for (int i = 0; i < iLoadAd; i++) {
                bArr2[i] = Byte.valueOf(bArr[i]);
            }
            linkedHashMap.put("request", bArr2);
            C4279l c4279l = new C4279l(linkedHashMap);
            AbstractC7280l.admob(c4279l);
            ((C7718l) c10111l.f20586l).purchase = c4279l;
            c13432lCrashlytics.yandex(c10111l.firebase());
            C10111l c10111l2 = new C10111l(AsyncRequestWorker.class);
            c10111l2.m2881native();
            ((C7718l) c10111l2.f20586l).isPro = new C13152l(new C8891l(null), 1, true, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC16901l.m4229l(new LinkedHashSet()) : C5746l.f12138l);
            new C5934l(c13432lCrashlytics, "updateRequestWorkerKeepEnabled", 2, Collections.singletonList(c10111l2.firebase())).yandex();
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + C11208l.class.getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static C7733l yandex(C14115l c14115l, int i) {
        C7733l c7733l = new C7733l(c14115l, (((long) c14115l.yandex.getHeight()) & 4294967295L) | (((long) c14115l.yandex.getWidth()) << 32));
        c7733l.f16226l = i;
        return c7733l;
    }
}
