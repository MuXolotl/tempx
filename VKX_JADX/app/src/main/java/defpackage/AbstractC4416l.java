package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: lۣؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4416l {
    public final int admob;
    public final C3797l amazon;
    public final C7800l billing;
    public final C1770l crashlytics;
    public final C14138l isPro;
    public final String loadAd;
    public final Looper mopub;
    public final InterfaceC13945l purchase;
    public final C18450l subs;
    public final Context yandex;

    public AbstractC4416l(Context context, C3797l c3797l, InterfaceC13945l interfaceC13945l, C1308l c1308l) {
        AbstractC1051l.isPro(context, "Null context is not permitted.");
        AbstractC1051l.isPro(c3797l, "Api must not be null.");
        AbstractC1051l.isPro(c1308l, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC1051l.isPro(applicationContext, "The provided context did not have an application context.");
        this.yandex = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.loadAd = attributionTag;
        this.crashlytics = i >= 31 ? new C1770l(5, context.getAttributionSource()) : null;
        this.amazon = c3797l;
        this.purchase = interfaceC13945l;
        this.mopub = c1308l.loadAd;
        this.billing = new C7800l(c3797l, interfaceC13945l, attributionTag);
        C14138l c14138lAmazon = C14138l.amazon(applicationContext);
        this.isPro = c14138lAmazon;
        this.admob = c14138lAmazon.f27641l.getAndIncrement();
        this.subs = c1308l.yandex;
        HandlerC4052l handlerC4052l = c14138lAmazon.f27638l;
        handlerC4052l.sendMessage(handlerC4052l.obtainMessage(7, this));
    }

    public final C18096l amazon(Object obj, String str) {
        Looper looper = this.mopub;
        AbstractC1051l.isPro(obj, "Listener must not be null");
        AbstractC1051l.isPro(looper, "Looper must not be null");
        C18096l c18096l = new C18096l();
        c18096l.yandex = new ExecutorC0877l(looper);
        AbstractC1051l.isPro(obj, "Listener must not be null");
        AbstractC1051l.billing(str);
        c18096l.loadAd = new C12648l(obj, str);
        return c18096l;
    }

    public final C3823l crashlytics(C12648l c12648l, int i) {
        AbstractC1051l.isPro(c12648l, "Listener key cannot be null.");
        C14138l c14138l = this.isPro;
        c14138l.getClass();
        C2350l c2350l = new C2350l();
        c14138l.loadAd(c2350l, i, this);
        C8144l c8144l = new C8144l(new C0026l(c12648l, c2350l), c14138l.f27648l.get(), this);
        HandlerC4052l handlerC4052l = c14138l.f27638l;
        handlerC4052l.sendMessage(handlerC4052l.obtainMessage(13, c8144l));
        return c2350l.yandex;
    }

    public final C3823l loadAd(C13568l c13568l) {
        AbstractC1051l.isPro((C12648l) ((C18096l) ((C1196l) c13568l.f26581l).f3253l).loadAd, "Listener has already been released.");
        C17516l c17516l = (C17516l) c13568l.f26580l;
        AbstractC1051l.isPro((C12648l) c17516l.f34134l, "Listener has already been released.");
        C1196l c1196l = (C1196l) c13568l.f26581l;
        C14138l c14138l = this.isPro;
        c14138l.getClass();
        C2350l c2350l = new C2350l();
        c14138l.loadAd(c2350l, c1196l.f3249l, this);
        C8144l c8144l = new C8144l(new C0026l(new C10988l(c1196l, c17516l), c2350l), c14138l.f27648l.get(), this);
        HandlerC4052l handlerC4052l = c14138l.f27638l;
        handlerC4052l.sendMessage(handlerC4052l.obtainMessage(8, c8144l));
        return c2350l.yandex;
    }

    public final C3823l purchase(int i, C8662l c8662l) {
        C2350l c2350l = new C2350l();
        C14138l c14138l = this.isPro;
        c14138l.getClass();
        c14138l.loadAd(c2350l, c8662l.loadAd, this);
        C8144l c8144l = new C8144l(new C17665l(i, c8662l, c2350l, this.subs), c14138l.f27648l.get(), this);
        HandlerC4052l handlerC4052l = c14138l.f27638l;
        handlerC4052l.sendMessage(handlerC4052l.obtainMessage(4, c8144l));
        return c2350l.yandex;
    }

    public final C10111l yandex() {
        C10111l c10111l = new C10111l(11, false);
        Set set = Collections.EMPTY_SET;
        if (((C10834l) c10111l.f20587l) == null) {
            c10111l.f20587l = new C10834l(0);
        }
        ((C10834l) c10111l.f20587l).addAll(set);
        Context context = this.yandex;
        c10111l.f20589l = context.getClass().getName();
        c10111l.f20586l = context.getPackageName();
        return c10111l;
    }
}
