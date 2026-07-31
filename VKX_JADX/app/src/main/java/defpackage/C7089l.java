package defpackage;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: renamed from: lؘؚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7089l extends AbstractC16817l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9453l f14854l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f14855l;

    public C7089l(String str, C10373l c10373l) {
        this.f14855l = 7;
        this.f14854l = c10373l;
    }

    @Override // defpackage.InterfaceC6795l
    public final void yandex(Object obj) {
        int i = this.f14855l;
        AbstractC9453l abstractC9453l = this.f14854l;
        switch (i) {
            case 0:
                C14151l c14151l = (C14151l) abstractC9453l;
                ((AbstractC12216l) obj).loadAd(c14151l.f27670l, new C3713l(c14151l.f27673l, c14151l.f27676l));
                break;
            case 1:
                ((AbstractC12216l) obj).amazon(((C15906l) abstractC9453l).f31220l);
                break;
            case 2:
                ((AbstractC12216l) obj).yandex(((C15397l) abstractC9453l).f30074l, new C18450l(25));
                break;
            case 3:
                C14975l c14975l = (C14975l) abstractC9453l;
                c14975l.getClass();
                c14975l.getClass();
                c14975l.getClass();
                break;
            case 4:
                C11060l c11060l = (C11060l) abstractC9453l;
                C1817l c1817l = (C1817l) obj;
                BluetoothDevice bluetoothDevice = c11060l.f22260l;
                String str = c11060l.f22258l;
                if (bluetoothDevice != null && (str == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str))) {
                    "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
                    c1817l.yandex.f14762l.add(new C8195l("__UNRECOGNIZED_BLUETOOTH_DEVICE__", new C2310l("__UNRECOGNIZED_BLUETOOTH_DEVICE__")));
                } else {
                    c1817l.yandex.f14762l.add(new C8195l(str, new C2310l(c11060l.f22255l)));
                }
                break;
            case 5:
                AbstractC3984l.ad(((C1817l) obj).yandex.f14762l, new C6908l(((C4031l) abstractC9453l).f8312l, 5));
                break;
            case 6:
                ((C17178l) obj).yandex(((C11233l) abstractC9453l).f22605l);
                break;
            default:
                C10373l c10373l = (C10373l) abstractC9453l;
                C10373l c10373l2 = new C10373l();
                c10373l2.f21171l = c10373l.f21171l;
                c10373l2.f21169l = c10373l.f21169l;
                c10373l2.f21172l = c10373l.f21172l;
                c10373l2.f21170l = 2;
                ((C17178l) obj).yandex(c10373l2);
                break;
        }
    }

    public /* synthetic */ C7089l(AbstractC9453l abstractC9453l, int i) {
        this.f14855l = i;
        this.f14854l = abstractC9453l;
    }
}
