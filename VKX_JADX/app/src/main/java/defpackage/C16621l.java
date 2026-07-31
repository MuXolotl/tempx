package defpackage;

import android.media.MediaFormat;

/* JADX INFO: renamed from: lٖۚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16621l implements InterfaceC15310l, InterfaceC3184l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C16621l f32596l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC15310l f32597l;

    public final void amazon() {
        C16621l c16621l = this.f32596l;
        if (c16621l != null) {
            c16621l.amazon();
        }
    }

    public final void crashlytics(long j, float[] fArr) {
        C16621l c16621l = this.f32596l;
        if (c16621l != null) {
            c16621l.crashlytics(j, fArr);
        }
    }

    @Override // defpackage.InterfaceC15310l
    public final void loadAd(long j, long j2, C5978l c5978l, MediaFormat mediaFormat) {
        InterfaceC15310l interfaceC15310l = this.f32597l;
        if (interfaceC15310l != null) {
            interfaceC15310l.loadAd(j, j2, c5978l, mediaFormat);
        }
    }

    @Override // defpackage.InterfaceC3184l
    public final void yandex(int i, Object obj) {
        if (i == 7) {
            this.f32597l = (InterfaceC15310l) obj;
            return;
        }
        if (i == 8) {
            this.f32596l = (C16621l) obj;
        } else if (i == 10000 && obj != null) {
            C18725l.loadAd();
        }
    }
}
