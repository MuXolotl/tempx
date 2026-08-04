package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒٗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1106l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f3042l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f3043l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3044l = 0;

    public /* synthetic */ C1106l(int i, int i2, Function0 function0) {
        this.f3042l = i;
        this.f3043l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (this.f3044l) {
            case 0:
                num.getClass();
                AbstractC14289l.loadAd(this.f3042l, this.f3043l, c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                num.intValue();
                AbstractC9843l.loadAd(this.f3043l, c6956l, AbstractC0545l.purchase(this.f3042l | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1106l(int i, Function0 function0) {
        this.f3043l = function0;
        this.f3042l = i;
    }
}
