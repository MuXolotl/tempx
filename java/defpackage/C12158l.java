package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: lِ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12158l {
    public Object admob;
    public final Object amazon;
    public Object billing;
    public final Object crashlytics;
    public Object firebase;
    public Object isPro;
    public int loadAd;
    public Object mopub;
    public final Object purchase;
    public Object smaato;
    public Object subs;
    public final /* synthetic */ int yandex;

    public C12158l(Context context, String str, C15813l c15813l) {
        boolean z = false;
        this.yandex = 0;
        this.crashlytics = str;
        this.amazon = c15813l;
        this.purchase = context.getApplicationContext();
        C18662l c18662l = c15813l.yandex.yandex;
        this.billing = c18662l == null ? null : c18662l;
        this.mopub = new AtomicBoolean(true);
        this.subs = AbstractC3861l.yandex(0, 0, 1);
        this.isPro = new C18396l(this, c15813l.loadAd, z, 8);
        this.firebase = new BinderC16987l(this);
        this.smaato = new ServiceConnectionC14290l(this);
    }

    public void crashlytics() {
        int iInmobi = AbstractC5020l.inmobi(this.loadAd);
        if (iInmobi == 0) {
            this.loadAd = 5;
            return;
        }
        int i = 2;
        if (iInmobi != 1 && iInmobi != 2 && iInmobi != 3) {
            int i2 = this.loadAd;
            if (iInmobi != 4) {
                C18353l.vip(AbstractC12589l.m3419extends(i2), " is not handled", "State ");
                return;
            }
            AbstractC5088l.yandex("VideoEncoderSession", "terminateNow in " + AbstractC12589l.m3419extends(i2) + ", No-op");
            return;
        }
        this.loadAd = 5;
        ((C5807l) this.smaato).loadAd((C7025l) this.billing);
        this.admob = null;
        if (((C7025l) this.billing) == null) {
            AbstractC5088l.tapsense("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            ((C5807l) this.isPro).loadAd(null);
            return;
        }
        AbstractC5088l.yandex("VideoEncoderSession", "VideoEncoder is releasing: " + ((C7025l) this.billing));
        C7025l c7025l = (C7025l) this.billing;
        c7025l.admob.execute(new RunnableC5229l(c7025l, i));
        ((C7025l) this.billing).subs.yandex(new RunnableC6665l(16, this), (Executor) this.amazon);
        this.billing = null;
    }

    public void loadAd(Intent intent) {
        if (((AtomicBoolean) this.mopub).compareAndSet(true, false)) {
            ((Context) this.purchase).bindService(intent, (ServiceConnectionC14290l) this.smaato, 1);
            C15813l c15813l = (C15813l) this.amazon;
            C18396l c18396l = (C18396l) this.isPro;
            LinkedHashMap linkedHashMap = c15813l.amazon;
            C17274l c17274l = c15813l.crashlytics;
            C8195l c8195lIsPro = c17274l.isPro((String[]) c18396l.f35934l);
            String[] strArr = (String[]) c8195lIsPro.f17098l;
            int[] iArr = (int[]) c8195lIsPro.f17097l;
            C18340l c18340l = new C18340l(c18396l, iArr, strArr);
            ReentrantLock reentrantLock = c15813l.purchase;
            reentrantLock.lock();
            try {
                C18340l c18340l2 = linkedHashMap.containsKey(c18396l) ? (C18340l) AbstractC8676l.smaato(c18396l, linkedHashMap) : (C18340l) linkedHashMap.put(c18396l, c18340l);
                reentrantLock.unlock();
                if (c18340l2 == null) {
                    ((C11919l) c17274l.admob).remoteconfig(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 1:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((C15691l) this.admob, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public void yandex() {
        int iInmobi = AbstractC5020l.inmobi(this.loadAd);
        if (iInmobi == 0 || iInmobi == 1) {
            crashlytics();
            return;
        }
        if (iInmobi != 2 && iInmobi != 3) {
            if (iInmobi == 4) {
                AbstractC5088l.yandex("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
                return;
            } else {
                C18353l.vip(AbstractC12589l.m3419extends(this.loadAd), " is not handled", "State ");
                return;
            }
        }
        AbstractC5088l.yandex("VideoEncoderSession", "closeInternal in " + AbstractC12589l.m3419extends(this.loadAd) + " state");
        this.loadAd = 3;
    }

    public C12158l(C11983l c11983l, ExecutorC7870l executorC7870l, Executor executor) {
        this.yandex = 1;
        this.billing = null;
        this.mopub = null;
        this.admob = null;
        this.loadAd = 1;
        this.subs = new C11077l(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.isPro = null;
        this.firebase = new C11077l(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.smaato = null;
        this.crashlytics = executor;
        this.amazon = executorC7870l;
        this.purchase = c11983l;
    }
}
