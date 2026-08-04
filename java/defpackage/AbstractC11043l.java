package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: lُٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11043l {
    public static /* synthetic */ String Signature(int i) {
        switch (i) {
            case 1:
                return "APP_CLOSED";
            case 2:
                return "APP_DISCONNECTED";
            case 3:
                return "CAMERA2_CLOSED";
            case 4:
                return "CAMERA2_DISCONNECTED";
            case 5:
                return "CAMERA2_ERROR";
            case 6:
                return "CAMERA2_EXCEPTION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String ad(int i) {
        if (i == 1) {
            return "MEMORY_CACHE";
        }
        if (i == 2) {
            return "MEMORY";
        }
        if (i != 3) {
            return i != 4 ? "null" : "NETWORK";
        }
        return "DISK";
    }

    public static void adcel(ConfigurableProvider configurableProvider, String str, String str2, String str3, Cfor cfor) {
        configurableProvider.addAlgorithm(str3, cfor, str + str2);
    }

    public static String admob(char c, String str, String str2) {
        return str + c + str2;
    }

    public static C7420l ads(InterfaceC17944l interfaceC17944l, InterfaceC17944l interfaceC17944l2) {
        if (interfaceC17944l == null && interfaceC17944l2 == null) {
            return C7420l.f15370l;
        }
        C5104l c5104lAmazon = interfaceC17944l2 != null ? C5104l.amazon(interfaceC17944l2) : C5104l.crashlytics();
        if (interfaceC17944l != null) {
            Iterator it = interfaceC17944l.startapp().iterator();
            while (it.hasNext()) {
                subscription(c5104lAmazon, interfaceC17944l2, interfaceC17944l, (C6916l) it.next());
            }
        }
        return C7420l.yandex(c5104lAmazon);
    }

    public static InterfaceC17242l advert(InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(new C9247l(1.0f, true));
    }

    public static InterfaceC9576l billing(C5954l c5954l, int i) {
        return C6693l.yandex(new C14785l(c5954l, i, 3));
    }

    public static /* synthetic */ int crashlytics(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        throw null;
    }

    public static void firebase(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void isPro(int i, C6956l c6956l, C6415l c6415l, C6956l c6956l2, C11192l c11192l) {
        AbstractC8182l.billing(c6956l, Integer.valueOf(i), c6415l);
        AbstractC8182l.purchase(c6956l2, c11192l);
    }

    public static /* synthetic */ String license(int i) {
        if (i == 1) {
            return "RLM_COLLECTION_TYPE_NONE";
        }
        if (i == 2) {
            return "RLM_COLLECTION_TYPE_LIST";
        }
        if (i != 3) {
            return i != 4 ? "null" : "RLM_COLLECTION_TYPE_DICTIONARY";
        }
        return "RLM_COLLECTION_TYPE_SET";
    }

    public static long loadAd(C9056l c9056l) {
        byte[] bArr = (byte[]) c9056l.loadAd.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static void metrica(StringBuilder sb, Cfor cfor, ConfigurableProvider configurableProvider, String str) {
        sb.append(cfor);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    public static Object mopub(C6956l c6956l, int i, boolean z, C18656l c18656l) {
        c6956l.m2123default(i);
        c6956l.startapp(z);
        return c18656l.crashlytics();
    }

    public static /* synthetic */ String pro(int i) {
        if (i == 1) {
            return "CROSSED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "COLLAPSED";
        }
        return "NOT_CROSSED";
    }

    public static InterfaceC9576l purchase(C9377l c9377l, C13416l c13416l, int i) {
        return C6693l.yandex(new C13698l(c9377l, c13416l, i, 6));
    }

    public static void remoteconfig(String str, String str2, String str3) {
        AbstractC6427l.vip(str3, str + str2);
    }

    public static void smaato(long j, String str, StringBuilder sb) {
        sb.append((Object) C9735l.subs(j));
        sb.append(str);
    }

    public static void startapp(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static StringBuilder subs(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
        return new StringBuilder();
    }

    public static void subscription(C5104l c5104l, InterfaceC17944l interfaceC17944l, InterfaceC17944l interfaceC17944l2, C6916l c6916l) {
        if (!Objects.equals(c6916l, InterfaceC4089l.f8427volatile)) {
            c5104l.purchase(c6916l, interfaceC17944l2.mo860class(c6916l), interfaceC17944l2.adcel(c6916l));
            return;
        }
        C18085l c18085l = (C18085l) interfaceC17944l2.smaato(c6916l, null);
        C18085l c18085l2 = (C18085l) interfaceC17944l.smaato(c6916l, null);
        EnumC10534l enumC10534lMo860class = interfaceC17944l2.mo860class(c6916l);
        if (c18085l == null) {
            c18085l = c18085l2;
        } else if (c18085l2 != null) {
            C12418l c12418lStartapp = C12418l.startapp(c18085l2);
            C14513l c14513l = c18085l.yandex;
            if (c14513l != null) {
                c12418lStartapp.f24519l = c14513l;
            }
            C10077l c10077l = c18085l.loadAd;
            if (c10077l != null) {
                c12418lStartapp.f24518l = c10077l;
            }
            C6536l c6536l = c18085l.crashlytics;
            if (c6536l != null) {
                c12418lStartapp.f24521l = c6536l;
            }
            c18085l = new C18085l((C14513l) c12418lStartapp.f24519l, (C10077l) c12418lStartapp.f24518l, (C6536l) c12418lStartapp.f24521l);
        }
        c5104l.purchase(c6916l, enumC10534lMo860class, c18085l);
    }

    public static /* synthetic */ String tapsense(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static void vip(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
    }

    public static Long yandex(realm_value_t realm_value_tVar) {
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            return null;
        }
        return Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar));
    }
}
