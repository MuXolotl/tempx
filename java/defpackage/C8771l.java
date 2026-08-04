package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8771l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f18063l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f18064l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18065l;

    public /* synthetic */ C8771l(Object obj, long j, int i) {
        this.f18065l = i;
        this.f18063l = obj;
        this.f18064l = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f18065l;
        long j = this.f18064l;
        Object obj = this.f18063l;
        switch (i) {
            case 0:
                return ((AbstractC17404l) ((AbstractC9544l) obj)).crashlytics(j);
            case 1:
                C16811l c16811l = ((C16076l) obj).f31499l;
                if (c16811l == null) {
                    return null;
                }
                c16811l.mo2759for(j);
                return Unit.INSTANCE;
            default:
                C2580l c2580l = C2580l.f5619l;
                return new C10178l((String) obj, j, new C2494l((C0574l) null, new C9106l(100, c2580l, c2580l)));
        }
    }
}
