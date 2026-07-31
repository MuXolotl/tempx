package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: lٍٜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9681l implements InterfaceC14833l {
    public boolean crashlytics;
    public final C13916l yandex = new C13916l(0, 1, null, "audio/ac4");
    public final C13143l loadAd = new C13143l(16384);

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
        int i;
        C13143l c13143l = new C13143l(10);
        int i2 = 0;
        while (true) {
            c11826l = (C11826l) interfaceC10430l;
            c11826l.billing(c13143l.yandex, 0, 10, false);
            c13143l.m3562for(0);
            if (c13143l.appmetrica() != 4801587) {
                break;
            }
            c13143l.m3568throw(3);
            int iIsVip = c13143l.isVip();
            i2 += iIsVip + 10;
            c11826l.firebase(iIsVip, false);
        }
        c11826l.f23660l = 0;
        c11826l.firebase(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            c11826l.billing(c13143l.yandex, 0, 7, false);
            c13143l.m3562for(0);
            int iM3567synchronized = c13143l.m3567synchronized();
            if (iM3567synchronized == 44096 || iM3567synchronized == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = c13143l.yandex;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iM3567synchronized == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                c11826l.firebase(i - 7, false);
            } else {
                c11826l.f23660l = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                c11826l.firebase(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        C13143l c13143l = this.loadAd;
        int i = interfaceC10430l.read(c13143l.yandex, 0, 16384);
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
