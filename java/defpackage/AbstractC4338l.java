package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_version_id_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: lؖۗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4338l {
    public static float Signature(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static String ad(Cclass cclass, StringBuilder sb) {
        sb.append(cclass.size());
        return sb.toString();
    }

    public static InterfaceC6942l adcel(C14649l c14649l) {
        return c14649l.f28663l.mo1843l().mo1733l(c14649l, null);
    }

    public static boolean admob(InterfaceC17603l interfaceC17603l) {
        return interfaceC17603l.mo875abstract().isClosed();
    }

    public static int ads(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static String advert(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static void amazon(InterfaceC15866l interfaceC15866l, C5131l c5131l) {
        interfaceC15866l.subs().inmobi(c5131l);
    }

    public static void applovin(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    public static void appmetrica(HashMap map, Cfor cfor) {
        map.put(cfor, new C7584l(17));
    }

    public static Set billing(InterfaceC15866l interfaceC15866l, C6916l c6916l) {
        return interfaceC15866l.subs().Signature(c6916l);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static /* synthetic */ String m1527catch(int i) {
        if (i == 1) {
            return "AUTOMATIC";
        }
        if (i != 2) {
            return i != 3 ? "null" : "WRITE_AHEAD_LOGGING";
        }
        return "TRUNCATE";
    }

    public static boolean crashlytics(InterfaceC15866l interfaceC15866l, C6916l c6916l) {
        return interfaceC15866l.subs().mo861strictfp(c6916l);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static /* synthetic */ int m1528else(String str) {
        if (str == null) {
            C6541l.subs("Name is null");
            return 0;
        }
        if (str.equals("Ltr")) {
            return 1;
        }
        if (str.equals("Rtl")) {
            return 2;
        }
        C8339l.metrica("No enum constant androidx.compose.ui.text.style.ResolvedTextDirection.".concat(str));
        return 0;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static /* synthetic */ String m1529extends(int i) {
        switch (i) {
            case 1:
                return "RLM_PROPERTY_TYPE_INT";
            case 2:
                return "RLM_PROPERTY_TYPE_BOOL";
            case 3:
                return "RLM_PROPERTY_TYPE_STRING";
            case 4:
                return "RLM_PROPERTY_TYPE_BINARY";
            case 5:
                return "RLM_PROPERTY_TYPE_MIXED";
            case 6:
                return "RLM_PROPERTY_TYPE_TIMESTAMP";
            case 7:
                return "RLM_PROPERTY_TYPE_FLOAT";
            case 8:
                return "RLM_PROPERTY_TYPE_DOUBLE";
            case 9:
                return "RLM_PROPERTY_TYPE_OBJECT";
            case 10:
                return "RLM_PROPERTY_TYPE_LINKING_OBJECTS";
            case 11:
                return "RLM_PROPERTY_TYPE_DECIMAL128";
            case 12:
                return "RLM_PROPERTY_TYPE_OBJECT_ID";
            case 13:
                return "RLM_PROPERTY_TYPE_UUID";
            default:
                return "null";
        }
    }

    public static Object firebase(InterfaceC15866l interfaceC15866l, C6916l c6916l) {
        return interfaceC15866l.subs().adcel(c6916l);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static /* synthetic */ String m1530for(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static int inmobi(int i, int i2, int i3, int i4) {
        return C4352l.subs(i + i2, i3) + i4;
    }

    public static Set isPro(InterfaceC15866l interfaceC15866l) {
        return interfaceC15866l.subs().startapp();
    }

    public static StringBuilder isVip(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    public static int license(int i, int i2, int i3, int i4) {
        return C4871l.subs(i + i2, i3) + i4;
    }

    public static void loadAd(InterfaceC7832l interfaceC7832l) {
        interfaceC7832l.mo1844l();
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC7832l.mo1845l()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_close(ptr$cinterop_release);
    }

    public static C10821l metrica(InterfaceC17603l interfaceC17603l) {
        return interfaceC17603l.mo875abstract().mo876l();
    }

    public static boolean mopub(InterfaceC7832l interfaceC7832l) {
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC7832l.mo1845l()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_is_closed(ptr$cinterop_release);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static /* synthetic */ String m1531native(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        throw null;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static void m1532package(HashMap map, Cfor cfor) {
        map.put(cfor, new C9254l(13));
    }

    public static StringBuilder premium(ConfigurableProvider configurableProvider, String str, String str2, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static void m1533private(C6099l c6099l, Function1 function1) {
        function1.invoke(new C18677l(c6099l.yandex));
    }

    public static int pro(int i, int i2, int i3, int i4, int i5) {
        return C4871l.subs(i + i2 + i3, i4) + i5;
    }

    public static EnumC10534l purchase(InterfaceC15866l interfaceC15866l, C6916l c6916l) {
        return interfaceC15866l.subs().mo860class(c6916l);
    }

    public static Object remoteconfig(InterfaceC15866l interfaceC15866l, C6916l c6916l, EnumC10534l enumC10534l) {
        return interfaceC15866l.subs().advert(c6916l, enumC10534l);
    }

    public static StringBuilder signatures(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    public static Object smaato(InterfaceC15866l interfaceC15866l, C6916l c6916l, Object obj) {
        return interfaceC15866l.subs().smaato(c6916l, obj);
    }

    public static C12867l startapp(C17483l c17483l) {
        C10700l c10700l = new C10700l();
        C16124l c16124lAmazon = AbstractC3206l.amazon(new C14300l(c17483l.f34051l.mo1843l().mo1733l(c17483l, null), 5), new C1698l(13), AbstractC3206l.loadAd);
        C14082l c14082l = new C14082l(null, c10700l);
        int i = AbstractC16600l.yandex;
        return new C12867l(c14082l, c16124lAmazon, C17218l.f33421l, -2, 1);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static void m1534strictfp(HashMap map, Cfor cfor) {
        map.put(cfor, new C7584l(21));
    }

    public static boolean subs(InterfaceC17603l interfaceC17603l) {
        return interfaceC17603l.mo875abstract().mo879l();
    }

    public static /* synthetic */ int subscription(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 12;
            case 10:
                return 14;
            case 11:
                return 11;
            case 12:
                return 15;
            case 13:
                return 17;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m1535synchronized(HashMap map, Cfor cfor) {
        map.put(cfor, new C7584l(20));
    }

    public static boolean tapsense(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static /* synthetic */ String m1536throw(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "Rtl";
        }
        return "Ltr";
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static int m1537throws(int i, int i2, int i3, int i4, int i5) {
        return C4352l.subs(i + i2 + i3, i4) + i5;
    }

    public static C10821l vip(InterfaceC7832l interfaceC7832l) {
        interfaceC7832l.mo1844l();
        NativePointer nativePointerMo1845l = interfaceC7832l.mo1845l();
        long jNew_realm_version_id_t = realmcJNI.new_realm_version_id_t();
        realm_version_id_t realm_version_id_tVar = new realm_version_id_t();
        realm_version_id_tVar.loadAd = true;
        realm_version_id_tVar.yandex = jNew_realm_version_id_t;
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointerMo1845l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, realm_version_id_tVar.yandex, realm_version_id_tVar);
        if (zArr[0]) {
            return new C10821l(realmcJNI.realm_version_id_t_version_get(realm_version_id_tVar.yandex, realm_version_id_tVar));
        }
        C8339l.smaato("No VersionId was available. Reading the VersionId requires a valid read transaction.");
        return null;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static /* synthetic */ String m1538volatile(int i) {
        switch (i) {
            case 1:
                return "INT";
            case 2:
                return "BOOL";
            case 3:
                return "STRING";
            case 4:
                return "BINARY";
            case 5:
                return "TIMESTAMP";
            case 6:
                return "FLOAT";
            case 7:
                return "DOUBLE";
            case 8:
                return "DECIMAL128";
            case 9:
                return "OBJECT_ID";
            case 10:
                return "UUID";
            case 11:
                return "OBJECT";
            case 12:
                return "LIST";
            case 13:
                return "DICTIONARY";
            default:
                throw null;
        }
    }

    public static void yandex(InterfaceC7832l interfaceC7832l) {
        if (interfaceC7832l.isClosed()) {
            C8339l.smaato(AbstractC14814l.startapp("Realm has been closed and is no longer accessible: ", ((C12125l) interfaceC7832l.mo1843l().f33215l).crashlytics));
        }
    }
}
