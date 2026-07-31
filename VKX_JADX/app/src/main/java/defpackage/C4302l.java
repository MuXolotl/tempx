package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4302l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7883l f8832l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8833l;

    public /* synthetic */ C4302l(C7883l c7883l, int i) {
        this.f8833l = i;
        this.f8832l = c7883l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8833l;
        int i2 = 2;
        C7883l c7883l = this.f8832l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(1748497598, new C4302l(c7883l, i2), c6956l), c6956l, 12582912, 127);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c7883l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c7883l.isVip(c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                c7883l.isVip((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c7883l.signatures((InterfaceC0038l) c7883l.f16439l.getValue(), c6956l3, 0);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4302l(C7883l c7883l, int i, int i2) {
        this.f8833l = i2;
        this.f8832l = c7883l;
    }
}
