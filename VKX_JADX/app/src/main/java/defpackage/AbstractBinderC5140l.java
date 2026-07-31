package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: lِؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5140l extends AbstractBinderC10624l implements InterfaceC11842l {
    public static InterfaceC11842l asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof InterfaceC11842l ? (InterfaceC11842l) iInterfaceQueryLocalInterface : new C1912l(iBinder);
    }
}
