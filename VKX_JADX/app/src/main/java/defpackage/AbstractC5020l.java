package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import androidx.car.app.hardware.info.EnergyProfile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: lٜؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5020l implements InterfaceC7456l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f10250l = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163};

    public static String Signature(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder ad(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static String adcel(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static /* synthetic */ Integer admob(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static String ads(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static StringBuilder advert(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void amazon(InterfaceC17211l interfaceC17211l, String str) {
        interfaceC17211l.yandex().yandex(new C12782l(str));
    }

    public static int applovin(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static /* synthetic */ String appmetrica(int i) {
        if (i == 1) {
            return "ACTIVITY";
        }
        if (i == 2) {
            return "BROADCAST";
        }
        if (i == 3) {
            return "SERVICE";
        }
        if (i == 4) {
            return "FOREGROUND_SERVICE";
        }
        if (i == 5) {
            return "CALLBACK";
        }
        throw null;
    }

    public static void billing(InterfaceC2933l interfaceC2933l) {
        interfaceC2933l.remoteconfig(new C9695l(new C9627l()));
    }

    public static C15977l crashlytics(InterfaceC17211l interfaceC17211l) {
        return new C15977l(interfaceC17211l.yandex().yandex);
    }

    public static /* synthetic */ boolean firebase(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ int inmobi(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static StringBuilder isVip(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static String license(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static void loadAd(InterfaceC17211l interfaceC17211l, String str, Function1 function1) {
        C4384l c4384lYandex = interfaceC17211l.yandex();
        InterfaceC17211l interfaceC17211lSmaato = interfaceC17211l.smaato();
        function1.invoke(interfaceC17211lSmaato);
        Unit unit = Unit.INSTANCE;
        c4384lYandex.yandex(new C6513l(str, new C0659l(interfaceC17211lSmaato.yandex().yandex)));
    }

    public static C6451l metrica(String str) {
        AbstractC0081l.amazon(str);
        return new C6451l(10);
    }

    public static InterfaceC17242l mopub(C7091l c7091l) {
        C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 400.0f, null, 5);
        C8896l c8896l = AbstractC11922l.yandex;
        C13315l c13315lAdmob2 = AbstractC0532l.admob(0.0f, 400.0f, new C5177l(4294967297L), 1);
        C13315l c13315lAdmob3 = AbstractC0532l.admob(0.0f, 400.0f, null, 5);
        c7091l.getClass();
        return new C2424l(c13315lAdmob, c13315lAdmob2, c13315lAdmob3);
    }

    public static void premium(ArrayList arrayList, String str, String str2, String str3, String str4) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
    }

    public static StringBuilder pro(Cfor cfor, String str, String str2, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, cfor, sb.toString());
        return new StringBuilder();
    }

    public static boolean purchase(InterfaceC14748l interfaceC14748l, long j) {
        return j >= interfaceC14748l.loadAd();
    }

    public static int remoteconfig(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static StringBuilder signatures(ConfigurableProvider configurableProvider, String str, String str2, String str3, Cfor cfor) {
        configurableProvider.addAlgorithm(str, cfor, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static InterfaceC17242l smaato(C7091l c7091l, InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(new C13758l(c7091l.yandex));
    }

    public static C10092l startapp(long j, C8540l c8540l) {
        return c8540l.yandex(new C9735l(j));
    }

    public static /* synthetic */ int subs(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static String subscription(String str, InterfaceC9719l interfaceC9719l) {
        return str.concat(interfaceC9719l.getClass().getName());
    }

    public static String tapsense(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static /* synthetic */ int[] m1673throws(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f10250l, 0, iArr, 0, i);
        return iArr;
    }

    public static long vip(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    public static void yandex(InterfaceC17211l interfaceC17211l, Function1[] function1Arr, Function1 function1) {
        ArrayList arrayList = new ArrayList(function1Arr.length);
        for (Function1 function2 : function1Arr) {
            InterfaceC17211l interfaceC17211lSmaato = interfaceC17211l.smaato();
            function2.invoke(interfaceC17211lSmaato);
            arrayList.add(new C0659l(interfaceC17211lSmaato.yandex().yandex));
        }
        InterfaceC17211l interfaceC17211lSmaato2 = interfaceC17211l.smaato();
        function1.invoke(interfaceC17211lSmaato2);
        interfaceC17211l.yandex().yandex(new C7914l(new C0659l(interfaceC17211lSmaato2.yandex().yandex), arrayList));
    }
}
