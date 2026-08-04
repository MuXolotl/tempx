package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lٕ۠ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15973l {
    public final C7847l amazon;
    public final C12418l crashlytics;
    public C7502l loadAd;
    public final C1381l yandex;

    public C15973l() {
        C1381l c1381l = new C1381l();
        this.yandex = c1381l;
        this.loadAd = ((C7502l) c1381l.f3512l).isPro();
        this.crashlytics = new C12418l(13);
        this.amazon = new C7847l();
        final int i = 1;
        Callable callable = new Callable(this) { // from class: lٍۖٚ
            public final /* synthetic */ C15973l loadAd;

            {
                this.loadAd = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                C15973l c15973l = this.loadAd;
                switch (i2) {
                    case 0:
                        return new C8570l(c15973l.crashlytics);
                    default:
                        return new C8570l(c15973l.amazon);
                }
            }
        };
        C3316l c3316l = (C3316l) c1381l.f3514l;
        ((HashMap) c3316l.f7072l).put("internal.registerCallback", callable);
        final int i2 = 0;
        ((HashMap) c3316l.f7072l).put("internal.eventLogger", new Callable(this) { // from class: lٍۖٚ
            public final /* synthetic */ C15973l loadAd;

            {
                this.loadAd = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i2;
                C15973l c15973l = this.loadAd;
                switch (i3) {
                    case 0:
                        return new C8570l(c15973l.crashlytics);
                    default:
                        return new C8570l(c15973l.amazon);
                }
            }
        });
    }

    public final void loadAd(C9618l c9618l) {
        AbstractC10453l abstractC10453l;
        try {
            C1381l c1381l = this.yandex;
            this.loadAd = ((C7502l) c1381l.f3512l).isPro();
            if (c1381l.billing(this.loadAd, (C3683l[]) c9618l.tapsense().toArray(new C3683l[0])) instanceof C11926l) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C14994l c14994l : c9618l.Signature().tapsense()) {
                List listSignature = c14994l.Signature();
                String strTapsense = c14994l.tapsense();
                Iterator it = listSignature.iterator();
                while (it.hasNext()) {
                    InterfaceC2167l interfaceC2167lBilling = c1381l.billing(this.loadAd, (C3683l) it.next());
                    if (!(interfaceC2167lBilling instanceof C10303l)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C7502l c7502l = this.loadAd;
                    if (c7502l.firebase(strTapsense)) {
                        InterfaceC2167l interfaceC2167lVip = c7502l.vip(strTapsense);
                        if (!(interfaceC2167lVip instanceof AbstractC10453l)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strTapsense)));
                        }
                        abstractC10453l = (AbstractC10453l) interfaceC2167lVip;
                    } else {
                        abstractC10453l = null;
                    }
                    if (abstractC10453l == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strTapsense)));
                    }
                    abstractC10453l.yandex(this.loadAd, Collections.singletonList(interfaceC2167lBilling));
                }
            }
        } catch (Throwable th) {
            throw new C17540l(th);
        }
    }

    public final boolean yandex(C17235l c17235l) throws C17540l {
        C12418l c12418l = this.crashlytics;
        try {
            c12418l.f24519l = c17235l;
            c12418l.f24518l = c17235l.clone();
            ((ArrayList) c12418l.f24521l).clear();
            ((C7502l) this.yandex.f3511l).smaato("runtime.counter", new C14259l(Double.valueOf(0.0d)));
            this.amazon.crashlytics(this.loadAd.isPro(), c12418l);
            return (((C17235l) c12418l.f24518l).equals((C17235l) c12418l.f24519l) && ((ArrayList) c12418l.f24521l).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new C17540l(th);
        }
    }
}
