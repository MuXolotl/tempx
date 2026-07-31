package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.media.session.MediaController;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lّؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12388l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f24477l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24478l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24479l;

    public /* synthetic */ RunnableC12388l(C3726l c3726l, C6499l c6499l, Runnable runnable) {
        this.f24479l = 19;
        this.f24478l = c3726l;
        this.f24477l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        C5159l c5159l;
        int i5 = 1;
        switch (this.f24479l) {
            case 0:
                ((ViewGroup) this.f24478l).removeView((C10295l) this.f24477l);
                return;
            case 1:
                ((AbstractC2361l) this.f24478l).addView((View) this.f24477l);
                return;
            case 2:
                C9967l c9967l = (C9967l) this.f24478l;
                ((C1796l) this.f24477l).loadAd();
                c9967l.f20353l = false;
                ((InterfaceC9215l) c9967l.f20348l.f9862l).getClass();
                c9967l.f20348l = null;
                c9967l.loadAd();
                if (c9967l.getBackView() != null) {
                    c9967l.getBackView().setVisibility(8);
                    return;
                }
                return;
            case 3:
                C18449l c18449l = (C18449l) this.f24478l;
                InterfaceC15984l interfaceC15984l = (InterfaceC15984l) this.f24477l;
                C9337l c9337l = (C9337l) ((C13716l) c18449l.f36010l).amazon();
                if (c9337l == null) {
                    return;
                }
                interfaceC15984l.yandex(c9337l.yandex);
                return;
            case 4:
                C18449l c18449l2 = (C18449l) this.f24478l;
                C5807l c5807l = (C5807l) this.f24477l;
                C9337l c9337l2 = (C9337l) ((C13716l) c18449l2.f36010l).amazon();
                if (c9337l2 == null) {
                    c5807l.amazon(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    c5807l.loadAd(c9337l2.yandex);
                    return;
                }
            case 5:
                Map.Entry entry = (Map.Entry) this.f24478l;
                C9337l c9337l3 = (C9337l) this.f24477l;
                InterfaceC15984l interfaceC15984l2 = (InterfaceC15984l) entry.getKey();
                c9337l3.getClass();
                interfaceC15984l2.yandex(c9337l3.yandex);
                return;
            case 6:
                AbstractC6641l abstractC6641l = (AbstractC6641l) this.f24478l;
                abstractC6641l.f13929l.set(abstractC6641l.pro((C10023l) this.f24477l, abstractC6641l.f13938l, 0));
                return;
            case 7:
                C0188l c0188l = (C0188l) this.f24478l;
                C18396l c18396l = new C18396l(c0188l.yandex, (C5057l) this.f24477l);
                c0188l.subs = c18396l;
                C17977l c17977l = c0188l.purchase;
                Handler handler = c0188l.loadAd.f32839l;
                if (!((Set) c18396l.f35933l).add(c17977l)) {
                    AbstractC6427l.vip("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                c17977l.amazon(handler);
                C10730l c10730l = (C10730l) c18396l.f35934l;
                MediaController mediaController = c10730l.yandex;
                C2516l c2516l = c17977l.yandex;
                c2516l.getClass();
                mediaController.registerCallback(c2516l, handler);
                synchronized (c10730l.loadAd) {
                    InterfaceC10867l interfaceC10867lYandex = c10730l.purchase.yandex();
                    if (interfaceC10867lYandex != null) {
                        BinderC18564l binderC18564l = new BinderC18564l(c17977l);
                        c10730l.amazon.put(c17977l, binderC18564l);
                        c17977l.crashlytics = binderC18564l;
                        try {
                            interfaceC10867lYandex.mo1136l(binderC18564l);
                            c17977l.crashlytics(13, null);
                        } catch (RemoteException | SecurityException e) {
                            AbstractC6427l.subs("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    } else {
                        c17977l.crashlytics = null;
                        c10730l.crashlytics.add(c17977l);
                    }
                    break;
                }
                return;
            case 8:
                C0188l c0188l2 = (C0188l) this.f24478l;
                AbstractC1186l abstractC1186l = (AbstractC1186l) ((C1424l) this.f24477l).f3605l;
                C16811l c16811l = c0188l2.loadAd;
                c16811l.getClass();
                AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                InterfaceC14026l interfaceC14026l = c16811l.f32840l;
                interfaceC14026l.ad(c16811l, abstractC1186l);
                interfaceC14026l.isVip();
                return;
            case 9:
                C13208l c13208l = (C13208l) this.f24478l;
                InterfaceC12052l interfaceC12052l = (InterfaceC12052l) this.f24477l;
                if (c13208l.startapp) {
                    return;
                }
                interfaceC12052l.amazon(c13208l);
                return;
            case 10:
                ListenableFuture listenableFuture = (ListenableFuture) this.f24478l;
                C18689l c18689l = (C18689l) this.f24477l;
                try {
                    C5159l c5159l2 = (C5159l) listenableFuture.get();
                    AbstractC12442l.metrica(c5159l2, "SessionResult must not be null");
                    c18689l.billing(c5159l2.loadAd);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    AbstractC6427l.metrica("MLSLegacyStub", "Custom action failed", e2);
                    c18689l.purchase();
                    return;
                }
            case 11:
                C1090l c1090l = (C1090l) this.f24478l;
                ArrayList arrayList = (ArrayList) this.f24477l;
                if (c1090l.f5919l instanceof C17783l) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (arrayList.get(i6) != null) {
                            ((ListenableFuture) arrayList.get(i6)).cancel(false);
                        }
                    }
                    return;
                }
                return;
            case 12:
                C17947l c17947l = (C17947l) this.f24478l;
                ArrayList arrayList2 = (ArrayList) this.f24477l;
                ServiceC16415l serviceC16415l = c17947l.f34930l;
                C3726l c3726l = serviceC16415l.f32112l;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    C11814l c11814l = (C11814l) arrayList2.get(i7);
                    Bundle bundle = c11814l.amazon;
                    C18689l c18689l2 = c11814l.purchase;
                    if (bundle != null) {
                        try {
                            bundle.setClassLoader(c3726l.billing.getClassLoader());
                            i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                            i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        } catch (BadParcelableException unused) {
                            c18689l2.billing(null);
                            return;
                        }
                    } else {
                        i = 0;
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i < 0 || i2 < 1) {
                        i3 = 0;
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i3 = i;
                        i4 = i2;
                    }
                    C1090l c1090lM3983this = AbstractC15323l.m3983this(serviceC16415l.f32112l.ad(c11814l.yandex, c11814l.crashlytics, i3, i4, AbstractC18585l.admob(c3726l.billing, bundle)), new C6680l(serviceC16415l, i5));
                    c1090lM3983this.yandex(new RunnableC10879l(c1090lM3983this, c18689l2, i5), EnumC1535l.f3808l);
                    break;
                }
                return;
            case 13:
                ((C15081l) this.f24478l).amazon.reportTrackChangeEvent((TrackChangeEvent) this.f24477l);
                return;
            case 14:
                ((C15081l) this.f24478l).amazon.reportNetworkEvent((NetworkEvent) this.f24477l);
                return;
            case 15:
                ((C15081l) this.f24478l).amazon.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f24477l);
                return;
            case 16:
                ((C15081l) this.f24478l).amazon.reportPlaybackMetrics((PlaybackMetrics) this.f24477l);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C15081l) this.f24478l).amazon.reportPlaybackStateEvent((PlaybackStateEvent) this.f24477l);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C3726l c3726l2 = (C3726l) this.f24478l;
                C18602l c18602l = (C18602l) this.f24477l;
                C13350l c13350l = c3726l2.admob;
                c3726l2.tapsense = c18602l;
                C9755l c9755l = new C9755l(c3726l2, c18602l);
                c18602l.Signature(c9755l);
                c3726l2.license = c9755l;
                try {
                    c13350l.isPro.pro(0, c18602l);
                    break;
                } catch (RemoteException e3) {
                    AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e3);
                }
                ((C1139l) c13350l.vip.f1691l).yandex.setActive(true);
                c3726l2.subscription = new C1908l(c18602l.mo2807switch(), 0, c18602l.m4570l(), c18602l.m4566l(), c18602l.m4566l(), 0, c18602l.billing(), c18602l.mopub(), c18602l.mo2788l(), c18602l.advert(), c18602l.m4569l(), 0, c18602l.mo2779l(18) ? c18602l.mo2802public() : C3852l.f7980private, c18602l.mo2779l(22) ? c18602l.signatures() : 1.0f, 1.0f, c18602l.mo2779l(21) ? c18602l.applovin() : C13736l.subs, 0, c18602l.mo2779l(28) ? c18602l.mo2809this() : C16684l.amazon, c18602l.inmobi(), c18602l.mo2779l(23) ? c18602l.admob() : 0, c18602l.m4571l(), c18602l.startapp(), 1, c18602l.mo2770l(), c18602l.purchase(), c18602l.mo2758finally(), c18602l.amazon(), c18602l.m4568l(), c18602l.mo2775l(), c18602l.mo2764interface(), c18602l.tapsense(), c18602l.mo2779l(30) ? c18602l.mo2762import() : C1047l.loadAd, c18602l.mo2766l());
                c3726l2.firebase(c18602l.vip());
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C3726l c3726l3 = (C3726l) this.f24478l;
                Runnable runnable = (Runnable) this.f24477l;
                c3726l3.getClass();
                runnable.run();
                return;
            case 20:
                ((C5807l) this.f24477l).loadAd(Boolean.valueOf(((C3726l) this.f24478l).isVip()));
                return;
            case 21:
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f24478l;
                ResultReceiver resultReceiver = (ResultReceiver) this.f24477l;
                try {
                    c5159l = (C5159l) listenableFuture2.get();
                    AbstractC12442l.metrica(c5159l, "SessionResult must not be null");
                    break;
                } catch (InterruptedException e4) {
                    e = e4;
                    AbstractC6427l.metrica("MediaSessionLegacyStub", "Custom command failed", e);
                    c5159l = new C5159l(-1);
                } catch (CancellationException e5) {
                    AbstractC6427l.metrica("MediaSessionLegacyStub", "Custom command cancelled", e5);
                    c5159l = new C5159l(1);
                } catch (ExecutionException e6) {
                    e = e6;
                    AbstractC6427l.metrica("MediaSessionLegacyStub", "Custom command failed", e);
                    c5159l = new C5159l(-1);
                }
                resultReceiver.send(c5159l.yandex, c5159l.loadAd);
                return;
            case 22:
                C3726l c3726l4 = (C3726l) this.f24478l;
                Intent intent = (Intent) this.f24477l;
                C6499l c6499lSubs = c3726l4.subs();
                if (c6499lSubs == null) {
                    c6499lSubs = AbstractServiceC3639l.purchase(intent);
                }
                if (c3726l4.advert(c6499lSubs, intent)) {
                    return;
                }
                AbstractC6427l.billing("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case 23:
                PlaybackService playbackService = (PlaybackService) this.f24478l;
                C14863l c14863l = (C14863l) this.f24477l;
                playbackService.billing(c14863l).f19811l = c14863l;
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                BinderC4841l binderC4841l = (BinderC4841l) this.f24478l;
                InterfaceC1087l interfaceC1087l = (InterfaceC1087l) this.f24477l;
                C12014l c12014l = binderC4841l.billing;
                C6499l c6499lLicense = c12014l.license(interfaceC1087l.asBinder());
                if (c6499lLicense != null) {
                    c12014l.m3308switch(c6499lLicense);
                    return;
                }
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((BinderC4841l) this.f24478l).billing.metrica((C6499l) this.f24477l);
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((InterfaceC18679l) this.f24478l).accept((InterfaceC4784l) this.f24477l);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((InterfaceC5755l) this.f24477l).subs((C9723l) this.f24478l);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Surface surface = (Surface) this.f24478l;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f24477l;
                surface.release();
                surfaceTexture.release();
                return;
            default:
                C1196l c1196l = (C1196l) this.f24478l;
                Context context = (Context) this.f24477l;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new C13773l(5, c1196l), intentFilter);
                return;
        }
    }

    public /* synthetic */ RunnableC12388l(C9967l c9967l, C1796l c1796l, View view, View view2) {
        this.f24479l = 2;
        this.f24478l = c9967l;
        this.f24477l = c1796l;
    }

    public /* synthetic */ RunnableC12388l(Object obj, Object obj2, int i) {
        this.f24479l = i;
        this.f24478l = obj;
        this.f24477l = obj2;
    }
}
