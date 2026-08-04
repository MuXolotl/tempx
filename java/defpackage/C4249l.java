package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* JADX INFO: renamed from: lَٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4249l implements Destroyable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f8720l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f8721l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AtomicBoolean f8722l = new AtomicBoolean(false);

    public C4249l(byte[] bArr, byte[] bArr2) {
        this.f8721l = bArr;
        this.f8720l = bArr2;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        if (this.f8722l.getAndSet(true)) {
            return;
        }
        AbstractC14024l.loadAd(this.f8721l);
        AbstractC14024l.loadAd(this.f8720l);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.f8722l.get();
    }
}
