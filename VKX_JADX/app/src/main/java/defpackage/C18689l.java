package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;

/* JADX INFO: renamed from: lۥؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18689l extends AbstractC14330l {
    public final /* synthetic */ C1102l billing;
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18689l(Object obj, C1102l c1102l, int i) {
        super(obj);
        this.purchase = i;
        this.billing = c1102l;
    }

    @Override // defpackage.AbstractC14330l
    public final void amazon(Object obj) {
        int i = this.purchase;
        C1102l c1102l = this.billing;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", AbstractC16431l.crashlytics((C11119l) obj, MediaBrowserCompat$MediaItem.CREATOR));
                InterfaceC0041l interfaceC0041l = c1102l.f3039l;
                if (interfaceC0041l != null) {
                    try {
                        interfaceC0041l.mo249l(0, bundle);
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                try {
                    if (list == null) {
                        InterfaceC0041l interfaceC0041l2 = c1102l.f3039l;
                        if (interfaceC0041l2 != null) {
                            interfaceC0041l2.mo249l(-1, null);
                        }
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelableArray("search_results", (Parcelable[]) AbstractC16431l.amazon(list, MediaBrowserCompat$MediaItem.CREATOR).toArray(new MediaBrowserCompat$MediaItem[0]));
                        InterfaceC0041l interfaceC0041l3 = c1102l.f3039l;
                        if (interfaceC0041l3 != null) {
                            interfaceC0041l3.mo249l(0, bundle2);
                        }
                    }
                } catch (RemoteException unused2) {
                    return;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                InterfaceC0041l interfaceC0041l4 = c1102l.f3039l;
                if (interfaceC0041l4 != null) {
                    try {
                        interfaceC0041l4.mo249l(0, bundle3);
                    } catch (RemoteException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.AbstractC14330l
    public void crashlytics() {
        switch (this.purchase) {
            case 2:
                InterfaceC0041l interfaceC0041l = this.billing.f3039l;
                if (interfaceC0041l != null) {
                    try {
                        interfaceC0041l.mo249l(-1, null);
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                break;
            default:
                super.crashlytics();
                break;
        }
    }
}
