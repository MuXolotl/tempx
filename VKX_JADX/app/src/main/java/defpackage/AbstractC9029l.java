package defpackage;

import android.app.Activity;
import android.content.Intent;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lٌۚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC9029l {
    public static void Signature(int i, int i2, Cfor cfor, HashMap map, Integer num) {
        map.put(num, new C15509l(i, i2, cfor));
    }

    public static void ad(StringBuilder sb, boolean z, ArrayList arrayList) {
        sb.append(z);
        arrayList.add(sb.toString());
    }

    public static HashMap adcel(Class cls, C10182l c10182l) {
        HashMap map = new HashMap();
        map.put(cls, c10182l);
        return map;
    }

    public static int admob(int i, int i2, int i3) {
        return AbstractC10908l.yandex(i) + i2 + i3;
    }

    public static C7601l ads(HashMap map, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new C7601l(i);
    }

    public static void advert(HashMap map) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public static int amazon(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ String applovin(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String appmetrica(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "End";
        }
        return "Start";
    }

    public static /* synthetic */ int billing(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int crashlytics(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        C8339l.subs("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static int firebase(boolean z, C16786l c16786l, int i, int i2) {
        return c16786l.firebase(i, Boolean.valueOf(z)) + i2;
    }

    public static InterfaceC2167l inmobi(InterfaceC11000l interfaceC11000l, C13997l c13997l, C7502l c7502l, ArrayList arrayList) {
        String str = c13997l.f27303l;
        if (interfaceC11000l.vip(str)) {
            InterfaceC2167l interfaceC2167lAdmob = interfaceC11000l.admob(str);
            if (interfaceC2167lAdmob instanceof AbstractC10453l) {
                return ((AbstractC10453l) interfaceC2167lAdmob).yandex(c7502l, arrayList);
            }
            C8339l.metrica(AbstractC12900l.firebase(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            AbstractC13831l.purchase(1, "hasOwnProperty", arrayList);
            return interfaceC11000l.vip(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub()) ? InterfaceC2167l.f4807l : InterfaceC2167l.f4804l;
        }
        C8339l.metrica(AbstractC14814l.startapp("Object has no function ", str));
        return null;
    }

    public static int isPro(int i, C16786l c16786l, int i2, int i3) {
        return c16786l.firebase(i2, Integer.valueOf(i)) + i3;
    }

    public static int isVip(int i, int i2, int i3) {
        return C9747l.yandex(i) + i2 + i3;
    }

    public static void license(C12984l c12984l, InterfaceC8979l interfaceC8979l) {
        interfaceC8979l.mopub(new C5978l(c12984l));
    }

    public static void loadAd(Activity activity) {
        try {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            activity.startActivityForResult(intent, 200);
        } catch (Exception unused) {
            AbstractC11708l.yandex(new C15245l(0, activity, "На устройстве не обнаружено приложений для распознавания голоса"));
        }
    }

    public static StringBuilder metrica(StringBuilder sb, boolean z, ArrayList arrayList, String str) {
        sb.append(z);
        arrayList.add(sb.toString());
        return new StringBuilder(str);
    }

    public static int mopub(int i, float f, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static int premium(int i, int i2, int i3) {
        return C9720l.isVip(i) + i2 + i3;
    }

    public static void pro(String str, String str2, ArrayList arrayList) {
        arrayList.add(str2.concat(AbstractC13457l.firebase(str)));
    }

    public static /* synthetic */ int purchase(int i) {
        if (i == 1) {
            return 135;
        }
        if (i == 2) {
            return 270;
        }
        if (i == 3) {
            return 300;
        }
        if (i == 4) {
            return 600;
        }
        if (i == 5) {
            return 1200;
        }
        throw null;
    }

    public static C3585l remoteconfig() {
        new LinkedHashMap();
        return new C3585l(16);
    }

    public static int signatures(int i, int i2, int i3, int i4) {
        return C9747l.yandex(i) + i2 + i3 + i4;
    }

    public static C3537l smaato(int i, C0458l c0458l) {
        C10182l c10182l = new C10182l(i);
        if (((HashMap) c0458l.f1690l) == null) {
            c0458l.f1690l = new HashMap();
        }
        ((HashMap) c0458l.f1690l).put(InterfaceC16073l.class, c10182l);
        return new C3537l((String) c0458l.f1691l, ((HashMap) c0458l.f1690l) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) c0458l.f1690l)));
    }

    public static HashMap startapp(Class cls, C7601l c7601l) {
        HashMap map = new HashMap();
        map.put(cls, c7601l);
        return map;
    }

    public static int subs(int i, int i2, int i3, int i4) {
        return AbstractC10908l.yandex(i) + i2 + i3 + i4;
    }

    public static InterfaceC9971l subscription(InterfaceC9971l interfaceC9971l) {
        int size = interfaceC9971l.size();
        return interfaceC9971l.license(size + size);
    }

    public static C10182l tapsense(HashMap map, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new C10182l(i);
    }

    public static StringBuilder vip(String str, String str2, ArrayList arrayList, String str3) {
        arrayList.add(str2.concat(AbstractC13457l.firebase(str)));
        return new StringBuilder(str3);
    }

    public static void yandex(InterfaceC0605l interfaceC0605l, int i, int i2, Intent intent) {
        if (i == 200 && i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("android.speech.extra.RESULTS") : null;
            String str = stringArrayListExtra != null ? stringArrayListExtra.get(0) : null;
            if (str == null) {
                return;
            }
            interfaceC0605l.mopub(str);
        }
    }
}
