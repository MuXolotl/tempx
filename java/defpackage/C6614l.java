package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٝٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6614l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f13849l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f13850l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13851l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f13852l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1555l f13853l;

    public /* synthetic */ C6614l(float f, C13250l c13250l, InterfaceC1555l interfaceC1555l, Function1 function1, int i) {
        this.f13851l = i;
        this.f13850l = f;
        this.f13849l = c13250l;
        this.f13853l = interfaceC1555l;
        this.f13852l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fYandex;
        int i = this.f13851l;
        Function1 function1 = this.f13852l;
        InterfaceC1555l interfaceC1555l = this.f13853l;
        C13250l c13250l = this.f13849l;
        float f = this.f13850l;
        C14734l c14734l = (C14734l) obj;
        switch (i) {
            case 0:
                float fAbs = Math.abs(((Number) c14734l.purchase.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                C10086l c10086l = c14734l.purchase;
                if (fAbs >= fAbs2) {
                    float fPurchase = AbstractC12811l.purchase(((Number) c10086l.getValue()).floatValue(), f);
                    AbstractC12811l.amazon(c14734l, interfaceC1555l, function1, fPurchase - c13250l.f26029l);
                    c14734l.yandex();
                    c13250l.f26029l = fPurchase;
                } else {
                    AbstractC12811l.amazon(c14734l, interfaceC1555l, function1, ((Number) c10086l.getValue()).floatValue() - c13250l.f26029l);
                    c13250l.f26029l = ((Number) c10086l.getValue()).floatValue();
                }
                break;
            default:
                float fPurchase2 = AbstractC12811l.purchase(((Number) c14734l.purchase.getValue()).floatValue(), f);
                float f2 = fPurchase2 - c13250l.f26029l;
                try {
                    fYandex = interfaceC1555l.yandex(f2);
                } catch (CancellationException unused) {
                    c14734l.yandex();
                    fYandex = 0.0f;
                }
                function1.invoke(Float.valueOf(fYandex));
                if (Math.abs(f2 - fYandex) > 0.5f || fPurchase2 != ((Number) c14734l.purchase.getValue()).floatValue()) {
                    c14734l.yandex();
                }
                c13250l.f26029l += fYandex;
                break;
        }
        return Unit.INSTANCE;
    }
}
