package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍۛٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9816l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2281l f19991l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19992l;

    public /* synthetic */ C9816l(C2281l c2281l, int i) {
        this.f19992l = i;
        this.f19991l = c2281l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19992l;
        C2281l c2281l = this.f19991l;
        switch (i) {
            case 0:
                c2281l.m4125private(new C4975l());
                return Unit.INSTANCE;
            default:
                return AbstractC3803l.yandex(c2281l.isVip());
        }
    }
}
