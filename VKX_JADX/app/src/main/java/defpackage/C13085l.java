package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13085l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f25602l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f25603l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25604l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f25605l;

    public /* synthetic */ C13085l(InterfaceC17242l interfaceC17242l, C15578l c15578l, int i, int i2) {
        this.f25604l = i2;
        this.f25603l = interfaceC17242l;
        this.f25602l = c15578l;
        this.f25605l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25604l;
        int i2 = this.f25605l;
        C15578l c15578l = this.f25602l;
        InterfaceC17242l interfaceC17242l = this.f25603l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC1213l.yandex(AbstractC0545l.purchase(i2 | 1), c15578l, c6956l, interfaceC17242l);
                break;
            case 1:
                AbstractC1213l.loadAd(AbstractC0545l.purchase(i2 | 1), c15578l, c6956l, interfaceC17242l);
                break;
            case 2:
                AbstractC10216l.amazon(AbstractC0545l.purchase(i2 | 1), c15578l, c6956l, interfaceC17242l);
                break;
            case 3:
                AbstractC6419l.amazon(AbstractC0545l.purchase(i2 | 1), c15578l, c6956l, interfaceC17242l);
                break;
            default:
                AbstractC6419l.crashlytics(AbstractC0545l.purchase(i2 | 1), c15578l, c6956l, interfaceC17242l);
                break;
        }
        return Unit.INSTANCE;
    }
}
