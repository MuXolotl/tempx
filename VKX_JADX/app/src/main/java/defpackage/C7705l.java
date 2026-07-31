package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؐۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7705l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f16176l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17136l f16177l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16178l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f16179l;

    public /* synthetic */ C7705l(InterfaceC2262l interfaceC2262l, C17136l c17136l, C5073l c5073l) {
        this.f16179l = interfaceC2262l;
        this.f16177l = c17136l;
        this.f16176l = c5073l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f16178l;
        InterfaceC14029l interfaceC14029l = null;
        InterfaceC2262l interfaceC2262l = this.f16179l;
        InterfaceC8714l interfaceC8714l = this.f16176l;
        C17136l c17136l = this.f16177l;
        switch (i) {
            case 0:
                C11359l c11359l = (C11359l) obj;
                if (AbstractC8576l.yandex(c11359l.yandex, ((C3554l) interfaceC8714l.getValue()).f7471l)) {
                    interfaceC8714l.setValue(C3554l.loadAd((C3554l) interfaceC8714l.getValue(), null, c11359l.loadAd, null, 29));
                }
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C18020l(c11359l, interfaceC14029l, 1), 3);
                c17136l.f33322l.setValue(null);
                break;
            default:
                C13434l c13434l = C13434l.yandex;
                C11359l c11359lAmazon = AbstractC8265l.amazon((C3554l) interfaceC8714l.getValue());
                c13434l.getClass();
                C11359l c11359lYandex = C11359l.yandex(C13434l.loadAd(c11359lAmazon), null, (String) obj, 29);
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C18020l(c11359lYandex, interfaceC14029l, 2), 3);
                interfaceC8714l.setValue(C3554l.loadAd((C3554l) interfaceC8714l.getValue(), c11359lYandex.yandex, c11359lYandex.loadAd, null, 28));
                c17136l.f33321l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7705l(C17136l c17136l, C5073l c5073l, InterfaceC2262l interfaceC2262l) {
        this.f16177l = c17136l;
        this.f16176l = c5073l;
        this.f16179l = interfaceC2262l;
    }
}
