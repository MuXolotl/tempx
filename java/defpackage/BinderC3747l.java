package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lَؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3747l extends AbstractBinderC15260l {
    public final /* synthetic */ C16014l mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3747l(C16014l c16014l) {
        super(1);
        this.mopub = c16014l;
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؑؓۙ */
    public final void mo1248l(int i) {
        this.mopub.admob().post(new RunnableC5647l(this, i, 3));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؑٞۘ */
    public final void mo1249l(int i) {
        this.mopub.billing(i);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؒۜۡ */
    public final void mo1250l(C5040l c5040l, String str, String str2, boolean z) {
        C16014l c16014l = this.mopub;
        c16014l.tapsense = c5040l;
        c16014l.Signature = str;
        C14577l c14577l = new C14577l(new Status(0, null, null, null), c5040l, str, str2, z);
        synchronized (c16014l.ads) {
            try {
                C2350l c2350l = c16014l.metrica;
                if (c2350l != null) {
                    c2350l.loadAd(c14577l);
                }
                c16014l.metrica = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؔۥ٘ */
    public final void mo1251l(int i) {
        this.mopub.billing(i);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؖٙؖ */
    public final void mo1252l(long j) {
        this.mopub.mopub(0, j);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؘٞۨ */
    public final void mo1253l(int i) {
        C16014l c16014l = this.mopub;
        c16014l.billing(i);
        if (c16014l.appmetrica != null) {
            c16014l.admob().post(new RunnableC5647l(this, i, 2));
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؙؕؕ */
    public final void mo1254l(C13853l c13853l) {
        this.mopub.admob().post(new RunnableC9929l(this, c13853l, 28));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lٍ۟ۨ */
    public final void mo1255l(C3882l c3882l) {
        this.mopub.admob().post(new RunnableC9929l(this, c3882l, 27));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lَٜؑ */
    public final void mo1256l() {
        C16014l.f31391package.loadAd("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final void mo1257l(int i, long j) {
        this.mopub.mopub(i, j);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lِۙٞ */
    public final void mo1258l(int i) {
        this.mopub.admob().post(new RunnableC5647l(this, i, 0));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lْۣٔ */
    public final void mo1259l(int i) {
        this.mopub.isPro(i);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lٔ٘۠ */
    public final void mo1260l(int i) {
        this.mopub.admob().post(new RunnableC5647l(this, i, 1));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lًٔۘ */
    public final void mo1261l(String str, byte[] bArr) {
        C0022l c0022l = C16014l.f31391package;
        C16014l.f31391package.loadAd("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lٕؖؔ */
    public final void mo1262l(String str, String str2) {
        C16014l.f31391package.loadAd("Receive (type=text, ns=%s) %s", str, str2);
        this.mopub.admob().post(new RunnableC7706l(this, str, str2, false, 4));
    }
}
