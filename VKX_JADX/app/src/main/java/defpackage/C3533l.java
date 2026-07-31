package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕٞٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3533l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f7428l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7429l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7430l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f7431l;

    public /* synthetic */ C3533l(InterfaceC12244l interfaceC12244l, boolean z, AbstractC10113l abstractC10113l) {
        this.f7430l = 1;
        this.f7428l = interfaceC12244l;
        this.f7429l = z;
        this.f7431l = abstractC10113l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f7430l;
        Object obj2 = this.f7431l;
        Object obj3 = this.f7428l;
        boolean z = this.f7429l;
        int i2 = 0;
        switch (i) {
            case 0:
                AbstractC13264l abstractC13264l = (AbstractC13264l) obj3;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj2;
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                if (z) {
                    C16154l c16154l = new C16154l(abstractC13264l, interfaceC2262l, i2);
                    InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                    interfaceC17593l.amazon(AbstractC16601l.advert, new C7629l(null, c16154l));
                    interfaceC17593l.amazon(AbstractC16601l.signatures, new C7629l(null, new C16154l(abstractC13264l, interfaceC2262l, 1)));
                } else {
                    C16154l c16154l2 = new C16154l(abstractC13264l, interfaceC2262l, 2);
                    InterfaceC13922l[] interfaceC13922lArr2 = AbstractC3668l.yandex;
                    interfaceC17593l.amazon(AbstractC16601l.isVip, new C7629l(null, c16154l2));
                    interfaceC17593l.amazon(AbstractC16601l.premium, new C7629l(null, new C16154l(abstractC13264l, interfaceC2262l, 3)));
                }
                break;
            case 1:
                ((AbstractC9601l) obj).mopub((AbstractC10113l) obj2, 0, 0, ((Number) ((InterfaceC12244l) obj3).getValue()).floatValue() + (z ? 5.0f : 0.0f));
                break;
            default:
                String str = (String) obj3;
                C15851l c15851l = (C15851l) obj2;
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                if (z) {
                    AbstractC3668l.isPro(interfaceC17593l2, 0);
                }
                C8905l c8905l = new C8905l(c15851l, 0);
                InterfaceC13922l[] interfaceC13922lArr3 = AbstractC3668l.yandex;
                interfaceC17593l2.amazon(AbstractC16601l.license, new C7629l(null, c8905l));
                AbstractC3668l.firebase(interfaceC17593l2, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3533l(boolean z, Object obj, Object obj2, int i) {
        this.f7430l = i;
        this.f7429l = z;
        this.f7428l = obj;
        this.f7431l = obj2;
    }
}
