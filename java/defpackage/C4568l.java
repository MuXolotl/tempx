package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4568l implements InterfaceC15953l, InterfaceC5877l, InterfaceC14342l, InterfaceC18679l, InterfaceC11185l, InterfaceC12350l, InterfaceC1953l, InterfaceC7456l, InterfaceC0015l, InterfaceC10162l, InterfaceC12833l, InterfaceC5755l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9268l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9269l;

    public /* synthetic */ C4568l(C10418l c10418l, C16774l c16774l) {
        this.f9269l = 13;
        this.f9268l = c16774l;
    }

    private final void amazon() {
        C3005l c3005l = (C3005l) this.f9268l;
        synchronized (AbstractC9620l.crashlytics) {
            AbstractC9620l.subs = AbstractC16901l.m4225interface(AbstractC9620l.subs, c3005l);
            Unit unit = Unit.INSTANCE;
        }
        AbstractC9620l.yandex();
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        int i = this.f9269l;
        Object obj2 = this.f9268l;
        switch (i) {
            case 6:
                C4880l c4880l = (C4880l) obj2;
                C8755l c8755l = (C8755l) obj;
                C11828l c11828l = new C11828l(c8755l.loadAd, C11140l.smaato(c8755l.yandex, c8755l.crashlytics));
                c4880l.crashlytics.add(c11828l);
                long j = c4880l.isPro;
                if (j == -9223372036854775807L || c8755l.amazon >= j) {
                    c4880l.mopub(c11828l);
                }
                break;
            default:
                ((C16971l) obj2).crashlytics((C8755l) obj);
                break;
        }
    }

    @Override // defpackage.InterfaceC0015l
    /* JADX INFO: renamed from: apply */
    public String mo2021apply(Object obj) {
        return (String) ((C0114l) this.f9268l).get(obj);
    }

    @Override // defpackage.InterfaceC15953l
    public void billing(long j, C13143l c13143l) {
        int i = this.f9269l;
        C3250l c3250l = (C3250l) this.f9268l;
        switch (i) {
            case 1:
                AbstractC0441l.loadAd(j, c13143l, c3250l.crashlytics);
                break;
            default:
                AbstractC0441l.crashlytics(j, c13143l, c3250l.crashlytics);
                break;
        }
    }

    public void crashlytics() {
        switch (this.f9269l) {
            case 3:
                amazon();
                return;
            default:
                Function2 function2 = (Function2) this.f9268l;
                synchronized (AbstractC9620l.crashlytics) {
                    AbstractC9620l.admob = AbstractC16901l.m4225interface(AbstractC9620l.admob, function2);
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        C16774l c16774l = (C16774l) this.f9268l;
        ((C12815l) c16774l.loadAd.f19554l).yandex.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c5807l.hashCode()));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C3720l c3720l = new C3720l(atomicBoolean, c5807l, c16774l);
        c5807l.yandex(new RunnableC15278l(atomicBoolean, c16774l, c3720l, 10), AbstractC12272l.yandex());
        c16774l.loadAd.tapsense(c3720l);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c5807l.hashCode()));
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public C1473l mo404implements(View view, C1473l c1473l) {
        C5897l c5897l = (C5897l) this.f9268l;
        C17212l c17212l = c1473l.yandex;
        AbstractC5852l.yandex = c17212l.subs(1).loadAd;
        AbstractC5852l.loadAd = c17212l.subs(2).amazon;
        AbstractC5852l.crashlytics = Math.max(c17212l.subs(2).yandex, c17212l.subs(128).yandex);
        AbstractC5852l.amazon = Math.max(c17212l.subs(2).crashlytics, c17212l.subs(128).crashlytics);
        c5897l.invoke(c1473l);
        return c1473l;
    }

    @Override // defpackage.InterfaceC11185l
    public void loadAd(float f) {
        ((InterfaceC7523l) this.f9268l).yandex(f);
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        int i = this.f9269l;
        Object obj = this.f9268l;
        switch (i) {
            case 16:
                AbstractC3105l.loadAd((Intent) obj);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C5744l) obj).loadAd.amazon(null);
                break;
        }
    }

    @Override // defpackage.InterfaceC12350l
    public Object purchase() {
        int i = this.f9269l;
        Object obj = this.f9268l;
        switch (i) {
            case 9:
                C16163l c16163l = (C16163l) ((C7644l) obj).f15741l;
                SQLiteDatabase sQLiteDatabaseYandex = c16163l.yandex();
                sQLiteDatabaseYandex.beginTransaction();
                try {
                    sQLiteDatabaseYandex.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseYandex.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c16163l.f31659l.admob()).execute();
                    sQLiteDatabaseYandex.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseYandex.endTransaction();
                }
            default:
                C1381l c1381l = (C1381l) obj;
                Iterator it = ((Iterable) ((C16163l) c1381l.f3512l).mopub(new C11983l())).iterator();
                while (it.hasNext()) {
                    ((C10111l) c1381l.f3511l).m2883strictfp((C4330l) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        ((CountDownLatch) this.f9268l).countDown();
        return null;
    }

    @Override // defpackage.InterfaceC5755l
    public void subs(InterfaceC12679l interfaceC12679l) {
        C16424l c16424l = (C16424l) this.f9268l;
        try {
            InterfaceC11792l interfaceC11792lSmaato = interfaceC12679l.smaato();
            if (interfaceC11792lSmaato != null) {
                c16424l.crashlytics.m1836super(interfaceC11792lSmaato);
            }
        } catch (IllegalStateException unused) {
            if (AbstractC5088l.smaato()) {
                Log.e("CXCP", "Failed to acquire latest image");
            }
        }
    }

    @Override // defpackage.InterfaceC14342l
    public void yandex(Object obj, Object obj2) {
        C1080l c1080l = (C1080l) this.f9268l;
        C12551l c12551l = (C12551l) obj;
        C12551l c12551l2 = (C12551l) obj2;
        SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c1080l.f2975l;
        boolean z = c12551l.crashlytics;
        int i = c12551l.loadAd;
        if (!z && c12551l2.crashlytics) {
            c1080l.f2972l = i;
        }
        int i2 = c12551l2.loadAd;
        boolean z2 = c12551l2.crashlytics;
        if (i != i2 || z != z2) {
            surfaceHolderCallbackC18330l.yandex.f34677l.mopub(30, new C10247l(i2, z2));
        }
        if (c12551l.yandex == c12551l2.yandex && c12551l.amazon == c12551l2.amazon && c12551l.purchase == c12551l2.purchase) {
            return;
        }
        C17804l c17804l = surfaceHolderCallbackC18330l.yandex;
        C1080l c1080l2 = c17804l.f34721l;
        C12676l c12676l = new C12676l(0);
        c12676l.crashlytics = c1080l2 != null ? ((C12551l) ((C1080l) c1080l2.f2974l).tapsense()).amazon : 0;
        c12676l.amazon = c1080l2 != null ? ((C12551l) ((C1080l) c1080l2.f2974l).tapsense()).purchase : 0;
        C2848l c2848lPurchase = c12676l.purchase();
        if (c2848lPurchase.equals(c17804l.f34684l)) {
            return;
        }
        c17804l.f34684l = c2848lPurchase;
        c17804l.f34677l.mopub(29, new C2683l(28, c2848lPurchase));
    }

    public /* synthetic */ C4568l(C8961l c8961l, ServiceConnectionC2783l serviceConnectionC2783l) {
        this.f9269l = 0;
        this.f9268l = c8961l;
    }

    public /* synthetic */ C4568l(int i, Object obj) {
        this.f9269l = i;
        this.f9268l = obj;
    }
}
