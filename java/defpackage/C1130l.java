package defpackage;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1130l {
    public final C18474l admob;
    public final InterfaceC15897l amazon;
    public final InterfaceC15897l billing;
    public final InterfaceC16983l crashlytics;
    public final C8688l isPro;
    public final C14338l loadAd;
    public final int mopub;
    public final InterfaceC15897l purchase;
    public final C8688l subs;
    public final C16047l yandex;

    public C1130l(C16047l c16047l, C14338l c14338l, InterfaceC16983l interfaceC16983l, InterfaceC15897l interfaceC15897l, InterfaceC15897l interfaceC15897l2, InterfaceC15897l interfaceC15897l3) {
        this.yandex = c16047l;
        this.loadAd = c14338l;
        this.crashlytics = interfaceC16983l;
        this.amazon = interfaceC15897l;
        this.purchase = interfaceC15897l2;
        this.billing = interfaceC15897l3;
        C11879l c11879l = AbstractC3222l.yandex;
        c11879l.getClass();
        this.mopub = C11879l.loadAd.incrementAndGet(c11879l);
        final int i = 0;
        this.admob = AbstractC1805l.yandex(false);
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.subs = new C8688l(new Function0(this) { // from class: lٌٔؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C1130l f28651l;

            {
                this.f28651l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C1130l c1130l = this.f28651l;
                switch (i2) {
                    case 0:
                        return (C4271l) c1130l.amazon.get();
                    case 1:
                        return (C9395l) c1130l.purchase.get();
                    default:
                        return (InterfaceC17552l) c1130l.billing.get();
                }
            }
        });
        final int i2 = 1;
        this.isPro = new C8688l(new Function0(this) { // from class: lٌٔؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C1130l f28651l;

            {
                this.f28651l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C1130l c1130l = this.f28651l;
                switch (i3) {
                    case 0:
                        return (C4271l) c1130l.amazon.get();
                    case 1:
                        return (C9395l) c1130l.purchase.get();
                    default:
                        return (InterfaceC17552l) c1130l.billing.get();
                }
            }
        });
        final int i3 = 2;
        new C8688l(new Function0(this) { // from class: lٌٔؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C1130l f28651l;

            {
                this.f28651l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                C1130l c1130l = this.f28651l;
                switch (i4) {
                    case 0:
                        return (C4271l) c1130l.amazon.get();
                    case 1:
                        return (C9395l) c1130l.purchase.get();
                    default:
                        return (InterfaceC17552l) c1130l.billing.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.mopub;
    }
}
