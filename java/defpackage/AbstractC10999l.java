package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُّٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10999l {
    public static final C15578l yandex = new C15578l(181905016, false, new C5974l(26));
    public static final C15578l loadAd = new C15578l(-637395504, false, new C5974l(27));
    public static final C15578l crashlytics = new C15578l(565634833, false, new C5974l(28));
    public static final C15578l amazon = new C15578l(2133755037, false, new C5974l(29));

    public static Object admob(Function2 function2) {
        return subs(C17218l.f33421l, function2);
    }

    public static int amazon(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC11880l.license(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final C7504l billing(int i, InterfaceC12932l interfaceC12932l, InterfaceC2262l interfaceC2262l, Function2 function2) {
        InterfaceC12932l interfaceC12932lSmaato = AbstractC14425l.smaato(interfaceC2262l, interfaceC12932l);
        C7504l c8297l = i == 2 ? new C8297l(interfaceC12932lSmaato, function2) : new C7504l(interfaceC12932lSmaato, true);
        c8297l.m3751l(i, c8297l, function2);
        return c8297l;
    }

    public static /* synthetic */ C11268l crashlytics(int i, InterfaceC12932l interfaceC12932l, InterfaceC2262l interfaceC2262l, Function2 function2) {
        if ((i & 1) != 0) {
            interfaceC12932l = C17218l.f33421l;
        }
        return loadAd((i & 2) != 0 ? 1 : 4, interfaceC12932l, interfaceC2262l, function2);
    }

    public static final Object firebase(InterfaceC12932l interfaceC12932l, Function2 function2, InterfaceC14029l interfaceC14029l) throws Throwable {
        InterfaceC12932l interfaceC12932lMetrica = interfaceC14029l.metrica();
        InterfaceC12932l interfaceC12932lMo246l = !((Boolean) interfaceC12932l.mo247l(Boolean.FALSE, new C8337l(29))).booleanValue() ? interfaceC12932lMetrica.mo246l(interfaceC12932l) : AbstractC14425l.loadAd(interfaceC12932lMetrica, interfaceC12932l, false);
        AbstractC11174l.billing(interfaceC12932lMo246l);
        if (interfaceC12932lMo246l == interfaceC12932lMetrica) {
            C14274l c14274l = new C14274l(interfaceC14029l, interfaceC12932lMo246l);
            return AbstractC1163l.billing(c14274l, true, c14274l, function2);
        }
        C6168l c6168l = C6168l.f13001l;
        if (AbstractC8576l.yandex(interfaceC12932lMo246l.mo245l(c6168l), interfaceC12932lMetrica.mo245l(c6168l))) {
            C13887l c13887l = new C13887l(interfaceC14029l, interfaceC12932lMo246l);
            InterfaceC12932l interfaceC12932l2 = c13887l.f26857l;
            Object objLoadAd = AbstractC7999l.loadAd(interfaceC12932l2, null);
            try {
                return AbstractC1163l.billing(c13887l, true, c13887l, function2);
            } finally {
                AbstractC7999l.yandex(interfaceC12932l2, objLoadAd);
            }
        }
        C5971l c5971l = new C5971l(interfaceC14029l, interfaceC12932lMo246l);
        try {
            AbstractC9853l.yandex(AbstractC17082l.billing(AbstractC17082l.yandex(c5971l, c5971l, function2)), Unit.INSTANCE);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5971l.f12574l;
            do {
                int i = atomicIntegerFieldUpdater.get(c5971l);
                if (i != 0) {
                    if (i != 2) {
                        C8339l.smaato("Already suspended");
                        return null;
                    }
                    Object objYandex = AbstractC7114l.yandex(C14750l.f28822l.get(c5971l));
                    if (objYandex instanceof C2175l) {
                        throw ((C2175l) objYandex).yandex;
                    }
                    return objYandex;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c5971l, 0, 1));
            return EnumC9342l.f19165l;
        } catch (Throwable th) {
            AbstractC17764l.crashlytics(c5971l, th);
            throw null;
        }
    }

    public static final C11268l loadAd(int i, InterfaceC12932l interfaceC12932l, InterfaceC2262l interfaceC2262l, Function2 function2) {
        InterfaceC12932l interfaceC12932lSmaato = AbstractC14425l.smaato(interfaceC2262l, interfaceC12932l);
        C11268l c9167l = i == 2 ? new C9167l(interfaceC12932lSmaato, function2) : new C11268l(interfaceC12932lSmaato, true);
        c9167l.m3751l(i, c9167l, function2);
        return c9167l;
    }

    public static /* synthetic */ C7504l mopub(InterfaceC2262l interfaceC2262l, InterfaceC12932l interfaceC12932l, int i, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC12932l = C17218l.f33421l;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return billing(i, interfaceC12932l, interfaceC2262l, function2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x002e  */
    public static int purchase(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 6;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case 23:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i = 6;
                    break;
                case 22:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i = 4;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i = 0;
                    break;
            }
        }
        if (i2 >= 30) {
            i3 = i;
        } else if (i == 12) {
            i3 = 1;
        } else if (i != 13) {
            if (i == 16) {
                i3 = 1;
            } else if (i != 17) {
                i3 = i;
            } else {
                i3 = 0;
            }
        }
        if (i2 >= 27 || !(i3 == 7 || i3 == 8 || i3 == 9)) {
            return i3;
        }
        return -1;
    }

    public static final Object subs(InterfaceC12932l interfaceC12932l, Function2 function2) throws Throwable {
        AbstractC14868l abstractC14868lYandex;
        InterfaceC12932l interfaceC12932lLoadAd;
        long jMo3213l;
        InterfaceC15446l interfaceC15446l = C6168l.f13001l;
        InterfaceC0273l interfaceC0273l = (InterfaceC0273l) interfaceC12932l.mo245l(interfaceC15446l);
        C17218l c17218l = C17218l.f33421l;
        if (interfaceC0273l == null) {
            abstractC14868lYandex = AbstractC12706l.yandex();
            interfaceC12932lLoadAd = AbstractC14425l.loadAd(c17218l, interfaceC12932l.mo246l(abstractC14868lYandex), true);
            C16552l c16552l = AbstractC11463l.yandex;
            if (interfaceC12932lLoadAd != c16552l && interfaceC12932lLoadAd.mo245l(interfaceC15446l) == null) {
                interfaceC12932lLoadAd = interfaceC12932lLoadAd.mo246l(c16552l);
            }
        } else {
            abstractC14868lYandex = (AbstractC14868l) AbstractC12706l.yandex.get();
            interfaceC12932lLoadAd = AbstractC14425l.loadAd(c17218l, interfaceC12932l, true);
            C16552l c16552l2 = AbstractC11463l.yandex;
            if (interfaceC12932lLoadAd != c16552l2 && interfaceC12932lLoadAd.mo245l(interfaceC15446l) == null) {
                interfaceC12932lLoadAd = interfaceC12932lLoadAd.mo246l(c16552l2);
            }
        }
        C17903l c17903l = new C17903l(interfaceC12932lLoadAd, Thread.currentThread(), abstractC14868lYandex);
        c17903l.m3751l(1, c17903l, function2);
        AbstractC14868l abstractC14868l = c17903l.f34856l;
        if (abstractC14868l != null) {
            int i = AbstractC14868l.f29098l;
            abstractC14868l.m3898l(false);
        }
        while (true) {
            if (abstractC14868l != null) {
                try {
                    jMo3213l = abstractC14868l.mo3213l();
                } catch (Throwable th) {
                    if (abstractC14868l != null) {
                        int i2 = AbstractC14868l.f29098l;
                        abstractC14868l.m3900l(false);
                    }
                    throw th;
                }
            } else {
                jMo3213l = Long.MAX_VALUE;
            }
            if (c17903l.mo2155l()) {
                break;
            }
            LockSupport.parkNanos(c17903l, jMo3213l);
            if (Thread.interrupted()) {
                c17903l.pro(new InterruptedException());
            }
        }
        if (abstractC14868l != null) {
            int i3 = AbstractC14868l.f29098l;
            abstractC14868l.m3900l(false);
        }
        Object objYandex = AbstractC7114l.yandex(C14750l.f28822l.get(c17903l));
        C2175l c2175l = objYandex instanceof C2175l ? (C2175l) objYandex : null;
        if (c2175l == null) {
            return objYandex;
        }
        throw c2175l.yandex;
    }

    public static /* synthetic */ void yandex(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
