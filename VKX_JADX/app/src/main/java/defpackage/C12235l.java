package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِۥِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12235l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17136l f24292l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24293l;

    public /* synthetic */ C12235l(C17136l c17136l, int i) {
        this.f24293l = i;
        this.f24292l = c17136l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f24293l;
        C17136l c17136l = this.f24292l;
        switch (i) {
            case 0:
                c17136l.f33323l.setValue(null);
                return Unit.INSTANCE;
            case 1:
                c17136l.f33322l.setValue(null);
                return Unit.INSTANCE;
            case 2:
                c17136l.f33321l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                c17136l.f33321l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                return AbstractC3803l.yandex(c17136l.isVip());
        }
    }
}
