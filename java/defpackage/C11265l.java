package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُۗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11265l extends AbstractC1679l {
    public final C4568l purchase;
    public final C13660l loadAd = AbstractC9831l.amazon();
    public final ArrayList crashlytics = new ArrayList();
    public final C13660l amazon = new C13660l();

    public C11265l() {
        C4951l c4951l = new C4951l(14, this);
        AbstractC9620l.purchase(AbstractC9620l.yandex);
        synchronized (AbstractC9620l.crashlytics) {
            AbstractC9620l.admob = AbstractC16901l.m4218final(c4951l, AbstractC9620l.admob);
            Unit unit = Unit.INSTANCE;
        }
        this.purchase = new C4568l(4, c4951l);
    }

    @Override // defpackage.AbstractC1679l
    public final Function1 amazon(InterfaceC0389l interfaceC0389l) {
        C13660l c13660l = this.amazon;
        Function1 function1 = (Function1) c13660l.mopub(interfaceC0389l);
        if (function1 != null) {
            return function1;
        }
        C8854l c8854l = new C8854l(this, interfaceC0389l, 5);
        c13660l.firebase(interfaceC0389l, c8854l);
        return c8854l;
    }

    @Override // defpackage.AbstractC1679l
    public final void crashlytics() {
        this.purchase.crashlytics();
        this.crashlytics.clear();
        this.amazon.yandex();
        synchronized (this.yandex) {
            this.loadAd.yandex();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC1679l
    public final void loadAd() {
        synchronized (this.yandex) {
            try {
                ArrayList arrayList = this.crashlytics;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC16572l interfaceC16572l = (InterfaceC16572l) arrayList.get(i);
                    if (interfaceC16572l instanceof C5564l) {
                        AbstractC9831l.loadAd(this.loadAd, ((C5564l) interfaceC16572l).yandex, ((C5564l) interfaceC16572l).loadAd);
                    } else {
                        if (!(interfaceC16572l instanceof C3731l)) {
                            throw new C6451l(11);
                        }
                        AbstractC9831l.isPro(this.loadAd, ((C3731l) interfaceC16572l).yandex);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.crashlytics.clear();
    }

    @Override // defpackage.AbstractC1679l
    public final void purchase(InterfaceC14592l interfaceC14592l) {
        this.amazon.smaato(interfaceC14592l);
        yandex(interfaceC14592l);
        loadAd();
    }

    @Override // defpackage.AbstractC1679l
    public final void yandex(InterfaceC0389l interfaceC0389l) {
        this.crashlytics.add(new C3731l(interfaceC0389l));
    }
}
