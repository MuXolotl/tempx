package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؒۙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1303l {
    public static final LinkedHashMap yandex = new LinkedHashMap();

    public static final C18663l loadAd(String str, InterfaceC12493l interfaceC12493l) {
        C18663l c18663l = new C18663l(str, interfaceC12493l);
        yandex.put(String.valueOf(c18663l), c18663l);
        return c18663l;
    }

    public static final int yandex(int i) {
        String str;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                switch (i) {
                    case 1:
                        str = "RLM_LOG_LEVEL_ALL";
                        break;
                    case 2:
                        str = "RLM_LOG_LEVEL_TRACE";
                        break;
                    case 3:
                        str = "RLM_LOG_LEVEL_DEBUG";
                        break;
                    case 4:
                        str = "RLM_LOG_LEVEL_DETAIL";
                        break;
                    case 5:
                        str = "RLM_LOG_LEVEL_INFO";
                        break;
                    case 6:
                        str = "RLM_LOG_LEVEL_WARNING";
                        break;
                    case 7:
                        str = "RLM_LOG_LEVEL_ERROR";
                        break;
                    case 8:
                        str = "RLM_LOG_LEVEL_FATAL";
                        break;
                    case 9:
                        str = "RLM_LOG_LEVEL_OFF";
                        break;
                    default:
                        str = "null";
                        break;
                }
                C8339l.metrica("Invalid core log level: ".concat(str));
                return 0;
        }
    }
}
