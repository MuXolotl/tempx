package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.MenuItem;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.DataInitializationCallback;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lؙ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6536l implements InterfaceC12101l, InterfaceC15953l, InterfaceC7456l, InterfaceC0015l, InterfaceC10782l, InterfaceC9481l, InterfaceC6784l, InterfaceC5246l, InterfaceC16004l, InterfaceC10072l, InterfaceC12052l, InterfaceC0945l, InterfaceC3266l, InterfaceC18104l, InterfaceC5755l, InterfaceC1666l, DataInitializationCallback {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13620l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13621l;

    public /* synthetic */ C6536l(C12417l c12417l) {
        this.f13621l = 16;
        Bundle bundle = Bundle.EMPTY;
        this.f13620l = c12417l;
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        int i2 = this.f13621l;
        Object obj = this.f13620l;
        switch (i2) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c3726l.m1417package(c6499l, (String) obj);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c3726l.pro(c6499l, (C17425l) obj);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC18104l interfaceC18104l = (InterfaceC18104l) obj;
                C5113l c5113l = C5113l.f11111l;
                if (!c3726l.metrica()) {
                    interfaceC18104l.crashlytics(c3726l.tapsense, c6499l);
                    BinderC4841l.m1620l(c3726l, c6499l, i, new C5159l(0));
                }
                return c5113l;
            default:
                return c3726l.inmobi(c6499l, (AbstractC7778l) obj);
        }
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        int i = this.f13621l;
        Object obj = this.f13620l;
        switch (i) {
            case 12:
                C5728l c5728l = (C5728l) obj;
                InterfaceC4725l interfaceC4725l = c5728l.crashlytics;
                C12962l c12962l = c13208l.purchase;
                C16811l c16811l = c13208l.yandex;
                if (c13208l.appmetrica != null) {
                    AbstractC6427l.admob("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    c16811l.release();
                } else {
                    AbstractC1186l abstractC1186l = c5728l.vip;
                    Bundle bundle = c5728l.subs;
                    c13208l.appmetrica = interfaceC4725l;
                    c13208l.adcel = c5728l.isPro;
                    c13208l.ads = c5728l.amazon;
                    c13208l.pro = c5728l.purchase;
                    C16616l c16616l = c5728l.billing;
                    c13208l.ad = c16616l;
                    C16616l c16616l2 = c5728l.mopub;
                    c13208l.advert = c16616l2;
                    C16616l c16616lM3607l = c13208l.m3607l(c16616l, c16616l2);
                    c13208l.isVip = c16616lM3607l;
                    AbstractC1186l abstractC1186l2 = c5728l.firebase;
                    c13208l.subscription = abstractC1186l2;
                    AbstractC1186l abstractC1186l3 = c5728l.smaato;
                    c13208l.tapsense = abstractC1186l3;
                    C13708l c13708lM3589l = C13208l.m3589l(abstractC1186l3, abstractC1186l2, c13208l.pro, c16616lM3607l, bundle);
                    c13208l.Signature = c13708lM3589l;
                    c13208l.license = C13208l.m3594l(c13708lM3589l, c13208l.subscription, c5728l.subs, c13208l.pro, c13208l.isVip, c5728l.loadAd);
                    C13698l c13698l = new C13698l(4, 11);
                    for (int i2 = 0; i2 < abstractC1186l.size(); i2++) {
                        C14869l c14869l = (C14869l) abstractC1186l.get(i2);
                        C12417l c12417l = c14869l.yandex;
                        if (c12417l != null && c12417l.yandex == 0) {
                            c13698l.mo3668catch(c12417l.loadAd, c14869l);
                        }
                    }
                    c13698l.metrica(true);
                    MediaSession.Token tokenSubs = c5728l.remoteconfig;
                    if (tokenSubs == null) {
                        tokenSubs = c12962l.yandex.subs();
                    }
                    if (tokenSubs != null) {
                        c13208l.inmobi = new MediaController(c13208l.amazon, tokenSubs);
                    }
                    try {
                        interfaceC4725l.asBinder().linkToDeath(c13208l.mopub, 0);
                        c13208l.vip = new C12962l(c12962l.yandex.loadAd(), c5728l.yandex, c5728l.loadAd, c12962l.yandex.mopub(), c5728l.crashlytics, c5728l.admob, tokenSubs);
                        c13208l.f25987strictfp = bundle;
                        c16811l.remoteconfig();
                    } catch (RemoteException unused) {
                        c16811l.release();
                        return;
                    }
                }
                break;
            case 13:
                C9009l c9009l = (C9009l) obj;
                if (c13208l.mo319l() && c13208l.firebase.isEmpty()) {
                    C9009l c9009l2 = c13208l.adcel.crashlytics;
                    if (c9009l2.crashlytics < c9009l.crashlytics && AbstractC8672l.yandex(c9009l, c9009l2)) {
                        c13208l.adcel = c13208l.adcel.isPro(c9009l);
                        break;
                    }
                }
                break;
            case 14:
                PendingIntent pendingIntent = (PendingIntent) obj;
                C16811l c16811l2 = c13208l.yandex;
                if (c13208l.mo319l() && !Objects.equals(c13208l.ads, pendingIntent)) {
                    c13208l.ads = pendingIntent;
                    c16811l2.getClass();
                    AbstractC12442l.subscription(Looper.myLooper() == c16811l2.f32839l.getLooper());
                    c16811l2.f32840l.getClass();
                    break;
                }
                break;
            default:
                C16811l c16811l3 = c13208l.yandex;
                Bundle bundle2 = (Bundle) obj;
                if (c13208l.mo319l()) {
                    C13708l c13708l = c13208l.Signature;
                    C13708l c13708l2 = c13208l.license;
                    c13208l.f25987strictfp = bundle2;
                    C13708l c13708lM3589l2 = C13208l.m3589l(c13208l.tapsense, c13208l.subscription, c13208l.pro, c13208l.isVip, bundle2);
                    c13208l.Signature = c13708lM3589l2;
                    c13208l.license = C13208l.m3594l(c13708lM3589l2, c13208l.subscription, c13208l.f25987strictfp, c13208l.pro, c13208l.isVip, c13208l.m3611l());
                    boolean zEquals = c13208l.Signature.equals(c13708l);
                    c13208l.license.equals(c13708l2);
                    c16811l3.getClass();
                    AbstractC12442l.subscription(Looper.myLooper() == c16811l3.f32839l.getLooper());
                    InterfaceC14026l interfaceC14026l = c16811l3.f32840l;
                    interfaceC14026l.license();
                    if (!zEquals) {
                        interfaceC14026l.isVip();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC12101l
    public long applovin(long j) {
        C5478l c5478l = (C5478l) this.f13620l;
        return AbstractC15323l.firebase((j * ((long) c5478l.purchase)) / 1000000, 0L, c5478l.isPro - 1);
    }

    @Override // defpackage.InterfaceC0015l
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public String mo2021apply(Object obj) {
        return (String) ((C17049l) this.f13620l).invoke(obj);
    }

    @Override // defpackage.InterfaceC15953l
    public void billing(long j, C13143l c13143l) {
        AbstractC0441l.loadAd(j, c13143l, ((C1721l) this.f13620l).f4117volatile);
    }

    @Override // defpackage.InterfaceC18104l
    public void crashlytics(C18602l c18602l, C6499l c6499l) {
        ((InterfaceC18679l) this.f13620l).accept(c18602l);
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        int i = this.f13621l;
        boolean z = false;
        Object obj = this.f13620l;
        switch (i) {
            case 2:
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                AbstractC11356l.isPro(false, listenableFuture, c5807l, AbstractC12272l.yandex());
                return "nonCancellationPropagating[" + listenableFuture + "]";
            case 11:
                C18449l c18449l = (C18449l) obj;
                AbstractC12272l.admob().execute(new RunnableC12388l(c18449l, c5807l, 4));
                return c18449l + " [fetch@" + SystemClock.uptimeMillis() + "]";
            default:
                C3551l c3551l = (C3551l) obj;
                C7025l c7025l = c3551l.subscription;
                C2494l c2494l = new C2494l(c3551l, c5807l, z, 15);
                ExecutorC7870l executorC7870l = c3551l.amazon;
                synchronized (c7025l.loadAd) {
                    c7025l.tapsense = c2494l;
                    c7025l.Signature = executorC7870l;
                    break;
                }
                return "videoEncodingFuture";
        }
    }

    public void firebase(AbstractC8513l abstractC8513l) {
        AbstractC2786l abstractC2786l;
        C7591l c7591l = (C7591l) this.f13620l;
        if (!(abstractC8513l instanceof C10394l) || (abstractC2786l = c7591l.f15599l) == null) {
            return;
        }
        float f = ((C10394l) abstractC8513l).loadAd;
        if (!abstractC2786l.isPro()) {
            AbstractC5088l.tapsense("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!abstractC2786l.tapsense) {
            AbstractC5088l.yandex("CameraController", "Pinch to zoom disabled.");
            return;
        }
        AbstractC5088l.yandex("CameraController", "Pinch to zoom with scale: " + f);
        AbstractC12225l.crashlytics();
        C11888l c11888l = (C11888l) abstractC2786l.pro.amazon();
        if (c11888l == null) {
            return;
        }
        abstractC2786l.firebase(Math.min(Math.max(c11888l.yandex() * (f > 1.0f ? AbstractC4338l.Signature(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), c11888l.loadAd), c11888l.crashlytics));
    }

    @Override // io.realm.kotlin.internal.interop.DataInitializationCallback
    public void invoke() {
        ((C9122l) this.f13620l).f18750l = true;
    }

    @Override // defpackage.InterfaceC10782l
    public void isPro(C15607l c15607l) {
        ((InterfaceC10782l) this.f13620l).isPro(c15607l);
    }

    @Override // defpackage.InterfaceC10782l
    public /* synthetic */ Size loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        C12417l c12417l = (C12417l) this.f13620l;
        Bundle bundle = Bundle.EMPTY;
        interfaceC3270l.purchase(i, c12417l);
    }

    @Override // defpackage.InterfaceC6784l
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((C12375l) this.f13620l).getClass();
        menuItem.getItemId();
        throw null;
    }

    @Override // defpackage.InterfaceC1666l
    public Object purchase(Object obj, Object obj2) {
        return AbstractC7280l.isPro(new C13254l(((C0353l) this.f13620l).f1418l, obj), (List) ((Collection) obj2));
    }

    @Override // defpackage.InterfaceC5755l
    public void subs(InterfaceC12679l interfaceC12679l) {
        C9723l c9723l = (C9723l) this.f13620l;
        synchronized (c9723l.f19829l) {
            c9723l.f19825l++;
        }
        c9723l.billing(interfaceC12679l);
    }

    @Override // defpackage.InterfaceC9481l
    public boolean yandex(C5138l c5138l, int i, Bundle bundle) {
        InterfaceC4326l c17240l;
        C5217l c5217l = (C5217l) this.f13620l;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC1554l) c5138l.f11181l).mopub();
                Parcelable parcelable = (Parcelable) ((InterfaceC1554l) c5138l.f11181l).vip();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        InterfaceC1554l interfaceC1554l = (InterfaceC1554l) c5138l.f11181l;
        ClipData clipData = new ClipData(interfaceC1554l.yandex(), new ClipData.Item(interfaceC1554l.amazon()));
        if (i2 >= 31) {
            c17240l = new C17240l(clipData, 2);
        } else {
            C2534l c2534l = new C2534l();
            c2534l.loadAd = clipData;
            c2534l.crashlytics = 2;
            c17240l = c2534l;
        }
        c17240l.loadAd(interfaceC1554l.subs());
        c17240l.setExtras(bundle);
        return AbstractC15872l.isPro(c5217l, c17240l.build()) == null;
    }

    @Override // defpackage.InterfaceC5246l
    public ListenableFuture apply(Object obj) {
        return (ListenableFuture) ((C17015l) this.f13620l).invoke(obj);
    }

    public /* synthetic */ C6536l(int i, Object obj) {
        this.f13621l = i;
        this.f13620l = obj;
    }

    @Override // defpackage.InterfaceC16004l
    /* JADX INFO: renamed from: apply */
    public Object mo1368apply(Object obj) {
        return (Void) ((Ctransient) this.f13620l).invoke(obj);
    }

    public /* synthetic */ C6536l(int i, PendingIntent pendingIntent) {
        this.f13621l = 14;
        this.f13620l = pendingIntent;
    }
}
