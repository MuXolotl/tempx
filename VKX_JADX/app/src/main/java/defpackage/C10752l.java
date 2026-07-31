package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10752l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7246l f21783l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21784l;

    public /* synthetic */ C10752l(C7246l c7246l, int i) {
        this.f21784l = i;
        this.f21783l = c7246l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f21784l;
        C7246l c7246l = this.f21783l;
        switch (i) {
            case 0:
                c7246l.m2185abstract(false);
                AbstractC10999l.mopub(AbstractC11990l.firebase(c7246l), null, 0, new C11789l(c7246l, null), 3);
                return Unit.INSTANCE;
            case 1:
                c7246l.m2185abstract(false);
                return Unit.INSTANCE;
            case 2:
                return Float.valueOf(c7246l.f15072l.admob());
            case 3:
                c7246l.m2185abstract(true);
                return Unit.INSTANCE;
            case 4:
                C10086l c10086l = c7246l.f15079l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 5:
                c7246l.m2185abstract(false);
                return Unit.INSTANCE;
            default:
                c7246l.m2185abstract(false);
                return Unit.INSTANCE;
        }
    }
}
