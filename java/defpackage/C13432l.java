package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lْْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13432l {
    public static C13432l firebase;
    public static final Object remoteconfig;
    public static C13432l smaato;
    public boolean admob = false;
    public final C3307l amazon;
    public final C5648l billing;
    public final WorkDatabase crashlytics;
    public final C13312l isPro;
    public final C12211l loadAd;
    public final C15053l mopub;
    public final List purchase;
    public BroadcastReceiver.PendingResult subs;
    public final Context yandex;

    static {
        C14513l.applovin("WorkManagerImpl");
        firebase = null;
        smaato = null;
        remoteconfig = new Object();
    }

    public C13432l(Context context, final C12211l c12211l, C3307l c3307l, final WorkDatabase workDatabase, final List list, C5648l c5648l, C13312l c13312l) {
        byte b = 0;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && AbstractC11965l.adcel(applicationContext)) {
            C8339l.smaato("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        C14513l c14513l = new C14513l(c12211l.admob, 1, b);
        synchronized (C14513l.f28390l) {
            try {
                if (C14513l.f28389l == null) {
                    C14513l.f28389l = c14513l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.yandex = applicationContext;
        this.amazon = c3307l;
        this.crashlytics = workDatabase;
        this.billing = c5648l;
        this.isPro = c13312l;
        this.loadAd = c12211l;
        this.purchase = list;
        C18662l c18662lYandex = AbstractC11990l.yandex(c3307l.loadAd);
        this.mopub = new C15053l(workDatabase);
        final ExecutorC8064l executorC8064l = c3307l.yandex;
        String str = AbstractC3387l.yandex;
        c5648l.yandex(new InterfaceC18230l() { // from class: lؗۛۢ
            @Override // defpackage.InterfaceC18230l
            public final void loadAd(C0350l c0350l, boolean z) {
                executorC8064l.execute(new RunnableC4063l(list, c0350l, c12211l, workDatabase, 18));
            }
        });
        c3307l.yandex.execute(new RunnableC2590l(applicationContext, this));
        String str2 = AbstractC15047l.yandex;
        if (AbstractC12901l.yandex(applicationContext)) {
            AbstractC15781l abstractC15781l = workDatabase.Signature().yandex;
            String[] strArr = {"workspec"};
            C8125l c8125l = new C8125l(17);
            C15813l c15813l = abstractC15781l.purchase;
            InterfaceC14029l interfaceC14029l = null;
            c15813l = c15813l == null ? null : c15813l;
            int i = 1;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            C17274l c17274l = c15813l.crashlytics;
            C8195l c8195lIsPro = c17274l.isPro(strArr2);
            String[] strArr3 = (String[]) c8195lIsPro.f17098l;
            InterfaceC6942l c14970l = new C14970l(8, new C8036l(c17274l, (int[]) c8195lIsPro.f17097l, strArr3, interfaceC14029l, 12));
            C12158l c12158l = c15813l.subs;
            int i2 = 4;
            C2606l c2606l = c12158l != null ? new C2606l((C8490l) c12158l.subs, strArr3, i2) : null;
            int i3 = 2;
            if (c2606l != null) {
                InterfaceC6942l[] interfaceC6942lArr = {c14970l, c2606l};
                int i4 = AbstractC16600l.yandex;
                c14970l = new C1274l(new C14297l(0, interfaceC6942lArr), C17218l.f33421l, -2, i, 1);
            }
            AbstractC0622l.startapp(new C2347l(AbstractC0622l.isPro(AbstractC0622l.loadAd(new C2606l(new C8766l(AbstractC0622l.loadAd(c14970l, -1), abstractC15781l, c8125l, i3), new C14011l(4, null), b), -1)), new C14047l(applicationContext, interfaceC14029l, i2), i3), c18662lYandex);
        }
    }

    public static C13432l crashlytics(Context context) {
        C13432l c13432lLoadAd;
        synchronized (remoteconfig) {
            try {
                c13432lLoadAd = loadAd();
                if (c13432lLoadAd == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c13432lLoadAd;
    }

    public static C13432l loadAd() {
        synchronized (remoteconfig) {
            try {
                C13432l c13432l = firebase;
                if (c13432l != null) {
                    return c13432l;
                }
                return smaato;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void amazon() {
        synchronized (remoteconfig) {
            try {
                this.admob = true;
                BroadcastReceiver.PendingResult pendingResult = this.subs;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.subs = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void purchase() throws Throwable {
        C15617l c15617l = this.loadAd.remoteconfig;
        C13932l c13932l = new C13932l(15, this);
        boolean zAdmob = AbstractC15011l.admob();
        if (zAdmob) {
            try {
                Trace.beginSection("ReschedulingWork");
            } finally {
                if (zAdmob) {
                    Trace.endSection();
                }
            }
        }
        c13932l.invoke();
    }

    public final void yandex(C9335l c9335l) {
        List listSingletonList = Collections.singletonList(c9335l);
        if (listSingletonList.isEmpty()) {
            C8339l.metrica("enqueue needs at least one WorkRequest.");
        } else {
            new C5934l(this, null, 2, listSingletonList).yandex();
        }
    }
}
