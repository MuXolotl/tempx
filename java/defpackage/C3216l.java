package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3216l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f6914l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1026l f6915l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6916l;

    public /* synthetic */ C3216l(C1026l c1026l, int i, int i2) {
        this.f6916l = i2;
        this.f6915l = c1026l;
        this.f6914l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6916l;
        int i2 = this.f6914l;
        C1026l c1026l = this.f6915l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Boolean bool = (Boolean) c1026l.f2849l.getValue();
                    bool.getClass();
                    boolean zAmazon = c6956l.amazon(i2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAmazon || objM2132native == C1867l.yandex) {
                        objM2132native = new C2221l(i2, 6);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC7741l.loadAd(bool, null, (Function1) objM2132native, null, "", null, AbstractC14566l.amazon(-2000221156, new C4508l(3, c1026l), c6956l), c6956l, 1597440, 42);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c1026l.signatures((C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                c1026l.isVip((C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
