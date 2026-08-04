package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0793l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2407l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16111l f2408l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2409l;

    public /* synthetic */ C0793l(AbstractC16111l abstractC16111l, Object obj, int i) {
        this.f2409l = i;
        this.f2408l = abstractC16111l;
        this.f2407l = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2409l;
        Object obj3 = this.f2407l;
        AbstractC16111l abstractC16111l = this.f2408l;
        int i2 = 2;
        int i3 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex((C0764l) abstractC16111l.f31561l.crashlytics.getValue(), AbstractC14566l.amazon(-2133242001, new C0793l(abstractC16111l, obj3, i3), c6956l), c6956l, 48, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC10478l.loadAd(new C10092l[]{AbstractC18678l.yandex.yandex(abstractC16111l.f31561l), AbstractC2431l.yandex.yandex(abstractC16111l)}, AbstractC14566l.amazon(-1759869905, new C0793l(abstractC16111l, obj3, i2), c6956l), c6956l, 56);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    abstractC16111l.license(obj3, c6956l);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
