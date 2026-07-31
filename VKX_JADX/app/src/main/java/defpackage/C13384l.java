package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lْٔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13384l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Uri f26265l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f26266l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14090l f26267l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Map f26268l;

    public C13384l(InterfaceC14090l interfaceC14090l) {
        interfaceC14090l.getClass();
        this.f26267l = interfaceC14090l;
        this.f26265l = Uri.EMPTY;
        this.f26268l = Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        this.f26267l.close();
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) {
        InterfaceC14090l interfaceC14090l = this.f26267l;
        this.f26265l = c2432l.yandex;
        this.f26268l = Collections.EMPTY_MAP;
        try {
            return interfaceC14090l.crashlytics(c2432l);
        } finally {
            Uri uriVip = interfaceC14090l.vip();
            if (uriVip != null) {
                this.f26265l = uriVip;
            }
            this.f26268l = interfaceC14090l.isPro();
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        return this.f26267l.isPro();
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        this.f26267l.metrica(c7713l);
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f26267l.read(bArr, i, i2);
        if (i3 != -1) {
            this.f26266l += (long) i3;
        }
        return i3;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f26267l.vip();
    }
}
