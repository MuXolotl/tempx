package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.util.Map;

/* JADX INFO: renamed from: lَُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC11396l extends AbstractBinderC5395l implements InterfaceC12038l, InterfaceC15885l {
    public final C11154l admob;
    public final Context billing;
    public final C18096l mopub;
    public final C7945l subs;

    public BinderC11396l(Context context, C18096l c18096l, C7945l c7945l) {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener", 5);
        this.admob = new C11154l(0);
        AbstractC1051l.subs(context);
        this.billing = context;
        this.mopub = c18096l;
        this.subs = c7945l;
    }

    @Override // defpackage.InterfaceC12038l
    public final synchronized void amazon() {
        try {
            for (Map.Entry entry : (C6542l) this.admob.entrySet()) {
                this.mopub.yandex(new C7089l(((C10161l) entry.getKey()).yandex, (C10373l) entry.getValue()));
            }
            this.admob.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final synchronized void m3077l(C16257l c16257l) {
        C10815l c10815lAdmob = AbstractC16814l.admob(this.billing, c16257l.f31816l);
        int i = 1;
        if (c10815lAdmob == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(c16257l.f31816l.f34059l)));
            return;
        }
        C11154l c11154l = this.admob;
        String str = c16257l.f31817l;
        long j = c16257l.f31816l.f34059l;
        C10161l c10161l = new C10161l(j, str);
        C10373l c10373l = new C10373l();
        c10373l.f21171l = j;
        c11154l.put(c10161l, c10373l);
        this.mopub.yandex(new C16200l(c16257l, c10815lAdmob, i));
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lّٔ٘ */
    public final boolean mo1423l(Parcel parcel, int i) {
        if (i == 2) {
            C16257l c16257l = (C16257l) AbstractC14866l.yandex(parcel, C16257l.CREATOR);
            AbstractC14866l.loadAd(parcel);
            m3077l(c16257l);
            return true;
        }
        if (i != 3) {
            return false;
        }
        C11233l c11233l = (C11233l) AbstractC14866l.yandex(parcel, C11233l.CREATOR);
        AbstractC14866l.loadAd(parcel);
        synchronized (this) {
            try {
                C10373l c10373l = c11233l.f22605l;
                int i2 = c10373l.f21170l;
                C11154l c11154l = this.admob;
                if (i2 == 3) {
                    c11154l.put(new C10161l(c10373l.f21171l, c11233l.f22606l), c10373l);
                } else {
                    c11154l.remove(new C10161l(c10373l.f21171l, c11233l.f22606l));
                    C7945l c7945l = this.subs;
                    if (c7945l != null) {
                        c7945l.loadAd(c11233l.f22605l.f21171l);
                    }
                }
                this.mopub.yandex(new C7089l(c11233l, 6));
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
