package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12559l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6543l f24743l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24744l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24745l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24746l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6543l f24747l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C12683l f24748l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12559l(C6543l c6543l, C6543l c6543l2, Object obj, int i, C12683l c12683l, int i2) {
        super(1);
        this.f24745l = i2;
        this.f24743l = c6543l;
        this.f24747l = c6543l2;
        this.f24744l = obj;
        this.f24746l = i;
        this.f24748l = c12683l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f24745l;
        C12683l c12683l = this.f24748l;
        int i2 = this.f24746l;
        Object obj2 = this.f24744l;
        C6543l c6543l = this.f24747l;
        C6543l c6543l2 = this.f24743l;
        switch (i) {
            case 0:
                InterfaceC5747l interfaceC5747l = (InterfaceC5747l) obj;
                if (c6543l2 != ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).billing()) {
                    return Boolean.TRUE;
                }
                boolean zVip = AbstractC7039l.vip(c6543l, (C6543l) obj2, i2, c12683l);
                Boolean boolValueOf = Boolean.valueOf(zVip);
                if (zVip || !interfaceC5747l.yandex()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC5747l interfaceC5747l2 = (InterfaceC5747l) obj;
                if (c6543l2 != ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).billing()) {
                    return Boolean.TRUE;
                }
                boolean zRemoteconfig = AbstractC11852l.remoteconfig(i2, c12683l, c6543l, (C8896l) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zRemoteconfig);
                if (zRemoteconfig || !interfaceC5747l2.yandex()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
