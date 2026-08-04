package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؔ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2942l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5766l f6408l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6409l;

    public /* synthetic */ C2942l(C5766l c5766l, int i) {
        this.f6409l = i;
        this.f6408l = c5766l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f6409l;
        C5766l c5766l = this.f6408l;
        switch (i) {
            case 0:
                c5766l.m1854try(false);
                break;
            case 1:
                c5766l.m1854try(true);
                break;
            case 2:
                c5766l.m1854try(false);
                c5766l.f12154l.setValue(Boolean.TRUE);
                break;
            default:
                c5766l.f12154l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
