package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11593l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f23304l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6408l f23305l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23306l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f23307l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f23308l;

    public /* synthetic */ C11593l(C6408l c6408l, Function0 function0, Function0 function1, Function0 function2, int i, int i2) {
        this.f23306l = i2;
        this.f23305l = c6408l;
        this.f23304l = function0;
        this.f23308l = function1;
        this.f23307l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23306l) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(3073);
                this.f23305l.loadAd(this.f23304l, this.f23308l, this.f23307l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(3073);
                this.f23305l.yandex(this.f23304l, this.f23308l, this.f23307l, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }
}
