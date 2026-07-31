package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: lٌَۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10185l extends AbstractC14330l {
    public final /* synthetic */ Bundle admob;
    public final /* synthetic */ String billing;
    public final /* synthetic */ Bundle mopub;
    public final /* synthetic */ C7996l purchase;
    public final /* synthetic */ ServiceC16415l subs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10185l(ServiceC16415l serviceC16415l, String str, C7996l c7996l, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.subs = serviceC16415l;
        this.purchase = c7996l;
        this.billing = str2;
        this.mopub = bundle;
        this.admob = bundle2;
    }

    @Override // defpackage.AbstractC14330l
    public final void amazon(Object obj) {
        List list = (List) obj;
        C11154l c11154l = this.subs.f32110l;
        C7996l c7996l = this.purchase;
        C15053l c15053l = c7996l.purchase;
        String str = c7996l.yandex;
        c15053l.getClass();
        Object obj2 = c11154l.get(((Messenger) c15053l.f29576l).getBinder());
        String str2 = this.billing;
        if (obj2 != c7996l) {
            AbstractC6427l.billing("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
            return;
        }
        try {
            c15053l.adcel(str2, list, this.mopub, this.admob);
        } catch (RemoteException unused) {
            AbstractC6427l.vip("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
