package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3739l {
    public static void amazon(Object obj, InterfaceC17325l interfaceC17325l, C3316l c3316l, AbstractC16840l abstractC16840l) {
        if (obj != null) {
            if (((HashSet) c3316l.f7072l).add(obj) && abstractC16840l.amazon(obj)) {
                Iterator it = interfaceC17325l.admob(obj).iterator();
                while (it.hasNext()) {
                    amazon(it.next(), interfaceC17325l, c3316l, abstractC16840l);
                }
                abstractC16840l.loadAd(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final InterfaceC17242l billing(Function2 function2) {
        return new C2838l(function2);
    }

    public static Object crashlytics(List list, InterfaceC17325l interfaceC17325l, AbstractC16840l abstractC16840l) {
        C3316l c3316l = new C3316l(8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amazon(it.next(), interfaceC17325l, c3316l, abstractC16840l);
        }
        return abstractC16840l.billing();
    }

    public static final Object loadAd(ListenableFuture listenableFuture, AbstractC0283l abstractC0283l) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return AbstractC4867l.mopub(listenableFuture);
            }
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC0283l));
            c2397l.license();
            listenableFuture.yandex(new RunnableC2953l(listenableFuture, c2397l, 1), EnumC9343l.f19168l);
            c2397l.ad(new C3006l(23, listenableFuture));
            return c2397l.Signature();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    public static String mopub(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean purchase(List list, InterfaceC17325l interfaceC17325l, Function1 function1) {
        return (Boolean) crashlytics(list, interfaceC17325l, new C1470l(function1, new boolean[1], 0));
    }

    public static final void yandex() {
        throw new C9850l();
    }
}
