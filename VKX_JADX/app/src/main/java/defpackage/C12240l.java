package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: renamed from: lِۥۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12240l implements InterfaceC9826l {
    public Vector yandex;

    @Override // defpackage.InterfaceC9826l
    public final void crashlytics(C2925l c2925l, File file) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC9826l) it.next()).crashlytics(c2925l, file);
        }
    }

    @Override // defpackage.InterfaceC9826l
    public final void loadAd(File file) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC9826l) it.next()).loadAd(file);
        }
    }

    @Override // defpackage.InterfaceC9826l
    public final void yandex(C2925l c2925l, boolean z) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC9826l) it.next()).yandex(c2925l, z);
        }
    }
}
