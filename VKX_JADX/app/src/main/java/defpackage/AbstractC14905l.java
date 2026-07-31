package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٕٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14905l {
    public static final C15578l crashlytics;
    public static final C15578l loadAd;
    public static final C15578l yandex;

    static {
        new C15578l(1524080993, false, new C13179l(16));
        new C15578l(-97021387, false, new C13179l(17));
        new C15578l(-587602735, false, new C13179l(18));
        yandex = new C15578l(-161223236, false, new C13179l(19));
        loadAd = new C15578l(783456056, false, new C13179l(20));
        crashlytics = new C15578l(1019625879, false, new C13179l(21));
    }

    public static final C2312l amazon(C2312l c2312l, C2312l c2312l2) {
        C16781l c16781l = c2312l.yandex;
        C16781l c16781l2 = c2312l2.yandex;
        if (!c2312l.equals(c2312l2) && !c16781l2.crashlytics()) {
            String str = c16781l.yandex;
            String str2 = c16781l2.yandex;
            if (!AbstractC16648l.isVip(str, str2, false) || str.charAt(str2.length()) != '.') {
                return c2312l;
            }
        }
        if (c16781l2.crashlytics()) {
            return c2312l;
        }
        return c2312l.equals(c2312l2) ? C2312l.crashlytics : new C2312l(c16781l.yandex.substring(c16781l2.yandex.length() + 1));
    }

    public static final Collection crashlytics(Collection collection, Function1 function1) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = C4853l.f9907l;
        C4853l c4853lCrashlytics = AbstractC11621l.crashlytics();
        while (!linkedList.isEmpty()) {
            Object objM4231native = AbstractC16901l.m4231native(linkedList);
            int i2 = C4853l.f9907l;
            C4853l c4853lCrashlytics2 = AbstractC11621l.crashlytics();
            ArrayList arrayListMopub = C14450l.mopub(objM4231native, linkedList, function1, new C17330l(1, c4853lCrashlytics2));
            if (arrayListMopub.size() == 1 && c4853lCrashlytics2.isEmpty()) {
                c4853lCrashlytics.add(AbstractC16901l.m4223import(arrayListMopub));
            } else {
                Object objSubscription = C14450l.subscription(arrayListMopub, function1);
                InterfaceC11661l interfaceC11661l = (InterfaceC11661l) function1.invoke(objSubscription);
                for (Object obj : arrayListMopub) {
                    if (!C14450l.firebase(interfaceC11661l, (InterfaceC11661l) function1.invoke(obj))) {
                        c4853lCrashlytics2.add(obj);
                    }
                }
                if (!c4853lCrashlytics2.isEmpty()) {
                    c4853lCrashlytics.addAll(c4853lCrashlytics2);
                }
                c4853lCrashlytics.add(objSubscription);
            }
        }
        return c4853lCrashlytics;
    }

    public static void loadAd(AppActivity appActivity) {
        SharedPreferences sharedPreferences = AbstractC3957l.amazon;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        C11521l c11521l = new C11521l(0, EnumC5224l.f11304l);
        while (c11521l.hasNext()) {
            EnumC5224l enumC5224l = (EnumC5224l) c11521l.next();
            if (((Boolean) enumC5224l.f11306l.invoke()).booleanValue() && !sharedPreferences.getBoolean("bad_device_vpn", false)) {
                new C11083l(enumC5224l).Signature(appActivity);
                return;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC18016l yandex(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC18016l.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC18016l.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC18016l.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC18016l.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC18016l.SSL_3_0;
        }
        C8339l.metrica("Unexpected TLS version: ".concat(str));
        return null;
    }
}
