package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: l٘۠۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18257l implements InterfaceC1910l {
    public static final C18257l yandex = new C18257l();

    @Override // defpackage.InterfaceC1910l
    public final Map admob() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.InterfaceC1910l
    public final InterfaceC5706l billing() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.InterfaceC1910l
    public final C2312l mopub() {
        InterfaceC17477l interfaceC17477lAmazon = AbstractC3759l.amazon(this);
        if (interfaceC17477lAmazon != null) {
            if (C8741l.purchase(interfaceC17477lAmazon)) {
                interfaceC17477lAmazon = null;
            }
            if (interfaceC17477lAmazon != null) {
                return AbstractC3759l.crashlytics(interfaceC17477lAmazon);
            }
        }
        return null;
    }

    public final String toString() {
        return "[EnhancedType]";
    }

    @Override // defpackage.InterfaceC1910l
    public final AbstractC18041l yandex() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }
}
