package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.List;

/* JADX INFO: renamed from: lٕ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17977l implements IBinder.DeathRecipient {
    public final Handler amazon;
    public BinderC18564l crashlytics;
    public HandlerC7734l loadAd;
    public final /* synthetic */ C0188l purchase;
    public final C2516l yandex = new C2516l(this);

    public C17977l(C0188l c0188l, Looper looper) {
        this.purchase = c0188l;
        this.amazon = new Handler(looper, new C6352l(2, this));
    }

    public final void amazon(Handler handler) {
        if (handler != null) {
            HandlerC7734l handlerC7734l = new HandlerC7734l(this, handler.getLooper());
            this.loadAd = handlerC7734l;
            handlerC7734l.loadAd = true;
        } else {
            HandlerC7734l handlerC7734l2 = this.loadAd;
            if (handlerC7734l2 != null) {
                handlerC7734l2.loadAd = false;
                handlerC7734l2.removeCallbacksAndMessages(null);
                this.loadAd = null;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        crashlytics(8, null);
    }

    public final void crashlytics(int i, Object obj) {
        HandlerC7734l handlerC7734l = this.loadAd;
        if (handlerC7734l != null) {
            handlerC7734l.obtainMessage(i, obj).sendToTarget();
        }
    }

    public final void loadAd(C16830l c16830l) {
        C0188l c0188l = this.purchase;
        C5908l c5908l = c0188l.vip;
        c0188l.vip = new C5908l((C13052l) c5908l.f12452l, C0188l.m290l(c16830l), (C8937l) c5908l.f12457l, (List) c5908l.f12459l, (CharSequence) c5908l.f12453l, c5908l.f12456l, c5908l.f12455l, (Bundle) c5908l.f12454l);
        purchase();
    }

    public final void purchase() {
        Handler handler = this.amazon;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.purchase.admob);
    }

    public final void yandex(boolean z) {
        C16811l c16811l = this.purchase.loadAd;
        c16811l.getClass();
        AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
        InterfaceC14026l interfaceC14026l = c16811l.f32840l;
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        interfaceC14026l.subscription(c16811l, new C12417l("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY), bundle);
    }
}
