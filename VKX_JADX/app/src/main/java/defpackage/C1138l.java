package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: lؒٙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1138l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16068l f3097l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f3098l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14090l f3099l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f3100l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f3101l;

    public C1138l(InterfaceC14090l interfaceC14090l, int i, C16068l c16068l) {
        AbstractC12442l.admob(i > 0);
        this.f3099l = interfaceC14090l;
        this.f3098l = i;
        this.f3097l = c16068l;
        this.f3101l = new byte[1];
        this.f3100l = i;
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        return this.f3099l.isPro();
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        this.f3099l.metrica(c7713l);
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f3100l;
        InterfaceC14090l interfaceC14090l = this.f3099l;
        if (i3 == 0) {
            byte[] bArr2 = this.f3101l;
            int i4 = 0;
            if (interfaceC14090l.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = interfaceC14090l.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        C13143l c13143l = new C13143l(bArr3, i5);
                        C16068l c16068l = this.f3097l;
                        long jMax = !c16068l.smaato ? c16068l.subs : Math.max(c16068l.remoteconfig.advert(true), c16068l.subs);
                        int iYandex = c13143l.yandex();
                        InterfaceC8979l interfaceC8979l = c16068l.firebase;
                        interfaceC8979l.getClass();
                        interfaceC8979l.purchase(iYandex, c13143l);
                        interfaceC8979l.yandex(jMax, 1, iYandex, 0, null);
                        c16068l.smaato = true;
                    }
                }
                this.f3100l = this.f3098l;
            }
            return -1;
        }
        int i8 = interfaceC14090l.read(bArr, i, Math.min(this.f3100l, i2));
        if (i8 != -1) {
            this.f3100l -= i8;
        }
        return i8;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f3099l.vip();
    }
}
