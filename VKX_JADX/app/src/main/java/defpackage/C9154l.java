package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٍۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9154l {
    public float amazon;
    public InterfaceC12553l billing;
    public float crashlytics;
    public float loadAd;
    public InterfaceC12553l mopub;
    public final C5616l purchase;
    public float yandex;

    public C9154l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        this.purchase = new C5616l(new C14467l(f), AbstractC3483l.mopub, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(AbstractC0283l abstractC0283l) {
        C2300l c2300l;
        float f;
        if (abstractC0283l instanceof C2300l) {
            c2300l = (C2300l) abstractC0283l;
            int i = c2300l.f5001l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2300l.f5001l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2300l = new C2300l(this, abstractC0283l);
            }
        } else {
            c2300l = new C2300l(this, abstractC0283l);
        }
        Object obj = c2300l.f5000l;
        int i2 = c2300l.f5001l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                InterfaceC12553l interfaceC12553l = this.mopub;
                if (interfaceC12553l instanceof C12951l) {
                    f = this.loadAd;
                } else if (interfaceC12553l instanceof C0261l) {
                    f = this.crashlytics;
                } else {
                    f = interfaceC12553l instanceof C7008l ? this.amazon : this.yandex;
                }
                C5616l c5616l = this.purchase;
                if (!C14467l.loadAd(((C14467l) c5616l.purchase.getValue()).f28331l, f)) {
                    C14467l c14467l = new C14467l(f);
                    c2300l.f5001l = 1;
                    Object objBilling = c5616l.billing(c2300l, c14467l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objBilling == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            this.billing = this.mopub;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.billing = this.mopub;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object yandex(InterfaceC12553l interfaceC12553l, AbstractC0283l abstractC0283l) {
        C18060l c18060l;
        float f;
        C5616l c5616l = this.purchase;
        if (abstractC0283l instanceof C18060l) {
            c18060l = (C18060l) abstractC0283l;
            int i = c18060l.f35354l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18060l.f35354l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18060l = new C18060l(this, abstractC0283l);
            }
        } else {
            c18060l = new C18060l(this, abstractC0283l);
        }
        Object obj = c18060l.f35355l;
        int i2 = c18060l.f35354l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                if (interfaceC12553l instanceof C12951l) {
                    f = this.loadAd;
                } else if (interfaceC12553l instanceof C0261l) {
                    f = this.crashlytics;
                } else {
                    f = interfaceC12553l instanceof C7008l ? this.amazon : this.yandex;
                }
                this.mopub = interfaceC12553l;
                if (!C14467l.loadAd(((C14467l) c5616l.purchase.getValue()).f28331l, f)) {
                    InterfaceC12553l interfaceC12553l2 = this.billing;
                    c18060l.f35356l = interfaceC12553l;
                    c18060l.f35354l = 1;
                    Object objYandex = AbstractC2327l.yandex(c5616l, f, interfaceC12553l2, interfaceC12553l, c18060l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC12553l = c18060l.f35356l;
                AbstractC2829l.crashlytics(obj);
            }
            this.billing = interfaceC12553l;
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.billing = interfaceC12553l;
            throw th;
        }
    }
}
