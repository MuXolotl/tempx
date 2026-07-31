package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: renamed from: lٕؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0538l extends BasePendingResult {
    public final boolean remoteconfig;
    public C7026l smaato;
    public final /* synthetic */ C17186l vip;

    public AbstractC0538l(C17186l c17186l, boolean z) {
        Objects.requireNonNull(c17186l);
        this.vip = c17186l;
        this.remoteconfig = z;
    }

    public final InterfaceC5194l firebase() {
        if (this.smaato == null) {
            this.smaato = new C7026l(26, this);
        }
        return this.smaato;
    }

    public abstract void isPro();

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC3736l loadAd(Status status) {
        return new C7983l(this, status);
    }

    public final void smaato() {
        if (!this.remoteconfig) {
            C17186l c17186l = this.vip;
            Iterator it = c17186l.mopub.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            Iterator it2 = c17186l.admob.iterator();
            while (it2.hasNext()) {
                ((C7801l) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.vip.yandex) {
                isPro();
            }
        } catch (C1330l unused) {
            billing(new C7983l(this, new Status(2100, null, null, null)));
        }
    }
}
