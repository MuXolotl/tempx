package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٔٞؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15048l implements InterfaceC0930l {
    public C9426l admob;
    public final C8688l amazon;
    public boolean billing;
    public final float crashlytics;
    public final float loadAd;
    public InterfaceC16983l mopub;
    public final C8688l purchase;
    public final InterfaceC4902l yandex;

    public C15048l(InterfaceC4902l interfaceC4902l) {
        this.yandex = interfaceC4902l;
        this.loadAd = interfaceC4902l.billing();
        this.crashlytics = interfaceC4902l.loadAd();
        final int i = 0;
        this.amazon = new C8688l(new Function0(this) { // from class: lِؖۦ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15048l f8364l;

            {
                this.f8364l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C15048l c15048l = this.f8364l;
                switch (i2) {
                    case 0:
                        return new C11888l(1.0f, c15048l.loadAd, c15048l.crashlytics);
                    default:
                        return new C13716l((C11888l) c15048l.amazon.getValue());
                }
            }
        });
        final int i2 = 1;
        this.purchase = new C8688l(new Function0(this) { // from class: lِؖۦ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15048l f8364l;

            {
                this.f8364l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C15048l c15048l = this.f8364l;
                switch (i3) {
                    case 0:
                        return new C11888l(1.0f, c15048l.loadAd, c15048l.crashlytics);
                    default:
                        return new C13716l((C11888l) c15048l.amazon.getValue());
                }
            }
        });
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.mopub = interfaceC16983l;
        C11888l c11888l = (C11888l) ((C13716l) this.purchase.getValue()).amazon();
        if (c11888l == null) {
            c11888l = (C11888l) this.amazon.getValue();
        }
        yandex(c11888l, false, this.billing || c11888l.yandex() != 1.0f);
        this.billing = true;
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        yandex((C11888l) this.amazon.getValue(), true, true);
    }

    public final ListenableFuture yandex(C11888l c11888l, boolean z, boolean z2) {
        C9426l c9426l = new C9426l();
        C9426l c9426l2 = this.admob;
        if (c9426l2 != null) {
            if (z) {
                AbstractC14814l.isVip("Cancelled due to another zoom value being set.", c9426l2);
            } else {
                AbstractC0140l.vip(c9426l, c9426l2);
            }
        }
        this.admob = c9426l;
        boolean zPurchase = AbstractC12225l.purchase();
        C8688l c8688l = this.purchase;
        if (zPurchase) {
            ((C13716l) c8688l.getValue()).subs(c11888l);
        } else {
            ((C13716l) c8688l.getValue()).isPro(c11888l);
        }
        InterfaceC16983l interfaceC16983l = this.mopub;
        if (interfaceC16983l != null) {
            float fYandex = c11888l.yandex();
            InterfaceC4902l interfaceC4902l = this.yandex;
            AbstractC0140l.vip(z2 ? interfaceC4902l.smaato(fYandex, interfaceC16983l) : interfaceC4902l.firebase(interfaceC16983l), c9426l);
        } else {
            AbstractC14814l.isVip("Camera is not active.", c9426l);
        }
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = C2683l.class;
        try {
            c9426l.mo2154l(new C15079l(6, c5807l));
            c5807l.yandex = "Job.asListenableFuture";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        return AbstractC11356l.admob(c16565l);
    }
}
