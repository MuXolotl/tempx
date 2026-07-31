package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1213l {
    public static final C15578l yandex = new C15578l(-692649309, false, new C2834l(3));
    public static final C15578l loadAd = new C15578l(-812464729, false, new C2834l(4));
    public static final C15578l crashlytics = new C15578l(-2001663974, false, new C2834l(5));
    public static final C15578l amazon = new C15578l(-1180165602, false, new C2834l(6));

    public static C17804l amazon(Context context, C11610l c11610l, C12220l c12220l, Function0 function0, Function0 function1, C18073l c18073l) {
        C1298l c1298l = new C1298l();
        c1298l.f3346l = context;
        c1298l.f3349l = new C7947l(context);
        C11897l c11897l = AbstractC8619l.ads;
        c1298l.f3347l = ((Boolean) c11897l.yandex()).booleanValue();
        int i = 1;
        c1298l.f3348l = true;
        C0554l c0554l = new C0554l();
        c0554l.f1957l = c11610l;
        c0554l.f1958l = new C0458l(27);
        Map mapSingletonMap = Collections.singletonMap("Accept-Encoding", "identity");
        C0458l c0458l = (C0458l) c0554l.f1958l;
        synchronized (c0458l) {
            c0458l.f1690l = null;
            ((HashMap) c0458l.f1691l).clear();
            ((HashMap) c0458l.f1691l).putAll(mapSingletonMap);
        }
        c0554l.f1956l = new C0908l(2);
        int i2 = 13;
        C13568l c13568l = new C13568l(new C13568l(new C0458l(context, c0554l), new C2683l(23, function0), i2), new C8876l(15), i2);
        C6344l c6344l = new C6344l();
        c6344l.f13308l = new C2183l(i);
        c6344l.f13304l = c13568l;
        c6344l.f13303l = c12220l;
        c6344l.f13305l = 2;
        C3253l c3253l = new C3253l(0);
        c3253l.f6947l = c12220l;
        c3253l.f6948l = -1L;
        c6344l.f13307l = c3253l;
        c6344l.f13306l = false;
        c6344l.f13309l = new C8876l(16);
        C13568l c13568l2 = new C13568l(c6344l, new C5131l(function1, c18073l, 18), i2);
        C2760l c2760l = new C2760l();
        c2760l.f5991l = new C8565l(28);
        c2760l.f5992l = true;
        c2760l.f5995l = 3;
        C15291l c15291l = new C15291l(c13568l2, c2760l);
        c15291l.mopub(new C14513l(3, 6, (byte) 0));
        C15670l c15670l = new C15670l(context, c1298l, c15291l);
        HashMap map = new HashMap();
        map.put(C17849l.amazon.yandex, 144179200);
        C13326l c13326l = new C13326l(1048576);
        C7865l.yandex(2500, 0, "bufferForPlaybackMs", "0");
        C7865l.yandex(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        C7865l.yandex(480000, 2500, "minBufferMs", "bufferForPlaybackMs");
        C7865l.yandex(480000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        C7865l.yandex(600000, 480000, "maxBufferMs", "minBufferMs");
        C7865l.yandex(60000, 0, "backBufferDurationMs", "0");
        C7865l c7865l = new C7865l(c13326l, 480000, 480000, 600000, 600000, 2500, 2500, 5000, 5000, true, 60000, map);
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.billing = new C0759l(i, c7865l);
        C13736l c13736l = new C13736l(2, 0, 1, 1, 0, false, true);
        boolean z = !((Boolean) AbstractC8619l.subs.yandex()).booleanValue();
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.isPro = c13736l;
        c15670l.firebase = z;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.smaato = true;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.ads = 30000L;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.subscription = 30000L;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.appmetrica = true;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.metrica = true;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.premium = false;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.remoteconfig = true;
        AbstractC12442l.subscription(!c15670l.applovin);
        c15670l.applovin = true;
        C17804l c17804l = new C17804l(c15670l);
        c17804l.m4419l(((Boolean) AbstractC8619l.isPro.yandex()).booleanValue());
        if (((Boolean) AbstractC8619l.adcel.yandex()).booleanValue()) {
            c17804l.m4428l(0);
        } else {
            c17804l.m4428l(2);
        }
        if (((Boolean) c11897l.yandex()).booleanValue()) {
            C9205l c9205l = (C9205l) c17804l.mo2766l();
            c9205l.getClass();
            C0725l c0725l = new C0725l(c9205l);
            C2985l c2985l = new C2985l();
            c2985l.yandex = 1;
            c2985l.loadAd = false;
            c2985l.crashlytics = false;
            c0725l.pro = new C2171l(c2985l);
            c17804l.mo2800private(new C9205l(c0725l));
        }
        return c17804l;
    }

    public static final void billing(Context context, AbstractC2484l abstractC2484l) {
        if (context instanceof AbstractActivityC2025l) {
            ((AbstractActivityC2025l) context).license(abstractC2484l);
        } else {
            C8339l.smaato("The required Context is not attached to NavigationActivity!");
        }
    }

    public static final void crashlytics(View view, AbstractC2484l abstractC2484l) {
        C9967l c9967l;
        Context context = view.getContext();
        AbstractActivityC2569l abstractActivityC2569l = context instanceof AbstractActivityC2569l ? (AbstractActivityC2569l) context : null;
        if (abstractActivityC2569l != null && (c9967l = abstractActivityC2569l.f5599l) != null) {
            c9967l.getCurrentFragment();
        }
        billing(view.getContext(), abstractC2484l);
    }

    public static final void loadAd(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(771959668);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                C10086l c10086l = new C10086l(null, C18450l.f36015l);
                c6956l.m2147try(c10086l);
                objM2132native = c10086l;
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C0289l(interfaceC8714l, i3);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC10478l.yandex(AbstractC8574l.loadAd.yandex(mopub((Function0) objM2132native2, c6956l, 0)), AbstractC14566l.amazon(-291176396, new C12755l(interfaceC17242l, interfaceC8714l, c15578l, i3), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13085l(interfaceC17242l, c15578l, i, i4);
        }
    }

    public static final C18439l mopub(Function0 function0, C6956l c6956l, int i) {
        View view = (View) c6956l.isPro(AbstractC1242l.billing);
        boolean zBilling = c6956l.billing(view);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (zBilling || objM2132native == obj) {
            objM2132native = new C18439l(view, null, function0);
            c6956l.m2147try(objM2132native);
        }
        C18439l c18439l = (C18439l) objM2132native;
        boolean zAdmob = c6956l.admob(c18439l);
        Object objM2132native2 = c6956l.m2132native();
        if (zAdmob || objM2132native2 == obj) {
            objM2132native2 = new C9319l(c18439l, 3);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.loadAd(c18439l, (Function1) objM2132native2, c6956l);
        return c18439l;
    }

    public static final boolean purchase(C3625l c3625l) {
        int length = c3625l.f7563l.length();
        List list = c3625l.f7564l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C15012l c15012l = (C15012l) list.get(i);
                if ((c15012l.yandex instanceof AbstractC12494l) && AbstractC0255l.loadAd(0, length, c15012l.loadAd, c15012l.crashlytics)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void yandex(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(2064964257);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            loadAd(((i2 << 3) & 896) | (i2 & 14) | 48, c15578l, c6956l, interfaceC17242l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13085l(interfaceC17242l, c15578l, i, i3);
        }
    }
}
