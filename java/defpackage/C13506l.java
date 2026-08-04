package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٛۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13506l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2994l f26523l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26524l;

    public /* synthetic */ C13506l(C2994l c2994l, int i) {
        this.f26524l = i;
        this.f26523l = c2994l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26524l;
        C2994l c2994l = this.f26523l;
        switch (i) {
            case 0:
                c2994l.m4125private(new C17136l());
                return Unit.INSTANCE;
            default:
                return AbstractC3803l.yandex(c2994l.isVip());
        }
    }
}
