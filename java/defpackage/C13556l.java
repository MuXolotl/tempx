package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13556l implements InterfaceC14745l {
    public final /* synthetic */ C16290l amazon;
    public final /* synthetic */ InterfaceC13490l crashlytics;
    public final /* synthetic */ C8954l loadAd;
    public final /* synthetic */ Function0 purchase;
    public final /* synthetic */ InterfaceC3114l yandex;

    public C13556l(InterfaceC3114l interfaceC3114l, C8954l c8954l, InterfaceC13490l interfaceC13490l, C16290l c16290l, Function0 function0) {
        this.yandex = interfaceC3114l;
        this.loadAd = c8954l;
        this.crashlytics = interfaceC13490l;
        this.amazon = c16290l;
        this.purchase = function0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.InterfaceC14745l
    public final Object yandex(InterfaceC1555l interfaceC1555l, float f, InterfaceC14029l interfaceC14029l) {
        C3840l c3840l;
        C8954l c8954l = this.loadAd;
        C15389l c15389l = c8954l.mopub;
        if (interfaceC14029l instanceof C3840l) {
            c3840l = (C3840l) interfaceC14029l;
            int i = c3840l.f7947l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3840l.f7947l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3840l = new C3840l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c3840l = new C3840l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objAmazon = c3840l.f7946l;
        int i2 = c3840l.f7947l;
        Function0 function0 = this.purchase;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objAmazon);
                float fPurchase = this.yandex.purchase();
                float fAmazon = AbstractC8576l.amazon(f, -fPurchase, fPurchase);
                if (fAmazon > 0.0f) {
                    C18416l c18416lSubs = c15389l.subs();
                    EnumC9129l enumC9129l = EnumC9129l.f18765l;
                    if (c18416lSubs.crashlytics(enumC9129l)) {
                        float fMax = Math.max(0.0f, c15389l.subs().billing(enumC9129l) - c15389l.smaato());
                        InterfaceC13490l interfaceC13490l = this.crashlytics;
                        float fMo868instanceof = interfaceC13490l.mo868instanceof(125.0f);
                        if (fMax < fMo868instanceof) {
                            float f2 = fMax / fMo868instanceof;
                            fAmazon *= f2 * f2;
                            float fMo868instanceof2 = interfaceC13490l.mo868instanceof(125.0f);
                            if (f >= fMo868instanceof2) {
                                fAmazon = Math.max(fAmazon, fMo868instanceof2);
                            }
                        }
                    }
                }
                C16290l c16290l = this.amazon;
                c3840l.f7947l = 1;
                objAmazon = c16290l.amazon(interfaceC1555l, fAmazon, AbstractC16840l.yandex, c3840l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAmazon == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(objAmazon);
            }
            float fFloatValue = ((Number) objAmazon).floatValue();
            if (!c8954l.mopub()) {
                function0.invoke();
            }
            return new Float(fFloatValue);
        } catch (Throwable th) {
            if (!c8954l.mopub()) {
                function0.invoke();
            }
            throw th;
        }
    }
}
