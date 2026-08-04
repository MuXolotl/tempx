package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13586l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C17517l f26607l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1820l f26608l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26609l;

    public /* synthetic */ C13586l(C1820l c1820l, C17517l c17517l, int i) {
        this.f26609l = i;
        this.f26608l = c1820l;
        this.f26607l = c17517l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26609l;
        C17517l c17517l = this.f26607l;
        C1820l c1820l = this.f26608l;
        switch (i) {
            case 0:
                List list = c1820l.amazon;
                ((C1336l) obj).firebase(list.size(), null, new C13512l(list, 23, false), new C15578l(802480018, true, new C13677l(list, c17517l, c1820l, 0)));
                break;
            default:
                List list2 = c1820l.amazon;
                ((C1336l) obj).firebase(list2.size(), null, new C13512l(list2, 24, false), new C15578l(802480018, true, new C13677l(list2, c17517l, c1820l, 1)));
                break;
        }
        return Unit.INSTANCE;
    }
}
