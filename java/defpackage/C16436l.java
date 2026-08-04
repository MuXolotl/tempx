package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16436l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f32132l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11754l f32133l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C17446l f32134l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f32135l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16436l(AbstractC11754l abstractC11754l, long j, long j2, C17446l c17446l) {
        super(0);
        this.f32133l = abstractC11754l;
        this.f32132l = j;
        this.f32135l = j2;
        this.f32134l = c17446l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC11754l abstractC11754l = this.f32133l;
        abstractC11754l.m3247l().f22796l = false;
        abstractC11754l.m3247l().f22795l = this.f32132l;
        abstractC11754l.m3247l().f22794l = this.f32135l;
        Function1 function1Mopub = this.f32134l.f33994l.mopub();
        if (function1Mopub != null) {
            function1Mopub.invoke(abstractC11754l.m3247l());
        }
        return Unit.INSTANCE;
    }
}
