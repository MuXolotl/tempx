package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؚؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4880l implements InterfaceC14833l {
    public InterfaceC8979l billing;
    public int mopub;
    public final InterfaceC17215l yandex;
    public byte[] purchase = AbstractC15323l.loadAd;
    public final C13143l amazon = new C13143l();
    public final C5978l loadAd = null;
    public final ArrayList crashlytics = new ArrayList();
    public int admob = 0;
    public long[] subs = AbstractC15323l.crashlytics;
    public long isPro = -9223372036854775807L;

    public C4880l(InterfaceC17215l interfaceC17215l) {
        this.yandex = interfaceC17215l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        int i = this.admob;
        AbstractC12442l.subscription((i == 0 || i == 5) ? false : true);
        this.isPro = j2;
        if (this.admob == 2) {
            this.admob = 1;
        }
        if (this.admob == 4) {
            this.admob = 3;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        AbstractC12442l.subscription(this.admob == 0);
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(0, 3);
        this.billing = interfaceC8979lStartapp;
        C5978l c5978l = this.loadAd;
        if (c5978l != null) {
            interfaceC8979lStartapp.mopub(c5978l);
            interfaceC2053l.firebase();
            interfaceC2053l.tapsense(new C3762l(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.admob = 1;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x00cd, TryCatch #0 {RuntimeException -> 0x00cd, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b1, B:41:0x00b7, B:42:0x00c6, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: RuntimeException -> 0x00cd, TryCatch #0 {RuntimeException -> 0x00cd, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b1, B:41:0x00b7, B:42:0x00c6, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7 A[Catch: RuntimeException -> 0x00cd, LOOP:1: B:39:0x00b1->B:41:0x00b7, LOOP_END, TryCatch #0 {RuntimeException -> 0x00cd, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b1, B:41:0x00b7, B:42:0x00c6, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        int i;
        long j;
        C8807l c8807l;
        int i2;
        int i3 = this.admob;
        AbstractC12442l.subscription((i3 == 0 || i3 == 5) ? false : true);
        if (this.admob == 1) {
            int iLoadAd = interfaceC10430l.getLength() != -1 ? AbstractC9966l.loadAd(interfaceC10430l.getLength()) : 1024;
            if (iLoadAd > this.purchase.length) {
                this.purchase = new byte[iLoadAd];
            }
            this.mopub = 0;
            this.admob = 2;
        }
        int i4 = this.admob;
        ArrayList arrayList = this.crashlytics;
        if (i4 == 2) {
            byte[] bArr = this.purchase;
            if (bArr.length == this.mopub) {
                this.purchase = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.purchase;
            int i5 = this.mopub;
            int i6 = interfaceC10430l.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.mopub += i6;
            }
            long length = interfaceC10430l.getLength();
            if (length != -1) {
                i = 0;
                if (this.mopub == length) {
                    try {
                        j = this.isPro;
                        if (j != -9223372036854775807L) {
                            c8807l = new C8807l(j, true);
                        } else {
                            c8807l = C8807l.crashlytics;
                        }
                        this.yandex.startapp(this.purchase, 0, this.mopub, c8807l, new C4568l(6, this));
                        Collections.sort(arrayList);
                        this.subs = new long[arrayList.size()];
                        for (i2 = i; i2 < arrayList.size(); i2++) {
                            this.subs[i2] = ((C11828l) arrayList.get(i2)).f23662l;
                        }
                        this.purchase = AbstractC15323l.loadAd;
                        this.admob = 4;
                    } catch (RuntimeException e) {
                        throw C17655l.yandex(e, "SubtitleParser failed.");
                    }
                }
            } else {
                i = 0;
            }
            if (i6 == -1) {
                j = this.isPro;
                if (j != -9223372036854775807L) {
                    c8807l = new C8807l(j, true);
                } else {
                    c8807l = C8807l.crashlytics;
                }
                this.yandex.startapp(this.purchase, 0, this.mopub, c8807l, new C4568l(6, this));
                Collections.sort(arrayList);
                this.subs = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.subs[i2] = ((C11828l) arrayList.get(i2)).f23662l;
                }
                this.purchase = AbstractC15323l.loadAd;
                this.admob = 4;
            }
        } else {
            i = 0;
        }
        if (this.admob == 3) {
            if (interfaceC10430l.subs(interfaceC10430l.getLength() != -1 ? AbstractC9966l.loadAd(interfaceC10430l.getLength()) : 1024) == -1) {
                long j2 = this.isPro;
                for (int iBilling = j2 == -9223372036854775807L ? i : AbstractC15323l.billing(this.subs, j2, true); iBilling < arrayList.size(); iBilling++) {
                    mopub((C11828l) arrayList.get(iBilling));
                }
                this.admob = 4;
            }
        }
        if (this.admob == 4) {
            return -1;
        }
        return i;
    }

    public final void mopub(C11828l c11828l) {
        this.billing.getClass();
        byte[] bArr = c11828l.f23661l;
        int length = bArr.length;
        C13143l c13143l = this.amazon;
        c13143l.getClass();
        c13143l.m3565private(bArr.length, bArr);
        this.billing.purchase(length, c13143l);
        this.billing.yandex(c11828l.f23662l, 1, length, 0, null);
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
        if (this.admob == 5) {
            return;
        }
        this.yandex.reset();
        this.admob = 5;
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
