package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؚۖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7447l {
    public final InterfaceC11766l admob;
    public final InterfaceC11766l amazon;
    public final InterfaceC11766l billing;
    public final InterfaceC11766l crashlytics;
    public final Context loadAd;
    public final C2079l mopub;
    public final InterfaceC11766l purchase;
    public final C7258l subs;
    public final C5991l yandex = new C5991l((byte) 0, 19);
    public static final Object isPro = new Object();
    public static final AtomicReference firebase = new AtomicReference();
    public static volatile C7447l smaato = null;
    public static final InterfaceC11766l remoteconfig = AbstractC15788l.purchase(C11360l.f22905l);

    public C7447l(Context context, InterfaceC11766l interfaceC11766l, InterfaceC11766l interfaceC11766l2, InterfaceC11766l interfaceC11766l3, InterfaceC11766l interfaceC11766l4, InterfaceC11766l interfaceC11766l5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        interfaceC11766l.getClass();
        interfaceC11766l2.getClass();
        interfaceC11766l3.getClass();
        interfaceC11766l4.getClass();
        interfaceC11766l5.getClass();
        InterfaceC11766l interfaceC11766lPurchase = AbstractC15788l.purchase(interfaceC11766l);
        InterfaceC11766l interfaceC11766lPurchase2 = AbstractC15788l.purchase(interfaceC11766l2);
        InterfaceC11766l interfaceC11766lPurchase3 = AbstractC15788l.purchase(new C11478l(interfaceC11766l3, 0));
        InterfaceC11766l interfaceC11766lPurchase4 = AbstractC15788l.purchase(interfaceC11766l4);
        InterfaceC11766l interfaceC11766lPurchase5 = AbstractC15788l.purchase(interfaceC11766l5);
        this.loadAd = applicationContext;
        this.crashlytics = interfaceC11766lPurchase;
        this.amazon = interfaceC11766lPurchase2;
        this.purchase = interfaceC11766lPurchase3;
        this.billing = interfaceC11766lPurchase4;
        this.mopub = new C2079l(applicationContext, interfaceC11766lPurchase, interfaceC11766lPurchase4, interfaceC11766lPurchase2);
        this.admob = interfaceC11766lPurchase5;
        this.subs = new C7258l(applicationContext, interfaceC11766lPurchase, interfaceC11766lPurchase3, interfaceC11766lPurchase2);
    }

    public static void loadAd() {
        AbstractC9151l.firebase();
        if (firebase.get() == null && AbstractC9151l.loadAd == null) {
            AbstractC9151l.loadAd = new C10756l(15);
        }
    }

    public final ScheduledExecutorServiceC6354l yandex() {
        return (ScheduledExecutorServiceC6354l) this.crashlytics.get();
    }
}
