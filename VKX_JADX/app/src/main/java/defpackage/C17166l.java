package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17166l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16604l f33343l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33344l = 0;

    public /* synthetic */ C17166l(C11183l c11183l, C16604l c16604l) {
        this.f33343l = c16604l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f33344l;
        C16604l c16604l = this.f33343l;
        switch (i) {
            case 0:
                return Boolean.valueOf(c16604l == null || ((C1625l) obj).crashlytics.admob() < 0.0f);
            default:
                ((Long) obj).getClass();
                Iterator it = c16604l.f32583l.purchase.iterator();
                while (true) {
                    C3038l c3038l = (C3038l) it;
                    if (!c3038l.hasNext()) {
                        return Unit.INSTANCE;
                    }
                    AbstractC2697l.firebase(((C6917l) c3038l.next()).f14489l);
                }
                break;
        }
    }

    public /* synthetic */ C17166l(C16604l c16604l) {
        this.f33343l = c16604l;
    }
}
