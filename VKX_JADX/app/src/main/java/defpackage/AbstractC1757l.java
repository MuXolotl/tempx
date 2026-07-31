package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lََؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1757l {
    public static int Signature(InterfaceC10835l interfaceC10835l, InterfaceC12822l interfaceC12822l, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 1;
            arrayList.add(new C11030l((InterfaceC6357l) list.get(i3), i4, i4, i2));
        }
        return interfaceC10835l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList, AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    public static Object ad(InterfaceC6429l interfaceC6429l, Object obj) {
        interfaceC6429l.remoteconfig().mo1844l();
        Object obj2 = interfaceC6429l.smaato(obj).f17098l;
        interfaceC6429l.crashlytics(interfaceC6429l.admob() + 1);
        return obj2;
    }

    public static int adcel(InterfaceC7150l interfaceC7150l, InterfaceC12822l interfaceC12822l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 2;
        return interfaceC7150l.amazon(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), new C11030l(interfaceC6357l, 1, i2, i2), AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    public static boolean admob(InterfaceC6272l interfaceC6272l, int i) {
        char c;
        String str;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return interfaceC6272l.admob();
        }
        if (c == '\n') {
            return interfaceC6272l.crashlytics();
        }
        if (c == 20) {
            return interfaceC6272l.billing();
        }
        if (c == 30) {
            return interfaceC6272l.loadAd();
        }
        if (c == '(') {
            return interfaceC6272l.purchase();
        }
        if (i == 1) {
            str = "ERROR";
        } else if (i == 2) {
            str = "WARN";
        } else if (i == 3) {
            str = "INFO";
        } else if (i != 4) {
            str = i != 5 ? "null" : "TRACE";
        } else {
            str = "DEBUG";
        }
        C4875l.smaato(str, "] not recognized.", "Level [");
        return false;
    }

    public static int ads(InterfaceC10835l interfaceC10835l, InterfaceC12822l interfaceC12822l, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C11030l((InterfaceC6357l) list.get(i3), 1, 2, i2));
        }
        return interfaceC10835l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList, AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    public static boolean advert(InterfaceC14426l interfaceC14426l, Object obj) {
        int iIndexOf = interfaceC14426l.indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC14426l.yandex()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_erase(ptr$cinterop_release, iIndexOf);
        return true;
    }

    public static Object amazon(InterfaceC6429l interfaceC6429l, NativePointer nativePointer, int i) {
        AbstractC14507l abstractC14507lMo792extends = interfaceC6429l.mo792extends();
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_results_get(ptr$cinterop_release, i, realm_value_tVar.yandex, realm_value_tVar);
        return abstractC14507lMo792extends.amazon(realm_value_tVar);
    }

    public static /* synthetic */ void appmetrica(C1336l c1336l, String str, Function0 function0, Function3 function3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c1336l.isPro(str, function0, function3);
    }

    public static C8195l billing(InterfaceC6429l interfaceC6429l, Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        interfaceC6429l.remoteconfig().mo1844l();
        C8195l c8195lIsPro = interfaceC6429l.isPro(obj, obj2, 2, linkedHashMap);
        interfaceC6429l.crashlytics(interfaceC6429l.admob() + 1);
        return c8195lIsPro;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static /* synthetic */ String m1029case(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static InterfaceC13921l m1030catch(C7972l c7972l, int i) {
        C5866l c5866l = (C5866l) c7972l.f16631l;
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            C1644l c1644l = (C1644l) c5866l.billing.getValue();
            return c5866l.adcel.yandex(i, c1644l.isPro, c5866l.amazon, new C2613l(i, c1644l));
        } finally {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static /* synthetic */ String m1031continue(int i) {
        if (i == 1) {
            return "BURGER";
        }
        if (i == 2) {
            return "ARROW";
        }
        if (i != 3) {
            return i != 4 ? "null" : "CHECK";
        }
        return "X";
    }

    public static C8195l crashlytics(InterfaceC6429l interfaceC6429l, Object obj) {
        interfaceC6429l.remoteconfig().mo1844l();
        C8195l c8195lSmaato = interfaceC6429l.smaato(obj);
        interfaceC6429l.crashlytics(interfaceC6429l.admob() + 1);
        return c8195lSmaato;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static void m1032else(C1336l c1336l, C15578l c15578l, int i) {
        String str = (i & 1) != 0 ? null : "cell:ActionsStrip";
        C13698l c13698l = c1336l.crashlytics;
        C16761l c16761l = c1336l.amazon;
        if (c16761l == null) {
            c16761l = new C16761l();
            c1336l.amazon = c16761l;
        }
        c16761l.yandex(c13698l.f26744l);
        c1336l.isPro(str, null, new C15578l(-1588696110, true, new C1866l(c15578l, c13698l.f26744l, 4)));
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static void m1033extends(int i, int i2, int i3, int i4, int i5) {
        AbstractC0593l.yandex(i);
        AbstractC0593l.yandex(i2);
        AbstractC0593l.yandex(i3);
        AbstractC0593l.yandex(i4);
        AbstractC0593l.yandex(i5);
    }

    public static int firebase(InterfaceC7150l interfaceC7150l, InterfaceC12822l interfaceC12822l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 2;
        return interfaceC7150l.amazon(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), new C11030l(interfaceC6357l, i2, i2, i2), AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static void m1034for(int i, HashMap map, Integer num, int i2, Integer num2) {
        map.put(Integer.valueOf(i), num);
        map.put(Integer.valueOf(i2), num2);
    }

    public static void inmobi(C14543l c14543l, C15578l c15578l) {
        C2782l c2782l = C2782l.f6065l;
        c14543l.getClass();
        c14543l.crashlytics.isPro(1, new C8609l(null, new C2613l(25), new C17015l(23, c2782l), new C15578l(1062451479, true, new C4508l(8, c15578l))));
    }

    public static int isPro(InterfaceC6263l interfaceC6263l, AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 2;
        return interfaceC6263l.amazon(new C9709l(abstractC11754l, abstractC11754l.getLayoutDirection()), new C11030l(interfaceC6357l, i2, i2, 1), AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    public static final int isVip(int i) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi != 0 && iInmobi != 1) {
            if (iInmobi == 2 || iInmobi == 3) {
                return 2;
            }
            if (iInmobi != 4) {
                return iInmobi != 5 ? 0 : 3;
            }
        }
        return 1;
    }

    public static Object license(InterfaceC6429l interfaceC6429l, Object obj, Object obj2, int i, Map map) {
        interfaceC6429l.remoteconfig().mo1844l();
        Object obj3 = interfaceC6429l.isPro(obj, obj2, i, map).f17098l;
        interfaceC6429l.crashlytics(interfaceC6429l.admob() + 1);
        return obj3;
    }

    public static boolean loadAd(InterfaceC6429l interfaceC6429l, Object obj) {
        interfaceC6429l.remoteconfig().mo1844l();
        C3585l c3585l = new C3585l(16);
        AbstractC14507l abstractC14507lMo792extends = interfaceC6429l.mo792extends();
        NativePointer nativePointerYandex = interfaceC6429l.yandex();
        realm_value_t realm_value_tVarCrashlytics = abstractC14507lMo792extends.crashlytics(c3585l, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointerYandex).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_contains_key(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, zArr);
        boolean z = zArr[0];
        c3585l.tapsense();
        return z;
    }

    public static int metrica(InterfaceC10835l interfaceC10835l, InterfaceC12822l interfaceC12822l, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C11030l((InterfaceC6357l) list.get(i3), 2, 1, i2));
        }
        return interfaceC10835l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList, AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    public static boolean mopub(InterfaceC14426l interfaceC14426l, int i, Collection collection, int i2, Map map) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            interfaceC14426l.ad(i, it.next(), i2, map);
            z = true;
            i++;
        }
        return z;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static String m1035native(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static int m1036package(int i, int i2, int i3, int i4) {
        return C2339l.smaato(i + i2 + i3, i4);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static String m1037private(String str, Cfor cfor, String str2) {
        return str + cfor + str2;
    }

    public static void pro(InterfaceC6429l interfaceC6429l, Map map, int i, Map map2) {
        interfaceC6429l.remoteconfig().mo1844l();
        for (Map.Entry entry : map.entrySet()) {
            interfaceC6429l.vip(entry.getKey(), entry.getValue(), i, map2);
        }
    }

    public static int purchase(InterfaceC6429l interfaceC6429l) {
        interfaceC6429l.remoteconfig().mo1844l();
        long[] jArr = new long[1];
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC6429l.yandex()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_size(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    public static int remoteconfig(InterfaceC6263l interfaceC6263l, AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 1;
        return interfaceC6263l.amazon(new C9709l(abstractC11754l, abstractC11754l.getLayoutDirection()), new C11030l(interfaceC6357l, 2, i2, i2), AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    public static final int signatures(int i) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return 2;
        }
        if (iInmobi == 1 || iInmobi == 2) {
            return 3;
        }
        return (iInmobi == 3 || iInmobi == 4 || iInmobi == 5) ? 4 : 0;
    }

    public static int smaato(InterfaceC10835l interfaceC10835l, InterfaceC12822l interfaceC12822l, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 2;
            arrayList.add(new C11030l((InterfaceC6357l) list.get(i3), i4, i4, i2));
        }
        return interfaceC10835l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList, AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    public static int startapp(InterfaceC6263l interfaceC6263l, AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 1;
        return interfaceC6263l.amazon(new C9709l(abstractC11754l, abstractC11754l.getLayoutDirection()), new C11030l(interfaceC6357l, i2, 2, i2), AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static int m1038strictfp(int i, long j, int i2) {
        return (C10882l.yandex(j) + i) * i2;
    }

    public static long subs(InterfaceC13553l interfaceC13553l, InterfaceC18212l interfaceC18212l, InterfaceC18212l interfaceC18212l2) {
        InterfaceC18212l interfaceC18212lYandex = interfaceC13553l.yandex(interfaceC18212l);
        InterfaceC18212l interfaceC18212lYandex2 = interfaceC13553l.yandex(interfaceC18212l2);
        if (interfaceC18212lYandex instanceof C9083l) {
            return ((C9083l) interfaceC18212lYandex).mo2589native(interfaceC18212lYandex2, 0L, true);
        }
        return interfaceC18212lYandex2 instanceof C9083l ? ((C9083l) interfaceC18212lYandex2).mo2589native(interfaceC18212lYandex, 0L, true) ^ (-9223372034707292160L) : interfaceC18212lYandex.mo2589native(interfaceC18212lYandex, 0L, true);
    }

    public static int subscription(InterfaceC6263l interfaceC6263l, AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 1;
        return interfaceC6263l.amazon(new C9709l(abstractC11754l, abstractC11754l.getLayoutDirection()), new C11030l(interfaceC6357l, i2, i2, i2), AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static /* synthetic */ String m1039switch(int i) {
        if (i == 1) {
            return "Wrap";
        }
        if (i == 2) {
            return "Fixed";
        }
        if (i != 3) {
            return i != 4 ? "null" : "MatchParent";
        }
        return "Expand";
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static int m1040synchronized(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2 + i3;
        return ((i6 >>> (32 - i4)) | (i6 << i4)) + i5;
    }

    public static int tapsense(InterfaceC7150l interfaceC7150l, InterfaceC12822l interfaceC12822l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 1;
        return interfaceC7150l.amazon(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), new C11030l(interfaceC6357l, i2, i2, 2), AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static void m1041throw(long j, C10086l c10086l) {
        c10086l.setValue(new C9735l(j));
    }

    public static int vip(InterfaceC7150l interfaceC7150l, InterfaceC12822l interfaceC12822l, InterfaceC6357l interfaceC6357l, int i) {
        int i2 = 2;
        return interfaceC7150l.amazon(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), new C11030l(interfaceC6357l, i2, 1, i2), AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static C6451l m1043volatile(String str) {
        AbstractC14825l.loadAd(str);
        return new C6451l(10);
    }

    public static void yandex(InterfaceC6429l interfaceC6429l) {
        interfaceC6429l.remoteconfig().mo1844l();
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC6429l.yandex()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_clear(ptr$cinterop_release);
        interfaceC6429l.crashlytics(interfaceC6429l.admob() + 1);
    }
}
