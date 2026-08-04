package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8244l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10633l f17133l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17134l;

    public /* synthetic */ C8244l(C10633l c10633l, int i) {
        this.f17134l = i;
        this.f17133l = c10633l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17134l;
        EnumC11300l enumC11300l = EnumC11300l.f22781l;
        C10633l c10633l = this.f17133l;
        switch (i) {
            case 0:
                C3498l c3498l = (C3498l) obj;
                if (c3498l != null) {
                    return c10633l.isPro(c3498l, c10633l.subs().yandex(c3498l, enumC11300l));
                }
                C10633l.admob(8);
                throw null;
            default:
                C3498l c3498l2 = (C3498l) obj;
                if (c3498l2 != null) {
                    return c10633l.isPro(c3498l2, c10633l.subs().billing(c3498l2, enumC11300l));
                }
                C10633l.admob(4);
                throw null;
        }
    }
}
