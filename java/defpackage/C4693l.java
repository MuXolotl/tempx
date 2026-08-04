package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4693l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f9537l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9538l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4693l(int i, Function1 function1) {
        super(1);
        this.f9538l = i;
        this.f9537l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f9538l;
        Function1 function1 = this.f9537l;
        switch (i) {
            case 0:
                C6742l c6742l = (C6742l) obj;
                function1.invoke(c6742l);
                c6742l.yandex();
                return Unit.INSTANCE;
            case 1:
                return new C5177l(((long) ((Number) function1.invoke(Integer.valueOf((int) (((C4999l) obj).yandex >> 32)))).intValue()) << 32);
            case 2:
                return new C5177l(((long) ((Number) function1.invoke(Integer.valueOf((int) (((C4999l) obj).yandex & 4294967295L)))).intValue()) & 4294967295L);
            default:
                return new C5177l(((long) ((Number) function1.invoke(Integer.valueOf((int) (((C4999l) obj).yandex >> 32)))).intValue()) << 32);
        }
    }
}
