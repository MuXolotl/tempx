package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lْٛٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13495l extends AbstractC18291l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C8417l f26507l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f26508l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f26509l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13495l(C8417l c8417l, C6705l c6705l) {
        super(c8417l, c6705l);
        this.f26507l = c8417l;
        this.f26508l = -1L;
        this.f26509l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r18.f26509l == false) goto L48;
     */
    @Override // defpackage.AbstractC18291l, defpackage.InterfaceC14991l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ad(defpackage.C0869l r19, long r20) throws java.net.ProtocolException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13495l.ad(lؘؒٓ, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zMopub;
        if (this.f35782l) {
            return;
        }
        if (this.f26509l) {
            try {
                zMopub = AbstractC11432l.mopub(this, 100);
            } catch (IOException unused) {
                zMopub = false;
            }
            if (!zMopub) {
                this.f26507l.loadAd.purchase();
                yandex(C8417l.billing);
            }
        }
        this.f35782l = true;
    }
}
