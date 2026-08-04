package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lُٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17044l {
    public final C9667l admob;
    public final long amazon;
    public C10023l billing;
    public final C2494l crashlytics;
    public final C0662l firebase;
    public final C0662l isPro;
    public final C16557l loadAd;
    public final C0554l metrica;
    public C17503l mopub;
    public C10023l purchase;
    public final C5976l remoteconfig;
    public final C7747l smaato;
    public final C12714l subs;
    public final C10685l vip;
    public final Context yandex;

    public C17044l(C14184l c14184l, C9667l c9667l, C5976l c5976l, C16557l c16557l, C0662l c0662l, C0662l c0662l2, C12714l c12714l, C7747l c7747l, C10685l c10685l, C0554l c0554l) {
        this.loadAd = c16557l;
        c14184l.yandex();
        this.yandex = c14184l.yandex;
        this.admob = c9667l;
        this.remoteconfig = c5976l;
        this.isPro = c0662l;
        this.firebase = c0662l2;
        this.subs = c12714l;
        this.smaato = c7747l;
        this.vip = c10685l;
        this.metrica = c0554l;
        this.amazon = System.currentTimeMillis();
        this.crashlytics = new C2494l(10);
    }

    public final void crashlytics() {
        C0554l.license();
        try {
            C10023l c10023l = this.purchase;
            C12714l c12714l = (C12714l) c10023l.f20418l;
            String str = (String) c10023l.f20419l;
            c12714l.getClass();
            if (new File((File) c12714l.f25072l, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public final void loadAd(C7644l c7644l) {
        Future<?> futureSubmit = ((ExecutorC4850l) this.metrica.f1958l).f9906l.submit(new RunnableC14824l(this, c7644l, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void yandex(C7644l c7644l) {
        C0554l.license();
        C0554l.license();
        this.purchase.license();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.isPro.yandex(new C3323l(this));
                this.mopub.mopub();
                if (!c7644l.firebase().loadAd.loadAd) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.mopub.amazon(c7644l)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.mopub.admob(((C2350l) ((AtomicReference) c7644l.f15741l).get()).yandex);
                crashlytics();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                crashlytics();
            }
        } catch (Throwable th) {
            crashlytics();
            throw th;
        }
    }
}
