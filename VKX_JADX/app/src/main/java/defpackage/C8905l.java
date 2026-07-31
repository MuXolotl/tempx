package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٛٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8905l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15851l f18296l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18297l;

    public /* synthetic */ C8905l(C15851l c15851l, int i) {
        this.f18297l = i;
        this.f18296l = c15851l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f18297l;
        C15851l c15851l = this.f18296l;
        switch (i) {
            case 0:
                c15851l.yandex();
                return Boolean.TRUE;
            default:
                C2397l c2397l = c15851l.loadAd;
                if (c2397l.isVip()) {
                    c2397l.subs(EnumC3455l.f7338l);
                }
                return Unit.INSTANCE;
        }
    }
}
