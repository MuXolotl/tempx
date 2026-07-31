package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙۤۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6865l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11446l f14359l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14360l;

    public /* synthetic */ C6865l(C11446l c11446l, int i) {
        this.f14360l = i;
        this.f14359l = c11446l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f14360l;
        C11446l c11446l = this.f14359l;
        switch (i) {
            case 0:
                c11446l.billing.invoke((String) c11446l.smaato.getValue());
                return Unit.INSTANCE;
            default:
                return (String) c11446l.smaato.getValue();
        }
    }
}
