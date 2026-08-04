package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: lؑۚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0565l implements InterfaceC14833l {
    public boolean crashlytics;
    public final C13916l yandex = new C13916l("audio/ac3");
    public final C13143l loadAd = new C13143l(2786);

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.crashlytics = false;
        this.yandex.billing();
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.yandex.mopub(interfaceC2053l, new Cstatic(0, 1));
        interfaceC2053l.firebase();
        interfaceC2053l.tapsense(new C9828l(-9223372036854775807L));
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        C11826l c11826l;
        int iSmaato;
        C13143l c13143l = new C13143l(10);
        int i = 0;
        while (true) {
            c11826l = (C11826l) interfaceC10430l;
            c11826l.billing(c13143l.yandex, 0, 10, false);
            c13143l.m3562for(0);
            if (c13143l.appmetrica() != 4801587) {
                break;
            }
            c13143l.m3568throw(3);
            int iIsVip = c13143l.isVip();
            i += iIsVip + 10;
            c11826l.firebase(iIsVip, false);
        }
        c11826l.f23660l = 0;
        c11826l.firebase(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            c11826l.billing(c13143l.yandex, 0, 6, false);
            c13143l.m3562for(0);
            if (c13143l.m3567synchronized() != 2935) {
                c11826l.f23660l = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                c11826l.firebase(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = c13143l.yandex;
                if (bArr.length < 6) {
                    iSmaato = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iSmaato = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iSmaato = AbstractC2991l.smaato((b & 192) >> 6, b & 63);
                }
                if (iSmaato == -1) {
                    break;
                }
                c11826l.firebase(iSmaato - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        C13143l c13143l = this.loadAd;
        int i = interfaceC10430l.read(c13143l.yandex, 0, 2786);
        if (i == -1) {
            return -1;
        }
        c13143l.m3562for(0);
        c13143l.m3561extends(i);
        boolean z = this.crashlytics;
        C13916l c13916l = this.yandex;
        if (!z) {
            c13916l.metrica = 0L;
            this.crashlytics = true;
        }
        c13916l.purchase(c13143l);
        return 0;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
