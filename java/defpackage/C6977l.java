package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6977l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5124l f14647l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14648l;

    public /* synthetic */ C6977l(C5124l c5124l, int i) {
        this.f14648l = i;
        this.f14647l = c5124l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f14648l;
        int i2 = 2;
        int i3 = 5;
        int i4 = 6;
        List list = C2580l.f5619l;
        int i5 = 3;
        C5124l c5124l = this.f14647l;
        int i6 = 1;
        C1336l c1336l = (C1336l) obj;
        switch (i) {
            case 0:
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(15924158, true, new C0455l(c5124l, i6)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(639484775, true, new C0455l(c5124l, i2)), 3);
                C8195l c8195lM1694const = c5124l.m1694const();
                List list2 = c8195lM1694const != null ? (List) c8195lM1694const.f17098l : null;
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1688595907, true, new C0455l(c5124l, i5)), 3);
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1354893780, true, new C0455l(c5124l, 4)), 3);
                }
                C8195l c8195lM1694const2 = c5124l.m1694const();
                List list3 = c8195lM1694const2 != null ? (List) c8195lM1694const2.f17097l : null;
                if (list3 != null && !list3.isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1759266860, true, new C0455l(c5124l, i3)), 3);
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1838406229, true, new C0455l(c5124l, i4)), 3);
                }
                break;
            case 1:
                c1336l.firebase(EnumC12334l.f24421l.pro(), null, new C2911l(17), new C15578l(802480018, true, new C5666l(c5124l, 2)));
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC17943l.admob, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC17943l.subs, 3);
                break;
            case 2:
                C8195l c8195lM1694const3 = c5124l.m1694const();
                List list4 = c8195lM1694const3 != null ? (List) c8195lM1694const3.f17098l : null;
                if (list4 != null) {
                    list = list4;
                }
                c1336l.firebase(list.size(), null, new C1178l(5, list), new C15578l(802480018, true, new C0089l(list, c5124l, 0)));
                break;
            default:
                C8195l c8195lM1694const4 = c5124l.m1694const();
                List list5 = c8195lM1694const4 != null ? (List) c8195lM1694const4.f17097l : null;
                if (list5 != null) {
                    list = list5;
                }
                c1336l.firebase(list.size(), null, new C1178l(6, list), new C15578l(802480018, true, new C0089l(list, c5124l, 1)));
                break;
        }
        return Unit.INSTANCE;
    }
}
