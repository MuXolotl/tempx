package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: renamed from: lؙؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17736l implements InterfaceC18108l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11792l f34553l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34554l;

    public /* synthetic */ C17736l(InterfaceC11792l interfaceC11792l, InterfaceC11792l interfaceC11792l2, int i) {
        this.f34554l = i;
        this.f34553l = interfaceC11792l2;
    }

    @Override // defpackage.InterfaceC18108l
    public final void yandex(AbstractC12655l abstractC12655l) throws Exception {
        int i = this.f34554l;
        InterfaceC11792l interfaceC11792l = this.f34553l;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.yandex;
                if (interfaceC11792l != null) {
                    interfaceC11792l.close();
                }
                break;
            default:
                int i3 = ImageProcessingUtil.yandex;
                interfaceC11792l.close();
                break;
        }
    }
}
