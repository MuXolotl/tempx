package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15626l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f30546l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f30547l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30548l;

    public /* synthetic */ C15626l(long j, Function2 function2, int i) {
        this.f30548l = 3;
        this.f30547l = j;
        this.f30546l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30548l;
        Function2 function2 = this.f30546l;
        long j = this.f30547l;
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC10478l.yandex(AbstractC5020l.startapp(j, AbstractC12502l.yandex), function2, c6956l, 8);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC15042l.billing(j, function2, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC15042l.billing(j, function2, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                num.getClass();
                AbstractC15042l.billing(j, function2, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15626l(long j, Function2 function2, int i, byte b) {
        this.f30548l = i;
        this.f30547l = j;
        this.f30546l = function2;
    }
}
