package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0294l {
    public Object amazon;
    public Object billing;
    public boolean crashlytics;
    public final Object loadAd;
    public final Object purchase;
    public final /* synthetic */ int yandex;

    public AbstractC0294l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new Object();
                this.purchase = new C13123l(1, this);
                this.amazon = new WeakReference(null);
                break;
            default:
                this.loadAd = new Object();
                this.purchase = new C13123l(0, this);
                this.amazon = new WeakReference(null);
                break;
        }
    }

    private boolean firebase(Intent intent) {
        C1139l c1139l;
        HandlerC8616l handlerC8616l;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.loadAd) {
                c1139l = (C1139l) ((WeakReference) this.amazon).get();
                handlerC8616l = (HandlerC8616l) this.billing;
            }
            if (c1139l != null && handlerC8616l != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C16701l c16701lCrashlytics = c1139l.crashlytics();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    crashlytics(c1139l, handlerC8616l);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    crashlytics(c1139l, handlerC8616l);
                    return true;
                }
                if (!this.crashlytics) {
                    this.crashlytics = true;
                    handlerC8616l.sendMessageDelayed(handlerC8616l.obtainMessage(1, c16701lCrashlytics), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                handlerC8616l.removeMessages(1);
                this.crashlytics = false;
                C16830l c16830l = c1139l.mopub;
                if (((c16830l == null ? 0L : c16830l.f32855l) & 32) != 0) {
                    mo414strictfp();
                }
                return true;
            }
        }
        return false;
    }

    public static void yandex(C9185l c9185l) {
        List list = c9185l.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C15730l) list.get(i)).yandex();
        }
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public void m409case(C1139l c1139l, Handler handler) {
        synchronized (this.loadAd) {
            try {
                this.amazon = new WeakReference(c1139l);
                HandlerC8616l handlerC8616l = (HandlerC8616l) this.billing;
                if (handlerC8616l != null) {
                    handlerC8616l.removeCallbacksAndMessages(null);
                }
                this.billing = new HandlerC8616l(this, handler.getLooper(), 6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void crashlytics(C1139l c1139l, Handler handler) {
        if (this.crashlytics) {
            this.crashlytics = false;
            handler.removeMessages(1);
            C16830l c16830l = c1139l.mopub;
            long j = c16830l == null ? 0L : c16830l.f32855l;
            boolean z = c16830l != null && c16830l.f32853l == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                smaato();
            } else {
                if (z || !z2) {
                    return;
                }
                metrica();
            }
        }
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m411else(C7272l c7272l, Handler handler) {
        synchronized (this.loadAd) {
            try {
                this.amazon = new WeakReference(c7272l);
                HandlerC8616l handlerC8616l = (HandlerC8616l) this.billing;
                HandlerC8616l handlerC8616l2 = null;
                if (handlerC8616l != null) {
                    handlerC8616l.removeCallbacksAndMessages(null);
                }
                if (handler != null) {
                    handlerC8616l2 = new HandlerC8616l(this, handler.getLooper(), 7);
                }
                this.billing = handlerC8616l2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isPro(Intent intent) {
        C7272l c7272l;
        HandlerC8616l handlerC8616l;
        KeyEvent keyEvent;
        switch (this.yandex) {
            case 0:
                return firebase(intent);
            default:
                if (Build.VERSION.SDK_INT >= 27) {
                    return false;
                }
                synchronized (this.loadAd) {
                    c7272l = (C7272l) ((WeakReference) this.amazon).get();
                    handlerC8616l = (HandlerC8616l) this.billing;
                    break;
                }
                if (c7272l == null || handlerC8616l == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                    return false;
                }
                C3070l c3070lCrashlytics = c7272l.crashlytics();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    loadAd(c7272l, handlerC8616l);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    loadAd(c7272l, handlerC8616l);
                } else if (this.crashlytics) {
                    handlerC8616l.removeMessages(1);
                    this.crashlytics = false;
                    PlaybackStateCompat playbackStateCompat = c7272l.billing;
                    if (((playbackStateCompat == null ? 0L : playbackStateCompat.f52l) & 32) != 0) {
                        mo414strictfp();
                    }
                } else {
                    this.crashlytics = true;
                    handlerC8616l.sendMessageDelayed(handlerC8616l.obtainMessage(1, c3070lCrashlytics), ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
        }
    }

    public void loadAd(C7272l c7272l, Handler handler) {
        if (this.crashlytics) {
            this.crashlytics = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = c7272l.billing;
            long j = playbackStateCompat == null ? 0L : playbackStateCompat.f52l;
            boolean z = playbackStateCompat != null && playbackStateCompat.f50l == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                smaato();
            } else {
                if (z || !z2) {
                    return;
                }
                metrica();
            }
        }
    }

    public void metrica() {
        int i = this.yandex;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void mo413private() {
        int i = this.yandex;
    }

    public void signatures(long j) {
        int i = this.yandex;
    }

    public void smaato() {
        int i = this.yandex;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void mo414strictfp() {
        int i = this.yandex;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public Object m415switch(Function2 function2, AbstractC0283l abstractC0283l) {
        C10593l c10593l;
        if (abstractC0283l instanceof C10593l) {
            c10593l = (C10593l) abstractC0283l;
            int i = c10593l.f21508l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10593l.f21508l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10593l = new C10593l(this, abstractC0283l);
            }
        } else {
            c10593l = new C10593l(this, abstractC0283l);
        }
        Object obj = c10593l.f21507l;
        int i2 = c10593l.f21508l;
        InterfaceC14029l interfaceC14029l = null;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            this.crashlytics = true;
            C5888l c5888l = new C5888l(this, function2, interfaceC14029l, 7);
            c10593l.f21508l = 1;
            C16063l c16063l = new C16063l(c10593l.metrica(), c10593l, i3);
            Object objBilling = AbstractC1163l.billing(c16063l, true, c16063l, c5888l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        this.crashlytics = false;
        return Unit.INSTANCE;
    }

    private void adcel() {
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    private void m405extends() {
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    private void m406for() {
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private void m407native() {
    }

    private void remoteconfig() {
    }

    private void startapp() {
    }

    private void vip() {
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    private void m408volatile() {
    }

    public void Signature() {
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void mo410catch() {
    }

    public void isVip() {
    }

    public void subs() {
    }

    private void applovin(long j) {
    }

    private void premium(long j) {
    }

    public void advert(C0579l c0579l) {
    }

    public void amazon(C0579l c0579l) {
    }

    public void appmetrica(float f) {
    }

    public void inmobi(C10388l c10388l) {
    }

    public void mopub(String str) {
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public void mo412package(int i) {
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void mo416synchronized(int i) {
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void mo417throw(long j) {
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void mo418throws(C10388l c10388l) {
    }

    public void ad(Uri uri, Bundle bundle) {
    }

    public void admob(String str, Bundle bundle) {
    }

    public void ads(String str, Bundle bundle) {
    }

    public void license(String str, Bundle bundle) {
    }

    public void pro(String str, Bundle bundle) {
    }

    public void purchase(C0579l c0579l, int i) {
    }

    public void subscription(String str, Bundle bundle) {
    }

    public void tapsense(Uri uri, Bundle bundle) {
    }

    public AbstractC0294l(C4154l c4154l, Function2 function2, InterfaceC13490l interfaceC13490l) {
        this.yandex = 2;
        this.loadAd = c4154l;
        this.purchase = function2;
        this.amazon = interfaceC13490l;
        this.billing = new C0458l(17);
    }

    public void billing(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
