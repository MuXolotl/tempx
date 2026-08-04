package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6484l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11801l f13536l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11801l f13537l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13538l;

    public /* synthetic */ C6484l(AbstractC11801l abstractC11801l, AbstractC11801l abstractC11801l2, int i) {
        this.f13538l = i;
        this.f13537l = abstractC11801l;
        this.f13536l = abstractC11801l2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f13538l;
        AbstractC11801l abstractC11801l = this.f13536l;
        AbstractC11801l abstractC11801l2 = this.f13537l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex((C0764l) ((C15700l) abstractC11801l2.f23627l).crashlytics.getValue(), AbstractC14566l.amazon(-1086679249, new C6484l(abstractC11801l2, abstractC11801l, i2), c6956l), c6956l, 48, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC10478l.loadAd(new C10092l[]{AbstractC18678l.yandex.yandex((C15700l) abstractC11801l2.f23627l), AbstractC2431l.yandex.yandex(abstractC11801l)}, AbstractC14566l.amazon(1015761519, new C15707l(14, abstractC11801l2), c6956l), c6956l, 56);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
