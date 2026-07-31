package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًۣۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8256l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2397l f17150l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17151l;

    public /* synthetic */ C8256l(C2397l c2397l, int i) {
        this.f17151l = i;
        this.f17150l = c2397l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17151l;
        C2397l c2397l = this.f17150l;
        switch (i) {
            case 0:
                if (c2397l.isVip()) {
                    c2397l.subs(null);
                }
                return Unit.INSTANCE;
            case 1:
                c2397l.subs(null);
                return Unit.INSTANCE;
            case 2:
                if (c2397l.isVip()) {
                    c2397l.subs(C14054l.f27396l);
                }
                return Unit.INSTANCE;
            default:
                Unit unit = Unit.INSTANCE;
                c2397l.subs(unit);
                return unit;
        }
    }
}
