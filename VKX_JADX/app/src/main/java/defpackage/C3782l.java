package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕۦ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3782l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f7868l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7869l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3782l(C15578l c15578l, int i, int i2) {
        super(2);
        this.f7869l = i2;
        this.f7868l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7869l;
        C15578l c15578l = this.f7868l;
        C6956l c6956l = (C6956l) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC14760l.yandex(c15578l, c6956l, AbstractC0545l.purchase(7));
                break;
            default:
                AbstractC17863l.loadAd(c15578l, c6956l, AbstractC0545l.purchase(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
