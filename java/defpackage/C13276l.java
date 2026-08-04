package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lَْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13276l implements InterfaceC11075l, InterfaceC15834l {
    public final int crashlytics;
    public final InterfaceC11075l loadAd;
    public final /* synthetic */ int yandex;

    public C13276l(InterfaceC11075l interfaceC11075l, int i, int i2) {
        this.yandex = i2;
        switch (i2) {
            case 1:
                this.loadAd = interfaceC11075l;
                this.crashlytics = i;
                if (i >= 0) {
                    return;
                }
                C10754l.metrica(AbstractC12589l.appmetrica("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                this.loadAd = interfaceC11075l;
                this.crashlytics = i;
                if (i >= 0) {
                    return;
                }
                C10754l.metrica(AbstractC12589l.appmetrica("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        switch (this.yandex) {
            case 0:
                return new C14596l(this);
            default:
                return new C14596l(this, (byte) 0);
        }
    }

    @Override // defpackage.InterfaceC15834l
    public final InterfaceC11075l loadAd(int i) {
        int i2 = this.yandex;
        InterfaceC11075l interfaceC11075l = this.loadAd;
        int i3 = this.crashlytics;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new C13276l(this, i, 0) : new C13276l(interfaceC11075l, i4, 0);
            default:
                return i >= i3 ? C8360l.yandex : new C18415l(interfaceC11075l, i, i3);
        }
    }

    @Override // defpackage.InterfaceC15834l
    public final InterfaceC11075l yandex(int i) {
        int i2 = this.yandex;
        InterfaceC11075l interfaceC11075l = this.loadAd;
        int i3 = this.crashlytics;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new C13276l(this, i, 1) : new C18415l(interfaceC11075l, i3, i4);
            default:
                return i >= i3 ? this : new C13276l(interfaceC11075l, i, 1);
        }
    }
}
