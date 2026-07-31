package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6501l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7136l f13573l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11925l f13574l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13575l;

    public /* synthetic */ C6501l(C11925l c11925l, C7136l c7136l, int i) {
        this.f13575l = i;
        this.f13574l = c11925l;
        this.f13573l = c7136l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f13575l;
        C7136l c7136l = this.f13573l;
        C11925l c11925l = this.f13574l;
        C5616l c5616l = (C5616l) obj;
        switch (i) {
            case 0:
                c11925l.billing(((Number) c5616l.amazon()).floatValue());
                c7136l.crashlytics.invoke();
                break;
            default:
                c11925l.billing(((Number) c5616l.amazon()).floatValue());
                c7136l.crashlytics.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
