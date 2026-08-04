package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17698l implements InterfaceC15754l {
    public final ArrayList yandex;

    public C17698l(ArrayList arrayList) {
        this.yandex = arrayList;
    }

    @Override // defpackage.InterfaceC15754l
    public final C14513l yandex(SessionConfiguration sessionConfiguration) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            C14513l c14513lYandex = ((InterfaceC15754l) it.next()).yandex(sessionConfiguration);
            if (c14513lYandex.f28392l != 0) {
                return c14513lYandex;
            }
        }
        return new C14513l(0, 4, (byte) 0);
    }
}
