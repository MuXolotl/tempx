package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lٟۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18548l {
    public final C1008l amazon;
    public final List crashlytics;
    public final C14517l loadAd;
    public final C14437l yandex;

    public C18548l(C11969l c11969l, C14437l c14437l, C7931l c7931l, C8935l c8935l, List list, C8409l c8409l) {
        this.yandex = c14437l;
        this.crashlytics = c7931l.smaato;
        Map map = c7931l.isPro;
        Map map2 = c7931l.remoteconfig;
        C5192l c5192l = AbstractC12634l.crashlytics;
        Object obj = map.get(c5192l);
        Boolean bool = Boolean.TRUE;
        if (AbstractC8576l.yandex(obj, bool) || AbstractC8576l.yandex(map2.get(c5192l), bool)) {
            Log.i("CXCP", c5192l + " is set to true, ignoring GraphState3A parameters.");
        }
        C10379l c10379l = c7931l.metrica;
        c8409l.loadAd.getClass();
        C14513l c14513l = c10379l.loadAd;
        Set set = (Set) C8409l.crashlytics.get(Build.MANUFACTURER);
        int iMax = (set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10);
        c14513l.getClass();
        int iMax2 = Math.max(iMax, c14513l.f28392l);
        C12733l c12733l = iMax2 != 0 ? new C12733l(iMax2) : null;
        C14517l c14517l = new C14517l(c14437l, map, map2, AbstractC16901l.m4232new(list, AbstractC14055l.vip(c12733l)), AbstractC8669l.m2420volatile(new Object[]{c8935l, c12733l}), c11969l.yandex, c11969l.billing);
        this.loadAd = c14517l;
        if (c12733l != null) {
            if (c12733l.f25100l != null) {
                C8339l.smaato("GraphLoop has already been set!");
                throw null;
            }
            c12733l.f25100l = c14517l;
            c14517l.f28415l.yandex = 0;
            Log.w("CXCP", "Capture processing has been disabled for " + c14517l + " until " + c12733l.f25102l + " frames have been completed.");
        }
        this.amazon = AbstractC11190l.yandex(C17874l.loadAd);
    }

    public final void amazon(C15390l c15390l) {
        C14517l c14517l = this.loadAd;
        synchronized (c14517l.f28412l) {
            try {
                C15390l c15390l2 = c14517l.f28411l;
                c14517l.f28411l = c15390l;
                if (c15390l2 != null || c15390l != null) {
                    C11644l c11644l = c14517l.f28401l;
                    if (c15390l != null) {
                        c11644l.m3144l(new C12253l(c15390l));
                    } else {
                        c11644l.m3144l(C15305l.amazon);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c15390l == null) {
            int size = c14517l.f28409l.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC12762l) c14517l.f28409l.get(i)).crashlytics();
            }
        }
    }

    public final void billing(LinkedHashMap linkedHashMap) {
        C14517l c14517l = this.loadAd;
        synchronized (c14517l.f28412l) {
            c14517l.f28401l.m3144l(new C4122l(c14517l.f28397l, linkedHashMap));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void crashlytics() {
        Log.d("CXCP", this + " onGraphStopped");
        C1008l c1008l = this.amazon;
        c1008l.getClass();
        C17874l c17874l = C17874l.loadAd;
        c1008l.remoteconfig(null, c17874l);
        this.loadAd.m3861package(null);
        for (C7686l c7686l : this.crashlytics) {
            C7647l c7647l = c7686l.yandex;
            C2667l c2667l = c7686l.loadAd;
            if (c2667l == null) {
                c2667l = null;
            }
            c7647l.loadAd(c2667l, c17874l);
        }
    }

    public final void loadAd(C9598l c9598l) {
        Log.d("CXCP", this + " onGraphStarted");
        C13339l c13339l = C13339l.loadAd;
        C1008l c1008l = this.amazon;
        c1008l.getClass();
        c1008l.remoteconfig(null, c13339l);
        this.loadAd.m3861package(c9598l);
        for (C7686l c7686l : this.crashlytics) {
            C7647l c7647l = c7686l.yandex;
            C2667l c2667l = c7686l.loadAd;
            if (c2667l == null) {
                c2667l = null;
            }
            c7647l.loadAd(c2667l, c13339l);
        }
    }

    public final boolean purchase(Map map) {
        C14517l c14517l = this.loadAd;
        if (c14517l.mopub() != null) {
            return c14517l.f28401l.m3144l(new C1879l(map));
        }
        C8339l.smaato("Cannot submit parameters without an active repeating request!");
        return false;
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.yandex + ')';
    }

    public final void yandex(C11769l c11769l) {
        C1008l c1008l;
        Object value;
        AbstractC12724l abstractC12724l;
        Log.d("CXCP", this + " onGraphError(" + c11769l + ')');
        do {
            c1008l = this.amazon;
            value = c1008l.getValue();
            abstractC12724l = (AbstractC12724l) value;
        } while (!c1008l.firebase(value, ((abstractC12724l instanceof C11913l) || (abstractC12724l instanceof C17874l)) ? C17874l.loadAd : c11769l));
        for (C7686l c7686l : this.crashlytics) {
            C7647l c7647l = c7686l.yandex;
            C2667l c2667l = c7686l.loadAd;
            if (c2667l == null) {
                c2667l = null;
            }
            c7647l.loadAd(c2667l, c11769l);
        }
    }
}
