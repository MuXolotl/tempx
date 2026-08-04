package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: lَٗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17038l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f33199l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC0737l f33200l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14090l f33201l;

    public C17038l(InterfaceC14090l interfaceC14090l, InterfaceC0737l interfaceC0737l) {
        this.f33201l = interfaceC14090l;
        this.f33200l = interfaceC0737l;
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        if (this.f33199l) {
            this.f33199l = false;
            this.f33201l.close();
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) {
        C2432l c2432lMopub = this.f33200l.mopub(c2432l);
        this.f33199l = true;
        return this.f33201l.crashlytics(c2432lMopub);
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        return this.f33201l.isPro();
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        this.f33201l.metrica(c7713l);
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) {
        return this.f33201l.read(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        Uri uriVip = this.f33201l.vip();
        if (uriVip == null) {
            return null;
        }
        return this.f33200l.purchase(uriVip);
    }
}
