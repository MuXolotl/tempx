package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑؖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0115l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f1020l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1021l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f1022l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f1023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0115l(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f1021l = i;
        this.f1020l = obj;
        this.f1023l = obj2;
        this.f1022l = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1021l;
        Object obj = this.f1022l;
        Object obj2 = this.f1023l;
        Object obj3 = this.f1020l;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj3;
                AbstractC11754l abstractC11754l = (AbstractC11754l) ((C10700l) obj2).f21708l;
                C3384l c3384l = (C3384l) obj;
                C13660l c13660l = abstractC11754l.f23543l;
                if (c13660l == null) {
                    long[] jArr = AbstractC12154l.yandex;
                    c13660l = new C13660l();
                    abstractC11754l.f23543l = c13660l;
                }
                Object objMopub = c13660l.mopub(c3384l);
                if (objMopub == null) {
                    objMopub = new C11303l(abstractC11754l);
                    c13660l.vip(c3384l, objMopub);
                }
                C11303l c11303l = (C11303l) objMopub;
                c11303l.f22796l = false;
                function2.invoke(c11303l, c3384l);
                break;
            default:
                AbstractC15391l abstractC15391l = (AbstractC15391l) obj3;
                abstractC15391l.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC15229l) obj2);
                AbstractC9307l.amazon(abstractC15391l).yandex.remove((C9340l) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
