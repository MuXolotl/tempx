package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٝۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11194l implements InterfaceC17955l {
    public static final C13645l firebase = new C13645l(new C2062l(26), new C10557l(17), 13);
    public final C8610l isPro;
    public float mopub;
    public final C8610l subs;
    public final C15308l yandex;
    public final C15308l loadAd = new C15308l(0);
    public final C15308l crashlytics = new C15308l(0);
    public final C10086l amazon = AbstractC8020l.smaato(Boolean.FALSE);
    public final C2403l purchase = new C2403l();
    public final C15308l billing = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
    public final C7239l admob = new C7239l(new C16931l(15, this));

    public C11194l(int i) {
        this.yandex = new C15308l(i);
        final int i2 = 0;
        this.subs = AbstractC8020l.mopub(new Function0(this) { // from class: lؓۧؐ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11194l f4944l;

            {
                this.f4944l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C11194l c11194l = this.f4944l;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(c11194l.yandex.admob() < c11194l.billing.admob());
                    default:
                        return Boolean.valueOf(c11194l.yandex.admob() > 0);
                }
            }
        });
        final int i3 = 1;
        this.isPro = AbstractC8020l.mopub(new Function0(this) { // from class: lؓۧؐ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11194l f4944l;

            {
                this.f4944l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                C11194l c11194l = this.f4944l;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c11194l.yandex.admob() < c11194l.billing.admob());
                    default:
                        return Boolean.valueOf(c11194l.yandex.admob() > 0);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean amazon() {
        return ((Boolean) this.subs.getValue()).booleanValue();
    }

    public final void billing(int i) {
        C15308l c15308l = this.yandex;
        this.billing.subs(i);
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            if (c15308l.admob() > i) {
                c15308l.subs(i);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean crashlytics() {
        return ((Boolean) this.isPro.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final Object loadAd(EnumC11011l enumC11011l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        Object objLoadAd = this.admob.loadAd(enumC11011l, function2, interfaceC14029l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17955l
    public final float purchase(float f) {
        return this.admob.purchase(f);
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean yandex() {
        return this.admob.yandex();
    }
}
