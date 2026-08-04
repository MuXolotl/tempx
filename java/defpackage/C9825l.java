package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9825l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f20014l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC18643l f20015l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20016l;

    public /* synthetic */ C9825l(AbstractC18643l abstractC18643l, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f20016l = i2;
        this.f20015l = abstractC18643l;
        this.f20014l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20016l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC15042l.subs(this.f20015l, this.f20014l, c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                AbstractC4959l.yandex(this.f20015l, this.f20014l, c6956l, AbstractC0545l.purchase(49));
                break;
        }
        return Unit.INSTANCE;
    }
}
