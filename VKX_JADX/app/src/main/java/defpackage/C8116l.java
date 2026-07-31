package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًٛۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8116l implements InterfaceC14833l {
    public long admob;
    public boolean billing;
    public boolean firebase;
    public InterfaceC2053l isPro;
    public boolean mopub;
    public boolean purchase;
    public C16269l subs;
    public final C16391l yandex = new C16391l(0);
    public final C13143l crashlytics = new C13143l(4096);
    public final SparseArray loadAd = new SparseArray();
    public final C12587l amazon = new C12587l(0);

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        C16391l c16391l = this.yandex;
        boolean z = c16391l.purchase() == -9223372036854775807L;
        if (!z) {
            long jAmazon = c16391l.amazon();
            z = (jAmazon == -9223372036854775807L || jAmazon == 0 || jAmazon == j2) ? false : true;
        }
        if (z) {
            c16391l.mopub(j2);
        }
        C16269l c16269l = this.subs;
        if (c16269l != null) {
            c16269l.amazon(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.loadAd;
            if (i >= sparseArray.size()) {
                return;
            }
            C15716l c15716l = (C15716l) sparseArray.valueAt(i);
            c15716l.billing = false;
            c15716l.yandex.billing();
            i++;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.isPro = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C11826l c11826l = (C11826l) interfaceC10430l;
        c11826l.billing(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c11826l.firebase(bArr[13] & 7, false);
            c11826l.billing(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        char c;
        int i;
        InterfaceC17094l c9619l;
        long j;
        this.isPro.getClass();
        long length = interfaceC10430l.getLength();
        long j2 = -9223372036854775807L;
        C12587l c12587l = this.amazon;
        if (length != -1) {
            c = 3;
            if (!c12587l.amazon) {
                C16391l c16391l = c12587l.loadAd;
                C13143l c13143l = c12587l.crashlytics;
                if (!c12587l.billing) {
                    long length2 = interfaceC10430l.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j3 = length2 - ((long) iMin);
                    if (interfaceC10430l.getPosition() != j3) {
                        c1014l.f2761l = j3;
                        return 1;
                    }
                    c13143l.m3563native(iMin);
                    interfaceC10430l.smaato();
                    interfaceC10430l.yandex(0, iMin, c13143l.yandex);
                    int i2 = c13143l.loadAd;
                    for (int i3 = c13143l.crashlytics - 4; i3 >= i2; i3--) {
                        if (C12587l.loadAd(i3, c13143l.yandex) == 442) {
                            c13143l.m3562for(i3 + 4);
                            long jCrashlytics = C12587l.crashlytics(c13143l);
                            if (jCrashlytics != -9223372036854775807L) {
                                j2 = jCrashlytics;
                                break;
                            }
                        }
                    }
                    c12587l.admob = j2;
                    c12587l.billing = true;
                    return 0;
                }
                if (c12587l.admob == -9223372036854775807L) {
                    c12587l.yandex(interfaceC10430l);
                    return 0;
                }
                if (c12587l.purchase) {
                    long j4 = c12587l.mopub;
                    if (j4 == -9223372036854775807L) {
                        c12587l.yandex(interfaceC10430l);
                        return 0;
                    }
                    c12587l.subs = c16391l.crashlytics(c12587l.admob) - c16391l.loadAd(j4);
                    c12587l.yandex(interfaceC10430l);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, interfaceC10430l.getLength());
                if (interfaceC10430l.getPosition() != 0) {
                    c1014l.f2761l = 0L;
                    return 1;
                }
                c13143l.m3563native(iMin2);
                interfaceC10430l.smaato();
                interfaceC10430l.yandex(0, iMin2, c13143l.yandex);
                int i4 = c13143l.crashlytics;
                for (int i5 = c13143l.loadAd; i5 < i4 - 3; i5++) {
                    if (C12587l.loadAd(i5, c13143l.yandex) == 442) {
                        c13143l.m3562for(i5 + 4);
                        long jCrashlytics2 = C12587l.crashlytics(c13143l);
                        if (jCrashlytics2 != -9223372036854775807L) {
                            j = jCrashlytics2;
                            c12587l.mopub = j;
                            c12587l.purchase = true;
                            return 0;
                        }
                    }
                }
                j = -9223372036854775807L;
                c12587l.mopub = j;
                c12587l.purchase = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.firebase) {
            i = 4;
        } else {
            this.firebase = true;
            long j5 = c12587l.subs;
            if (j5 != -9223372036854775807L) {
                i = 4;
                C16269l c16269l = new C16269l(new C17334l(25), new C2494l(c12587l.loadAd), j5, j5 + 1, 0L, length, 188L, 1000);
                this.subs = c16269l;
                this.isPro.tapsense(c16269l.yandex);
            } else {
                i = 4;
                this.isPro.tapsense(new C9828l(j5));
            }
        }
        C16269l c16269l2 = this.subs;
        if (c16269l2 != null && c16269l2.crashlytics != null) {
            return c16269l2.loadAd(interfaceC10430l, c1014l);
        }
        interfaceC10430l.smaato();
        long jMopub = length != -1 ? length - interfaceC10430l.mopub() : -1L;
        if (jMopub != -1 && jMopub < 4) {
            return -1;
        }
        C13143l c13143l2 = this.crashlytics;
        if (!interfaceC10430l.billing(c13143l2.yandex, 0, i, true)) {
            return -1;
        }
        c13143l2.m3562for(0);
        int iRemoteconfig = c13143l2.remoteconfig();
        if (iRemoteconfig == 441) {
            return -1;
        }
        if (iRemoteconfig == 442) {
            interfaceC10430l.yandex(0, 10, c13143l2.yandex);
            c13143l2.m3562for(9);
            interfaceC10430l.remoteconfig((c13143l2.signatures() & 7) + 14);
            return 0;
        }
        if (iRemoteconfig == 443) {
            interfaceC10430l.yandex(0, 2, c13143l2.yandex);
            c13143l2.m3562for(0);
            interfaceC10430l.remoteconfig(c13143l2.m3567synchronized() + 6);
            return 0;
        }
        if (((iRemoteconfig & (-256)) >> 8) != 1) {
            interfaceC10430l.remoteconfig(1);
            return 0;
        }
        int i6 = iRemoteconfig & 255;
        SparseArray sparseArray = this.loadAd;
        C15716l c15716l = (C15716l) sparseArray.get(i6);
        if (!this.purchase) {
            if (c15716l == null) {
                if (i6 == 189) {
                    c9619l = new C13916l("video/mp2p");
                    this.billing = true;
                    this.admob = interfaceC10430l.getPosition();
                } else if ((iRemoteconfig & 224) == 192) {
                    c9619l = new C14510l(null, 0, "video/mp2p");
                    this.billing = true;
                    this.admob = interfaceC10430l.getPosition();
                } else if ((iRemoteconfig & 240) == 224) {
                    c9619l = new C9619l(null, "video/mp2p");
                    this.mopub = true;
                    this.admob = interfaceC10430l.getPosition();
                } else {
                    c9619l = null;
                }
                if (c9619l != null) {
                    c9619l.mopub(this.isPro, new Cstatic(i6, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                    c15716l = new C15716l(c9619l, this.yandex);
                    sparseArray.put(i6, c15716l);
                }
            }
            if (interfaceC10430l.getPosition() > ((this.billing && this.mopub) ? this.admob + 8192 : 1048576L)) {
                this.purchase = true;
                this.isPro.firebase();
            }
        }
        interfaceC10430l.yandex(0, 2, c13143l2.yandex);
        c13143l2.m3562for(0);
        int iM3567synchronized = c13143l2.m3567synchronized() + 6;
        if (c15716l == null) {
            interfaceC10430l.remoteconfig(iM3567synchronized);
            return 0;
        }
        c13143l2.m3563native(iM3567synchronized);
        interfaceC10430l.readFully(c13143l2.yandex, 0, iM3567synchronized);
        c13143l2.m3562for(6);
        InterfaceC17094l interfaceC17094l = c15716l.yandex;
        C5257l c5257l = c15716l.crashlytics;
        c13143l2.firebase(0, 3, c5257l.loadAd);
        c5257l.remoteconfig(0);
        c5257l.metrica(8);
        c15716l.amazon = c5257l.billing();
        c15716l.purchase = c5257l.billing();
        c5257l.metrica(6);
        c13143l2.firebase(0, c5257l.mopub(8), c5257l.loadAd);
        c5257l.remoteconfig(0);
        C16391l c16391l2 = c15716l.loadAd;
        c15716l.mopub = 0L;
        if (c15716l.amazon) {
            c5257l.metrica(4);
            long jMopub2 = ((long) c5257l.mopub(3)) << 30;
            c5257l.metrica(1);
            long jMopub3 = jMopub2 | ((long) (c5257l.mopub(15) << 15));
            c5257l.metrica(1);
            long jMopub4 = jMopub3 | ((long) c5257l.mopub(15));
            c5257l.metrica(1);
            if (!c15716l.billing && c15716l.purchase) {
                c5257l.metrica(4);
                long jMopub5 = ((long) c5257l.mopub(3)) << 30;
                c5257l.metrica(1);
                long jMopub6 = jMopub5 | ((long) (c5257l.mopub(15) << 15));
                c5257l.metrica(1);
                long jMopub7 = jMopub6 | ((long) c5257l.mopub(15));
                c5257l.metrica(1);
                c16391l2.loadAd(jMopub7);
                c15716l.billing = true;
            }
            c15716l.mopub = c16391l2.loadAd(jMopub4);
        }
        interfaceC17094l.subs(4, c15716l.mopub);
        interfaceC17094l.purchase(c13143l2);
        interfaceC17094l.admob(false);
        c13143l2.m3561extends(c13143l2.yandex.length);
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
