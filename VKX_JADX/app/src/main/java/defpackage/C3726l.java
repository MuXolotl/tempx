package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Unit;

/* JADX INFO: renamed from: lؕۢۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3726l {
    public final PendingIntent Signature;
    public ServiceC16415l ad;
    public final boolean adcel;
    public final C13350l admob;
    public final AbstractC1186l ads;
    public boolean advert;
    public final HandlerC0341l amazon;
    public final AbstractC1186l applovin;
    public final Bundle appmetrica;
    public final Context billing;
    public final HandlerC11256l crashlytics;
    public final C13572l firebase;
    public final C13572l inmobi;
    public final C12962l isPro;
    public final long isVip;
    public C9755l license;
    public final Uri loadAd;
    public final Handler metrica;
    public final BinderC4841l mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C2497l f7785package;
    public AbstractC1186l premium;
    public C7026l pro;
    public final C15035l purchase;
    public final InterfaceC9474l remoteconfig;
    public boolean signatures;
    public final Handler smaato;
    public final boolean startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final int f7786strictfp;
    public final String subs;
    public C1908l subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C2497l f7787synchronized;
    public C18602l tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C15035l f7788throws;
    public final RunnableC0128l vip;
    public final Object yandex = new Object();

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final C5159l f7784volatile = new C5159l(1);

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final InterfaceC11766l f7783native = AbstractC15788l.purchase(new C0120l(4));

    public C3726l(C13572l c13572l, Context context, String str, InterfaceC9814l interfaceC9814l, PendingIntent pendingIntent, AbstractC1186l abstractC1186l, AbstractC1186l abstractC1186l2, AbstractC1186l abstractC1186l3, C15035l c15035l, Bundle bundle, Bundle bundle2, InterfaceC9474l interfaceC9474l, boolean z, boolean z2, int i) {
        AbstractC6427l.firebase("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + AbstractC15323l.yandex + "]");
        this.firebase = c13572l;
        this.billing = context;
        this.subs = str;
        this.Signature = pendingIntent;
        this.premium = abstractC1186l;
        this.applovin = abstractC1186l2;
        this.ads = abstractC1186l3;
        this.purchase = c15035l;
        this.appmetrica = bundle2;
        this.remoteconfig = interfaceC9474l;
        this.startapp = z;
        this.adcel = z2;
        BinderC4841l binderC4841l = new BinderC4841l(this);
        this.mopub = binderC4841l;
        this.metrica = new Handler(Looper.getMainLooper());
        Looper looperMo2780l = interfaceC9814l.mo2780l();
        Handler handler = new Handler(looperMo2780l);
        this.smaato = handler;
        this.subscription = C1908l.f4358synchronized;
        this.crashlytics = new HandlerC11256l(this, looperMo2780l);
        this.amazon = new HandlerC0341l(this, looperMo2780l);
        Uri uriPurchase = purchase(str);
        this.loadAd = uriPurchase;
        C13350l c13350l = new C13350l(this, uriPurchase, handler, bundle, z, abstractC1186l, abstractC1186l2, C3764l.purchase, C3764l.billing, bundle2);
        this.admob = c13350l;
        this.isPro = new C12962l(Process.myUid(), 1010001300, 9, context.getPackageName(), binderC4841l, bundle, ((C1139l) c13350l.vip.f1691l).crashlytics.f10328l);
        C18602l c18602l = new C18602l(interfaceC9814l);
        this.tapsense = c18602l;
        AbstractC15323l.m3966final(handler, new RunnableC12388l(this, c18602l, 18));
        this.isVip = 3000L;
        this.vip = new RunnableC0128l(this, 1);
        AbstractC15323l.m3966final(handler, new RunnableC0128l(this, 2));
        this.inmobi = c13572l;
        this.f7788throws = c15035l;
        this.f7786strictfp = i;
        this.f7785package = new C2497l();
        this.f7787synchronized = new C2497l();
    }

    public static void crashlytics(C3726l c3726l, Runnable runnable) {
        AbstractC15323l.m3966final(c3726l.smaato, runnable);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static void m1413for(int i, C9201l c9201l) {
        if (c9201l.yandex == 0) {
            AbstractC1186l abstractC1186l = (AbstractC1186l) c9201l.crashlytics;
            abstractC1186l.getClass();
            if (abstractC1186l.size() <= i) {
                return;
            }
            C18073l.subs(abstractC1186l.size(), i, ", pageSize=", "Invalid size=");
        }
    }

    public static C9201l loadAd(C17425l c17425l, C9896l c9896l) {
        AbstractC1186l abstractC1186l = c9896l.yandex;
        return abstractC1186l.isEmpty() ? new C9201l(-2, SystemClock.elapsedRealtime(), c17425l, new C18503l("no error message provided", -2, Bundle.EMPTY), null, 4) : C9201l.crashlytics(AbstractC1186l.isVip((C2427l) abstractC1186l.get(Math.max(0, Math.min(c9896l.loadAd, abstractC1186l.size() - 1)))), c17425l);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Object m1414private(Future future) {
        AbstractC12442l.subscription(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            AbstractC6427l.metrica("MediaSessionImpl", "Library operation failed", e);
            return null;
        }
    }

    public static Uri purchase(String str) {
        Uri.Builder builderAuthority = new Uri.Builder().scheme("androidx").authority("media3.session");
        if (str == null) {
            str = "";
        }
        return builderAuthority.appendPath(str).build();
    }

    public static boolean startapp(C6499l c6499l) {
        return c6499l != null && Objects.equals(c6499l.yandex.yandex.yandex, "com.android.systemui");
    }

    public static void yandex(C3726l c3726l) {
        synchronized (c3726l.yandex) {
            try {
                if (c3726l.advert) {
                    return;
                }
                C9009l c9009lM4570l = c3726l.tapsense.m4570l();
                if (!c3726l.crashlytics.hasMessages(1) && AbstractC8672l.yandex(c9009lM4570l, c3726l.subscription.crashlytics)) {
                    C12014l c12014l = c3726l.mopub.billing;
                    AbstractC1186l abstractC1186lSignature = c12014l.Signature();
                    for (int i = 0; i < abstractC1186lSignature.size(); i++) {
                        C6499l c6499l = (C6499l) abstractC1186lSignature.get(i);
                        c12014l.advert(c6499l);
                        c3726l.mopub(c6499l, new C10792l(c9009lM4570l, c12014l.m3304native(c6499l, 16), c12014l.m3304native(c6499l, 17), c6499l));
                    }
                    try {
                        c3726l.admob.isPro.adcel(0, c9009lM4570l, true, true, 0);
                    } catch (RemoteException e) {
                        AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
                c3726l.m1416native();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture Signature(C6499l c6499l, String str, int i, int i2, final C17425l c17425l) {
        boolean zEquals = Objects.equals(str, "androidx.media3.session.recent.root");
        final int i3 = 0;
        InterfaceC14029l interfaceC14029l = null;
        C15035l c15035l = this.f7788throws;
        if (!zEquals) {
            m1421volatile(c6499l);
            C8149l c8149lPurchase = AbstractC16840l.purchase(3, null, c15035l.yandex, new C16567l(c15035l, str, i, i2, c17425l, null, 0));
            c8149lPurchase.f17030l.yandex(new RunnableC7921l(this, c8149lPurchase, c6499l, i2, 0), new ExecutorC10279l(this, i3));
            return c8149lPurchase;
        }
        if (this.admob.startapp == null) {
            return AbstractC7151l.purchase(C9201l.loadAd(-6));
        }
        final int i4 = 1;
        if (this.tapsense.purchase() == 1) {
            if (this.signatures) {
                subs();
            }
            C8149l c8149lPurchase2 = AbstractC16840l.purchase(3, null, c15035l.yandex, new C11671l(c15035l, interfaceC14029l, 12));
            InterfaceC17302l interfaceC17302l = new InterfaceC17302l() { // from class: lؗٛۥ
                @Override // defpackage.InterfaceC17302l
                public final Object apply(Object obj) {
                    switch (i4) {
                        case 0:
                            AbstractC6427l.subs("MediaSessionImpl", "Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new C9201l(-1, SystemClock.elapsedRealtime(), c17425l, new C18503l("no error message provided", -1, Bundle.EMPTY), null, 4);
                        default:
                            return C3726l.loadAd(c17425l, (C9896l) obj);
                    }
                }
            };
            EnumC1535l enumC1535l = EnumC1535l.f3808l;
            return AbstractC7151l.yandex(AbstractC7151l.mopub(c8149lPurchase2, interfaceC17302l, enumC1535l), Throwable.class, new InterfaceC17302l() { // from class: lؗٛۥ
                @Override // defpackage.InterfaceC17302l
                public final Object apply(Object obj) {
                    switch (i3) {
                        case 0:
                            AbstractC6427l.subs("MediaSessionImpl", "Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new C9201l(-1, SystemClock.elapsedRealtime(), c17425l, new C18503l("no error message provided", -1, Bundle.EMPTY), null, 4);
                        default:
                            return C3726l.loadAd(c17425l, (C9896l) obj);
                    }
                }
            }, enumC1535l);
        }
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        C3117l c3117l = new C3117l();
        c3117l.ads = Boolean.FALSE;
        c3117l.subscription = Boolean.TRUE;
        return AbstractC7151l.purchase(C9201l.crashlytics(AbstractC1186l.isVip(new C2427l("androidx.media3.session.recent.item", new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l)), c17425l));
    }

    public final C8149l ad(C6499l c6499l, String str, int i, int i2, C17425l c17425l) {
        m1421volatile(c6499l);
        C15035l c15035l = this.f7788throws;
        C8149l c8149lPurchase = AbstractC16840l.purchase(3, null, c15035l.yandex, new C16567l(c15035l, str, i, i2, c17425l, null, 1));
        c8149lPurchase.f17030l.yandex(new RunnableC7921l(this, c8149lPurchase, c6499l, i2, 1), new ExecutorC10279l(this, 0));
        return c8149lPurchase;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    public final void adcel(C6499l c6499l, C9201l c9201l) {
        int i = this.f7786strictfp;
        if (i == 0 || c6499l.loadAd != 0) {
            return;
        }
        int i2 = c9201l.yandex;
        C13350l c13350l = this.admob;
        if (i2 == -102 || i2 == -105) {
            boolean z = i == 1;
            c13350l.getClass();
            C17425l c17425l = c9201l.purchase;
            C18503l c18503l = c9201l.billing;
            int iMopub = AbstractC18585l.mopub(i2);
            C8662l c8662l = c13350l.license;
            if (c8662l == null || c8662l.loadAd != iMopub) {
                String str = c18503l != null ? c18503l.loadAd : "no error message provided";
                Bundle bundle = Bundle.EMPTY;
                if (c17425l != null) {
                    Bundle bundle2 = c17425l.yandex;
                    if (bundle2.containsKey("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT")) {
                        bundle = bundle2;
                    } else if (c18503l != null) {
                        bundle = c18503l.crashlytics;
                    }
                } else if (c18503l != null) {
                    bundle = c18503l.crashlytics;
                }
                c13350l.license = new C8662l(z, iMopub, str, bundle);
                c13350l.m3637instanceof(c13350l.admob.tapsense);
            }
        }
        if (i2 != 0 || c13350l.license == null) {
            return;
        }
        c13350l.license = null;
        c13350l.m3637instanceof(c13350l.admob.tapsense);
    }

    public final void admob(InterfaceC0945l interfaceC0945l) {
        AbstractC1186l abstractC1186lSignature = this.mopub.billing.Signature();
        for (int i = 0; i < abstractC1186lSignature.size(); i++) {
            mopub((C6499l) abstractC1186lSignature.get(i), interfaceC0945l);
        }
        try {
            interfaceC0945l.mopub(this.admob.isPro, 0);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final ListenableFuture ads(C6499l c6499l, List list) {
        m1421volatile(c6499l);
        C15035l c15035l = this.purchase;
        C8149l c8149lPurchase = AbstractC16840l.purchase(2, AbstractC11463l.yandex, c15035l.yandex, new C0932l(c15035l, list, null, 11));
        AbstractC12442l.metrica(c8149lPurchase, "Callback.onAddMediaItems must return a non-null future");
        return c8149lPurchase;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    public final boolean advert(C6499l c6499l, Intent intent) {
        boolean z;
        C13350l c13350l;
        int i = c6499l.loadAd;
        Bundle extras = intent.getExtras();
        RunnableC10613l runnableC10613l = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
            Context context = this.billing;
            if ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEvent != null) {
                m1415extends();
                this.purchase.getClass();
                if (keyEvent.getAction() != 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                        switch (keyCode) {
                        }
                    }
                    return true;
                }
                int keyCode2 = keyEvent.getKeyCode();
                boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
                HandlerC0341l handlerC0341l = this.amazon;
                if (keyCode2 == 79 || keyCode2 == 85) {
                    if (!zHasSystemFeature && i == 0 && keyEvent.getRepeatCount() == 0) {
                        RunnableC10613l runnableC10613l2 = (RunnableC10613l) handlerC0341l.loadAd;
                        if (runnableC10613l2 == null) {
                            RunnableC10613l runnableC10613l3 = new RunnableC10613l(handlerC0341l, c6499l, keyEvent, 28);
                            handlerC0341l.loadAd = runnableC10613l3;
                            handlerC0341l.postDelayed(runnableC10613l3, ViewConfiguration.getDoubleTapTimeout());
                            return true;
                        }
                        if (runnableC10613l2 != null) {
                            handlerC0341l.removeCallbacks(runnableC10613l2);
                            handlerC0341l.loadAd = null;
                        }
                        z = true;
                    } else {
                        RunnableC10613l runnableC10613l4 = (RunnableC10613l) handlerC0341l.loadAd;
                        if (runnableC10613l4 != null) {
                            handlerC0341l.removeCallbacks(runnableC10613l4);
                            RunnableC10613l runnableC10613l5 = (RunnableC10613l) handlerC0341l.loadAd;
                            handlerC0341l.loadAd = null;
                            runnableC10613l = runnableC10613l5;
                        }
                        if (runnableC10613l != null) {
                            AbstractC15323l.m3966final(handlerC0341l, runnableC10613l);
                        }
                    }
                    if (!this.signatures) {
                        boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                        if (keyEvent.getRepeatCount() <= 0 || amazon(keyEvent, z, booleanExtra)) {
                            return true;
                        }
                    } else {
                        c13350l = this.admob;
                        if ((keyCode2 != 85 || keyCode2 == 79) && z) {
                            c13350l.mo414strictfp();
                            return true;
                        }
                        if (i != 0) {
                            ((C10730l) ((C18396l) c13350l.vip.f1690l).f35934l).yandex.dispatchMediaButtonEvent(keyEvent);
                            return true;
                        }
                    }
                } else {
                    RunnableC10613l runnableC10613l6 = (RunnableC10613l) handlerC0341l.loadAd;
                    if (runnableC10613l6 != null) {
                        handlerC0341l.removeCallbacks(runnableC10613l6);
                        RunnableC10613l runnableC10613l7 = (RunnableC10613l) handlerC0341l.loadAd;
                        handlerC0341l.loadAd = null;
                        runnableC10613l = runnableC10613l7;
                    }
                    if (runnableC10613l != null) {
                        AbstractC15323l.m3966final(handlerC0341l, runnableC10613l);
                    }
                }
                z = false;
                if (!this.signatures) {
                    boolean booleanExtra2 = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() <= 0) {
                    }
                    return true;
                }
                c13350l = this.admob;
                if (keyCode2 != 85) {
                    c13350l.mo414strictfp();
                    return true;
                }
                c13350l.mo414strictfp();
                return true;
                if (i != 0) {
                    ((C10730l) ((C18396l) c13350l.vip.f1690l).f35934l).yandex.dispatchMediaButtonEvent(keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final boolean amazon(KeyEvent keyEvent, boolean z, boolean z2) {
        RunnableC7754l runnableC7754l;
        C6499l c6499lSubs = this.firebase.yandex.subs();
        if (c6499lSubs == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        int i = 1;
        if (keyCode == 79) {
            if (!this.tapsense.startapp()) {
                runnableC7754l = new RunnableC7754l(this, c6499lSubs, 6);
            } else {
                runnableC7754l = new RunnableC7754l(this, c6499lSubs, 7);
            }
        } else if (keyCode == 126) {
            runnableC7754l = new RunnableC7754l(this, c6499lSubs, 8);
        } else if (keyCode == 127) {
            runnableC7754l = new RunnableC7754l(this, c6499lSubs, 9);
        } else if (keyCode == 272) {
            runnableC7754l = new RunnableC7754l(this, c6499lSubs, i);
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    if (!this.tapsense.startapp()) {
                        runnableC7754l = new RunnableC7754l(this, c6499lSubs, 7);
                    } else {
                        runnableC7754l = new RunnableC7754l(this, c6499lSubs, 6);
                    }
                    break;
                case 86:
                    runnableC7754l = new RunnableC7754l(this, c6499lSubs, 5);
                    break;
                case 87:
                    runnableC7754l = new RunnableC7754l(this, c6499lSubs, i);
                    break;
                case 88:
                    runnableC7754l = new RunnableC7754l(this, c6499lSubs, 2);
                    break;
                case 89:
                    runnableC7754l = new RunnableC7754l(this, c6499lSubs, 4);
                    break;
                case 90:
                    runnableC7754l = new RunnableC7754l(this, c6499lSubs, 3);
                    break;
                default:
                    return false;
            }
        } else {
            runnableC7754l = new RunnableC7754l(this, c6499lSubs, 2);
        }
        AbstractC15323l.m3966final(this.smaato, new RunnableC14553l(this, z2, c6499lSubs, runnableC7754l, 1));
        return true;
    }

    public final C8149l applovin(C6499l c6499l, String str, C17425l c17425l) {
        C6499l c6499lM1421volatile = m1421volatile(c6499l);
        C8149l c8149lPurchase = AbstractC16840l.purchase(3, null, this.f7788throws.yandex, new C13979l(this.inmobi, c6499lM1421volatile, str, c17425l, null, 6));
        c8149lPurchase.f17030l.yandex(new RunnableC15937l(this, c8149lPurchase, c6499l, 1), new ExecutorC10279l(this, 0));
        return c8149lPurchase;
    }

    public final ListenableFuture appmetrica(C6499l c6499l, List list, final int i, final long j) {
        C2427l c2427l;
        m1421volatile(c6499l);
        C15035l c15035l = this.purchase;
        c15035l.getClass();
        C18662l c18662l = c15035l.yandex;
        ArrayList arrayList = AbstractC18569l.yandex;
        InterfaceC14029l interfaceC14029l = null;
        ListenableFuture listenableFutureM3983this = (i != -1 || (c2427l = (C2427l) AbstractC16901l.m4217extends(list)) == null) ? AbstractC15323l.m3983this(AbstractC16840l.purchase(2, AbstractC11463l.yandex, c18662l, new C0932l(c15035l, list, interfaceC14029l, 11)), new InterfaceC12538l() { // from class: lًۡۗ
            @Override // defpackage.InterfaceC12538l
            public final ListenableFuture apply(Object obj) {
                return AbstractC7151l.purchase(new C9896l(i, j, (List) obj));
            }
        }) : AbstractC16840l.purchase(2, AbstractC11463l.yandex, c18662l, new C15556l(c15035l, c2427l, interfaceC14029l, 14));
        AbstractC12442l.metrica(listenableFutureM3983this, "Callback.onSetMediaItems must return a non-null future");
        return listenableFutureM3983this;
    }

    public final ListenableFuture billing(C6499l c6499l, InterfaceC0945l interfaceC0945l) {
        int i;
        ListenableFuture listenableFuturePurchase;
        BinderC4841l binderC4841l = this.mopub;
        try {
            C13904l c13904lPremium = binderC4841l.billing.premium(c6499l);
            if (c13904lPremium != null) {
                C14784l c14784lCrashlytics = c13904lPremium.crashlytics(f7784volatile);
                i = c14784lCrashlytics.f28905l;
                listenableFuturePurchase = c14784lCrashlytics;
            } else {
                if (!remoteconfig(c6499l)) {
                    return AbstractC7151l.purchase(new C5159l(-100));
                }
                i = 0;
                listenableFuturePurchase = AbstractC7151l.purchase(new C5159l(0));
            }
            InterfaceC3270l interfaceC3270l = c6499l.amazon;
            if (interfaceC3270l != null) {
                interfaceC0945l.mopub(interfaceC3270l, i);
            }
            return listenableFuturePurchase;
        } catch (DeadObjectException unused) {
            binderC4841l.billing.m3308switch(c6499l);
            return AbstractC7151l.purchase(new C5159l(-100));
        } catch (RemoteException e) {
            AbstractC6427l.metrica("MediaSessionImpl", "Exception in " + c6499l, e);
            return AbstractC7151l.purchase(new C5159l(-1));
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m1415extends() {
        if (Looper.myLooper() == this.smaato.getLooper()) {
            return;
        }
        C8339l.smaato("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }

    public final void firebase(C16616l c16616l) {
        this.crashlytics.yandex(false, false);
        admob(new C16487l(c16616l));
        try {
            C18338l c18338l = this.admob.isPro;
            C2848l c2848l = this.subscription.subscription;
            c18338l.Signature();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final ListenableFuture inmobi(C6499l c6499l, AbstractC7778l abstractC7778l) {
        String str;
        m1421volatile(c6499l);
        C15035l c15035l = this.purchase;
        c15035l.getClass();
        C2427l c2427lMo2778l = this.firebase.yandex().mo2778l();
        if (c2427lMo2778l != null && (str = c2427lMo2778l.yandex) != null) {
            C8149l c8149lPurchase = AbstractC16840l.purchase(3, null, c15035l.yandex, new C0932l(c15035l, str, abstractC7778l, (InterfaceC14029l) null, 12));
            if (c8149lPurchase != null) {
                return c8149lPurchase;
            }
        }
        return AbstractC7151l.purchase(C15035l.yandex());
    }

    public final C6499l isPro() {
        AbstractC1186l abstractC1186lSignature = this.admob.mopub.Signature();
        for (int i = 0; i < abstractC1186lSignature.size(); i++) {
            C6499l c6499l = (C6499l) abstractC1186lSignature.get(i);
            if (startapp(c6499l)) {
                return c6499l;
            }
        }
        AbstractC1186l abstractC1186lSignature2 = this.mopub.billing.Signature();
        for (int i2 = 0; i2 < abstractC1186lSignature2.size(); i2++) {
            C6499l c6499l2 = (C6499l) abstractC1186lSignature2.get(i2);
            if (startapp(c6499l2)) {
                return c6499l2;
            }
        }
        return null;
    }

    public final boolean isVip() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C7026l c7026l = this.pro;
            if (c7026l != null) {
                AbstractServiceC3639l abstractServiceC3639l = (AbstractServiceC3639l) c7026l.f14720l;
                int i = Build.VERSION.SDK_INT;
                if (i >= 31 && i < 33 && !abstractServiceC3639l.billing(null).f19810l) {
                    abstractServiceC3639l.firebase(this.firebase, true);
                }
            }
            return true;
        }
        try {
            try {
                C5807l c5807l = new C5807l();
                c5807l.crashlytics = new C0011l();
                C16565l c16565l = new C16565l(c5807l);
                c5807l.loadAd = c16565l;
                c5807l.yandex = AbstractC5020l.class;
                try {
                    this.metrica.post(new RunnableC12388l(this, c5807l, 20));
                    c5807l.yandex = "onPlayRequested";
                } catch (Exception e) {
                    c16565l.loadAd(e);
                }
                return ((Boolean) c16565l.f32512l.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
                C11983l.ads(e);
                return false;
            }
        } catch (ExecutionException e3) {
            e = e3;
            C11983l.ads(e);
            return false;
        }
    }

    public final C8149l license(C6499l c6499l) {
        m1421volatile(c6499l);
        C8149l c8149lPurchase = AbstractC16840l.purchase(3, null, this.f7788throws.yandex, new C0071l(2, null, 15));
        int i = 0;
        c8149lPurchase.f17030l.yandex(new RunnableC15937l(this, c8149lPurchase, c6499l, i), new ExecutorC10279l(this, i));
        return c8149lPurchase;
    }

    public final boolean metrica() {
        boolean z;
        synchronized (this.yandex) {
            z = this.advert;
        }
        return z;
    }

    public final void mopub(C6499l c6499l, InterfaceC0945l interfaceC0945l) {
        int iBilling;
        BinderC4841l binderC4841l = this.mopub;
        try {
            C13904l c13904lPremium = binderC4841l.billing.premium(c6499l);
            if (c13904lPremium != null) {
                iBilling = c13904lPremium.billing();
            } else if (!remoteconfig(c6499l)) {
                return;
            } else {
                iBilling = 0;
            }
            InterfaceC3270l interfaceC3270l = c6499l.amazon;
            if (interfaceC3270l != null) {
                interfaceC0945l.mopub(interfaceC3270l, iBilling);
            }
        } catch (DeadObjectException unused) {
            binderC4841l.billing.m3308switch(c6499l);
        } catch (RemoteException e) {
            AbstractC6427l.metrica("MediaSessionImpl", "Exception in " + c6499l, e);
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m1416native() {
        Handler handler = this.smaato;
        RunnableC0128l runnableC0128l = this.vip;
        handler.removeCallbacks(runnableC0128l);
        if (this.adcel) {
            long j = this.isVip;
            if (j > 0) {
                if (this.tapsense.mo2758finally() || this.tapsense.amazon()) {
                    handler.postDelayed(runnableC0128l, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C5113l m1417package(C6499l c6499l, String str) {
        m1421volatile(c6499l);
        this.f7788throws.getClass();
        C5113l c5113lPurchase = AbstractC7151l.purchase(new C9201l(0, SystemClock.elapsedRealtime(), null, null, null, 1));
        c5113lPurchase.yandex(new RunnableC10613l(this, c6499l, str, 25), new ExecutorC10279l(this, 0));
        return c5113lPurchase;
    }

    public final void premium(C6499l c6499l) {
        if (this.signatures && startapp(c6499l)) {
            return;
        }
        List list = (List) this.purchase.amazon.get();
        AbstractC12442l.metrica(list, "layout must not be null");
        C3726l c3726l = this.firebase.yandex;
        AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(list);
        if (c3726l.vip(c6499l)) {
            C13350l c13350l = c3726l.admob;
            c13350l.ad = abstractC1186lSignature;
            c13350l.m3637instanceof(c3726l.tapsense);
        }
        c3726l.billing(c6499l, new C18317l(abstractC1186lSignature, 1));
    }

    public final C5113l pro(C6499l c6499l, C17425l c17425l) {
        C9201l c9201l;
        C9201l c9201lLoadAd;
        if (c17425l != null && c17425l.loadAd && startapp(c6499l)) {
            if (this.admob.startapp == null) {
                return AbstractC7151l.purchase(C9201l.loadAd(-6));
            }
            C0935l c0935l = new C0935l();
            C9258l c9258l = AbstractC1186l.f3181l;
            C13708l c13708l = C13708l.f26763l;
            List list = Collections.EMPTY_LIST;
            C13708l c13708l2 = C13708l.f26763l;
            C2410l c2410l = new C2410l();
            C11470l c11470l = C11470l.amazon;
            C3117l c3117l = new C3117l();
            c3117l.ads = Boolean.TRUE;
            c3117l.subscription = Boolean.FALSE;
            C2427l c2427l = new C2427l("androidx.media3.session.recent.root", new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l);
            C9201l.amazon(c2427l);
            return AbstractC7151l.purchase(new C9201l(0, SystemClock.elapsedRealtime(), c17425l, null, c2427l, 2));
        }
        m1421volatile(c6499l);
        ((C16076l) this.f7788throws.loadAd.get()).f31514l.getClass();
        if (!AbstractC8576l.yandex(Build.BRAND, "samsung") || Build.VERSION.SDK_INT >= 28) {
            if (c17425l == null || !c17425l.loadAd) {
                C0935l c0935l2 = new C0935l();
                C9258l c9258l2 = AbstractC1186l.f3181l;
                C13708l c13708l3 = C13708l.f26763l;
                List list2 = Collections.EMPTY_LIST;
                C2410l c2410l2 = new C2410l();
                C11470l c11470l2 = C11470l.amazon;
                C3117l c3117l2 = new C3117l();
                c3117l2.subscription = Boolean.FALSE;
                c3117l2.ads = Boolean.TRUE;
                c3117l2.f6662synchronized = 20;
                C2427l c2427l2 = new C2427l("vkx:root", new C9202l(c0935l2), null, new C7828l(c2410l2), new C3852l(c3117l2), c11470l2);
                Bundle bundle = Bundle.EMPTY;
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("android.media.browse.SEARCH_SUPPORTED", true);
                Unit unit = Unit.INSTANCE;
                C17425l c17425l2 = new C17425l(bundle2, false, false, false);
                C9201l.amazon(c2427l2);
                c9201l = new C9201l(0, SystemClock.elapsedRealtime(), c17425l2, null, c2427l2, 2);
            } else {
                C0935l c0935l3 = new C0935l();
                C9258l c9258l3 = AbstractC1186l.f3181l;
                C13708l c13708l4 = C13708l.f26763l;
                List list3 = Collections.EMPTY_LIST;
                C2410l c2410l3 = new C2410l();
                C11470l c11470l3 = C11470l.amazon;
                C3117l c3117l3 = new C3117l();
                c3117l3.ads = Boolean.TRUE;
                c3117l3.subscription = Boolean.FALSE;
                c3117l3.f6662synchronized = 20;
                C2427l c2427l3 = new C2427l("vkx:sysRecents", new C9202l(c0935l3), null, new C7828l(c2410l3), new C3852l(c3117l3), c11470l3);
                C17425l c17425l3 = new C17425l(Bundle.EMPTY, true, false, false);
                C9201l.amazon(c2427l3);
                c9201l = new C9201l(0, SystemClock.elapsedRealtime(), c17425l3, null, c2427l3, 2);
            }
            c9201lLoadAd = c9201l;
        } else {
            c9201lLoadAd = C9201l.loadAd(-6);
        }
        return AbstractC7151l.purchase(c9201lLoadAd);
    }

    public final boolean remoteconfig(C6499l c6499l) {
        ServiceC16415l serviceC16415l;
        if (this.mopub.billing.m3307strictfp(c6499l) || this.admob.mopub.m3307strictfp(c6499l)) {
            return true;
        }
        synchronized (this.yandex) {
            serviceC16415l = this.ad;
        }
        return serviceC16415l != null && serviceC16415l.f32115l.m3307strictfp(c6499l);
    }

    public final void signatures(C6499l c6499l) {
        m1421volatile(c6499l);
        this.purchase.getClass();
    }

    public final void smaato(C6499l c6499l, boolean z) {
        if (isVip()) {
            boolean z2 = this.tapsense.mo2779l(16) && this.tapsense.mo2778l() != null;
            boolean z3 = this.tapsense.mo2779l(31) || this.tapsense.mo2779l(20);
            C6499l c6499lM1421volatile = m1421volatile(c6499l);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            AbstractC12442l.subscription(!false);
            sparseBooleanArray.append(1, true);
            AbstractC12442l.subscription(!false);
            C16616l c16616l = new C16616l(new C4094l(sparseBooleanArray));
            if (!z2 && z3) {
                C15035l c15035l = this.purchase;
                C8149l c8149lPurchase = AbstractC16840l.purchase(3, null, c15035l.yandex, new C11671l(c15035l, null, 12));
                AbstractC12442l.metrica(c8149lPurchase, "Callback.onPlaybackResumption must return a non-null future");
                c8149lPurchase.yandex(new RunnableC9929l(c8149lPurchase, new C8634l(this, c6499lM1421volatile, z, c16616l), 9), new ExecutorC10279l(this, 2));
                return;
            }
            if (!z2) {
                AbstractC6427l.vip("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            AbstractC15323l.m3973native(this.tapsense);
            if (z) {
                signatures(c6499lM1421volatile);
            }
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final synchronized void m1418strictfp(C6499l c6499l, String str) {
        InterfaceC3270l interfaceC3270l = c6499l.amazon;
        interfaceC3270l.getClass();
        this.f7785package.remove(str, c6499l);
        this.f7787synchronized.remove(interfaceC3270l, str);
    }

    public final C6499l subs() {
        AbstractC1186l abstractC1186lSignature = this.mopub.billing.Signature();
        for (int i = 0; i < abstractC1186lSignature.size(); i++) {
            C6499l c6499l = (C6499l) abstractC1186lSignature.get(i);
            if (vip(c6499l)) {
                return c6499l;
            }
        }
        return null;
    }

    public final C3764l subscription(C6499l c6499l) {
        AbstractC1186l abstractC1186lSignature;
        boolean z = this.signatures;
        AbstractC1186l abstractC1186lSignature2 = null;
        C13350l c13350l = this.admob;
        if (z && startapp(c6499l)) {
            c13350l.getClass();
            C14023l c14023l = C3764l.purchase;
            C14023l c14023l2 = c13350l.isVip;
            c14023l2.getClass();
            C16616l c16616l = c13350l.signatures;
            c16616l.getClass();
            if (c13350l.advert.isEmpty()) {
                AbstractC1186l abstractC1186l = c13350l.ad;
                abstractC1186lSignature2 = abstractC1186l == null ? null : AbstractC1186l.Signature(abstractC1186l);
                abstractC1186lSignature = null;
            } else {
                AbstractC1186l abstractC1186l2 = c13350l.advert;
                abstractC1186lSignature = abstractC1186l2 == null ? null : AbstractC1186l.Signature(abstractC1186l2);
            }
            return new C3764l(c14023l2, c16616l, abstractC1186lSignature2, abstractC1186lSignature);
        }
        this.purchase.getClass();
        C16616l c16616l2 = C3764l.billing;
        C14023l c14023l3 = C3764l.purchase;
        c14023l3.getClass();
        HashSet hashSet = new HashSet(c14023l3.yandex);
        C12417l c12417l = AbstractC9079l.loadAd;
        c12417l.getClass();
        hashSet.add(c12417l);
        C12417l c12417l2 = AbstractC9079l.yandex;
        c12417l2.getClass();
        hashSet.add(c12417l2);
        C14023l c14023l4 = new C14023l(hashSet);
        C3764l c3764l = new C3764l(c14023l4, c16616l2, null, null);
        if (vip(c6499l)) {
            this.signatures = true;
            C13572l c13572l = this.firebase;
            AbstractC1186l abstractC1186l3 = c13572l.yandex.applovin;
            if (abstractC1186l3.isEmpty()) {
                c13350l.ad = c13572l.yandex.premium;
            } else {
                c13350l.advert = abstractC1186l3;
                c13350l.m3632abstract();
            }
            int i = 0;
            boolean z2 = c13350l.signatures.yandex(17) != c16616l2.yandex(17);
            c13350l.isVip = c14023l4;
            c13350l.signatures = c16616l2;
            if (!c13350l.advert.isEmpty()) {
                c13350l.m3632abstract();
            }
            C3726l c3726l = c13350l.admob;
            if (z2) {
                AbstractC15323l.m3966final(c3726l.smaato, new RunnableC4159l(c13350l, c3726l.tapsense, i));
                return c3764l;
            }
            c13350l.m3637instanceof(c3726l.tapsense);
        }
        return c3764l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m1419synchronized() {
        AbstractC6427l.firebase("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + AbstractC15323l.yandex + "] [" + AbstractC17959l.loadAd() + "]");
        synchronized (this.yandex) {
            try {
                if (this.advert) {
                    return;
                }
                this.advert = true;
                HandlerC0341l handlerC0341l = this.amazon;
                RunnableC10613l runnableC10613l = (RunnableC10613l) handlerC0341l.loadAd;
                if (runnableC10613l != null) {
                    handlerC0341l.removeCallbacks(runnableC10613l);
                    handlerC0341l.loadAd = null;
                }
                this.smaato.removeCallbacksAndMessages(null);
                try {
                    AbstractC15323l.m3966final(this.smaato, new RunnableC0128l(this, 3));
                } catch (Exception e) {
                    AbstractC6427l.metrica("MediaSessionImpl", "Exception thrown while closing", e);
                }
                C13350l c13350l = this.admob;
                ComponentName componentName = c13350l.startapp;
                C3726l c3726l = c13350l.admob;
                C0458l c0458l = c13350l.vip;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    if (componentName == null) {
                        ((C1139l) c0458l.f1691l).yandex.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", c3726l.loadAd);
                        intent.setComponent(componentName);
                        ((C1139l) c0458l.f1691l).yandex.setMediaButtonReceiver(PendingIntent.getBroadcast(c3726l.billing, 0, intent, C13350l.premium));
                    }
                }
                C13773l c13773l = c13350l.metrica;
                if (c13773l != null) {
                    c3726l.billing.unregisterReceiver(c13773l);
                }
                C8384l c8384l = c13350l.remoteconfig;
                if (c8384l != null && !c8384l.billing.getAndSet(true)) {
                    c8384l.crashlytics.execute(new RunnableC7852l(c8384l, 0));
                }
                C1139l c1139l = (C1139l) c0458l.f1691l;
                MediaSession mediaSession = c1139l.yandex;
                c1139l.billing.kill();
                if (i == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        AbstractC6427l.metrica("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                mediaSession.setCallback(null);
                c1139l.loadAd.purchase.clear();
                mediaSession.release();
                BinderC4841l binderC4841l = this.mopub;
                Set set = binderC4841l.mopub;
                C12014l c12014l = binderC4841l.billing;
                for (C6499l c6499l : c12014l.Signature()) {
                    c12014l.m3308switch(c6499l);
                    InterfaceC3270l interfaceC3270l = c6499l.amazon;
                    if (interfaceC3270l != null) {
                        interfaceC3270l.yandex();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    InterfaceC3270l interfaceC3270l2 = ((C6499l) it.next()).amazon;
                    if (interfaceC3270l2 != null) {
                        interfaceC3270l2.yandex();
                    }
                }
                set.clear();
                binderC4841l.purchase.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture tapsense(C6499l c6499l, C12417l c12417l, Bundle bundle) {
        ListenableFuture listenableFuturePurchase;
        m1421volatile(c6499l);
        C15035l c15035l = this.purchase;
        if (c12417l.loadAd.length() == 0) {
            c15035l.getClass();
            listenableFuturePurchase = AbstractC7151l.purchase(C15035l.yandex());
        } else {
            C18662l c18662l = c15035l.yandex;
            C16552l c16552l = AbstractC11463l.yandex;
            listenableFuturePurchase = AbstractC16840l.purchase(2, AbstractC17278l.yandex, c18662l, new C8036l(c15035l, c12417l, bundle, null, 15));
        }
        AbstractC12442l.metrica(listenableFuturePurchase, "Callback.onCustomCommandOnHandler must return non-null future");
        return listenableFuturePurchase;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C5113l m1420throws(C6499l c6499l, String str, C17425l c17425l) {
        InterfaceC3270l interfaceC3270l = c6499l.amazon;
        interfaceC3270l.getClass();
        synchronized (this) {
            this.f7787synchronized.isPro(interfaceC3270l, str);
            this.f7785package.isPro(str, c6499l);
        }
        C15035l c15035l = this.f7788throws;
        C13572l c13572l = this.inmobi;
        C6499l c6499lM1421volatile = m1421volatile(c6499l);
        c15035l.getClass();
        int i = 1;
        AbstractC12442l.admob(!TextUtils.isEmpty(str));
        C3726l c3726l = c13572l.yandex;
        if (!c3726l.signatures || !c3726l.vip(c6499lM1421volatile) || (c6499lM1421volatile = c3726l.isPro()) != null) {
            c3726l.mopub(c6499lM1421volatile, new C17706l(c3726l, str, c17425l, 9));
        }
        C5113l c5113lPurchase = AbstractC7151l.purchase(new C9201l(0, SystemClock.elapsedRealtime(), null, null, null, 1));
        c5113lPurchase.yandex(new RunnableC4063l(this, c5113lPurchase, c6499l, str, 6), new ExecutorC10279l(this, i));
        return c5113lPurchase;
    }

    public final boolean vip(C6499l c6499l) {
        return Objects.equals(c6499l.yandex.yandex.yandex, this.billing.getPackageName()) && c6499l.loadAd != 0 && new Bundle(c6499l.purchase).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final C6499l m1421volatile(C6499l c6499l) {
        C6499l c6499lSubs;
        return (this.signatures && startapp(c6499l) && (c6499lSubs = subs()) != null) ? c6499lSubs : c6499l;
    }
}
