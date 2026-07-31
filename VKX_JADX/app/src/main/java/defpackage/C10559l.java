package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lَۚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10559l {
    public static final C10559l crashlytics = new C10559l(100);
    public final int loadAd;
    public final EnumMap yandex;

    public C10559l(int i) {
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        this.yandex = enumMap;
        EnumC3170l enumC3170l = EnumC3170l.AD_STORAGE;
        EnumC17672l enumC17672l = EnumC17672l.UNINITIALIZED;
        enumMap.put(enumC3170l, enumC17672l);
        enumMap.put(EnumC3170l.ANALYTICS_STORAGE, enumC17672l);
        this.loadAd = i;
    }

    public static char admob(EnumC17672l enumC17672l) {
        if (enumC17672l == null) {
            return '-';
        }
        int iOrdinal = enumC17672l.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static EnumC17672l amazon(String str) {
        EnumC17672l enumC17672l = EnumC17672l.UNINITIALIZED;
        if (str == null) {
            return enumC17672l;
        }
        if (str.equals("granted")) {
            return EnumC17672l.GRANTED;
        }
        return str.equals("denied") ? EnumC17672l.DENIED : enumC17672l;
    }

    public static C10559l crashlytics(int i, String str) {
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        EnumC3170l[] enumC3170lArr = EnumC2242l.STORAGE.f4923l;
        for (int i2 = 0; i2 < enumC3170lArr.length; i2++) {
            String str2 = str == null ? "" : str;
            EnumC3170l enumC3170l = enumC3170lArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(enumC3170l, purchase(str2.charAt(i3)));
            } else {
                enumMap.put(enumC3170l, EnumC17672l.UNINITIALIZED);
            }
        }
        return new C10559l(enumMap, i);
    }

    public static C10559l loadAd(int i, Bundle bundle) {
        if (bundle == null) {
            return new C10559l(i);
        }
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        for (EnumC3170l enumC3170l : EnumC2242l.STORAGE.f4923l) {
            enumMap.put(enumC3170l, amazon(bundle.getString(enumC3170l.f6814l)));
        }
        return new C10559l(enumMap, i);
    }

    public static EnumC17672l purchase(char c) {
        if (c == '+') {
            return EnumC17672l.POLICY;
        }
        if (c != '0') {
            return c != '1' ? EnumC17672l.UNINITIALIZED : EnumC17672l.GRANTED;
        }
        return EnumC17672l.DENIED;
    }

    public static boolean smaato(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public static String yandex(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String billing() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC3170l enumC3170l : EnumC2242l.STORAGE.f4923l) {
            EnumC17672l enumC17672l = (EnumC17672l) this.yandex.get(enumC3170l);
            char c = '-';
            if (enumC17672l != null && (iOrdinal = enumC17672l.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10559l) {
            C10559l c10559l = (C10559l) obj;
            for (EnumC3170l enumC3170l : EnumC2242l.STORAGE.f4923l) {
                if (this.yandex.get(enumC3170l) == c10559l.yandex.get(enumC3170l)) {
                }
            }
            if (this.loadAd == c10559l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final C10559l firebase(C10559l c10559l) {
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        for (EnumC3170l enumC3170l : EnumC2242l.STORAGE.f4923l) {
            EnumC17672l enumC17672l = (EnumC17672l) this.yandex.get(enumC3170l);
            if (enumC17672l == EnumC17672l.UNINITIALIZED) {
                enumC17672l = (EnumC17672l) c10559l.yandex.get(enumC3170l);
            }
            if (enumC17672l != null) {
                enumMap.put(enumC3170l, enumC17672l);
            }
        }
        return new C10559l(enumMap, this.loadAd);
    }

    public final int hashCode() {
        Iterator it = this.yandex.values().iterator();
        int iHashCode = this.loadAd * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC17672l) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final C10559l isPro(C10559l c10559l) {
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        for (EnumC3170l enumC3170l : EnumC2242l.STORAGE.f4923l) {
            EnumC17672l enumC17672l = (EnumC17672l) this.yandex.get(enumC3170l);
            EnumC17672l enumC17672l2 = (EnumC17672l) c10559l.yandex.get(enumC3170l);
            if (enumC17672l == null) {
                enumC17672l = enumC17672l2;
            } else if (enumC17672l2 != null) {
                EnumC17672l enumC17672l3 = EnumC17672l.UNINITIALIZED;
                if (enumC17672l == enumC17672l3) {
                    enumC17672l = enumC17672l2;
                } else if (enumC17672l2 != enumC17672l3) {
                    EnumC17672l enumC17672l4 = EnumC17672l.POLICY;
                    if (enumC17672l == enumC17672l4) {
                        enumC17672l = enumC17672l2;
                    } else if (enumC17672l2 != enumC17672l4) {
                        EnumC17672l enumC17672l5 = EnumC17672l.DENIED;
                        enumC17672l = (enumC17672l == enumC17672l5 || enumC17672l2 == enumC17672l5) ? enumC17672l5 : EnumC17672l.GRANTED;
                    }
                }
            }
            if (enumC17672l != null) {
                enumMap.put(enumC3170l, enumC17672l);
            }
        }
        return new C10559l(enumMap, 100);
    }

    public final String mopub() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC3170l enumC3170l : EnumC2242l.STORAGE.f4923l) {
            sb.append(admob((EnumC17672l) this.yandex.get(enumC3170l)));
        }
        return sb.toString();
    }

    public final boolean subs(EnumC3170l enumC3170l) {
        return ((EnumC17672l) this.yandex.get(enumC3170l)) != EnumC17672l.DENIED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(yandex(this.loadAd));
        for (EnumC3170l enumC3170l : EnumC2242l.STORAGE.f4923l) {
            sb.append(",");
            sb.append(enumC3170l.f6814l);
            sb.append("=");
            EnumC17672l enumC17672l = (EnumC17672l) this.yandex.get(enumC3170l);
            if (enumC17672l == null) {
                enumC17672l = EnumC17672l.UNINITIALIZED;
            }
            sb.append(enumC17672l);
        }
        return sb.toString();
    }

    public C10559l(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(EnumC3170l.class);
        this.yandex = enumMap2;
        enumMap2.putAll(enumMap);
        this.loadAd = i;
    }
}
