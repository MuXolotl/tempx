package defpackage;

import android.os.SystemClock;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚٕٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7276l {
    public C9386l Signature;
    public C17266l ad;
    public final C3557l admob;
    public C15202l advert;
    public final C18548l amazon;
    public C7504l applovin;
    public final C11751l billing;
    public final C7931l crashlytics;
    public final C8409l firebase;
    public final C12292l isPro;
    public Map isVip;
    public C7504l license;
    public final C11969l loadAd;
    public final C5664l metrica;
    public final InterfaceC0627l mopub;
    public C7504l premium;
    public final C9028l purchase;
    public final C14437l remoteconfig;
    public C7504l signatures;
    public final C3945l smaato;
    public final C2182l subs;
    public AbstractC10252l subscription;
    public C6288l tapsense;
    public final C1663l vip;
    public final InterfaceC2262l yandex;
    public final Object startapp = new Object();
    public boolean adcel = true;
    public AbstractC3925l ads = C10370l.admob;
    public final C9426l pro = new C9426l();

    public C7276l(InterfaceC2262l interfaceC2262l, C11969l c11969l, C7094l c7094l, C7931l c7931l, C18548l c18548l, C9028l c9028l, C11751l c11751l, InterfaceC0627l interfaceC0627l, C3557l c3557l, C2182l c2182l, C12292l c12292l, C8409l c8409l, C3945l c3945l, C14437l c14437l, C1663l c1663l, C5664l c5664l, C7820l c7820l) {
        this.yandex = interfaceC2262l;
        this.loadAd = c11969l;
        this.crashlytics = c7931l;
        this.amazon = c18548l;
        this.purchase = c9028l;
        this.billing = c11751l;
        this.mopub = interfaceC0627l;
        this.admob = c3557l;
        this.subs = c2182l;
        this.isPro = c12292l;
        this.firebase = c8409l;
        this.smaato = c3945l;
        this.remoteconfig = c14437l;
        this.vip = c1663l;
        this.metrica = c5664l;
        this.subscription = new C12163l(c7931l.yandex);
        InterfaceC14029l interfaceC14029l = null;
        this.premium = AbstractC10999l.mopub(interfaceC2262l, null, 0, new C7588l(this, interfaceC14029l, 0), 3);
        this.applovin = AbstractC10999l.mopub(interfaceC2262l, null, 0, new C7588l(this, interfaceC14029l, 1), 3);
    }

    public static final void crashlytics(C7276l c7276l) {
        if (c7276l.billing()) {
            Log.w("CXCP", "Ignoring stop(): " + c7276l + " is already closed");
            return;
        }
        AbstractC3925l abstractC3925l = c7276l.ads;
        C10370l c10370l = C10370l.subs;
        if (abstractC3925l.equals(c10370l) || c7276l.ads.equals(C10370l.admob)) {
            Log.w("CXCP", "Ignoring stop(): " + c7276l + " already stopping or stopped");
            return;
        }
        C17266l c17266l = c7276l.ad;
        C15202l c15202l = c7276l.advert;
        c7276l.ad = null;
        c7276l.advert = null;
        c7276l.ads = c10370l;
        Log.d("CXCP", "Stopping " + c7276l);
        c7276l.purchase(c15202l, c17266l);
    }

    public static final void loadAd(C7276l c7276l, C8172l c8172l) {
        synchronized (c7276l.startapp) {
            try {
                if (c7276l.billing()) {
                    return;
                }
                C6288l c6288l = c8172l.subs;
                if (c6288l != null) {
                    c7276l.tapsense = c6288l;
                    int i = c6288l.yandex;
                    if (i == 6 || i == 1 || i == 2) {
                        c7276l.ads = C10370l.purchase;
                        Log.d("CXCP", c7276l + " is disconnected");
                    } else {
                        c7276l.ads = C10370l.billing;
                        Log.d("CXCP", c7276l + " encountered error: " + ((Object) C6288l.yandex(c8172l.subs.yandex)));
                    }
                } else {
                    c7276l.ads = C10370l.admob;
                }
                c7276l.purchase.mopub();
                c7276l.admob();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void yandex(C7276l c7276l, AbstractC10252l abstractC10252l) {
        Log.d("CXCP", c7276l + " (" + ((Object) C10160l.loadAd(c7276l.crashlytics.yandex)) + ") camera status changed: " + abstractC10252l);
        synchronized (c7276l.startapp) {
            try {
                if (c7276l.billing()) {
                    return;
                }
                if ((abstractC10252l instanceof C17481l) || (abstractC10252l instanceof C12163l)) {
                    c7276l.subscription = abstractC10252l;
                } else if (abstractC10252l instanceof C16495l) {
                    c7276l.smaato.getClass();
                    c7276l.Signature = new C9386l(SystemClock.elapsedRealtimeNanos());
                }
                c7276l.admob();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (r3.yandex != 8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void admob() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7276l.admob():void");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(AbstractC0283l abstractC0283l) {
        C11242l c11242l;
        if (abstractC0283l instanceof C11242l) {
            c11242l = (C11242l) abstractC0283l;
            int i = c11242l.f22635l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11242l.f22635l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11242l = new C11242l(this, abstractC0283l);
            }
        } else {
            c11242l = new C11242l(this, abstractC0283l);
        }
        Object obj = c11242l.f22634l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c11242l.f22635l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            Log.d("CXCP", this + "#awaitClosed");
            synchronized (this.startapp) {
                if (this.ads.equals(C10370l.crashlytics)) {
                    Log.d("CXCP", this + "#awaitClosed: Controller is already closed.");
                    return Boolean.TRUE;
                }
                if (!this.ads.equals(C10370l.amazon)) {
                    Log.w("CXCP", this + "#awaitClosed: Controller isn't closing!");
                    return Boolean.FALSE;
                }
                Unit unit = Unit.INSTANCE;
                C9426l c9426l = this.pro;
                c11242l.f22635l = 1;
                if (c9426l.firebase(c11242l) == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Boolean.TRUE;
    }

    public final boolean billing() {
        return this.ads.equals(C10370l.amazon) || this.ads.equals(C10370l.crashlytics);
    }

    public final void mopub() {
        if (billing()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        AbstractC3925l abstractC3925l = this.ads;
        C10370l c10370l = C10370l.mopub;
        if (abstractC3925l.equals(c10370l)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        InterfaceC14029l interfaceC14029l = null;
        this.tapsense = null;
        C7931l c7931l = this.crashlytics;
        String str = c7931l.yandex;
        List listM4213const = AbstractC16901l.m4213const(AbstractC9905l.amazon(Collections.singleton(new C10160l(str)), new C10160l(str)));
        C11760l c11760l = new C11760l(this, 1);
        C2182l c2182l = this.subs;
        InterfaceC2262l interfaceC2262l = c2182l.amazon;
        C18548l c18548l = this.amazon;
        C17266l c17266l = new C17266l(str, c18548l, interfaceC2262l);
        if (((C7119l) c2182l.purchase.f3604l).amazon(new C2185l(c17266l, listM4213const, c18548l, c11760l)) instanceof C15230l) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) C10160l.loadAd(str)) + '!');
            c18548l.yandex(new C11769l(12, false));
            c17266l = null;
        }
        if (c17266l == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
            return;
        }
        if (this.ad != null) {
            C8339l.smaato("Check failed.");
            return;
        }
        if (this.advert != null) {
            C8339l.smaato("Check failed.");
            return;
        }
        this.ad = c17266l;
        C15202l c15202l = new C15202l(c18548l, this.mopub, this.admob, this.isPro, this.smaato, c7931l.metrica, null, this.metrica, this.loadAd, this.yandex);
        this.advert = c15202l;
        Map map = this.isVip;
        if (map != null) {
            c15202l.firebase(map);
        }
        this.ads = c10370l;
        Log.d("CXCP", "Started " + this);
        C7504l c7504l = this.signatures;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.signatures = AbstractC10999l.mopub(this.yandex, null, 0, new C7588l(this, interfaceC14029l, 2), 3);
    }

    public final void purchase(C15202l c15202l, C17266l c17266l) {
        C13624l c13624l = new C13624l(c15202l, c17266l, null, 6);
        int i = 0;
        C7504l c7504lMopub = AbstractC10999l.mopub(this.yandex, null, 0, c13624l, 3);
        if (this.ads.equals(C10370l.amazon)) {
            c7504lMopub.mo2154l(new C11760l(this, i));
        }
    }

    public final void subs(Map map) {
        synchronized (this.startapp) {
            if (billing()) {
                return;
            }
            this.isVip = map;
            C15202l c15202l = this.advert;
            if (c15202l != null) {
                c15202l.firebase(map);
            }
        }
    }

    public final String toString() {
        return "Camera2CameraController(" + this.remoteconfig + ')';
    }
}
