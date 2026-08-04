package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lٓٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14138l implements Handler.Callback {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static C14138l f27637l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final HandlerC4052l f27638l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C12798l f27639l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C0848l f27640l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final AtomicInteger f27641l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f27642l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f27643l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final ConcurrentHashMap f27644l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Context f27645l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7560l f27646l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C10834l f27647l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final AtomicInteger f27648l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C7181l f27649l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C10834l f27650l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public volatile boolean f27651l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final Status f27636l = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final Status f27634l = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final Object f27635l = new Object();

    public C14138l(Context context, Looper looper) {
        C7181l c7181l = C7181l.purchase;
        this.f27643l = 10000L;
        this.f27642l = false;
        this.f27641l = new AtomicInteger(1);
        this.f27648l = new AtomicInteger(0);
        this.f27644l = new ConcurrentHashMap(5, 0.75f, 1);
        this.f27650l = new C10834l(0);
        this.f27647l = new C10834l(0);
        this.f27651l = true;
        this.f27645l = context;
        HandlerC4052l handlerC4052l = new HandlerC4052l(looper, this);
        Looper.getMainLooper();
        this.f27638l = handlerC4052l;
        this.f27649l = c7181l;
        this.f27640l = new C0848l(5);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC7572l.smaato == null) {
            AbstractC7572l.smaato = Boolean.valueOf(AbstractC12300l.subs() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC7572l.smaato.booleanValue()) {
            this.f27651l = false;
        }
        handlerC4052l.sendMessage(handlerC4052l.obtainMessage(6));
    }

    public static C14138l amazon(Context context) {
        C14138l c14138l;
        synchronized (f27635l) {
            try {
                if (f27637l == null) {
                    Looper looper = C13304l.loadAd().getLooper();
                    context.getPackageName();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C7181l.amazon;
                    C14138l c14138l2 = new C14138l(applicationContext, looper);
                    AbstractC18433l.premium = ExecutorC10149l.yandex(c14138l2.f27645l);
                    f27637l = c14138l2;
                }
                c14138l = f27637l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14138l;
    }

    public static Status crashlytics(C7800l c7800l, C10602l c10602l) {
        String str = (String) c7800l.loadAd.f7902l;
        String strValueOf = String.valueOf(c10602l);
        return new Status(17, AbstractC9361l.advert(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), c10602l.f21519l, c10602l);
    }

    public final boolean billing(C10602l c10602l, int i) {
        PendingIntent activity;
        int i2 = c10602l.f21520l;
        C7181l c7181l = this.f27649l;
        c7181l.getClass();
        if (i2 != 9) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    switch (i2) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                            break;
                        default:
                            Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(c10602l)));
                            return false;
                    }
                    break;
            }
        }
        Context context = this.f27645l;
        if (!AbstractC5941l.m1899package(context)) {
            int i3 = c10602l.f21520l;
            if (i3 == 0 || (activity = c10602l.f21519l) == null) {
                activity = null;
                Intent intentLoadAd = c7181l.loadAd(i3, context, null);
                if (intentLoadAd != null) {
                    activity = PendingIntent.getActivity(context, 0, intentLoadAd, 201326592);
                }
            }
            if (activity != null) {
                int i4 = c10602l.f21520l;
                int i5 = GoogleApiActivity.f575l;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                c7181l.admob(context, new C10602l(1, i4, PendingIntent.getActivity(context, 0, intent, AbstractC11073l.yandex | 134217728), c10602l.f21523l, c10602l.f21522l));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0300  */
    /* JADX WARN: Code duplicated, block: B:152:0x0306  */
    /* JADX WARN: Code duplicated, block: B:154:0x0338  */
    /* JADX WARN: Code duplicated, block: B:156:0x0342  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 l￘ﾕￛﾢ￘ﾕ, still in use, count: 2, list:
          (r2v11 l￘ﾕￛﾢ￘ﾕ) from 0x02f8: IGET (r2v11 l￘ﾕￛﾢ￘ﾕ) A[WRAPPED] (LINE:761) l￘ﾕￛﾢ￘ﾕ.firebase int
          (r2v11 l￘ﾕￛﾢ￘ﾕ) from 0x02fe: PHI (r2 I:??) = (r2v8 l￘ﾕￛﾢ￘ﾕ), (r2v11 l￘ﾕￛﾢ￘ﾕ) binds: [B:148:0x02fd, B:202:0x02fe] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14138l.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public final void loadAd(C2350l c2350l, int i, AbstractC4416l abstractC4416l) {
        C14292l c14292l;
        C14138l c14138l;
        if (i != 0) {
            C7800l c7800l = abstractC4416l.billing;
            if (purchase()) {
                C11361l c11361l = (C11361l) C15053l.vip().f29576l;
                boolean z = true;
                if (c11361l != null) {
                    if (c11361l.f22908l) {
                        boolean z2 = c11361l.f22907l;
                        C3714l c3714l = (C3714l) this.f27644l.get(c7800l);
                        if (c3714l != null) {
                            Object obj = c3714l.billing;
                            if (obj instanceof AbstractC4620l) {
                                AbstractC4620l abstractC4620l = (AbstractC4620l) obj;
                                if (abstractC4620l.ad == null || abstractC4620l.tapsense()) {
                                    z = z2;
                                } else {
                                    C16526l c16526lYandex = C14292l.yandex(c3714l, abstractC4620l, i);
                                    if (c16526lYandex != null) {
                                        c3714l.startapp++;
                                        z = c16526lYandex.f32296l;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    c14292l = null;
                    c14138l = this;
                }
                c14138l = this;
                c14292l = new C14292l(c14138l, i, c7800l, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                c14292l = null;
                c14138l = this;
            }
            if (c14292l != null) {
                C3823l c3823l = c2350l.yandex;
                HandlerC4052l handlerC4052l = c14138l.f27638l;
                Objects.requireNonNull(handlerC4052l);
                c3823l.loadAd(new ExecutorC10608l(handlerC4052l, 2), c14292l);
            }
        }
    }

    public final void mopub(C10602l c10602l, int i) {
        if (billing(c10602l, i)) {
            return;
        }
        HandlerC4052l handlerC4052l = this.f27638l;
        handlerC4052l.sendMessage(handlerC4052l.obtainMessage(5, i, 0, c10602l));
    }

    public final boolean purchase() {
        if (this.f27642l) {
            return false;
        }
        C11361l c11361l = (C11361l) C15053l.vip().f29576l;
        if (c11361l != null && !c11361l.f22908l) {
            return false;
        }
        int iAdmob = this.f27640l.admob(203400000);
        return iAdmob == -1 || iAdmob == 0;
    }

    public final C3714l yandex(AbstractC4416l abstractC4416l) {
        C7800l c7800l = abstractC4416l.billing;
        ConcurrentHashMap concurrentHashMap = this.f27644l;
        C3714l c3714l = (C3714l) concurrentHashMap.get(c7800l);
        if (c3714l == null) {
            c3714l = new C3714l(this, abstractC4416l);
            concurrentHashMap.put(c7800l, c3714l);
        }
        if (c3714l.billing.crashlytics()) {
            this.f27647l.add(c7800l);
        }
        c3714l.ads();
        return c3714l;
    }
}
