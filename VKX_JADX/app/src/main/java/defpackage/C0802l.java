package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0802l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2421l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2422l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2423l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f2424l;

    public /* synthetic */ C0802l(boolean z, boolean z2, C15578l c15578l, int i) {
        this.f2423l = 2;
        this.f2422l = z;
        this.f2421l = z2;
        this.f2424l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2423l;
        int i2 = 2;
        Object obj3 = this.f2424l;
        boolean z = this.f2421l;
        boolean z2 = this.f2422l;
        switch (i) {
            case 0:
                C1351l c1351l = (C1351l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10768l c10768l = new C10768l(new C0059l(0, 12, InterfaceC12244l.class, AbstractC0703l.yandex(c1351l.yandex(z2, false, z), C17423l.remoteconfig(c6956l, 5), null, null, c6956l, 0, 12), "value", "getValue()Ljava/lang/Object;"));
                    C7038l c7038l = C7038l.yandex;
                    AbstractC9383l.yandex(AbstractC14289l.firebase(C4346l.f8873l, new C10207l(AbstractC2610l.loadAd(c6956l, 7), c10768l, 19)), c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                return new C8195l(AbstractC12019l.yandex(new C14027l(i2, (C4999l) obj, z2, z)), (EnumC16440l) ((C8610l) ((C12324l) obj3).yandex.mopub).getValue());
            default:
                ((Integer) obj2).getClass();
                C2287l.loadAd(z2, z, (C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(385));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0802l(int i, Object obj, boolean z, boolean z2) {
        this.f2423l = i;
        this.f2424l = obj;
        this.f2422l = z;
        this.f2421l = z2;
    }
}
