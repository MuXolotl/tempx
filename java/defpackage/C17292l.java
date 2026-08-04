package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗٞٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17292l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f33557l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f33558l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33559l;

    public /* synthetic */ C17292l(InterfaceC17242l interfaceC17242l, int i) {
        this.f33559l = 1;
        this.f33558l = interfaceC17242l;
        this.f33557l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (this.f33559l) {
            case 0:
                num.getClass();
                AbstractC6852l.loadAd(AbstractC0545l.purchase(1), this.f33557l, c6956l, this.f33558l);
                break;
            case 1:
                num.intValue();
                AbstractC9383l.yandex(this.f33558l, c6956l, AbstractC0545l.purchase(this.f33557l | 1));
                break;
            case 2:
                num.getClass();
                AbstractC4111l.amazon(AbstractC0545l.purchase(1), this.f33557l, c6956l, this.f33558l);
                break;
            default:
                num.getClass();
                AbstractC4111l.crashlytics(AbstractC0545l.purchase(1), this.f33557l, c6956l, this.f33558l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17292l(InterfaceC17242l interfaceC17242l, int i, int i2, int i3) {
        this.f33559l = i3;
        this.f33558l = interfaceC17242l;
        this.f33557l = i2;
    }
}
