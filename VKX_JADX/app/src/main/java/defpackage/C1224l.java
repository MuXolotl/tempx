package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lۣؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1224l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f3261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3262l;

    public /* synthetic */ C1224l(C9879l c9879l, int i) {
        this.f3262l = i;
        this.f3261l = c9879l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f3262l;
        C9879l c9879l = this.f3261l;
        switch (i) {
            case 0:
                return c9879l.isPro();
            case 1:
                return Float.valueOf(c9879l.subs().crashlytics);
            case 2:
                return Float.valueOf(c9879l.subs().crashlytics);
            case 3:
                AbstractC9033l.crashlytics(c9879l.yandex, new C13941l(2, null));
                return Unit.INSTANCE;
            default:
                return c9879l.isPro();
        }
    }
}
