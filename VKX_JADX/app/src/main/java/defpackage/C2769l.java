package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔٝؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2769l implements InterfaceC6474l {
    public final C15578l yandex;
    public final C16801l loadAd = new C16801l();
    public final C10086l crashlytics = AbstractC8020l.smaato(null);

    public C2769l(C15578l c15578l) {
        this.yandex = c15578l;
    }

    public final void loadAd(final Function0 function0, C6956l c6956l, final int i) {
        final Function0 function1;
        C6956l c6956l2;
        c6956l.m2133new(723898654);
        int i2 = (c6956l.billing(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C8300l c8300l = (C8300l) this.crashlytics.getValue();
            if (c8300l == null) {
                C4224l c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2(this, function0, i, i3) { // from class: lؚٝۜ

                        /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                        public final /* synthetic */ Function0 f15332l;

                        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                        public final /* synthetic */ C2769l f15333l;

                        /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                        public final /* synthetic */ int f15334l;

                        {
                            this.f15334l = i3;
                            this.f15333l = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f15334l;
                            C6956l c6956l3 = (C6956l) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    this.f15333l.loadAd(this.f15332l, c6956l3, AbstractC0545l.purchase(7));
                                    break;
                                default:
                                    this.f15333l.loadAd(this.f15332l, c6956l3, AbstractC0545l.purchase(7));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            function1 = function0;
            c6956l2 = c6956l;
            this.yandex.invoke(c8300l, c8300l.yandex, function1, c6956l2, 384);
        } else {
            function1 = function0;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds2 = c6956l2.ads();
        if (c4224lAds2 != null) {
            c4224lAds2.amazon = new Function2(this, function1, i, i4) { // from class: lؚٝۜ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f15332l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C2769l f15333l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ int f15334l;

                {
                    this.f15334l = i4;
                    this.f15333l = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f15334l;
                    C6956l c6956l3 = (C6956l) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.f15333l.loadAd(this.f15332l, c6956l3, AbstractC0545l.purchase(7));
                            break;
                        default:
                            this.f15333l.loadAd(this.f15332l, c6956l3, AbstractC0545l.purchase(7));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // defpackage.InterfaceC6474l
    public final Object yandex(InterfaceC15209l interfaceC15209l, AbstractC5563l abstractC5563l) {
        Object objLoadAd = C16801l.loadAd(this.loadAd, new C6208l(this, new C8300l(interfaceC15209l), null, 2), abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }
}
