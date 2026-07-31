package defpackage;

import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؙؚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6665l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14016l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14017l;

    public /* synthetic */ RunnableC6665l(int i, Object obj) {
        this.f14017l = i;
        this.f14016l = obj;
    }

    private final void yandex() {
        C11919l c11919l = (C11919l) this.f14016l;
        Map mapYandex = null;
        ((AtomicReference) c11919l.f23767l).set(null);
        synchronized (c11919l) {
            try {
                if (((AtomicMarkableReference) c11919l.f23763l).isMarked()) {
                    mapYandex = ((C11787l) ((AtomicMarkableReference) c11919l.f23763l).getReference()).yandex();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c11919l.f23763l;
                    atomicMarkableReference.set((C11787l) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapYandex != null) {
            C6472l c6472l = (C6472l) c11919l.f23766l;
            ((C16532l) c6472l.f13512l).admob((String) c6472l.f13515l, mapYandex, c11919l.f23764l);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        View viewFindFocus;
        Boolean bool = null;
        switch (this.f14017l) {
            case 0:
                C5659l.setRippleState$lambda$1((C5659l) this.f14016l);
                return;
            case 1:
                ((C13904l) this.f14016l).admob();
                return;
            case 2:
                C3557l c3557l = (C3557l) this.f14016l;
                synchronized (((ArrayDeque) c3557l.f7482l)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) c3557l.f7480l).edit();
                    String str = (String) c3557l.f7479l;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) c3557l.f7482l).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) c3557l.f7478l);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
            case 3:
                C8662l c8662l = (C8662l) this.f14016l;
                c8662l.crashlytics = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c8662l.purchase;
                C0213l c0213l = sideSheetBehavior.subs;
                if (c0213l != null && c0213l.billing()) {
                    c8662l.loadAd(c8662l.loadAd);
                    return;
                } else {
                    if (sideSheetBehavior.admob == 2) {
                        sideSheetBehavior.subscription(c8662l.loadAd);
                        return;
                    }
                    return;
                }
            case 4:
                C1080l c1080l = (C1080l) ((C13773l) this.f14016l).loadAd;
                C13773l c13773l = (C13773l) c1080l.f2971l;
                C1080l c1080l2 = (C1080l) c1080l.f2974l;
                if (c13773l == null) {
                    return;
                }
                c1080l2.m787catch(c1080l.startapp(((C12551l) c1080l2.tapsense()).yandex));
                return;
            case 5:
                C0376l c0376l = (C0376l) ((C10038l) this.f14016l).f20466l;
                if (c0376l != null) {
                    Iterator it2 = c0376l.values().iterator();
                    while (it2.hasNext()) {
                        ((C3716l) it2.next()).crashlytics();
                    }
                    return;
                }
                return;
            case 6:
                ((C17706l) this.f14016l).yandex();
                return;
            case 7:
                ((C12656l) this.f14016l).smaato();
                return;
            case 8:
                ((C11108l) this.f14016l).crashlytics();
                return;
            case 9:
                ((TextInputLayout) this.f14016l).f731l.requestLayout();
                return;
            case 10:
                C8483l c8483l = (C8483l) this.f14016l;
                C10111l c10111l = c8483l.loadAd;
                c8483l.vip = null;
                C17893l c17893l = c8483l.remoteconfig;
                View view = c8483l.yandex;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    c17893l.isPro();
                    return;
                }
                Object[] objArr = c17893l.f34848l;
                int i = c17893l.f34846l;
                Boolean boolValueOf = null;
                for (int i2 = 0; i2 < i; i2++) {
                    EnumC11723l enumC11723l = (EnumC11723l) objArr[i2];
                    int iOrdinal = enumC11723l.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            C18725l.billing();
                            return;
                        } else if (!AbstractC8576l.yandex(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(enumC11723l == EnumC11723l.f23458l);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                c17893l.isPro();
                if (AbstractC8576l.yandex(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((InterfaceC1220l) c10111l.f20586l).getValue()).restartInput((View) c10111l.f20587l);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((C3585l) ((C1770l) c10111l.f20589l).f4179l).mo1357strictfp();
                    } else {
                        ((C3585l) ((C1770l) c10111l.f20589l).f4179l).advert();
                    }
                }
                if (AbstractC8576l.yandex(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((InterfaceC1220l) c10111l.f20586l).getValue()).restartInput((View) c10111l.f20587l);
                    return;
                }
                return;
            case 11:
                ArrayList arrayList = (ArrayList) this.f14016l;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((ExecutorService) it3.next()).shutdownNow();
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((ExecutorService) it4.next()).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
            case 12:
                HandlerThread handlerThread = (HandlerThread) this.f14016l;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
            case 13:
                ExecutorService executorService = (ExecutorService) this.f14016l;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case 14:
                yandex();
                return;
            case 15:
                ((C10418l) this.f14016l).adcel();
                return;
            case 16:
                ((C5807l) ((C12158l) this.f14016l).isPro).loadAd(null);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ChoreographerVsyncCallbackC16680l choreographerVsyncCallbackC16680l = (ChoreographerVsyncCallbackC16680l) this.f14016l;
                choreographerVsyncCallbackC16680l.f31554l.postVsyncCallback(choreographerVsyncCallbackC16680l);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C5744l c5744l = (C5744l) this.f14016l;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + c5744l.yandex.getAction() + " finishing.");
                c5744l.loadAd.amazon(null);
                return;
            default:
                C1381l c1381l = (C1381l) this.f14016l;
                ((C16163l) c1381l.f3514l).ads(new C4568l(20, c1381l));
                return;
        }
    }
}
