package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۜۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9068l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f18658l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12418l f18659l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18660l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f18661l;

    public /* synthetic */ C9068l(C12418l c12418l, Function0 function0, Function0 function1, int i) {
        this.f18659l = c12418l;
        this.f18658l = function0;
        this.f18661l = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18660l;
        Function0 function0 = this.f18661l;
        Function0 function1 = this.f18658l;
        C12418l c12418l = this.f18659l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-10256751, new C0454l(15, function1), c6956l), null, null, AbstractC14566l.amazon(-351088236, new C0454l(16, function0), c6956l), 0, 0L, 0L, null, AbstractC14566l.amazon(1305910876, new C11299l(c12418l, i2), c6956l), c6956l, 805330992, 493);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC6689l.loadAd(c12418l, function1, function0, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9068l(Function0 function0, Function0 function1, C12418l c12418l) {
        this.f18658l = function0;
        this.f18661l = function1;
        this.f18659l = c12418l;
    }
}
