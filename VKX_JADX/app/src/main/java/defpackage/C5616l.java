package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5616l {
    public final AbstractC2249l admob;
    public final C10086l amazon;
    public final C4793l billing;
    public final C6570l crashlytics;
    public AbstractC2249l firebase;
    public AbstractC2249l isPro;
    public final Object loadAd;
    public final C13315l mopub;
    public final C10086l purchase;
    public final AbstractC2249l subs;
    public final C0010l yandex;

    public C5616l(Object obj, C0010l c0010l, Object obj2) {
        this.yandex = c0010l;
        this.loadAd = obj2;
        C6570l c6570l = new C6570l(c0010l, obj, null, 60);
        this.crashlytics = c6570l;
        this.amazon = AbstractC8020l.smaato(Boolean.FALSE);
        this.purchase = AbstractC8020l.smaato(obj);
        this.billing = new C4793l();
        this.mopub = new C13315l(obj2);
        AbstractC2249l abstractC2249l = c6570l.f13719l;
        boolean z = abstractC2249l instanceof C11951l;
        AbstractC2249l abstractC2249l2 = z ? AbstractC6791l.purchase : abstractC2249l instanceof C15709l ? AbstractC6791l.billing : abstractC2249l instanceof C5951l ? AbstractC6791l.mopub : AbstractC6791l.admob;
        this.admob = abstractC2249l2;
        AbstractC2249l abstractC2249l3 = z ? AbstractC6791l.yandex : abstractC2249l instanceof C15709l ? AbstractC6791l.loadAd : abstractC2249l instanceof C5951l ? AbstractC6791l.crashlytics : AbstractC6791l.amazon;
        this.subs = abstractC2249l3;
        this.isPro = abstractC2249l2;
        this.firebase = abstractC2249l3;
    }

    public static Object loadAd(C5616l c5616l, Object obj, InterfaceC1489l interfaceC1489l, Float f, Function1 function1, InterfaceC14029l interfaceC14029l, int i) {
        if ((i & 2) != 0) {
            interfaceC1489l = c5616l.mopub;
        }
        InterfaceC1489l interfaceC1489l2 = interfaceC1489l;
        Object objInvoke = f;
        if ((i & 4) != 0) {
            objInvoke = c5616l.yandex.loadAd.invoke(c5616l.crashlytics.f13719l);
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        Object objAmazon = c5616l.amazon();
        C0010l c0010l = c5616l.yandex;
        return C4793l.yandex(c5616l.billing, new C1092l(c5616l, objInvoke, new C5810l(interfaceC1489l2, c0010l, objAmazon, obj, (AbstractC2249l) c0010l.yandex.invoke(objInvoke)), c5616l.crashlytics.f13723l, function1, null), interfaceC14029l);
    }

    public static final void yandex(C5616l c5616l) {
        C6570l c6570l = c5616l.crashlytics;
        c6570l.f13719l.amazon();
        c6570l.f13723l = Long.MIN_VALUE;
        c5616l.amazon.setValue(Boolean.FALSE);
    }

    public final Object amazon() {
        return this.crashlytics.f13720l.getValue();
    }

    public final Object billing(InterfaceC14029l interfaceC14029l, Object obj) {
        Object objYandex = C4793l.yandex(this.billing, new C1474l(this, obj, null, 0), interfaceC14029l);
        return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
    }

    public final Object crashlytics(Object obj) {
        if (!AbstractC8576l.yandex(this.isPro, this.admob) || !AbstractC8576l.yandex(this.firebase, this.subs)) {
            C0010l c0010l = this.yandex;
            AbstractC2249l abstractC2249l = (AbstractC2249l) c0010l.yandex.invoke(obj);
            int iLoadAd = abstractC2249l.loadAd();
            boolean z = false;
            for (int i = 0; i < iLoadAd; i++) {
                if (abstractC2249l.yandex(i) < this.isPro.yandex(i) || abstractC2249l.yandex(i) > this.firebase.yandex(i)) {
                    abstractC2249l.purchase(i, AbstractC8576l.amazon(abstractC2249l.yandex(i), this.isPro.yandex(i), this.firebase.yandex(i)));
                    z = true;
                }
            }
            if (z) {
                return c0010l.loadAd.invoke(abstractC2249l);
            }
        }
        return obj;
    }

    public final Object mopub(AbstractC5563l abstractC5563l) {
        Object objYandex = C4793l.yandex(this.billing, new C4978l(this, null, 0), abstractC5563l);
        return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
    }

    public final boolean purchase() {
        return ((Boolean) this.amazon.getValue()).booleanValue();
    }

    public /* synthetic */ C5616l(Object obj, C0010l c0010l, Object obj2, int i) {
        this(obj, c0010l, (i & 4) != 0 ? null : obj2);
    }
}
