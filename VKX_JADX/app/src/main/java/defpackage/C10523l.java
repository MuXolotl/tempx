package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lَۘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10523l {
    public final InterfaceC11220l amazon;
    public final Map yandex;
    public final Object loadAd = new Object();
    public final LinkedHashMap crashlytics = new LinkedHashMap();

    public C10523l(String str, Map map, Context context, C11969l c11969l, C5172l c5172l) {
        this.yandex = map;
        c5172l.crashlytics(1, new RunnableC16112l(11, this));
        InterfaceC11220l interfaceC11220lYandex = yandex(str);
        if (interfaceC11220lYandex != null) {
            this.amazon = interfaceC11220lYandex;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) C1594l.yandex(str));
        C18353l.adcel(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final InterfaceC11220l yandex(String str) {
        synchronized (this.loadAd) {
            try {
                InterfaceC11220l interfaceC11220l = (InterfaceC11220l) this.crashlytics.get(new C1594l(str));
                if (interfaceC11220l != null) {
                    return interfaceC11220l;
                }
                C9903l c9903l = (C9903l) this.yandex.get(new C1594l(str));
                InterfaceC11220l interfaceC11220l2 = c9903l != null ? c9903l.yandex : null;
                if (interfaceC11220l2 != null) {
                    if (!str.equals("CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) C1594l.yandex(str)) + " but it was actually " + ((Object) C1594l.yandex("CXCP-Camera2"))).toString());
                    }
                    this.crashlytics.put(new C1594l(str), interfaceC11220l2);
                }
                return interfaceC11220l2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
