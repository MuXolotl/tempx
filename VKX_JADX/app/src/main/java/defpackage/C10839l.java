package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10839l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9649l f21905l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21906l;

    public /* synthetic */ C10839l(C9649l c9649l, int i) {
        this.f21906l = i;
        this.f21905l = c9649l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f21906l;
        C9649l c9649l = this.f21905l;
        switch (i) {
            case 0:
                return Boolean.valueOf(c9649l.f29462l);
            default:
                C6543l c6543l = c9649l.f19678l;
                if (!c6543l.f29454l.f29462l) {
                    return null;
                }
                EnumC11822l enumC11822lM2028l = c6543l.m2028l();
                if (!enumC11822lM2028l.yandex()) {
                    return null;
                }
                if (enumC11822lM2028l.loadAd()) {
                    return c6543l.m2029l(null);
                }
                C6543l c6543lBilling = ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).billing();
                if (c6543lBilling != null) {
                    return c6543lBilling.m2029l(AbstractC5573l.vip(c6543l));
                }
                return null;
        }
    }
}
