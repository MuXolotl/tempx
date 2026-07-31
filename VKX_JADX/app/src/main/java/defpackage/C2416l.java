package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lّؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2416l extends AbstractC3031l {
    @Override // defpackage.InterfaceC3770l
    public final void Signature(int i, Object obj) {
        InterfaceC9708l interfaceC9708l = (InterfaceC9708l) obj;
        int i2 = ((AbstractC11563l) this.f6544l).yandex;
        if (i2 <= 0) {
            throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((AbstractC11563l) this.f6545l).yandex).toString());
        }
        if (interfaceC9708l instanceof AbstractC11563l) {
            ((AbstractC11563l) interfaceC9708l).yandex = i2 - 1;
        }
        amazon().add(i, interfaceC9708l);
    }

    public final ArrayList amazon() {
        InterfaceC9708l interfaceC9708l = (InterfaceC9708l) this.f6544l;
        if (interfaceC9708l instanceof AbstractC11563l) {
            return ((AbstractC11563l) interfaceC9708l).loadAd;
        }
        C8339l.smaato("Current node cannot accept children");
        return null;
    }

    @Override // defpackage.InterfaceC3770l
    public final /* bridge */ /* synthetic */ void billing(int i, Object obj) {
    }

    @Override // defpackage.AbstractC3031l
    public final void crashlytics() {
        ((AbstractC11563l) this.f6545l).loadAd.clear();
    }

    @Override // defpackage.InterfaceC3770l
    public final void remoteconfig(int i, int i2) {
        ArrayList arrayListAmazon = amazon();
        if (i2 == 1) {
            arrayListAmazon.remove(i);
        } else {
            arrayListAmazon.subList(i, i2 + i).clear();
        }
    }

    @Override // defpackage.InterfaceC3770l
    public final void smaato(int i, int i2, int i3) {
        ArrayList arrayListAmazon = amazon();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List listSubList = arrayListAmazon.subList(i, i3 + i);
            ArrayList arrayList = new ArrayList(listSubList);
            listSubList.clear();
            arrayListAmazon.addAll(i4, arrayList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            arrayListAmazon.set(i, arrayListAmazon.set(i2, arrayListAmazon.get(i)));
        } else {
            arrayListAmazon.add(i4, arrayListAmazon.remove(i));
        }
    }
}
