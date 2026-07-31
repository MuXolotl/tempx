package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًۘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8224l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17408l f17122l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17123l;

    public /* synthetic */ C8224l(C17408l c17408l, int i) {
        this.f17123l = i;
        this.f17122l = c17408l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17123l;
        C17408l c17408l = this.f17122l;
        switch (i) {
            case 0:
                c17408l.f33914l.setValue(Boolean.FALSE);
                break;
            case 1:
                c17408l.m4324finally(false);
                break;
            case 2:
                c17408l.m4324finally(true);
                break;
            default:
                c17408l.f33914l.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
