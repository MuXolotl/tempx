package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16859l extends AbstractC1679l {
    public final C4568l admob;
    public C6295l amazon;
    public InterfaceC0389l billing;
    public Object crashlytics;
    public Object loadAd;
    public final C16931l mopub = new C16931l(25, this);
    public C6295l purchase;

    public C16859l() {
        C1645l c1645l = new C1645l(10, this);
        AbstractC9620l.purchase(AbstractC9620l.yandex);
        synchronized (AbstractC9620l.crashlytics) {
            AbstractC9620l.admob = AbstractC16901l.m4218final(c1645l, AbstractC9620l.admob);
            Unit unit = Unit.INSTANCE;
        }
        this.admob = new C4568l(4, c1645l);
    }

    @Override // defpackage.AbstractC1679l
    public final Function1 amazon(InterfaceC0389l interfaceC0389l) {
        InterfaceC0389l interfaceC0389l2 = this.billing;
        if (interfaceC0389l2 != null && !interfaceC0389l2.equals(interfaceC0389l)) {
            AbstractC5363l.loadAd("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.billing = interfaceC0389l;
        return this.mopub;
    }

    @Override // defpackage.AbstractC1679l
    public final void crashlytics() {
        this.admob.crashlytics();
        this.crashlytics = null;
        this.purchase = null;
        synchronized (this.yandex) {
            this.billing = null;
            this.loadAd = null;
            this.amazon = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC1679l
    public final void loadAd() {
        synchronized (this.yandex) {
            try {
                this.loadAd = this.crashlytics;
                if (this.purchase == null) {
                    this.amazon = null;
                } else {
                    if (this.amazon == null) {
                        C6295l c6295l = AbstractC13087l.yandex;
                        this.amazon = new C6295l();
                    }
                    C6295l c6295l2 = this.amazon;
                    this.amazon = this.purchase;
                    this.purchase = c6295l2;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC1679l
    public final void purchase(InterfaceC14592l interfaceC14592l) {
        this.billing = null;
        this.crashlytics = null;
        this.purchase = null;
        loadAd();
    }

    @Override // defpackage.AbstractC1679l
    public final void yandex(InterfaceC0389l interfaceC0389l) {
        this.crashlytics = null;
        this.purchase = null;
    }
}
