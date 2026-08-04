package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: lٕؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1066l {
    public final /* synthetic */ C0189l yandex;

    public C1066l(C0189l c0189l) {
        this.yandex = c0189l;
    }

    public final void yandex() {
        C0189l c0189l = this.yandex;
        if (c0189l.purchase == null) {
            return;
        }
        try {
            C17186l c17186l = c0189l.isPro;
            if (c17186l != null) {
                c17186l.vip();
            }
            C17513l c17513l = (C17513l) c0189l.purchase;
            Parcel parcelM743l = c17513l.m743l();
            int i = AbstractC14627l.yandex;
            parcelM743l.writeInt(0);
            c17513l.m741l(parcelM743l, 1);
        } catch (RemoteException e) {
            C0189l.remoteconfig.yandex(e, "Unable to call %s on %s.", "onConnected", InterfaceC2695l.class.getSimpleName());
        }
        C7214l c7214l = c0189l.smaato;
        if (c7214l != null) {
            ((C3557l) c7214l.f15044l).mopub(new C6276l(new C13698l(3, 29)));
        }
    }
}
