package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: lٜٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16877l implements InterfaceC14833l {
    public boolean admob;
    public final C5257l amazon;
    public long billing;
    public final C13143l crashlytics;
    public InterfaceC2053l purchase;
    public boolean subs;
    public final C5132l yandex = new C5132l(0, null, "audio/mp4a-latm", true);
    public final C13143l loadAd = new C13143l(2048);
    public long mopub = -1;

    public C16877l(int i) {
        C13143l c13143l = new C13143l(10);
        this.crashlytics = c13143l;
        byte[] bArr = c13143l.yandex;
        this.amazon = new C5257l(bArr, bArr.length);
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.admob = false;
        this.yandex.billing();
        this.billing = j2;
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.purchase = interfaceC2053l;
        this.yandex.mopub(interfaceC2053l, new Cstatic(0, 1));
        interfaceC2053l.firebase();
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        C13143l c13143l;
        int i = 0;
        while (true) {
            c13143l = this.crashlytics;
            interfaceC10430l.yandex(0, 10, c13143l.yandex);
            c13143l.m3562for(0);
            if (c13143l.appmetrica() != 4801587) {
                break;
            }
            c13143l.m3568throw(3);
            int iIsVip = c13143l.isVip();
            i += iIsVip + 10;
            interfaceC10430l.admob(iIsVip);
        }
        interfaceC10430l.smaato();
        interfaceC10430l.admob(i);
        if (this.mopub == -1) {
            this.mopub = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            C11826l c11826l = (C11826l) interfaceC10430l;
            c11826l.billing(c13143l.yandex, 0, 2, false);
            c13143l.m3562for(0);
            if ((c13143l.m3567synchronized() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c11826l.billing(c13143l.yandex, 0, 4, false);
                C5257l c5257l = this.amazon;
                c5257l.remoteconfig(14);
                int iMopub = c5257l.mopub(13);
                if (iMopub <= 6) {
                    i4++;
                    c11826l.f23660l = 0;
                    c11826l.firebase(i4, false);
                } else {
                    c11826l.firebase(iMopub - 6, false);
                    i3 += iMopub;
                }
            } else {
                i4++;
                c11826l.f23660l = 0;
                c11826l.firebase(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        this.purchase.getClass();
        interfaceC10430l.getLength();
        C13143l c13143l = this.loadAd;
        int i = interfaceC10430l.read(c13143l.yandex, 0, 2048);
        boolean z = i == -1;
        if (!this.subs) {
            this.purchase.tapsense(new C9828l(-9223372036854775807L));
            this.subs = true;
        }
        if (z) {
            return -1;
        }
        c13143l.m3562for(0);
        c13143l.m3561extends(i);
        boolean z2 = this.admob;
        C5132l c5132l = this.yandex;
        if (!z2) {
            c5132l.Signature = this.billing;
            this.admob = true;
        }
        c5132l.purchase(c13143l);
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
